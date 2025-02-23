package cc.allio.uno.data.orm.dsl;

/**
 * SQL 相关字符
 *
 * @author j.x
 * @since 1.1.4
 */
public enum Token {
    SELECT("SELECT"),
    DELETE("DELETE"),
    INSERT("INSERT"),
    UPDATE("UPDATE"),

    FROM("FROM"),
    HAVING("HAVING"),
    WHERE("WHERE"),
    ORDER("ORDER"),
    BY("BY"),
    GROUP("GROUP"),
    INTO("INTO"),
    AS("AS"),

    CREATE("CREATE"),
    ALTER("ALTER"),
    DROP("DROP"),
    SET("SET"),

    NULL("NULL"),
    NOT("NOT"),
    DISTINCT("DISTINCT"),

    TABLE("TABLE"),
    TABLESPACE("TABLESPACE"),
    VIEW("VIEW"),
    SEQUENCE("SEQUENCE"),
    TRIGGER("TRIGGER"),
    USER("USER"),
    INDEX("INDEX"),
    SESSION("SESSION"),
    PROCEDURE("PROCEDURE"),
    FUNCTION("FUNCTION"),

    PRIMARY("PRIMARY"),
    KEY("KEY"),
    DEFAULT("DEFAULT"),
    CONSTRAINT("CONSTRAINT"),
    CHECK("CHECK"),
    UNIQUE("UNIQUE"),
    FOREIGN("FOREIGN"),
    REFERENCES("REFERENCES"),

    EXPLAIN("EXPLAIN"),
    FOR("FOR"),
    IF("IF"),

    LOCAL("LOCAL"),
    GLOBAL("GLOBAL"),
    ALL("ALL"),
    UNION("UNION"),
    EXCEPT("EXCEPT"),
    INTERSECT("INTERSECT"),
    MINUS("MINUS"),
    INNER("INNER"),
    LEFT("LEFT"),
    RIGHT("RIGHT"),
    FULL("FULL"),
    OUTER("OUTER"),
    JOIN("JOIN"),
    STRAIGHT_JOIN("STRAIGHT_JOIN"),
    ON("ON"),
    SCHEMA("SCHEMA"),
    CAST("CAST"),
    COLUMN("COLUMN"),
    USE("USE"),
    DATABASE("DATABASE"),
    TO("TO"),

    AND("AND"),
    OR("OR"),
    XOR("XOR"),
    CASE("CASE"),
    WHEN("WHEN"),
    THEN("THEN"),
    ELSE("ELSE"),
    ELSIF("ELSIF"),
    END("END"),
    EXISTS("EXISTS"),
    IN("IN"),

    NEW("NEW"),
    ASC("ASC"),
    DESC("DESC"),
    IS("IS"),
    LIKE("LIKE"),
    ESCAPE("ESCAPE"),
    BETWEEN("BETWEEN"),
    VALUES("VALUES"),
    INTERVAL("INTERVAL"),

    LOCK("LOCK"),
    SOME("SOME"),
    ANY("ANY"),
    TRUNCATE("TRUNCATE"),

    RETURN("RETURN"),

    BITS,

    LPAREN("("),
    RPAREN(")"),
    LBRACE("{"),
    RBRACE("}"),
    LBRACKET("["),
    RBRACKET("]"),
    SEMI(";"),
    COMMA(","),
    DOT("."),
    DOTDOT(".."),
    DOTDOTDOT("..,"),
    EQ("="),
    GT(">"),
    LT("<"),
    LT_SUB_GT("<->"),
    BANG("!"),
    BANGBANG("!!"),
    BANG_TILDE("!~"),
    BANG_TILDE_STAR("!~*"),
    TILDE("~"),
    TILDE_STAR("~*"),
    TILDE_EQ("~="),
    QUES("?"),
    QUESQUES("??"),
    QUESBAR("?|"),
    QUESAMP("?&"),
    COLON(":"),
    COLONCOLON("::"),
    COLONEQ(":="),
    EQEQ("=="),
    EQGT("=>"),
    LTEQ("<="),
    LTEQGT("<=>"),
    LTGT("<>"),
    GTEQ(">="),
    BANGEQ("!="),
    BANGGT("!>"),
    BANGLT("!<"),
    AMPAMP("&&"),
    BARBAR("||"),
    BARBARSLASH("||/"),
    BARSLASH("|/"),
    PLUS("+"),
    SUB("-"),
    SUBGT("->"),
    SUBGTGT("->>"),
    STAR("*"),
    SLASH("/"),
    AMP("&"),
    BAR("|"),
    CARET("^"),
    CARETEQ("^="),
    PERCENT("%"),
    LTLT("<<"),
    GTGT(">>"),
    MONKEYS_AT("@"),
    MONKEYS_AT_AT("@@"),
    POUND("#"),
    POUNDGT("#>"),
    POUNDGTGT("#>>"),
    MONKEYS_AT_GT("@>"),
    LT_MONKEYS_AT("<@");

    public final String name;

    Token() {
        this(null);
    }

    Token(String name) {
        this.name = name;
    }
}
