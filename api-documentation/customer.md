## Register Customer
Endpoint : PUT /customer/register

Request Header : none

Request Body :
```json
{
  "fullname" :  "Moch Juang",
  "email" : "mochjuangpp@nusaputra.ac.id",
  "password" :  "JIda09",
  "hobby" : "Watching Film",
}
```
Response Body (Success) : 
```json
{
  "data" : {
    "fullname" :  "Moch Juang",
    "email" : "mochjuangpp@nusaputra.ac.id",
    "password" :  "JIda09",
    "hobby" : "Watching Film",
    "credit" : {
      "balance" : 200000
    }
  }
}
```

Response Body (Failed) : 
```json
{
  "error" :  "Email format involid, Email already exist, ..",
}
```

## Login Customer
Endpoint : POST /customer/register

Request Header : none

Request Body :
```json
{
  "email" : "mochjuangpp@nusaputra.ac.id",
  "password" :  "JIda09",
}
```
Response Body (Success) :
```json
{
  "data" : {
    "fullname" :  "Moch Juang",
    "email" : "mochjuangpp@nusaputra.ac.id",
    "password" :  "JIda09",
    "hobby" : "Watching Film",
    "credit" : {
      "balance" : 200000
    }
  }
}
```

Response Body (Failed) :
```json
{
  "error" :  "customer not found",
}
```


