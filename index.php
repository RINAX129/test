<!DOPCTYPE html>
<html lang="ja">
    <head>
        <meta charset="UTF-8">
        <title>4eachblog 掲示板</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    
    <body>
        
        <?php
        
        mb_internal_encoding("utf8");
        $pdo=new PDO("mysql:dbname=lesson01;host=localhost;","root","");
        $stmt=$pdo->query("select*from 4each_keijiban");
        
        /*while($row=$stmt->fetch()){
            echo $row['handlename'];
            echo $row['title'];
            echo $row['comments'];
        }*/
            
        while($row=$stmt->fetch()){
            echo"<div class='box1'>";
            echo"<h2>".$row['title']."</h2>";
            echo"<p>";
            echo $row['comments'];
            echo"</p>";
            echo "<h5>posted by".$row['handlename']."</h5>";
            echo"</div>";
        }
        
        ?>
        
        <div class="logo">
            <img src="./4eachblog_logo.jpg">
        </div>
        
        <div class="menu">
            <ul>
                <li>トップ</li>
                <li>プロフィール</li>
                <li>4eachについて</li>
                <li>登録フォーム</li>
                <li>問い合わせ</li>
                <li>その他</li>
            </ul>
        </div>
        
        <main>

            <div class="left">
                <h1>プログラミングに役立つ掲示板</h1>
                
                <form method="post" action="insert.php">
                    <h2>入力フォーム</h2>
                    
                    <div>
                        ハンドルネーム<br>
                        <input type="text" class="text" size="30" name="handlename">
                    </div>
                    <br>
                    
                    <div>
                        タイトル<br>
                        <input type="text" class="text" size="30" name="title">
                    </div>
                    <br>
                    
                    <div>
                    コメント<br>
                    <textarea rows="7" cols="50" name="comments"></textarea>
                    </div>
                    <br>
                    
                    <div>
                        <input type="submit" class="submit" size="30" value="投稿する">
                    </div>
                </form>
                
                <?php
                
                echo"<div class='box1'>";
                echo"<h2>タイトル</h2>";
                echo"<p>";
                echo"記事の中身,記事の中身,記事の中身,記事の中身,記事の中身,記事の中身,記事の中身,記事の中身,記事の中身,記事の中身,記事の中身,記事の中身,<br>
                記事の中身,記事の中身,記事の中身,記事の中身,<br>
                記事の中身,記事の中身,記事の中身,記事の中身,記事の中身,記事の中身,<br> 
                記事の中身,記事の中身,記事の中身,記事の中身,記事の中身,記事の中身,";
                echo"</p>";
                echo"<h5>produce by通りすがり</h5>";
                echo"</div>"
                    
                ?>

                <div class="box2">
                <h2>タイトル</h2>
                <p>記事の中身,記事の中身,記事の中身,記事の中身,記事の中身,記事の中身,記事の中身,記事の中身,記事の中身,記事の中身,記事の中身,記事の中身,<br>
                記事の中身,記事の中身,記事の中身,記事の中身,<br>
                記事の中身,記事の中身,記事の中身,記事の中身,記事の中身,記事の中身,<br> 
                記事の中身,記事の中身,記事の中身,記事の中身,記事の中身,記事の中身,</p>
                <h5>produce by通りすがり</h5>
                </div>  
            </div>
 
            <div class="right">
               <h2>人気の記事</h2>
                <ul>
                    <li>PHPオススメ本</li>
                    <li>PHP MyAdminの使い方</li>
                    <li>いま人気のエディタTop5</li>
                    <li>HTMLの基礎</li>
                </ul>
                <br>
                <h2>オススメリンク</h2>
                <ul>
                    <li>インターノウス株式会社</li>
                    <li>XAMPPのダウンロード</li>
                    <li>Eclipseのダウンロード</li>
                    <li>Bracktsのダウンロード</li>
                </ul>
                <br>
                <h2>カテゴリ</h2>
                <ul>
                    <li>HTML</li>
                    <li>PHP</li>
                    <li>MySQL</li>
                    <li>JavaScript</li>
                </ul>
            </div>
            
        </main>
        
        <footer>
            copyright c internous | 4each blog is the one which provides A to Z about programing.
        </footer>
        
    </body>
</html>