# payroll_of_labor

Payroll of Construction Labor
  - Employee from contruction site download payslip from app
  - Project Manager approve or deputy
  - Salary imported from construction site which will be delivered to HQ in order to make transfer transactions
    Employee can download slip from app.

 requirement
personal card when ตอกบัตรเข้า ออกงาน
ลางานไม่มี ไม่ตอกบัตร  ขาด

***
ข้อมูลเงินเดือนมากจากไหน
ข้อมูลเงินเดือนส่ง email HQ มีรวม รายคน \  เรท รวม file เดียว
วิธีออก slip outsource + ประจำ เอา file text แยกรายคน -> excel รายบุคคล  -> approve ลงนาม
manager -> duputy approve -> notify to data owner
manager -> duputy approve vary by site not specific
signature auto approved or mannual?
mannual when verify.

outsource || Permanent separate files

payroll bank -> all  end of month -> Weekend -> Friday
account bank -> only one -> edit account possible -> bookbank other document (bookbank only)
bookbank other document (bookbank only) -> approve by who? -> notify to data owner
interval of approval bookbank -> Status? Wrong account? Wrong Bank?
Web (Computer on Site) / Personal -> user pass from  single sign on same HQ ask HQ / Password from email owner to edit password
download -> period time 6 month 2 years?
download -> period time 6 per 1 set
PND1 yes
Payslip || PND1 separate -> PIN encryption
pdf PIN -> edit by employee after login
PIN -> number 6 length -> editable without approve -> noti?
PIN -> First login? -> Second change PIN?
 

1. noti
2. approve
3. text file import
4. mapping field schema api
5. error handle
Confirm Data Import
6. Confirm Data Completeness & Validate before Import

1.text import 2.payslip 3.รับรองเงินเดือน

Table
  1.Permission(Role) 2.User(IAM) + PIN  3.Personal Data ข้อมูลส่วนตัว  4.เงินเดือน 5.path bookbank + file type(N type)
FK -> cascade delete
pdf
!!

!!Sqeuence
1. Import -> confirmed by HR -> confirmed by Acc
2.

domain
1.Noti -> workflow diagram  -> approval approver cc deputy -> cc owner.
1.1 BookBank & new Account -> Permission Role IAM
2.Permission
3.Approve

Spec
Login -> Modal\Dialog reset Pass/PIN 3 component first login -> service reset PIN / reset Password Policy?
Home (User)-> Nav 1.Download slip 2. รับรอง 3. PND1 + หัก ณ ที่จ่าย   Radio period start - end 6 months
Password -> jwt (user profile)/ PIN (home btn) -> PDF (DB)

Home (Approver)

Home (Deputy)

Home (Owner HR)

Home (Owner Account)

!! Flow one by one
