## Create Destination
Endpoint : PUT /destination

Request Header : 
- Authorization : Bearer Token (Mandatory)

Request Body :
```json
{
  "name" :  "",
  "description" : "",
  "price" :  "",
  "country_id" : "",
  "photos" :  "",
  "insurance" : true,
  "refundable" : true,
  "vat" : 2.4
}
```
Response Body (Success) :
```json
{
  "data" : {
    "name" :  "",
    "description" : "",
    "price" :  "",
    "country_id" : "",
    "photos" :  "",
    "insurance" : true,
    "refundable" : true,
    "vat" : 2.4
  }
}
```

Response Body (Failed) :
```json
{
  "error" :  "data required"
}
```



## Get List Destination
Endpoint : GET /destination

Request Header :
- Authorization : Bearer Token (Mandatory)

Request Body : none


Response Body (Success) :
```json
{
  "data" : [
    {
      "name" :  "",
      "description" : "",
      "price" :  "",
      "country_id" : "",
      "photos" :  "",
      "insurance" : true,
      "refundable" : true,
      "vat" : 2.4
    }, ...
  ]
}
```

Response Body (Failed) : none

## Get Detail Destination
Endpoint : GET /destination/:id

Request Header :
- Authorization : Bearer Token (Mandatory)

Request Body : none

Response Body (Success) :
```json
{
  "data" : {
    "name" :  "",
    "description" : "",
    "price" :  "",
    "country_id" : "",
    "photos" :  "",
    "insurance" : true,
    "refundable" : true,
    "vat" : 2.4
  }
}
```

Response Body (Failed) :
```json
{
  "error" :  "destination not found"
}
```

## Update Destination
Endpoint : PATCH /destination/:id

Request Header :
- Authorization : Bearer Token (Mandatory)

Request Body :
```json
{
  "name" :  "",
  "description" : "",
  "price" :  "",
  "country_id" : "",
  "photos" :  "",
  "insurance" : true,
  "refundable" : true,
  "vat" : 2.4
}
```
Response Body (Success) :
```json
{
  "data" : {
    "name" :  "",
    "description" : "",
    "price" :  "",
    "country_id" : "",
    "photos" :  "",
    "insurance" : true,
    "refundable" : true,
    "vat" : 2.4
  }
}
```

Response Body (Failed) :
```json
{
  "error" :  "data required"
}
```


## Delete Destination
Endpoint : DELETE /destination/:id

Request Header :
- Authorization : Bearer Token (Mandatory)

Request Body : none


Response Body (Success) :
```json
{
  "data" : {
    "name" :  "",
    "description" : "",
    "price" :  "",
    "country_id" : "",
    "photos" :  "",
    "insurance" : true,
    "refundable" : true,
    "vat" : 2.4
  }
}
```

Response Body (Failed) :
```json
{
  "error" :  "data required"
}
```

