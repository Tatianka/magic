import java.util.List;

public class Function {
    private String name;
    private Type returnType;
    private List<Variable> params;
    private CodeFragment code;
    private String id;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CodeFragment getCode() {
        return this.code;
    }

    public void setCode(CodeFragment code) {
        this.code = code;
    }

    public Type getReturnType() {
        return this.returnType;
    }

    public List<Variable> getParams() {
        return this.params;
    }

    public void setReturnType(Type returnType) {
        this.returnType = returnType;
    }

    public void setParams(List<Variable> params) {
        this.params = params;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Function(String id, String name, Type returnType, List<Variable> params, CodeFragment code) {
        this.setId(id);
        this.setName(name);
        this.setReturnType(returnType);
        this.setParams(params);
        this.setCode(code);
    }

}
