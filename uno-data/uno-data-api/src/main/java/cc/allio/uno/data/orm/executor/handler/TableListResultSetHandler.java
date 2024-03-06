package cc.allio.uno.data.orm.executor.handler;

import cc.allio.uno.data.orm.dsl.DSLName;
import cc.allio.uno.data.orm.dsl.Table;
import cc.allio.uno.data.orm.dsl.ddl.ShowTablesOperator;
import cc.allio.uno.data.orm.executor.ResultSet;
import com.google.common.collect.Lists;

import java.util.List;

/**
 * {@link Table}结果集处理器
 *
 * @author jiangwei
 * @date 2024/1/4 18:56
 * @since 1.1.7
 */
public class TableListResultSetHandler extends ExecutorOptionsAwareImpl implements ListResultSetHandler<Table> {

    private static final DSLName TABLE_CATALOG_DSL_NAME = DSLName.of(ShowTablesOperator.TABLE_CATALOG_FILED, DSLName.HUMP_FEATURE);
    private static final DSLName TABLE_SCHEMA_DSL_NAME = DSLName.of(ShowTablesOperator.TABLE_SCHEMA_FILED, DSLName.HUMP_FEATURE);
    private static final DSLName TABLE_NAME_DSL_NAME = DSLName.of(ShowTablesOperator.TABLE_NAME_FILED, DSLName.HUMP_FEATURE);
    private static final DSLName TABLE_TYPE_DSL_NAME = DSLName.of(ShowTablesOperator.TABLE_TYPE_FILED, DSLName.HUMP_FEATURE);

    @Override
    public List<Table> apply(ResultSet resultSet) {
        return Lists.newArrayList(resultSet)
                .stream()
                .map(r -> {
                    Table table = new Table();
                    r.getOptionStringValue(TABLE_CATALOG_DSL_NAME, table::setCatalog);
                    r.getOptionStringValue(TABLE_SCHEMA_DSL_NAME, table::setSchema);
                    r.getOptionStringValue(TABLE_NAME_DSL_NAME, name -> table.setName(DSLName.of(name, DSLName.PLAIN_FEATURE)));
                    r.getOptionStringValue(TABLE_TYPE_DSL_NAME, table::setType);
                    return table;
                })
                .toList();
    }
}
