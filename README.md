# spring_multi_datasource
This basic project show how to manage multiple H2 (or any other database) with springboot via Header interceptor.

To swtich the datasource just set the header "database" according to property key "first" or "second"
### N.B. The databse must be initialized with sql script or must be already created

### API
- POST -> /api/v1/create 
- GET -> /api/v1/getUsers

HEADER -> database:first switch to jdbc:h2:mem:primo
HEADER -> database:second swtich to jdbc:h2:mem:secondo

