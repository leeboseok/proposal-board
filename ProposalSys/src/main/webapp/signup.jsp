<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>Create Account</title>
		<link rel="stylesheet" href="css/signup.css">
	</head>
	<body>
		<div id="wrap">
			<h1>Create account</h1>
			<hr>
			<form method="post" action="signupprogress.jsp" name="frm">
                <div>Email Address</div>
                <div>
                	<input type="email" name="email"  placeholder="이메일 주소를 정확히 입력해 주세요." required>
                </div>
                <div>Password</div>
                <div><input type="password" name="pw" placeholder="비밀번호를 입력해주세요." required></div>
                <hr>
                <div>FirstName</div>
                <div><input type="text" name="fn" placeholder="성을 제외한 이름을 입력해주세요." required></div>
                <div>LastName</div>
                <div><input type="text" name="ln" placeholder="성만 입력해주세요." required></div>
                <div>Photo</div>
                <div><input type="file" name="photo" required></div>
                <div>Phone</div>
                <div><input type="text" name="phone" placeholder=" ex) 01012341234"required></div>
                <div>Job</div>
                <div>
                    <select name="job">
                    	<option value="admin">Admin</option>
                        <option value="Engineering-Account Engineer">Engineering-Account Engineer</option>
                        <option value="Engineering-Engineering">Engineering-Engineering</option>
                        <option value="Engineering-Enterprise Service Delivery">Engineering-Enterprise Service Delivery</option>
                        <option value="Engineering-Field Engineer">Engineering-Field Engineer</option>
                        <option value="Engineering-Other">Engineering-Other</option>
                        <option value="Engineering-Quality Engineering/Audition">Engineering-Quality Engineering/Audition</option>
                        <option value="Engineering-Testing & Certification">Engineering-Testing and Certification</option>
                        <option value="Executive">Executive</option>
                    </select>
                </div>
                <div>Branch location</div>
                <div>
                	<select name="location">
                        <option value="United States - San Juan">United States - San Juan</option>
                        <option value="United States - California-Walnut Creek">United States - California-Walnut Creek</option>
                        <option value="United States - California-Woodlang Hills">United States - California-Woodlang Hills</option>
                        <option value="United States - Colorado-Denver">United States - Colorado-Denver</option>
                        <option value="United States - Connecticut-Burlington">United States - Connecticut-Burlington</option>
                        <option value="United States - Connecticut-Coventry">United States - Connecticut-Coventry</option>
                        <option value="United States - Connecticut-Newington">United States - Connecticut-Newington</option>
                        <option value="United States - Connecticut-Norwalk">United States - Connecticut-Norwalk</option>
                        <option value="United States - Georgia-Alpharetta">United States - Georgia-Alpharetta</option>
                        <option value="United States - Georgia-Rome">United States - Georgia-Rome</option>
                        <option value="United States - Illinois-Park Ridge">United States - Illinois-Park Ridge</option>
                        <option value="United States - Illinois-Peoria">United States - Illinois-Peoria</option>
                        <option value="United States - Indiana-Indianapolis">United States - Indiana-Indianapolis</option>
                        <option value="United States - Indiana-Merrillville">United States - Indiana-Merrillville</option>
                        <option value="United States - Indiana-South Bend">United States - Indiana-South Bend</option>
                        <option value="United States - lowa-Cedar Rapids">United States - lowa-Cedar Rapids</option>
                        <option value="United States - lowa-Davenport">United States - lowa-Davenport</option>
                        <option value="United States - lowa-Des Moines">United States - lowa-Des Moines</option>
                        <option value="United States - lowa-Sioux City">United States - lowa-Sioux City</option>
                        <option value="United states - Kansas-Topeka">United states - Kansas-Topeka</option>
                        <option value="United States - Kansas-Wichita">United States - Kansas-Wichita</option>
                        <option value="United States - Kentucky-Louisville">United States - Kentucky-Louisville</option>
                        <option value="United States - Maryland-Frederick">United States - Maryland-Frederick</option>
                        <option value="United States - Maryland-Gaithersburg">United States - Maryland-Gaithersburg</option>
                        <option value="United States - Massachusetts-Boston">United States - Massachusetts-Boston</option>
                        <option value="United States - Massachusetts-Norwood">United States - Massachusetts-Norwood</option>
                        <option value="United States - Massachusetts-Wakefield">United States - Massachusetts-Wakefield</option>
                        <option value="United States - Massachusetts-Waltham">United States - Massachusetts-Waltham</option>
                        <option value="United States - Michigan-Detroit">United States - Michigan-Detroit</option>
                        <option value="United States - Michigan-Grand Rapids">United States - Michigan-Grand Rapids</option>
                        <option value="United States - Michigan-Lansing">United States - Michigan-Lansing</option>
                        <option value="United States - Minnesota-Plymouth">United States - Minnesota-Plymouth</option>
                        <option value="United States - Missouri-Creve Coeur">United States - Missouri-Creve Coeur</option>
                        <option value="United States - Missouri-Kansas City">United States - Missouri-Kansas City</option>
                        <option value="United States - Missouri-St.Louis">United States - Missouri-St.Louis</option>
                        <option value="United States - Nebraska-Omaha">United States - Nebraska-Omaha</option>
                        <option value="United States - New Hampshire-Portsmouth">United States - New Hampshire-Portsmouth</option>
                        <option value="United States - New Jersey-Parsippany">United States - New Jersey-Parsippany</option>
                        <option value="United States - New York-Albany">United States - New York-Albany</option>
                        <option value="United States - New York-Rochester">United States - New York-Rochester</option>
                        <option value="United States - Ohio-Cincinnati">United States - Ohio-Cincinnati</option>
                        <option value="United States - Ohio-Cleveland">United States - Ohio-Cleveland</option>
                        <option value="United States - Ohio-North Olmsted">United States - Ohio-North Olmsted</option>
                        <option value="United States - Ohio-Toledo">United States - Ohio-Toledo</option>
                        <option value="United States - Oregon-Portland">United States - Oregon-Portland</option>
                        <option value="United States - Pennsylvania-Harrisburg">United States - Pennsylvania-Harrisburg</option>
                        <option value="United States - Pennsylvania-Malvern">United States - Pennsylvania-Malvern</option>
                        <option value="United States - Pennsylvania-York">United States - Pennsylvania-York</option>
                        <option value="United States - Rhode Island-Providence">United States - Rhode Island-Providence</option>
                        <option value="United States - Rhode Island-West Glocester">United States - Rhode Island-West Glocester</option>
                        <option value="United States - South Dakota-Sioux Falls">United States - South Dakota-Sioux Falls</option>
                        <option value="United States - Texas-Frisco">United States - Texas-Frisco</option>
                        <option value="United States - Houston">United States - Houston</option>
                        <option value="United States - Virginia-Reston">United States - Virginia-Reston</option>
                        <option value="United States - Virginia-Roanoke">United States - Virginia-Roanoke</option>
                        <option value="United States - Washington-Bellevue">United States - Washington-Bellevue</option>
                        <option value="United States - Wisconsin-Green Bay">United States - Wisconsin-Green Bay</option>
                        <option value="United States - Wisconsin-Madison">United States - Wisconsin-Madison</option>
                        <option value="United States - Wisconsin-Milwaukee">United States - Wisconsin-Milwaukee</option>
                        <option value="Argentina">Argentina</option>
                        <option value="Australia-New South Wales-Sydney">Australia-New South Wales-Sydney</option>
                        <option value="Australia-Queensland-Brisbane">Australia-Queensland-Brisbane</option>
                        <option value="Australia-Victoria-Melbourne">Australia-Victoria-Melbourne</option>
                        <option value="Austria">Austria</option>
                        <option value="Belgium-Brussels">Belgium-Brussels</option>
                        <option value="Belgium-Debroux">Belgium-Debroux</option>
                        <option value="Belgium-Brussels-Capital Region-Brussels">Belgium-Brussels-Capital Region-Brussels</option>
                        <option value="Brazil-Sao Paulo-Sao Paulo">Brazil-Sao Paulo-Sao Paulo</option>
                        <option value="Brazil-Sao Paulo-Vila Olimpia">Brazil-Sao Paulo-Vila Olimpia</option>
                        <option value="Canada-Alberta">Canada-Alberta</option>
                        <option value="Canada-British Columbia-Vancouver">Canada-British Columbia-Vancouver</option>
                        <option value="Canada-Manitoba-Winnipeg">Canada-Manitoba-Winnipeg</option>
                        <option value="Canada-Nova Scotia-Halifax">Canada-Nova Scotia-Halifax</option>
                        <option value="Canada-Ontario-Thornhill">Canada-Ontario-Thornhill</option>
                        <option value="Canada-Ontario-Vaughan">Canada-Ontario-Vaughan</option>
                        <option value="Canada-Quebec-Montreal">Canada-Quebec-Montreal</option>
                        <option value="Chile">Chile</option>
                        <option value="Chile-Region Metropolitana de Santiago">Chile-Region Metropolitana de Santiago</option>
                        <option value="China-Beijing">China-Beijing</option>
                        <option value="China-Shanghai">China-Shanghai</option>
                        <option Value="Colombia-Bogota">Colombia-Bogota</option>
                        <option value="Colombia">Colombia</option>
                        <option value="Czech Republic">Czech Republic</option>
                        <option value="Denmark">Denmark</option>
                        <option value="Egypt">Egypt</option>
                        <option value="Finland">Finland</option>
                        <option value="France-Metz-Tessy">France-Metz-Tessy</option>
                        <option value="France-Paris La Defense Cedex">France-Paris La Defense Cedex</option>
                        <option value="France-Paris">France-Paris</option>
                        <option value="France-Haute-Savoie-Mety-Tessy">France-Haute-Savoie-Mety-Tessy</option>
                        <option value="Germany-Frankfurt">Germany-Frankfurt</option>
                        <option value="Hong Kong-Mongkok">Hong Kong-Mongkok</option>
                        <option value="Hungary">Hungary</option>
                        <option value="India-Karnataka-Bangalulu">India-Karnataka-Bangalulu</option>
                        <option value="Ireland">Ireland</option>
                        <option value="Ireland-Dublin">Ireland-Dublin</option>
                        <option value="Italy-Milano">Italy-Milano</option>
                        <option value="Japan-Kanagawa-Yokohama">Japan-Kanagawa-Yokohama</option>
                        <option value="South Korea-Seoul">South Korea-Seoul</option>
                        <option value="Luxembourg">Luxembourg</option>
                        <option value="Malaysia-Kuala Kumpur">Malaysia-Kuala Kumpur</option>
                        <option value="Mexico-Nuevo Leon-Monterrey">Mexico-Nuevo Leon-Monterrey</option>
                        <option value="Mexico-Nuevo Leon-San Pedro">Mexico-Nuevo Leon-San Pedro</option>
                        <option value="Mexico-Nuevo Leon-San Pedro Garza Garcia">Mexico-Nuevo Leon-San Pedro Garza Garcia</option>
                        <option value="Netherlands-Amsterdam">Netherlands-Amsterdam</option>
                        <option value="New Zealand">New Zealand</option>
                        <option value="Philippines-Quezon City,Metro Manilla">Philippines-Quezon City,Metro Manilla</option>
                        <option value="Poland">Poland</option>
                        <option value="Portugal">Portugal</option>
                        <option value="Romania">Romania</option>
                        <option value="Russia-Moscow">Russia-Moscow</option>
                        <option value="Singapore">Singapore</option>
                        <option value="Slovakia">Slovakia</option>
                        <option value="South Africa-Johannesburg">South Africa-Johannesburg</option>
                        <option value="Spain-Madrid">Spain-Madrid</option>
                        <option value="Sweden-Stockholm">Sweden-Stockholm</option>
                        <option value="Switzerland-Bern">Switzerland-Bern</option>
                        <option value="Switzerland">Switzerland</option>
                        <option value="Thailand">Thailand</option>
                        <option value="Turkey-Atasehir">Turkey-Atasehir</option>
                        <option value="United Arab Emirates-Abu Dhabi">United Arab Emirates-Abu Dhabi</option>
                        <option value="United Kingdom-London">United Kingdom-London</option>
                        <option value="United Kingdom-Maidenhead">United Kingdom-Maidenhead</option>
                        <option value="United Kingdom-Manchester">United Kingdom-Manchester</option>
                        <option value="United Kingdom-Windsor and maidenhead-Windsor">United Kingdom-Windsor and maidenhead-Windsor</option>
                        <option value="Vietnam">Vietnam</option>
                    </select>
					<input type="submit" value="가입하기">
                </div>
             </form>
        </div>
	</body>
</html>