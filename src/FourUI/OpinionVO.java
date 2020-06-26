package FourUI;

public class OpinionVO {

   int code;
   int cl_value;
   int ac_value;
   int ct_value;
   String des;
   int fc_code;
   String user_id;

   public int getCode() {
      return code;
   }

   public void setCode(int code) {
      this.code = code;
   }

   public int getCl_value() {
      return cl_value;
   }

   public void setCl_value(int cl_value) {
      this.cl_value = cl_value;
   }

   public int getAc_value() {
      return ac_value;
   }

   public void setAc_value(int ac_value) {
      this.ac_value = ac_value;
   }

   public int getCt_value() {
      return ct_value;
   }

   public void setCt_value(int ct_value) {
      this.ct_value = ct_value;
   }

   public String getDes() {
      return des;
   }

   public void setDes(String des) {
      this.des = des;
   }

   public int getFc_code() {
      return fc_code;
   }

   public void setFc_code(int fc_code) {
      this.fc_code = fc_code;
   }

   public String getUser_id() {
      return user_id;
   }

   public void setUser_id(String user_id) {
      this.user_id = user_id;
   }

   public OpinionVO(int code, int cl_value, int ac_value, int ct_value, String des, int fc_code, String user_id) {
      this.code = code;
      this.cl_value = cl_value;
      this.ac_value = ac_value;
      this.ct_value = ct_value;
      this.des = des;
      this.fc_code = fc_code;
      this.user_id = user_id;
   }

   public OpinionVO() {

   }

}