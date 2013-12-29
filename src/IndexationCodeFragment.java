import java.util.List;
import java.util.ArrayList;

public class IndexationCodeFragment extends CodeFragment {
    private String indexRegister;
    private Type indexType;

    public Type getIndexType() {
        return this.indexType;
    }

    public void setIndexType(Type indexType) {
        this.indexType = indexType;
    }

    public String getIndexRegister() {
        return this.indexRegister;
    }

    public void setIndexRegister(String indexRegister) {
        this.indexRegister = indexRegister;
    }

}
