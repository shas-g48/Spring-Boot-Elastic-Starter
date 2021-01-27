#!/bin/bash
curl -H "Content-Type: application/x-ndjson" -XPOST http://localhost:9200/booksindex/_bulk --data-binary "@books.json"
