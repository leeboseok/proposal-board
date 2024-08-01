<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="ko">
	<head>
	    <meta charset="UTF-8">
	    <title>Write Page</title>
	    <style>
	    	html, body {
			    height: 100%;
			    margin: 0;
			    font-family: Arial, sans-serif;
			}
	
			html {
			    background-size: cover;
			    background-position: center;
			    background-repeat: no-repeat;
			}
	
			#wrap {
			    display: flex;
			    justify-content: space-between;
			    max-width: 1200px;
			    margin: 0 auto;
			    border: 3px solid navy;
			    padding: 30px;
			    box-sizing: border-box;
			    background-color: rgba(255, 255, 255, 0.8); /* 반투명 배경으로 내용이 강조됨 */
			}
			
			#logo {
			    width: 200px;
			    margin: 0 auto;
			}
			
			h1 {
			    margin: 0;
			    text-align: center;
			    color: navy;
			    font-size: 2rem;
			}
			
			input[type="submit"] {
			    width: 150px;
			    display: block;
			    margin: 15px auto;
			    background-color: white;
			    font-weight: 600;
			    border: 2px solid navy;
			    border-radius: 5px;
			    cursor: pointer;
			    transition: background-color 0.3s, color 0.3s;
			}
			
			input[type="submit"]:hover {
			    background-color: navy;
			    color: white;
			}
			
			textarea {
			    width: 100%;
			    border: 2px solid #ddd;
			    border-radius: 5px;
			    padding: 10px;
			    box-sizing: border-box;
			    font-size: 16px;
			    resize: vertical;
			}
			
			.input-size {
			    height: 150px;
			    margin-bottom: 20px;
			}
			
			.small-input {
			    width: calc(100% - 22px); /* 22px는 padding과 border를 고려 */
			    height: 40px;
			    margin-bottom: 20px;
			    font-size: 16px;
			}
			
			.div_input {
			    flex: 1;
			}
			
			.div_preview {
			    flex: 1;
			    padding-left: 20px;
			    padding-top: 143px;
			}
			
			.div_preview h2 {
			    color: navy;
			    margin-top: 0;
			}
			
			.div_preview div {
			    margin-bottom: 15px;
			}
			
			.attachmentButton {
			    display: block;
			    margin-bottom: 20px;
			}
	    </style>
	    <script>
	        function updatePreview() {
	            document.getElementById('previewTitle').innerText = document.querySelector('textarea[name="title"]').value;
	            document.getElementById('previewExecutiveSummary').innerText = document.querySelector('textarea[name="summary"]').value;
	            document.getElementById('previewProjectBackground').innerText = document.querySelector('textarea[name="background"]').value;
	            document.getElementById('previewSolutionsAndApproach').innerText = document.querySelector('textarea[name="solution"]').value;
	            document.getElementById('previewFinancial').innerText = document.querySelector('textarea[name="financial"]').value;
	            document.getElementById('previewConclusion').innerText = document.querySelector('textarea[name="conclusion"]').value;
	        }
	        window.onload = function() {
	            document.querySelectorAll('.div_input textarea').forEach(input => {
	                input.addEventListener('input', updatePreview);
	            });
	        }
	    </script>
	</head>
	<body>
	    <div id="wrap">
	        <div id="logo">
	        </div>
	        <div class="div_input"> <!--여기는 유저가 제안서를 작성하는 파트 입니다.-->
	            <form method="post" action="createprogress.jsp">
	            	<% String test=(String)session.getAttribute("fn"); %>
	            	<h1>환영합니다, <%= test %>님!</h1>
	                <h1>제안서 작성 페이지 입니다.</h1>
	                <div>
	                    <div>Title</div>
	                    <textarea name="title" class="small-input"></textarea>
	                    <div>Executive summary</div>
	                    <textarea class="input-size" name="summary"></textarea>
	                    <div>Project background</div>
	                    <textarea class="input-size" name="background"></textarea>
	                    <div>Solutions and approach</div>
	                    <textarea class="input-size" name="solution"></textarea>
	                    <div>Financial</div>
	                    <textarea class="input-size" name="financial"></textarea>
	                    <div>Conclusion</div>
	                    <textarea class="input-size" name="conclusion"></textarea>
	                    <div>Additional documents</div>
	                    <input type="file" name="documents" class="attachmentButton">
	                    <input type="submit" value="임시저장">
	                </div>
	            </form>
	        </div>
	        <div class="div_preview"><!--여기는 유저가 작성한 실시간 미리보기영역 입니다.-->
	            <h2>Preview</h2>
	            <div><span id="previewTitle"></span></div>
	            <div><span id="previewExecutiveSummary"></span></div>
	            <div><span id="previewProjectBackground"></span></div>
	            <div><span id="previewSolutionsAndApproach"></span></div>
	            <div><span id="previewFinancial"></span></div>
	            <div><span id="previewConclusion"></span></div>
	        </div>
	    </div>
	</body>
</html>