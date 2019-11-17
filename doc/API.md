# PasteMe Admin API Documentation

## Access Paste

### Request

`GET` `/v0.0.2/api/paste/{key}`

| Name | Type | Description |
| :---: | :---: | --- |
| `key` | long | Paste's primary key |

### Response

```json
{
  "code": 0,
  "message": "success",
  "data": null,
  "success": true
}
```

## Query Permanent Paste Current Maximum Key

### Request

`GET` `/v0.0.2/api/paste/current`

### Response

```json
{
  "code": 0,
  "message": "success",
  "data": 101,
  "success": true
}
```
