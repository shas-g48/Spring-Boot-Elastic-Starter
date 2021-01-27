import csv
i = 0
with open("books.csv", encoding = 'utf-8') as f:
	reader = csv.reader(f)
	for line_list in reader:
		if i != 0:
			meta = '{"index":{"_id":'+str(i)+'}}'
			print(meta)
			Title = line_list[0]
			Author = line_list[1]
			Genre = line_list[2]
			Height = line_list[3]
			Publisher = line_list[4]
			object = '{"Title":"'+Title+'","Author":"'+Author+'","Genre":"'+Genre+'","Height":"'+Height+'","Publisher":"'+Publisher+'"}'
			print(object)
		i+=1
		
