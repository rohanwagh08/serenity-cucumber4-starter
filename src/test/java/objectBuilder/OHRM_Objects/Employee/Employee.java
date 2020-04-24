package objectBuilder.OHRM_Objects.Employee;

public class Employee {

        private final String firstName; // required
        private String middleName; // optional
        private final String lastName; // required
        private final Integer empId; /** Octal Integer*/
        private Boolean createLoginDetails;
        private String username;
        private String password;
        private Boolean status;

        private Employee(EmployeeBuilder builder) {
            this.firstName = builder.firstName;
            this.lastName = builder.lastName;
            this.middleName = builder.middleName;
            this.empId = builder.empId;
            this.createLoginDetails = builder.createLoginDetails;
            this.username = builder.username;
            this.password = builder.password;
            this.status = builder.status;
        }

        //All getter, and NO setter to provde immutability
        public String getFirstName() {
            return firstName;
        }
        public String getLastName() {
            return lastName;
        }
        public String getMiddleName() {
            return middleName;
        }
        public Integer getEmpId() {
            return empId;
        }
        public Boolean getCreateLoginDetails() {
            return createLoginDetails;
        }
        public String getUsername() {
            return username;
        }
        public String getPassword() {
            return password;
        }
        public Boolean getStatus() {
            return status;
        }

        @Override
        public String toString() {
            return "Employee: "+this.firstName+", "+this.middleName+", "+this.lastName+", "+this.empId+", "+this.createLoginDetails+", "+this.username+", "+this.password+", "+this.status;
        }

        public static class EmployeeBuilder
        {
            private final String firstName;
            private String middleName;
            private final String lastName;
            private Integer empId;
            private Boolean createLoginDetails;
            private String username;
            private String password;
            private Boolean status;

            public EmployeeBuilder(String firstName, String lastName) {
                this.firstName = firstName;
                this.lastName = lastName;
            }
            public EmployeeBuilder middleName(String middleName) {
                this.middleName = middleName;
                return this;
            }
            public EmployeeBuilder empId(Integer empId) {
                this.empId = empId;
                return this;
            }
            public EmployeeBuilder createLoginDetails(Boolean createLoginDetails) {
                this.createLoginDetails = createLoginDetails;
                return this;
            }
            public EmployeeBuilder username(String username) {
                this.username = username;
                return this;
            }
            public EmployeeBuilder password(String password) {
                this.password = password;
                return this;
            }
            public EmployeeBuilder status(Boolean status) {
                this.status = status;
                return this;
            }
            //Return the finally consrcuted User object
            public Employee build() {
                Employee employee =  new Employee(this);
                validateUserObject(employee);
                return employee;
            }
            private void validateUserObject(Employee user) {
                //Do some basic validations to check
                //if user object does not break any assumption of system
            }
        }
    }

