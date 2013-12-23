public class CodeFragment {
        private String code;
        private String register;
        private Type type;
        private String info;

        public String getInfo() {
            return this.info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        public CodeFragment() {
                this.code = "";
                this.register = null;
        }

        public void addCode(String code) {
                // System.err.println(String.format("Fragment: %s", code));
                this.code += code;
        }

        public void addCode(CodeFragment fragment) {
                if (fragment == null) {
                        System.err.println("Null fragment");
                        return;
                }
                addCode(fragment.toString());
        }

        public void appendCodeFragment(CodeFragment fragment) {
                this.addCode(fragment);
                this.setRegister(fragment.getRegister());
                this.setType(fragment.getType());
        }

        public String toString() {
                return this.code;
        }

        public void setRegister(String register) {
                this.register = register;
        }

        public String getRegister() {
                return this.register;
        }

        public void setType(Type t) {
                this.type = t;
        }

        public Type getType() {
                return this.type;
        }
}
