  


<!DOCTYPE html>
<html>
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# githubog: http://ogp.me/ns/fb/githubog#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>CS5340FinalProject/CS5340FinalProject/src/StringMatcher.java at 20295f7ad4964baaf396ddf7ce38b1af5415fb10 · brekkie/CS5340FinalProject</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub" />
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub" />
    <link rel="apple-touch-icon-precomposed" sizes="57x57" href="apple-touch-icon-114.png" />
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="apple-touch-icon-114.png" />
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="apple-touch-icon-144.png" />
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="apple-touch-icon-144.png" />
    <meta name="msapplication-TileImage" content="/windows-tile.png">
    <meta name="msapplication-TileColor" content="#ffffff">

    
    
    <link rel="icon" type="image/x-icon" href="/favicon.ico" />

    <meta content="authenticity_token" name="csrf-param" />
<meta content="bnbsCJ0Kf+IvTTpXKLwY3+jIcNARXuynEgGdWLRBUHA=" name="csrf-token" />

    <link href="https://a248.e.akamai.net/assets.github.com/assets/github-0e32f81f7335640e8749ec2640f0bb96cb197f66.css" media="screen" rel="stylesheet" type="text/css" />
    <link href="https://a248.e.akamai.net/assets.github.com/assets/github2-4bddbb8a794100992349be0f15692563223b5fc2.css" media="screen" rel="stylesheet" type="text/css" />
    


    <script src="https://a248.e.akamai.net/assets.github.com/assets/frameworks-57542e0cba19d068168099f287c117efa142863c.js" type="text/javascript"></script>
    <script src="https://a248.e.akamai.net/assets.github.com/assets/github-65c8131db26cee4318983041a0339ebe444a0fd4.js" type="text/javascript"></script>
    

      <link rel='permalink' href='/brekkie/CS5340FinalProject/blob/20295f7ad4964baaf396ddf7ce38b1af5415fb10/CS5340FinalProject/src/StringMatcher.java'>
    <meta property="og:title" content="CS5340FinalProject"/>
    <meta property="og:type" content="githubog:gitrepository"/>
    <meta property="og:url" content="https://github.com/brekkie/CS5340FinalProject"/>
    <meta property="og:image" content="https://a248.e.akamai.net/assets.github.com/images/gravatars/gravatar-user-420.png?1345673561"/>
    <meta property="og:site_name" content="GitHub"/>
    <meta property="og:description" content="Contribute to CS5340FinalProject development by creating an account on GitHub."/>

    <meta name="description" content="Contribute to CS5340FinalProject development by creating an account on GitHub." />

  <link href="https://github.com/brekkie/CS5340FinalProject/commits/20295f7ad4964baaf396ddf7ce38b1af5415fb10.atom?login=theblur05&token=ed3fb8ea97869727b5831296f248bdb5" rel="alternate" title="Recent Commits to CS5340FinalProject:20295f7ad4964baaf396ddf7ce38b1af5415fb10" type="application/atom+xml" />

  </head>


  <body class="logged_in page-blob windows vis-private env-production ">
    <div id="wrapper">

      

      

      


        <div class="header header-logged-in true">
          <div class="container clearfix">

            <a class="header-logo-blacktocat" href="https://github.com/">
  <span class="mega-icon mega-icon-blacktocat"></span>
</a>

            <div class="divider-vertical"></div>

              <a href="/notifications" class="notification-indicator tooltipped downwards" title="You have no unread notifications">
    <span class="mail-status all-read"></span>
  </a>
  <div class="divider-vertical"></div>


              
  <div class="topsearch command-bar-activated">
    <form accept-charset="UTF-8" action="/search" class="command_bar_form" id="top_search_form" method="get">
  <a href="/search/advanced" class="advanced-search tooltipped downwards command-bar-search" id="advanced_search" title="Advanced search"><span class="mini-icon mini-icon-advanced-search "></span></a>

  <input type="text" name="q" id="command-bar" placeholder="Search or type a command" tabindex="1" data-username="theblur05" autocapitalize="off">

  <span class="mini-icon help tooltipped downwards" title="Show command bar help">
    <span class="mini-icon mini-icon-help"></span>
  </span>

  <input type="hidden" name="ref" value="commandbar">

  <div class="divider-vertical"></div>
</form>



    <ul class="top-nav">
        <li class="explore"><a href="https://github.com/explore">Explore</a></li>
        <li><a href="https://gist.github.com">Gist</a></li>
        <li><a href="/blog">Blog</a></li>
      <li><a href="http://help.github.com">Help</a></li>
    </ul>
  </div>


            

  
    <ul id="user-links">
      <li>
        <a href="https://github.com/theblur05" class="name">
          <img height="20" src="https://secure.gravatar.com/avatar/beff9e67978a72200d53d343a24131de?s=140&amp;d=https://a248.e.akamai.net/assets.github.com%2Fimages%2Fgravatars%2Fgravatar-user-420.png" width="20" /> theblur05
        </a>
      </li>
      <li>
        <a href="/new" id="new_repo" class="tooltipped downwards" title="Create a new repo">
          <span class="mini-icon mini-icon-create"></span>
        </a>
      </li>
      <li>
        <a href="/settings/profile" id="account_settings"
          class="tooltipped downwards"
          title="Account settings ">
          <span class="mini-icon mini-icon-account-settings"></span>
        </a>
      </li>
      <li>
          <a href="/logout" data-method="post" id="logout" class="tooltipped downwards" title="Sign out">
            <span class="mini-icon mini-icon-logout"></span>
          </a>
      </li>
    </ul>



            
          </div>
        </div>


      

      


            <div class="site hfeed" itemscope itemtype="http://schema.org/WebPage">
      <div class="hentry">
        
        <div class="pagehead repohead instapaper_ignore readability-menu">
          <div class="container">
            <div class="title-actions-bar">
              


                  <ul class="pagehead-actions">
          <li class="nspr">
            <a href="/brekkie/CS5340FinalProject/pull/new/20295f7ad4964baaf396ddf7ce38b1af5415fb10" class="minibutton btn-pull-request" icon_class="mini-icon-pull-request"><span class="mini-icon mini-icon-pull-request"></span>Pull Request</a>
          </li>

          <li class="subscription">
              <form accept-charset="UTF-8" action="/notifications/subscribe" data-autosubmit="true" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="authenticity_token" type="hidden" value="bnbsCJ0Kf+IvTTpXKLwY3+jIcNARXuynEgGdWLRBUHA=" /></div>  <input id="repository_id" name="repository_id" type="hidden" value="6325804" />
  <div class="context-menu-container js-menu-container js-context-menu">
    <span class="minibutton switcher bigger js-menu-target">
      <span class="js-context-button">
          <span class="mini-icon mini-icon-unwatch"></span>Unwatch
      </span>
    </span>

    <div class="context-pane js-menu-content">
      <a href="javascript:;" class="close js-menu-close"><span class="mini-icon mini-icon-remove-close"></span></a>
      <div class="context-title">Notification status</div>

      <div class="context-body pane-selector">
        <ul class="js-navigation-container">
          <li class="selector-item js-navigation-item js-navigation-target ">
            <span class="mini-icon mini-icon-confirm"></span>
            <label>
              <input id="do_included" name="do" type="radio" value="included" />
              <h4>Not watching</h4>
              <p>You will only receive notifications when you participate or are mentioned.</p>
            </label>
            <span class="context-button-text js-context-button-text">
              <span class="mini-icon mini-icon-watching"></span>
              Watch
            </span>
          </li>
          <li class="selector-item js-navigation-item js-navigation-target selected">
            <span class="mini-icon mini-icon-confirm"></span>
            <label>
              <input checked="checked" id="do_subscribed" name="do" type="radio" value="subscribed" />
              <h4>Watching</h4>
              <p>You will receive all notifications for this repository.</p>
            </label>
            <span class="context-button-text js-context-button-text">
              <span class="mini-icon mini-icon-unwatch"></span>
              Unwatch
            </span>
          </li>
          <li class="selector-item js-navigation-item js-navigation-target ">
            <span class="mini-icon mini-icon-confirm"></span>
            <label>
              <input id="do_ignore" name="do" type="radio" value="ignore" />
              <h4>Ignored</h4>
              <p>You will not receive notifications for this repository.</p>
            </label>
            <span class="context-button-text js-context-button-text">
              <span class="mini-icon mini-icon-mute"></span>
              Stop ignoring
            </span>
          </li>
        </ul>
      </div>
    </div>
  </div>
</form>
          </li>

          <li class="js-toggler-container js-social-container starring-container ">
            <a href="/brekkie/CS5340FinalProject/unstar" class="minibutton js-toggler-target starred" data-remote="true" data-method="post" rel="nofollow">
              <span class="mini-icon mini-icon-star"></span>Unstar
            </a><a href="/brekkie/CS5340FinalProject/star" class="minibutton js-toggler-target unstarred" data-remote="true" data-method="post" rel="nofollow">
              <span class="mini-icon mini-icon-star"></span>Star
            </a><a class="social-count js-social-count" href="/brekkie/CS5340FinalProject/stargazers">0</a>
          </li>

              <li><a href="/brekkie/CS5340FinalProject/fork" class="minibutton js-toggler-target fork-button lighter" rel="nofollow" data-method="post"><span class="mini-icon mini-icon-fork"></span>Fork</a><a href="/brekkie/CS5340FinalProject/network" class="social-count">0</a>
              </li>


    </ul>

              <h1 itemscope itemtype="http://data-vocabulary.org/Breadcrumb" class="entry-title private">
                <span class="repo-label"><span>private</span></span>
                <span class="mega-icon mega-icon-private-repo"></span>
                <span class="author vcard">
                  <a href="/brekkie" class="url fn" itemprop="url" rel="author">
                  <span itemprop="title">brekkie</span>
                  </a></span> /
                <strong><a href="/brekkie/CS5340FinalProject" class="js-current-repository">CS5340FinalProject</a></strong>
              </h1>
            </div>

            

  <ul class="tabs">
    <li><a href="/brekkie/CS5340FinalProject" class="selected" highlight="repo_sourcerepo_downloadsrepo_commitsrepo_tagsrepo_branches">Code</a></li>
    <li><a href="/brekkie/CS5340FinalProject/network" highlight="repo_network">Network</a></li>
    <li><a href="/brekkie/CS5340FinalProject/pulls" highlight="repo_pulls">Pull Requests <span class='counter'>0</span></a></li>

      <li><a href="/brekkie/CS5340FinalProject/issues" highlight="repo_issues">Issues <span class='counter'>0</span></a></li>

      <li><a href="/brekkie/CS5340FinalProject/wiki" highlight="repo_wiki">Wiki</a></li>


    <li><a href="/brekkie/CS5340FinalProject/graphs" highlight="repo_graphsrepo_contributors">Graphs</a></li>


  </ul>
  
<div class="tabnav">

  <span class="tabnav-right">
    <ul class="tabnav-tabs">
      <li><a href="/brekkie/CS5340FinalProject/tags" class="tabnav-tab" highlight="repo_tags">Tags <span class="counter blank">0</span></a></li>
      <li><a href="/brekkie/CS5340FinalProject/downloads" class="tabnav-tab" highlight="repo_downloads">Downloads <span class="counter blank">0</span></a></li>
    </ul>
    
  <div class="tabnav-widget search repo-search ">
    <form accept-charset="UTF-8" action="/brekkie/CS5340FinalProject/search" method="get">
      <span class="fieldwrap">
        <input type="text" name="q" value=""
          placeholder="Search source code&hellip;" tabindex="2" autocapitalize="off" /><button type="submit" class="minibutton empty-icon"><span class="mini-icon mini-icon-search-input"></span></button>
      </span>
      <input type="hidden" id="lang-value" name="l" value="" />
      <input type="hidden" id="start-value" name="start" value="" />
</form>  </div>

  </span>

  <div class="tabnav-widget scope">


    <div class="context-menu-container js-menu-container js-context-menu">
      <a href="#"
         class="minibutton bigger switcher js-menu-target js-commitish-button btn-tree repo-tree"
         data-hotkey="w"
         data-ref="">
         <span><em class="mini-icon mini-icon-tree"></em><i>tree:</i> 20295f7ad4</span>
      </a>

      <div class="context-pane commitish-context js-menu-content">
        <a href="javascript:;" class="close js-menu-close"><span class="mini-icon mini-icon-remove-close"></span></a>
        <div class="context-title">Switch branches/tags</div>
        <div class="context-body pane-selector commitish-selector js-navigation-container">
          <div class="filterbar">
            <input type="text" id="context-commitish-filter-field" class="js-navigation-enable js-filterable-field" placeholder="Filter branches/tags">
            <ul class="tabs">
              <li><a href="#" data-filter="branches" class="selected">Branches</a></li>
                <li><a href="#" data-filter="tags">Tags</a></li>
            </ul>
          </div>

          <div class="js-filter-tab js-filter-branches">
            <div data-filterable-for="context-commitish-filter-field" data-filterable-type=substring>
                <div class="commitish-item branch-commitish selector-item js-navigation-item js-navigation-target ">
                  <span class="mini-icon mini-icon-confirm"></span>
                  <h4>
                      <a href="/brekkie/CS5340FinalProject/blob/master/CS5340FinalProject/src/StringMatcher.java" class="js-navigation-open" data-name="master" rel="nofollow">master</a>
                  </h4>
                </div>
            </div>
            <div class="no-results">Nothing to show</div>
          </div>

            <div class="js-filter-tab js-filter-tags filter-tab-empty" style="display:none">
              <div data-filterable-for="context-commitish-filter-field" data-filterable-type=substring>
              </div>
              <div class="no-results">Nothing to show</div>
            </div>
        </div>
      </div><!-- /.commitish-context-context -->
    </div>
  </div> <!-- /.scope -->

  <ul class="tabnav-tabs">
    <li><a href="/brekkie/CS5340FinalProject" class="selected tabnav-tab" highlight="repo_source">Files</a></li>
    <li><a href="/brekkie/CS5340FinalProject/commits/" class="tabnav-tab" highlight="repo_commits">Commits</a></li>
    <li><a href="/brekkie/CS5340FinalProject/branches" class="tabnav-tab" highlight="repo_branches" rel="nofollow">Branches <span class="counter ">1</span></a></li>
  </ul>

</div>

  
  
  


            
          </div>
        </div><!-- /.repohead -->

        <div id="js-repo-pjax-container" class="container context-loader-container" data-pjax-container>
          


<!-- blob contrib key: blob_contributors:v21:52685b928503749bcfbbf912b6678fd6 -->
<!-- blob contrib frag key: views10/v8/blob_contributors:v21:52685b928503749bcfbbf912b6678fd6 -->

<div id="slider">


    <p title="This is a placeholder element" class="js-history-link-replace hidden"></p>
    <div class="breadcrumb" data-path="CS5340FinalProject/src/StringMatcher.java/">
      <span class='bold'><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/brekkie/CS5340FinalProject/tree/20295f7ad4964baaf396ddf7ce38b1af5415fb10" class="js-slider-breadcrumb" itemscope="url" rel="nofollow"><span itemprop="title">CS5340FinalProject</span></a></span></span> / <span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/brekkie/CS5340FinalProject/tree/20295f7ad4964baaf396ddf7ce38b1af5415fb10/CS5340FinalProject" class="js-slider-breadcrumb" itemscope="url" rel="nofollow"><span itemprop="title">CS5340FinalProject</span></a></span> / <span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/brekkie/CS5340FinalProject/tree/20295f7ad4964baaf396ddf7ce38b1af5415fb10/CS5340FinalProject/src" class="js-slider-breadcrumb" itemscope="url" rel="nofollow"><span itemprop="title">src</span></a></span> / <strong class="final-path">StringMatcher.java</strong> <span class="js-clippy mini-icon mini-icon-clippy " data-clipboard-text="CS5340FinalProject/src/StringMatcher.java" data-copied-hint="copied!" data-copy-hint="copy to clipboard"></span>
    </div>

    <a href="/brekkie/CS5340FinalProject/find/20295f7ad4964baaf396ddf7ce38b1af5415fb10" class="js-slide-to" data-hotkey="t" style="display:none">Show File Finder</a>

      <div class="commit commit-loader file-history-tease js-deferred-content" data-url="/brekkie/CS5340FinalProject/contributors/20295f7ad4964baaf396ddf7ce38b1af5415fb10/CS5340FinalProject/src/StringMatcher.java" data-path="CS5340FinalProject/src/StringMatcher.java/">
        Fetching contributors…

        <div class="participation">
          <p class="loader-loading"><img alt="Octocat-spinner-32-eaf2f5" height="16" src="https://a248.e.akamai.net/assets.github.com/images/spinners/octocat-spinner-32-EAF2F5.gif?1338945075" width="16" /></p>
          <p class="loader-error">Cannot retrieve contributors at this time</p>
        </div>
      </div>

    <div class="frames">
      <div class="frame frame-center" data-path="CS5340FinalProject/src/StringMatcher.java/" data-permalink-url="/brekkie/CS5340FinalProject/blob/20295f7ad4964baaf396ddf7ce38b1af5415fb10/CS5340FinalProject/src/StringMatcher.java" data-title="CS5340FinalProject/CS5340FinalProject/src/StringMatcher.java at 20295f7ad4964baaf396ddf7ce38b1af5415fb10 · brekkie/CS5340FinalProject · GitHub" data-type="blob">

        <div id="files" class="bubble">
          <div class="file">
            <div class="meta">
              <div class="info">
                <span class="icon"><b class="mini-icon mini-icon-text-file"></b></span>
                <span class="mode" title="File Mode">file</span>
                  <span>229 lines (207 sloc)</span>
                <span>7.862 kb</span>
              </div>
              <ul class="button-group actions">
                <li><a href="/brekkie/CS5340FinalProject/raw/20295f7ad4964baaf396ddf7ce38b1af5415fb10/CS5340FinalProject/src/StringMatcher.java" class="minibutton grouped-button bigger lighter" id="raw-url">Raw</a></li>
                  <li><a href="/brekkie/CS5340FinalProject/blame/20295f7ad4964baaf396ddf7ce38b1af5415fb10/CS5340FinalProject/src/StringMatcher.java" class="minibutton grouped-button bigger lighter">Blame</a></li>
                <li><a href="/brekkie/CS5340FinalProject/commits/20295f7ad4964baaf396ddf7ce38b1af5415fb10/CS5340FinalProject/src/StringMatcher.java" class="minibutton grouped-button bigger lighter" rel="nofollow">History</a></li>
              </ul>
            </div>
                <div class="data type-java">
      <table cellpadding="0" cellspacing="0" class="lines">
        <tr>
          <td>
            <pre class="line_numbers"><span id="L1" rel="#L1">1</span>
<span id="L2" rel="#L2">2</span>
<span id="L3" rel="#L3">3</span>
<span id="L4" rel="#L4">4</span>
<span id="L5" rel="#L5">5</span>
<span id="L6" rel="#L6">6</span>
<span id="L7" rel="#L7">7</span>
<span id="L8" rel="#L8">8</span>
<span id="L9" rel="#L9">9</span>
<span id="L10" rel="#L10">10</span>
<span id="L11" rel="#L11">11</span>
<span id="L12" rel="#L12">12</span>
<span id="L13" rel="#L13">13</span>
<span id="L14" rel="#L14">14</span>
<span id="L15" rel="#L15">15</span>
<span id="L16" rel="#L16">16</span>
<span id="L17" rel="#L17">17</span>
<span id="L18" rel="#L18">18</span>
<span id="L19" rel="#L19">19</span>
<span id="L20" rel="#L20">20</span>
<span id="L21" rel="#L21">21</span>
<span id="L22" rel="#L22">22</span>
<span id="L23" rel="#L23">23</span>
<span id="L24" rel="#L24">24</span>
<span id="L25" rel="#L25">25</span>
<span id="L26" rel="#L26">26</span>
<span id="L27" rel="#L27">27</span>
<span id="L28" rel="#L28">28</span>
<span id="L29" rel="#L29">29</span>
<span id="L30" rel="#L30">30</span>
<span id="L31" rel="#L31">31</span>
<span id="L32" rel="#L32">32</span>
<span id="L33" rel="#L33">33</span>
<span id="L34" rel="#L34">34</span>
<span id="L35" rel="#L35">35</span>
<span id="L36" rel="#L36">36</span>
<span id="L37" rel="#L37">37</span>
<span id="L38" rel="#L38">38</span>
<span id="L39" rel="#L39">39</span>
<span id="L40" rel="#L40">40</span>
<span id="L41" rel="#L41">41</span>
<span id="L42" rel="#L42">42</span>
<span id="L43" rel="#L43">43</span>
<span id="L44" rel="#L44">44</span>
<span id="L45" rel="#L45">45</span>
<span id="L46" rel="#L46">46</span>
<span id="L47" rel="#L47">47</span>
<span id="L48" rel="#L48">48</span>
<span id="L49" rel="#L49">49</span>
<span id="L50" rel="#L50">50</span>
<span id="L51" rel="#L51">51</span>
<span id="L52" rel="#L52">52</span>
<span id="L53" rel="#L53">53</span>
<span id="L54" rel="#L54">54</span>
<span id="L55" rel="#L55">55</span>
<span id="L56" rel="#L56">56</span>
<span id="L57" rel="#L57">57</span>
<span id="L58" rel="#L58">58</span>
<span id="L59" rel="#L59">59</span>
<span id="L60" rel="#L60">60</span>
<span id="L61" rel="#L61">61</span>
<span id="L62" rel="#L62">62</span>
<span id="L63" rel="#L63">63</span>
<span id="L64" rel="#L64">64</span>
<span id="L65" rel="#L65">65</span>
<span id="L66" rel="#L66">66</span>
<span id="L67" rel="#L67">67</span>
<span id="L68" rel="#L68">68</span>
<span id="L69" rel="#L69">69</span>
<span id="L70" rel="#L70">70</span>
<span id="L71" rel="#L71">71</span>
<span id="L72" rel="#L72">72</span>
<span id="L73" rel="#L73">73</span>
<span id="L74" rel="#L74">74</span>
<span id="L75" rel="#L75">75</span>
<span id="L76" rel="#L76">76</span>
<span id="L77" rel="#L77">77</span>
<span id="L78" rel="#L78">78</span>
<span id="L79" rel="#L79">79</span>
<span id="L80" rel="#L80">80</span>
<span id="L81" rel="#L81">81</span>
<span id="L82" rel="#L82">82</span>
<span id="L83" rel="#L83">83</span>
<span id="L84" rel="#L84">84</span>
<span id="L85" rel="#L85">85</span>
<span id="L86" rel="#L86">86</span>
<span id="L87" rel="#L87">87</span>
<span id="L88" rel="#L88">88</span>
<span id="L89" rel="#L89">89</span>
<span id="L90" rel="#L90">90</span>
<span id="L91" rel="#L91">91</span>
<span id="L92" rel="#L92">92</span>
<span id="L93" rel="#L93">93</span>
<span id="L94" rel="#L94">94</span>
<span id="L95" rel="#L95">95</span>
<span id="L96" rel="#L96">96</span>
<span id="L97" rel="#L97">97</span>
<span id="L98" rel="#L98">98</span>
<span id="L99" rel="#L99">99</span>
<span id="L100" rel="#L100">100</span>
<span id="L101" rel="#L101">101</span>
<span id="L102" rel="#L102">102</span>
<span id="L103" rel="#L103">103</span>
<span id="L104" rel="#L104">104</span>
<span id="L105" rel="#L105">105</span>
<span id="L106" rel="#L106">106</span>
<span id="L107" rel="#L107">107</span>
<span id="L108" rel="#L108">108</span>
<span id="L109" rel="#L109">109</span>
<span id="L110" rel="#L110">110</span>
<span id="L111" rel="#L111">111</span>
<span id="L112" rel="#L112">112</span>
<span id="L113" rel="#L113">113</span>
<span id="L114" rel="#L114">114</span>
<span id="L115" rel="#L115">115</span>
<span id="L116" rel="#L116">116</span>
<span id="L117" rel="#L117">117</span>
<span id="L118" rel="#L118">118</span>
<span id="L119" rel="#L119">119</span>
<span id="L120" rel="#L120">120</span>
<span id="L121" rel="#L121">121</span>
<span id="L122" rel="#L122">122</span>
<span id="L123" rel="#L123">123</span>
<span id="L124" rel="#L124">124</span>
<span id="L125" rel="#L125">125</span>
<span id="L126" rel="#L126">126</span>
<span id="L127" rel="#L127">127</span>
<span id="L128" rel="#L128">128</span>
<span id="L129" rel="#L129">129</span>
<span id="L130" rel="#L130">130</span>
<span id="L131" rel="#L131">131</span>
<span id="L132" rel="#L132">132</span>
<span id="L133" rel="#L133">133</span>
<span id="L134" rel="#L134">134</span>
<span id="L135" rel="#L135">135</span>
<span id="L136" rel="#L136">136</span>
<span id="L137" rel="#L137">137</span>
<span id="L138" rel="#L138">138</span>
<span id="L139" rel="#L139">139</span>
<span id="L140" rel="#L140">140</span>
<span id="L141" rel="#L141">141</span>
<span id="L142" rel="#L142">142</span>
<span id="L143" rel="#L143">143</span>
<span id="L144" rel="#L144">144</span>
<span id="L145" rel="#L145">145</span>
<span id="L146" rel="#L146">146</span>
<span id="L147" rel="#L147">147</span>
<span id="L148" rel="#L148">148</span>
<span id="L149" rel="#L149">149</span>
<span id="L150" rel="#L150">150</span>
<span id="L151" rel="#L151">151</span>
<span id="L152" rel="#L152">152</span>
<span id="L153" rel="#L153">153</span>
<span id="L154" rel="#L154">154</span>
<span id="L155" rel="#L155">155</span>
<span id="L156" rel="#L156">156</span>
<span id="L157" rel="#L157">157</span>
<span id="L158" rel="#L158">158</span>
<span id="L159" rel="#L159">159</span>
<span id="L160" rel="#L160">160</span>
<span id="L161" rel="#L161">161</span>
<span id="L162" rel="#L162">162</span>
<span id="L163" rel="#L163">163</span>
<span id="L164" rel="#L164">164</span>
<span id="L165" rel="#L165">165</span>
<span id="L166" rel="#L166">166</span>
<span id="L167" rel="#L167">167</span>
<span id="L168" rel="#L168">168</span>
<span id="L169" rel="#L169">169</span>
<span id="L170" rel="#L170">170</span>
<span id="L171" rel="#L171">171</span>
<span id="L172" rel="#L172">172</span>
<span id="L173" rel="#L173">173</span>
<span id="L174" rel="#L174">174</span>
<span id="L175" rel="#L175">175</span>
<span id="L176" rel="#L176">176</span>
<span id="L177" rel="#L177">177</span>
<span id="L178" rel="#L178">178</span>
<span id="L179" rel="#L179">179</span>
<span id="L180" rel="#L180">180</span>
<span id="L181" rel="#L181">181</span>
<span id="L182" rel="#L182">182</span>
<span id="L183" rel="#L183">183</span>
<span id="L184" rel="#L184">184</span>
<span id="L185" rel="#L185">185</span>
<span id="L186" rel="#L186">186</span>
<span id="L187" rel="#L187">187</span>
<span id="L188" rel="#L188">188</span>
<span id="L189" rel="#L189">189</span>
<span id="L190" rel="#L190">190</span>
<span id="L191" rel="#L191">191</span>
<span id="L192" rel="#L192">192</span>
<span id="L193" rel="#L193">193</span>
<span id="L194" rel="#L194">194</span>
<span id="L195" rel="#L195">195</span>
<span id="L196" rel="#L196">196</span>
<span id="L197" rel="#L197">197</span>
<span id="L198" rel="#L198">198</span>
<span id="L199" rel="#L199">199</span>
<span id="L200" rel="#L200">200</span>
<span id="L201" rel="#L201">201</span>
<span id="L202" rel="#L202">202</span>
<span id="L203" rel="#L203">203</span>
<span id="L204" rel="#L204">204</span>
<span id="L205" rel="#L205">205</span>
<span id="L206" rel="#L206">206</span>
<span id="L207" rel="#L207">207</span>
<span id="L208" rel="#L208">208</span>
<span id="L209" rel="#L209">209</span>
<span id="L210" rel="#L210">210</span>
<span id="L211" rel="#L211">211</span>
<span id="L212" rel="#L212">212</span>
<span id="L213" rel="#L213">213</span>
<span id="L214" rel="#L214">214</span>
<span id="L215" rel="#L215">215</span>
<span id="L216" rel="#L216">216</span>
<span id="L217" rel="#L217">217</span>
<span id="L218" rel="#L218">218</span>
<span id="L219" rel="#L219">219</span>
<span id="L220" rel="#L220">220</span>
<span id="L221" rel="#L221">221</span>
<span id="L222" rel="#L222">222</span>
<span id="L223" rel="#L223">223</span>
<span id="L224" rel="#L224">224</span>
<span id="L225" rel="#L225">225</span>
<span id="L226" rel="#L226">226</span>
<span id="L227" rel="#L227">227</span>
<span id="L228" rel="#L228">228</span>
</pre>
          </td>
          <td width="100%">
                <div class="highlight"><pre><div class='line' id='LC1'><span class="kn">import</span> <span class="nn">java.io.BufferedWriter</span><span class="o">;</span></div><div class='line' id='LC2'><span class="kn">import</span> <span class="nn">java.io.FileWriter</span><span class="o">;</span></div><div class='line' id='LC3'><span class="kn">import</span> <span class="nn">java.util.ArrayList</span><span class="o">;</span></div><div class='line' id='LC4'><br/></div><div class='line' id='LC5'><span class="cm">/**</span></div><div class='line' id='LC6'><span class="cm"> * This class is a collection of static methods that will take care of string matching</span></div><div class='line' id='LC7'><span class="cm"> * @author James</span></div><div class='line' id='LC8'><span class="cm"> *</span></div><div class='line' id='LC9'><span class="cm"> */</span></div><div class='line' id='LC10'><span class="kd">public</span> <span class="kd">class</span> <span class="nc">StringMatcher</span> <span class="o">{</span></div><div class='line' id='LC11'><br/></div><div class='line' id='LC12'><br/></div><div class='line' id='LC13'>	<span class="cm">/**</span></div><div class='line' id='LC14'><span class="cm">	 * This method will compare a coreference against a candidate NounPhrase. Specifically,</span></div><div class='line' id='LC15'><span class="cm">	 * this method will compare the coreference&#39;s Named entities against the candidate&#39;s named entities</span></div><div class='line' id='LC16'><span class="cm">	 *  Once a NounPhrase&#39;s classification and named entity phrase match exactly, this</span></div><div class='line' id='LC17'><span class="cm">	 * method will return 1. If no match is found, 0 will be returned.</span></div><div class='line' id='LC18'><span class="cm">	 * @param candidate possible match</span></div><div class='line' id='LC19'><span class="cm">	 * @param current coreference being matched</span></div><div class='line' id='LC20'><span class="cm">	 * @return 1 if a match is found 0 otherwise</span></div><div class='line' id='LC21'><span class="cm">	 */</span></div><div class='line' id='LC22'>	<span class="kd">public</span> <span class="kd">static</span> <span class="kt">int</span> <span class="nf">matchNE</span><span class="o">(</span><span class="n">NounPhrase</span> <span class="n">candidate</span><span class="o">,</span> <span class="n">NounPhrase</span> <span class="n">coref</span><span class="o">){</span></div><div class='line' id='LC23'>		<span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">NounPhrase</span><span class="o">.</span><span class="na">NamedEntity</span><span class="o">&gt;</span> <span class="n">candNEList</span> <span class="o">=</span> <span class="n">candidate</span><span class="o">.</span><span class="na">getNE</span><span class="o">();</span><span class="c1">//get the current candidate&#39;s List of named entities</span></div><div class='line' id='LC24'>		<span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">NounPhrase</span><span class="o">.</span><span class="na">NamedEntity</span><span class="o">&gt;</span> <span class="n">corefNEList</span> <span class="o">=</span> <span class="n">coref</span><span class="o">.</span><span class="na">getNE</span><span class="o">();</span><span class="c1">//get the coreference&#39;s list of named entities</span></div><div class='line' id='LC25'>		<span class="k">if</span><span class="o">(!</span><span class="n">candNEList</span><span class="o">.</span><span class="na">isEmpty</span><span class="o">()</span> <span class="o">&amp;&amp;</span> <span class="o">!</span><span class="n">corefNEList</span><span class="o">.</span><span class="na">isEmpty</span><span class="o">()){</span> <span class="c1">//check to make sure niether NE list is empty</span></div><div class='line' id='LC26'>			<span class="k">if</span><span class="o">(</span><span class="n">candNEList</span><span class="o">.</span><span class="na">size</span><span class="o">()</span> <span class="o">==</span> <span class="n">corefNEList</span><span class="o">.</span><span class="na">size</span><span class="o">())</span> <span class="c1">//check to see if the coref and NE have the same ammount of NEs</span></div><div class='line' id='LC27'>				<span class="k">for</span><span class="o">(</span><span class="n">NounPhrase</span><span class="o">.</span><span class="na">NamedEntity</span> <span class="nl">ce:</span> <span class="n">candNEList</span><span class="o">){</span></div><div class='line' id='LC28'>					<span class="k">for</span><span class="o">(</span><span class="n">NounPhrase</span><span class="o">.</span><span class="na">NamedEntity</span> <span class="nl">cre:</span> <span class="n">corefNEList</span><span class="o">){</span></div><div class='line' id='LC29'>						<span class="c1">//for each named entity in the coref and candidate&#39;s list. check to see if thier phrases match.</span></div><div class='line' id='LC30'>						<span class="k">if</span><span class="o">(</span><span class="n">ce</span><span class="o">.</span><span class="na">phrase</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="n">cre</span><span class="o">.</span><span class="na">phrase</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="n">ce</span><span class="o">.</span><span class="na">classification</span> <span class="o">==</span> <span class="n">cre</span><span class="o">.</span><span class="na">classification</span><span class="o">){</span></div><div class='line' id='LC31'>									<span class="k">return</span> <span class="mi">2</span><span class="o">;</span></div><div class='line' id='LC32'>						<span class="o">}</span></div><div class='line' id='LC33'>					<span class="o">}</span></div><div class='line' id='LC34'>				<span class="o">}</span></div><div class='line' id='LC35'>			<span class="k">for</span><span class="o">(</span><span class="n">NounPhrase</span><span class="o">.</span><span class="na">NamedEntity</span> <span class="nl">ce:</span> <span class="n">candNEList</span><span class="o">){</span></div><div class='line' id='LC36'>				<span class="k">for</span><span class="o">(</span><span class="n">NounPhrase</span><span class="o">.</span><span class="na">NamedEntity</span> <span class="nl">cre:</span> <span class="n">corefNEList</span><span class="o">){</span></div><div class='line' id='LC37'>					<span class="c1">//for each named entity in the coref and candidate&#39;s list. check to see if thier phrases match.</span></div><div class='line' id='LC38'>					<span class="k">if</span><span class="o">(</span><span class="n">ce</span><span class="o">.</span><span class="na">phrase</span><span class="o">.</span><span class="na">toLowerCase</span><span class="o">().</span><span class="na">trim</span><span class="o">().</span><span class="na">contains</span><span class="o">(</span><span class="n">cre</span><span class="o">.</span><span class="na">phrase</span><span class="o">.</span><span class="na">toLowerCase</span><span class="o">().</span><span class="na">trim</span><span class="o">()))</span></div><div class='line' id='LC39'>								<span class="k">return</span> <span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC40'>				<span class="o">}</span></div><div class='line' id='LC41'>			<span class="o">}</span></div><div class='line' id='LC42'>		<span class="o">}</span></div><div class='line' id='LC43'>		<span class="k">return</span> <span class="mi">0</span><span class="o">;</span></div><div class='line' id='LC44'>	<span class="o">}</span></div><div class='line' id='LC45'><br/></div><div class='line' id='LC46'>	<span class="kd">public</span> <span class="kd">static</span> <span class="kt">int</span> <span class="nf">partialHeadMatch</span><span class="o">(</span><span class="n">NounPhrase</span> <span class="n">candidate</span><span class="o">,</span> <span class="n">NounPhrase</span> <span class="n">coref</span><span class="o">){</span></div><div class='line' id='LC47'>		<span class="k">for</span><span class="o">(</span><span class="n">String</span> <span class="n">c</span> <span class="o">:</span> <span class="n">candidate</span><span class="o">.</span><span class="na">getHeadPhrase</span><span class="o">().</span><span class="na">split</span><span class="o">(</span><span class="s">&quot; &quot;</span><span class="o">))</span></div><div class='line' id='LC48'>			<span class="k">for</span><span class="o">(</span><span class="n">String</span> <span class="n">cr</span> <span class="o">:</span> <span class="n">coref</span><span class="o">.</span><span class="na">getHeadPhrase</span><span class="o">().</span><span class="na">split</span><span class="o">(</span><span class="s">&quot; &quot;</span><span class="o">)){</span></div><div class='line' id='LC49'>				<span class="k">if</span><span class="o">(</span><span class="n">c</span><span class="o">.</span><span class="na">toLowerCase</span><span class="o">().</span><span class="na">trim</span><span class="o">().</span><span class="na">equals</span><span class="o">(</span><span class="n">cr</span><span class="o">.</span><span class="na">toLowerCase</span><span class="o">().</span><span class="na">trim</span><span class="o">()))</span></div><div class='line' id='LC50'>					<span class="k">return</span> <span class="mi">1</span><span class="o">;</span>				</div><div class='line' id='LC51'>			<span class="o">}</span></div><div class='line' id='LC52'>		<span class="k">for</span><span class="o">(</span><span class="n">String</span> <span class="n">c</span> <span class="o">:</span> <span class="n">candidate</span><span class="o">.</span><span class="na">getHeadPhrase</span><span class="o">().</span><span class="na">split</span><span class="o">(</span><span class="s">&quot; &quot;</span><span class="o">))</span></div><div class='line' id='LC53'>			<span class="k">for</span><span class="o">(</span><span class="n">String</span> <span class="n">cr</span> <span class="o">:</span> <span class="n">coref</span><span class="o">.</span><span class="na">getHeadPhrase</span><span class="o">().</span><span class="na">split</span><span class="o">(</span><span class="s">&quot; &quot;</span><span class="o">)){</span></div><div class='line' id='LC54'>				<span class="n">String</span><span class="o">[]</span> <span class="n">ca</span> <span class="o">=</span> <span class="n">c</span><span class="o">.</span><span class="na">split</span><span class="o">(</span><span class="s">&quot; &quot;</span><span class="o">);</span></div><div class='line' id='LC55'>				<span class="n">String</span><span class="o">[]</span> <span class="n">cra</span> <span class="o">=</span> <span class="n">cr</span><span class="o">.</span><span class="na">split</span><span class="o">(</span><span class="s">&quot; &quot;</span><span class="o">);</span></div><div class='line' id='LC56'>				<span class="k">if</span><span class="o">(</span><span class="n">ca</span><span class="o">.</span><span class="na">length</span> <span class="o">&gt;</span> <span class="mi">0</span> <span class="o">&amp;&amp;</span> <span class="n">cra</span><span class="o">.</span><span class="na">length</span> <span class="o">&gt;</span> <span class="mi">0</span><span class="o">)</span></div><div class='line' id='LC57'>					<span class="k">if</span><span class="o">(</span><span class="n">ca</span><span class="o">[</span><span class="n">ca</span><span class="o">.</span><span class="na">length</span><span class="o">-</span><span class="mi">1</span><span class="o">].</span><span class="na">equals</span><span class="o">(</span><span class="n">cra</span><span class="o">[</span><span class="n">cra</span><span class="o">.</span><span class="na">length</span><span class="o">-</span><span class="mi">1</span><span class="o">]))</span></div><div class='line' id='LC58'>						<span class="k">return</span> <span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC59'>			<span class="o">}</span></div><div class='line' id='LC60'>		<span class="k">return</span> <span class="mi">0</span><span class="o">;</span></div><div class='line' id='LC61'>	<span class="o">}</span></div><div class='line' id='LC62'><br/></div><div class='line' id='LC63'>	<span class="cm">/**</span></div><div class='line' id='LC64'><span class="cm">	 * This method will take a candidate Noun phrase and compare its head phrase with the coreference&#39;s</span></div><div class='line' id='LC65'><span class="cm">	 * Head phrase.</span></div><div class='line' id='LC66'><span class="cm">	 * @param candidate possible match </span></div><div class='line' id='LC67'><span class="cm">	 * @param coref</span></div><div class='line' id='LC68'><span class="cm">	 * @return 1 if the head phrases match. 0 otherwise</span></div><div class='line' id='LC69'><span class="cm">	 */</span></div><div class='line' id='LC70'>	<span class="kd">public</span> <span class="kd">static</span> <span class="kt">int</span> <span class="nf">fullStringMatchHeads</span><span class="o">(</span><span class="n">NounPhrase</span> <span class="n">candidate</span><span class="o">,</span> <span class="n">NounPhrase</span> <span class="n">coref</span><span class="o">){</span></div><div class='line' id='LC71'>		<span class="n">String</span> <span class="n">candHead</span> <span class="o">=</span> <span class="n">candidate</span><span class="o">.</span><span class="na">getHeadPhrase</span><span class="o">();</span></div><div class='line' id='LC72'>		<span class="n">String</span> <span class="n">corefHead</span> <span class="o">=</span> <span class="n">coref</span><span class="o">.</span><span class="na">getHeadPhrase</span><span class="o">();</span></div><div class='line' id='LC73'>		<span class="k">if</span><span class="o">(</span><span class="n">candHead</span><span class="o">.</span><span class="na">equals</span><span class="o">(</span><span class="n">corefHead</span><span class="o">))</span></div><div class='line' id='LC74'>			<span class="k">return</span> <span class="mi">2</span><span class="o">;</span></div><div class='line' id='LC75'>		<span class="k">if</span><span class="o">(</span><span class="n">candidate</span><span class="o">.</span><span class="na">getHeadPhrase</span><span class="o">().</span><span class="na">contains</span><span class="o">(</span><span class="n">coref</span><span class="o">.</span><span class="na">getHeadPhrase</span><span class="o">()))</span></div><div class='line' id='LC76'>			<span class="k">return</span> <span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC77'>		<span class="k">return</span> <span class="mi">0</span><span class="o">;</span></div><div class='line' id='LC78'>	<span class="o">}</span></div><div class='line' id='LC79'><br/></div><div class='line' id='LC80'>	<span class="kd">public</span> <span class="kd">static</span> <span class="kt">int</span> <span class="nf">containsStringMatch</span><span class="o">(</span><span class="n">NounPhrase</span> <span class="n">candidate</span><span class="o">,</span> <span class="n">NounPhrase</span> <span class="n">coref</span><span class="o">){</span></div><div class='line' id='LC81'>		<span class="n">String</span> <span class="n">candPhrase</span> <span class="o">=</span> <span class="n">candidate</span><span class="o">.</span><span class="na">getPhrase</span><span class="o">();</span></div><div class='line' id='LC82'>		<span class="n">String</span> <span class="n">corefPhrase</span> <span class="o">=</span> <span class="n">candidate</span><span class="o">.</span><span class="na">getPhrase</span><span class="o">();</span></div><div class='line' id='LC83'>		<span class="k">if</span><span class="o">(</span><span class="n">candPhrase</span><span class="o">.</span><span class="na">contains</span><span class="o">(</span><span class="n">corefPhrase</span><span class="o">))</span></div><div class='line' id='LC84'>			<span class="k">if</span><span class="o">(</span><span class="n">parserUtil</span><span class="o">.</span><span class="na">computeLevenshteinDistance</span><span class="o">(</span><span class="n">candPhrase</span><span class="o">,</span> <span class="n">corefPhrase</span><span class="o">)</span> <span class="o">&lt;</span> <span class="mi">4</span><span class="o">){</span></div><div class='line' id='LC85'>				<span class="k">return</span> <span class="mi">2</span><span class="o">;</span></div><div class='line' id='LC86'>			<span class="o">}</span></div><div class='line' id='LC87'>			<span class="k">else</span></div><div class='line' id='LC88'>				<span class="k">return</span> <span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC89'>		<span class="k">else</span></div><div class='line' id='LC90'>			<span class="k">return</span> <span class="mi">0</span><span class="o">;</span></div><div class='line' id='LC91'>	<span class="o">}</span></div><div class='line' id='LC92'><br/></div><div class='line' id='LC93'>	<span class="kd">public</span> <span class="kd">static</span> <span class="kt">int</span> <span class="nf">distance</span><span class="o">(</span><span class="n">NounPhrase</span> <span class="n">candidate</span><span class="o">,</span> <span class="n">NounPhrase</span> <span class="n">coref</span><span class="o">){</span></div><div class='line' id='LC94'>		<span class="n">String</span> <span class="n">candPhrase</span> <span class="o">=</span> <span class="n">candidate</span><span class="o">.</span><span class="na">getPhrase</span><span class="o">();</span></div><div class='line' id='LC95'>		<span class="n">String</span> <span class="n">corefPhrase</span> <span class="o">=</span> <span class="n">candidate</span><span class="o">.</span><span class="na">getPhrase</span><span class="o">();</span></div><div class='line' id='LC96'>		<span class="k">if</span><span class="o">(</span><span class="n">parserUtil</span><span class="o">.</span><span class="na">computeLevenshteinDistance</span><span class="o">(</span><span class="n">candPhrase</span><span class="o">,</span> <span class="n">corefPhrase</span><span class="o">)</span> <span class="o">&lt;=</span> <span class="mi">8</span><span class="o">){</span></div><div class='line' id='LC97'>			<span class="k">return</span> <span class="mi">2</span><span class="o">;</span></div><div class='line' id='LC98'>		<span class="o">}</span></div><div class='line' id='LC99'>		<span class="k">else</span></div><div class='line' id='LC100'>			<span class="k">return</span> <span class="mi">0</span><span class="o">;</span></div><div class='line' id='LC101'>	<span class="o">}</span></div><div class='line' id='LC102'>	<span class="kd">public</span> <span class="kd">static</span> <span class="kt">int</span> <span class="nf">pluralityMatch</span><span class="o">(</span><span class="n">NounPhrase</span> <span class="n">candidate</span><span class="o">,</span> <span class="n">NounPhrase</span> <span class="n">coref</span><span class="o">){</span></div><div class='line' id='LC103'>		<span class="k">if</span><span class="o">((!</span><span class="n">candidate</span><span class="o">.</span><span class="na">isPlural</span><span class="o">()</span> <span class="o">&amp;&amp;</span> <span class="o">!</span><span class="n">coref</span><span class="o">.</span><span class="na">isPlural</span><span class="o">())</span> <span class="o">||</span> <span class="o">(</span><span class="n">candidate</span><span class="o">.</span><span class="na">isPlural</span><span class="o">()</span> <span class="o">&amp;&amp;</span> <span class="n">coref</span><span class="o">.</span><span class="na">isPlural</span><span class="o">()))</span></div><div class='line' id='LC104'>			<span class="k">return</span> <span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC105'>		<span class="k">else</span></div><div class='line' id='LC106'>			<span class="k">return</span> <span class="mi">0</span><span class="o">;</span></div><div class='line' id='LC107'>	<span class="o">}</span></div><div class='line' id='LC108'>	<span class="cm">/**</span></div><div class='line' id='LC109'><span class="cm">	 * This method is a sort of driver for the string matching. This method takes the current</span></div><div class='line' id='LC110'><span class="cm">	 * coref and cycles through a list of nounphrases. Each nounphrase in the list has it&#39;s head</span></div><div class='line' id='LC111'><span class="cm">	 * and named entities compared to the current coreference. This method will keep track of the best</span></div><div class='line' id='LC112'><span class="cm">	 * possible match, replacing it with a match that beats the current best&#39;s score.</span></div><div class='line' id='LC113'><span class="cm">	 * @param list The list of nounphrase candidates</span></div><div class='line' id='LC114'><span class="cm">	 * @param coref the current coreference</span></div><div class='line' id='LC115'><span class="cm">	 * @return the index of the best matched candidates location in the Nounphrase list </span></div><div class='line' id='LC116'><span class="cm">	 */</span></div><div class='line' id='LC117'>	<span class="kd">public</span> <span class="kd">static</span> <span class="kt">int</span> <span class="nf">createScores</span><span class="o">(</span><span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">NounPhrase</span><span class="o">&gt;</span> <span class="n">list</span><span class="o">,</span> <span class="n">NounPhrase</span> <span class="n">coref</span><span class="o">){</span></div><div class='line' id='LC118'>		<span class="kt">int</span> <span class="n">bestIndex</span> <span class="o">=</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC119'>		<span class="kt">int</span> <span class="n">bestScore</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></div><div class='line' id='LC120'>		<span class="c1">//Start from the end of the list because that will contain the noun phrases that are closest to the coref</span></div><div class='line' id='LC121'>		<span class="k">for</span><span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="n">list</span><span class="o">.</span><span class="na">size</span><span class="o">()-</span><span class="mi">1</span><span class="o">;</span> <span class="n">i</span> <span class="o">&gt;</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span> <span class="n">i</span><span class="o">--){</span></div><div class='line' id='LC122'>			<span class="kt">int</span> <span class="n">score</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span></div><div class='line' id='LC123'>			<span class="n">NounPhrase</span> <span class="n">candidate</span> <span class="o">=</span> <span class="n">list</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">i</span><span class="o">);</span></div><div class='line' id='LC124'>			<span class="n">score</span> <span class="o">=</span> <span class="n">fullStringMatchHeads</span><span class="o">(</span><span class="n">candidate</span><span class="o">,</span> <span class="n">coref</span><span class="o">);</span></div><div class='line' id='LC125'>			<span class="n">score</span> <span class="o">+=</span> <span class="n">matchNE</span><span class="o">(</span><span class="n">candidate</span><span class="o">,</span> <span class="n">coref</span><span class="o">);</span></div><div class='line' id='LC126'>			<span class="n">score</span> <span class="o">+=</span> <span class="n">containsStringMatch</span><span class="o">(</span><span class="n">candidate</span><span class="o">,</span> <span class="n">coref</span><span class="o">);</span></div><div class='line' id='LC127'>			<span class="n">score</span> <span class="o">+=</span> <span class="n">partialHeadMatch</span><span class="o">(</span><span class="n">candidate</span><span class="o">,</span> <span class="n">coref</span><span class="o">);</span></div><div class='line' id='LC128'>			<span class="k">if</span><span class="o">(</span><span class="n">score</span> <span class="o">&gt;</span> <span class="n">bestScore</span><span class="o">){</span></div><div class='line' id='LC129'>				<span class="n">bestIndex</span> <span class="o">=</span> <span class="n">i</span><span class="o">;</span></div><div class='line' id='LC130'>				<span class="n">bestScore</span> <span class="o">=</span> <span class="n">score</span><span class="o">;</span></div><div class='line' id='LC131'>			<span class="o">}</span></div><div class='line' id='LC132'>		<span class="o">}</span></div><div class='line' id='LC133'>		<span class="k">if</span><span class="o">(</span><span class="n">bestScore</span> <span class="o">&gt;</span> <span class="mi">0</span><span class="o">){</span></div><div class='line' id='LC134'>			<span class="c1">//System.out.println(coref.getPhrase() + &quot; ID=&quot; + coref.getId());</span></div><div class='line' id='LC135'>			<span class="n">NounPhrase</span> <span class="n">winner</span> <span class="o">=</span> <span class="n">list</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">bestIndex</span><span class="o">);</span></div><div class='line' id='LC136'>			<span class="c1">//System.out.println(winner.getPhrase() + (winner.getId() != null ? (&quot; ID=&quot; + winner.getId()) : &quot;&quot;));</span></div><div class='line' id='LC137'>			<span class="k">return</span> <span class="n">bestIndex</span><span class="o">;</span></div><div class='line' id='LC138'>		<span class="o">}</span></div><div class='line' id='LC139'>		<span class="k">return</span> <span class="o">-</span><span class="mi">1</span><span class="o">;</span></div><div class='line' id='LC140'>	<span class="o">}</span></div><div class='line' id='LC141'>	<span class="cm">/**</span></div><div class='line' id='LC142'><span class="cm">	 * this method is called by the main method and is used to create a match.</span></div><div class='line' id='LC143'><span class="cm">	 * if the candidate winner doesn&#39;t currently have an ID then this method will</span></div><div class='line' id='LC144'><span class="cm">	 * create one in the form of &quot;X+idIndex&quot; where the idIndex is an incrementing counter.</span></div><div class='line' id='LC145'><span class="cm">	 * if the current candidate does have an id, this method will simply set the coref&#39;s reference</span></div><div class='line' id='LC146'><span class="cm">	 * to the candidate&#39;s id.</span></div><div class='line' id='LC147'><span class="cm">	 * @param matchId the location of the candidate in the nounphrase list</span></div><div class='line' id='LC148'><span class="cm">	 * @param list</span></div><div class='line' id='LC149'><span class="cm">	 * @param coref</span></div><div class='line' id='LC150'><span class="cm">	 */</span></div><div class='line' id='LC151'>	<span class="kd">public</span> <span class="kd">static</span> <span class="kt">void</span> <span class="nf">CreateMatch</span><span class="o">(</span><span class="kt">int</span> <span class="n">matchId</span><span class="o">,</span> <span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">NounPhrase</span><span class="o">&gt;</span> <span class="n">list</span><span class="o">,</span> <span class="n">NounPhrase</span> <span class="n">coref</span><span class="o">,</span> <span class="n">Integer</span> <span class="n">idCounter</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC152'>		<span class="c1">//check to see if matched item is a previous coref</span></div><div class='line' id='LC153'><br/></div><div class='line' id='LC154'>		<span class="n">NounPhrase</span> <span class="n">match</span> <span class="o">=</span> <span class="n">list</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">matchId</span><span class="o">);</span></div><div class='line' id='LC155'><br/></div><div class='line' id='LC156'>		<span class="k">if</span><span class="o">(</span><span class="n">list</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">matchId</span><span class="o">).</span><span class="na">getId</span><span class="o">()</span> <span class="o">==</span> <span class="kc">null</span><span class="o">){</span></div><div class='line' id='LC157'>			<span class="c1">//not coref</span></div><div class='line' id='LC158'>			<span class="c1">//set ID</span></div><div class='line' id='LC159'>			<span class="n">String</span> <span class="n">ref</span> <span class="o">=</span> <span class="s">&quot;X&quot;</span> <span class="o">+</span> <span class="n">idCounter</span><span class="o">;</span></div><div class='line' id='LC160'>			<span class="n">match</span><span class="o">.</span><span class="na">setId</span><span class="o">(</span><span class="n">ref</span><span class="o">);</span></div><div class='line' id='LC161'>			<span class="c1">//set coref ref tag to the match&#39;s id</span></div><div class='line' id='LC162'>			<span class="n">coref</span><span class="o">.</span><span class="na">setRef</span><span class="o">(</span><span class="n">ref</span><span class="o">);</span></div><div class='line' id='LC163'>		<span class="o">}</span></div><div class='line' id='LC164'>		<span class="k">else</span><span class="o">{</span></div><div class='line' id='LC165'>			<span class="c1">//match is a previous coref</span></div><div class='line' id='LC166'>			<span class="c1">//just set the coref&#39;s ref to be the id of the old coref</span></div><div class='line' id='LC167'>			<span class="n">coref</span><span class="o">.</span><span class="na">setRef</span><span class="o">(</span><span class="n">match</span><span class="o">.</span><span class="na">getId</span><span class="o">());</span></div><div class='line' id='LC168'>		<span class="o">}</span></div><div class='line' id='LC169'><br/></div><div class='line' id='LC170'>	<span class="o">}</span></div><div class='line' id='LC171'><br/></div><div class='line' id='LC172'><br/></div><div class='line' id='LC173'><br/></div><div class='line' id='LC174'>	<span class="cm">/**</span></div><div class='line' id='LC175'><span class="cm">	 * this method will cycle through a list of nounphrases and if it has a reference</span></div><div class='line' id='LC176'><span class="cm">	 * or Id the reference will be written to the file.</span></div><div class='line' id='LC177'><span class="cm">	 * @param filePrefix the filename without the .crf tag</span></div><div class='line' id='LC178'><span class="cm">	 * @param dir the directory to place the file</span></div><div class='line' id='LC179'><span class="cm">	 * @param list the list of candidates(which contain all coreferences)</span></div><div class='line' id='LC180'><span class="cm">	 */</span></div><div class='line' id='LC181'>	<span class="kd">public</span> <span class="kd">static</span> <span class="kt">void</span> <span class="nf">printMatchesToFile</span><span class="o">(</span><span class="n">String</span> <span class="n">filePrefix</span><span class="o">,</span> <span class="n">String</span> <span class="n">dir</span><span class="o">,</span> <span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">NounPhrase</span><span class="o">&gt;</span> <span class="n">list</span><span class="o">){</span></div><div class='line' id='LC182'><br/></div><div class='line' id='LC183'>		<span class="c1">//Print out results</span></div><div class='line' id='LC184'>		<span class="n">String</span> <span class="n">outFile</span> <span class="o">=</span> <span class="n">dir</span> <span class="o">+</span> <span class="n">filePrefix</span> <span class="o">+</span> <span class="s">&quot;.response&quot;</span><span class="o">;</span></div><div class='line' id='LC185'>		<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC186'>			<span class="n">BufferedWriter</span> <span class="n">bw</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BufferedWriter</span><span class="o">(</span><span class="k">new</span> <span class="n">FileWriter</span><span class="o">(</span><span class="n">outFile</span><span class="o">));</span></div><div class='line' id='LC187'>			<span class="n">bw</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="s">&quot;&lt;TXT&gt;&quot;</span><span class="o">);</span></div><div class='line' id='LC188'>			<span class="n">String</span> <span class="n">res</span> <span class="o">=</span> <span class="s">&quot;&quot;</span><span class="o">;</span></div><div class='line' id='LC189'>			<span class="k">for</span><span class="o">(</span><span class="n">NounPhrase</span> <span class="n">n</span> <span class="o">:</span> <span class="n">list</span><span class="o">)</span></div><div class='line' id='LC190'>			<span class="o">{</span></div><div class='line' id='LC191'>				<span class="k">if</span><span class="o">(</span><span class="n">n</span><span class="o">.</span><span class="na">getId</span><span class="o">()</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span></div><div class='line' id='LC192'>				<span class="o">{</span></div><div class='line' id='LC193'><br/></div><div class='line' id='LC194'>					<span class="k">if</span><span class="o">(</span><span class="n">n</span><span class="o">.</span><span class="na">getRef</span><span class="o">()</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span></div><div class='line' id='LC195'>						<span class="n">res</span> <span class="o">=</span> <span class="s">&quot;&lt;COREF ID=\&quot;&quot;</span> <span class="o">+</span> <span class="n">n</span><span class="o">.</span><span class="na">getId</span><span class="o">()</span> <span class="o">+</span> <span class="s">&quot;\&quot; REF=\&quot;&quot;</span> <span class="o">+</span> <span class="n">n</span><span class="o">.</span><span class="na">getRef</span><span class="o">()</span> <span class="o">+</span> <span class="s">&quot;\&quot;&gt; &quot;</span> <span class="o">+</span> <span class="n">n</span><span class="o">.</span><span class="na">getPhrase</span><span class="o">()</span> <span class="o">+</span> <span class="s">&quot;&lt;/COREF&gt;&quot;</span><span class="o">;</span></div><div class='line' id='LC196'>					<span class="k">else</span></div><div class='line' id='LC197'>						<span class="n">res</span> <span class="o">=</span> <span class="s">&quot;&lt;COREF ID=\&quot;&quot;</span> <span class="o">+</span> <span class="n">n</span><span class="o">.</span><span class="na">getId</span><span class="o">()</span> <span class="o">+</span> <span class="s">&quot;\&quot;&gt; &quot;</span> <span class="o">+</span> <span class="n">n</span><span class="o">.</span><span class="na">getPhrase</span><span class="o">()</span> <span class="o">+</span> <span class="s">&quot;&lt;/COREF&gt; &quot;</span><span class="o">;</span></div><div class='line' id='LC198'>					<span class="n">bw</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="n">res</span><span class="o">,</span> <span class="mi">0</span><span class="o">,</span> <span class="n">res</span><span class="o">.</span><span class="na">length</span><span class="o">());</span></div><div class='line' id='LC199'>				<span class="o">}</span>	</div><div class='line' id='LC200'><br/></div><div class='line' id='LC201'>			<span class="o">}</span></div><div class='line' id='LC202'>			<span class="n">bw</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="s">&quot;&lt;/TXT&gt;&quot;</span><span class="o">);</span></div><div class='line' id='LC203'>			<span class="n">bw</span><span class="o">.</span><span class="na">close</span><span class="o">();</span></div><div class='line' id='LC204'>		<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">Exception</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC205'>			<span class="n">System</span><span class="o">.</span><span class="na">err</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">&quot;Problems writing results.&quot;</span><span class="o">);</span></div><div class='line' id='LC206'>			<span class="n">e</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();</span></div><div class='line' id='LC207'>		<span class="o">}</span></div><div class='line' id='LC208'><br/></div><div class='line' id='LC209'>		<span class="c1">//System.out.println(&quot;&quot;);</span></div><div class='line' id='LC210'><br/></div><div class='line' id='LC211'>		<span class="k">for</span><span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">list</span><span class="o">.</span><span class="na">size</span><span class="o">();</span> <span class="n">i</span> <span class="o">++){</span></div><div class='line' id='LC212'>			<span class="n">String</span> <span class="n">outString</span> <span class="o">=</span> <span class="s">&quot;&quot;</span><span class="o">;</span></div><div class='line' id='LC213'>			<span class="n">NounPhrase</span> <span class="n">temp</span> <span class="o">=</span> <span class="n">list</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">i</span><span class="o">);</span></div><div class='line' id='LC214'>			<span class="k">if</span><span class="o">(</span><span class="n">temp</span><span class="o">.</span><span class="na">getId</span><span class="o">()</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">){</span></div><div class='line' id='LC215'>				<span class="n">outString</span> <span class="o">+=</span> <span class="s">&quot;&lt;COREF ID=\&quot;&quot;</span> <span class="o">+</span> <span class="n">temp</span><span class="o">.</span><span class="na">getId</span><span class="o">();</span></div><div class='line' id='LC216'>				<span class="k">if</span><span class="o">(</span><span class="n">temp</span><span class="o">.</span><span class="na">getRef</span><span class="o">()</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">)</span></div><div class='line' id='LC217'>					<span class="n">outString</span> <span class="o">+=</span> <span class="s">&quot;\&quot; REF=\&quot;&quot;</span> <span class="o">+</span> <span class="n">temp</span><span class="o">.</span><span class="na">getRef</span><span class="o">();</span></div><div class='line' id='LC218'>				<span class="n">outString</span> <span class="o">+=</span> <span class="s">&quot;\&quot;&gt;&quot;</span> <span class="o">+</span> <span class="n">temp</span><span class="o">.</span><span class="na">getPhrase</span><span class="o">()+</span><span class="s">&quot;&lt;/COREF&gt;&quot;</span><span class="o">;</span></div><div class='line' id='LC219'>			<span class="o">}</span></div><div class='line' id='LC220'>			<span class="c1">//if(!outString.equals(&quot;&quot;))</span></div><div class='line' id='LC221'>				<span class="c1">//System.out.println(outString);</span></div><div class='line' id='LC222'><br/></div><div class='line' id='LC223'>		<span class="o">}</span></div><div class='line' id='LC224'><br/></div><div class='line' id='LC225'>		<span class="c1">//System.out.println(&quot;&quot;);</span></div><div class='line' id='LC226'>	<span class="o">}</span></div><div class='line' id='LC227'><br/></div><div class='line' id='LC228'><span class="o">}</span></div></pre></div>
          </td>
        </tr>
      </table>
  </div>

          </div>
        </div>
      </div>

      <a href="#jump-to-line" rel="facebox" data-hotkey="l" class="js-jump-to-line" style="display:none">Jump to Line</a>
      <div id="jump-to-line" style="display:none">
        <h2>Jump to Line</h2>
        <form accept-charset="UTF-8" class="js-jump-to-line-form">
          <input class="textfield js-jump-to-line-field" type="text">
          <div class="full-button">
            <button type="submit" class="classy">
              Go
            </button>
          </div>
        </form>
      </div>

    </div>
</div>

<div class="frame frame-loading large-loading-area" style="display:none;">
  <img src="https://a248.e.akamai.net/assets.github.com/images/spinners/octocat-spinner-128.gif?1347543527" height="64" width="64">
</div>

        </div>
      </div>
      <div class="context-overlay"></div>
    </div>

      <div id="footer-push"></div><!-- hack for sticky footer -->
    </div><!-- end of wrapper - hack for sticky footer -->

      <!-- footer -->
      <div id="footer">
  <div class="container clearfix">

      <dl class="footer_nav">
        <dt>GitHub</dt>
        <dd><a href="https://github.com/about">About us</a></dd>
        <dd><a href="https://github.com/blog">Blog</a></dd>
        <dd><a href="https://github.com/contact">Contact &amp; support</a></dd>
        <dd><a href="http://enterprise.github.com/">GitHub Enterprise</a></dd>
        <dd><a href="http://status.github.com/">Site status</a></dd>
      </dl>

      <dl class="footer_nav">
        <dt>Applications</dt>
        <dd><a href="http://mac.github.com/">GitHub for Mac</a></dd>
        <dd><a href="http://windows.github.com/">GitHub for Windows</a></dd>
        <dd><a href="http://eclipse.github.com/">GitHub for Eclipse</a></dd>
        <dd><a href="http://mobile.github.com/">GitHub mobile apps</a></dd>
      </dl>

      <dl class="footer_nav">
        <dt>Services</dt>
        <dd><a href="http://get.gaug.es/">Gauges: Web analytics</a></dd>
        <dd><a href="http://speakerdeck.com">Speaker Deck: Presentations</a></dd>
        <dd><a href="https://gist.github.com">Gist: Code snippets</a></dd>
        <dd><a href="http://jobs.github.com/">Job board</a></dd>
      </dl>

      <dl class="footer_nav">
        <dt>Documentation</dt>
        <dd><a href="http://help.github.com/">GitHub Help</a></dd>
        <dd><a href="http://developer.github.com/">Developer API</a></dd>
        <dd><a href="http://github.github.com/github-flavored-markdown/">GitHub Flavored Markdown</a></dd>
        <dd><a href="http://pages.github.com/">GitHub Pages</a></dd>
      </dl>

      <dl class="footer_nav">
        <dt>More</dt>
        <dd><a href="http://training.github.com/">Training</a></dd>
        <dd><a href="https://github.com/edu">Students &amp; teachers</a></dd>
        <dd><a href="http://shop.github.com">The Shop</a></dd>
        <dd><a href="http://octodex.github.com/">The Octodex</a></dd>
      </dl>

      <hr class="footer-divider">


    <p class="right">&copy; 2012 <span title="0.16945s from fe2.rs.github.com">GitHub</span> Inc. All rights reserved.</p>
    <a class="left" href="https://github.com/">
      <span class="mega-icon mega-icon-invertocat"></span>
    </a>
    <ul id="legal">
        <li><a href="https://github.com/site/terms">Terms of Service</a></li>
        <li><a href="https://github.com/site/privacy">Privacy</a></li>
        <li><a href="https://github.com/security">Security</a></li>
    </ul>

  </div><!-- /.container -->

</div><!-- /.#footer -->


    

<div id="keyboard_shortcuts_pane" class="instapaper_ignore readability-extra" style="display:none">
  <h2>Keyboard Shortcuts <small><a href="#" class="js-see-all-keyboard-shortcuts">(see all)</a></small></h2>

  <div class="columns threecols">
    <div class="column first">
      <h3>Site wide shortcuts</h3>
      <dl class="keyboard-mappings">
        <dt>s</dt>
        <dd>Focus command bar</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt>?</dt>
        <dd>Bring up this help dialog</dd>
      </dl>
    </div><!-- /.column.first -->

    <div class="column middle" style='display:none'>
      <h3>Commit list</h3>
      <dl class="keyboard-mappings">
        <dt>j</dt>
        <dd>Move selection down</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt>k</dt>
        <dd>Move selection up</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt>c <em>or</em> o <em>or</em> enter</dt>
        <dd>Open commit</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt>y</dt>
        <dd>Expand URL to its canonical form</dd>
      </dl>
    </div><!-- /.column.first -->

    <div class="column last js-hidden-pane" style='display:none'>
      <h3>Pull request list</h3>
      <dl class="keyboard-mappings">
        <dt>j</dt>
        <dd>Move selection down</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt>k</dt>
        <dd>Move selection up</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt>o <em>or</em> enter</dt>
        <dd>Open issue</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt><span class="platform-mac">⌘</span><span class="platform-other">ctrl</span> <em>+</em> enter</dt>
        <dd>Submit comment</dd>
      </dl>
      <dl class="keyboard-mappings">
        <dt><span class="platform-mac">⌘</span><span class="platform-other">ctrl</span> <em>+</em> shift p</dt>
        <dd>Preview comment</dd>
      </dl>
    </div><!-- /.columns.last -->

  </div><!-- /.columns.equacols -->

  <div class="js-hidden-pane" style='display:none'>
    <div class="rule"></div>

    <h3>Issues</h3>

    <div class="columns threecols">
      <div class="column first">
        <dl class="keyboard-mappings">
          <dt>j</dt>
          <dd>Move selection down</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>k</dt>
          <dd>Move selection up</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>x</dt>
          <dd>Toggle selection</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>o <em>or</em> enter</dt>
          <dd>Open issue</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt><span class="platform-mac">⌘</span><span class="platform-other">ctrl</span> <em>+</em> enter</dt>
          <dd>Submit comment</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt><span class="platform-mac">⌘</span><span class="platform-other">ctrl</span> <em>+</em> shift p</dt>
          <dd>Preview comment</dd>
        </dl>
      </div><!-- /.column.first -->
      <div class="column last">
        <dl class="keyboard-mappings">
          <dt>c</dt>
          <dd>Create issue</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>l</dt>
          <dd>Create label</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>i</dt>
          <dd>Back to inbox</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>u</dt>
          <dd>Back to issues</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>/</dt>
          <dd>Focus issues search</dd>
        </dl>
      </div>
    </div>
  </div>

  <div class="js-hidden-pane" style='display:none'>
    <div class="rule"></div>

    <h3>Issues Dashboard</h3>

    <div class="columns threecols">
      <div class="column first">
        <dl class="keyboard-mappings">
          <dt>j</dt>
          <dd>Move selection down</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>k</dt>
          <dd>Move selection up</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>o <em>or</em> enter</dt>
          <dd>Open issue</dd>
        </dl>
      </div><!-- /.column.first -->
    </div>
  </div>

  <div class="js-hidden-pane" style='display:none'>
    <div class="rule"></div>

    <h3>Network Graph</h3>
    <div class="columns equacols">
      <div class="column first">
        <dl class="keyboard-mappings">
          <dt><span class="badmono">←</span> <em>or</em> h</dt>
          <dd>Scroll left</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt><span class="badmono">→</span> <em>or</em> l</dt>
          <dd>Scroll right</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt><span class="badmono">↑</span> <em>or</em> k</dt>
          <dd>Scroll up</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt><span class="badmono">↓</span> <em>or</em> j</dt>
          <dd>Scroll down</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>t</dt>
          <dd>Toggle visibility of head labels</dd>
        </dl>
      </div><!-- /.column.first -->
      <div class="column last">
        <dl class="keyboard-mappings">
          <dt>shift <span class="badmono">←</span> <em>or</em> shift h</dt>
          <dd>Scroll all the way left</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>shift <span class="badmono">→</span> <em>or</em> shift l</dt>
          <dd>Scroll all the way right</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>shift <span class="badmono">↑</span> <em>or</em> shift k</dt>
          <dd>Scroll all the way up</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>shift <span class="badmono">↓</span> <em>or</em> shift j</dt>
          <dd>Scroll all the way down</dd>
        </dl>
      </div><!-- /.column.last -->
    </div>
  </div>

  <div class="js-hidden-pane" >
    <div class="rule"></div>
    <div class="columns threecols">
      <div class="column first js-hidden-pane" >
        <h3>Source Code Browsing</h3>
        <dl class="keyboard-mappings">
          <dt>t</dt>
          <dd>Activates the file finder</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>l</dt>
          <dd>Jump to line</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>w</dt>
          <dd>Switch branch/tag</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>y</dt>
          <dd>Expand URL to its canonical form</dd>
        </dl>
      </div>
    </div>
  </div>

  <div class="js-hidden-pane" style='display:none'>
    <div class="rule"></div>
    <div class="columns threecols">
      <div class="column first">
        <h3>Browsing Commits</h3>
        <dl class="keyboard-mappings">
          <dt><span class="platform-mac">⌘</span><span class="platform-other">ctrl</span> <em>+</em> enter</dt>
          <dd>Submit comment</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>escape</dt>
          <dd>Close form</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>p</dt>
          <dd>Parent commit</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>o</dt>
          <dd>Other parent commit</dd>
        </dl>
      </div>
    </div>
  </div>

  <div class="js-hidden-pane" style='display:none'>
    <div class="rule"></div>
    <h3>Notifications</h3>

    <div class="columns threecols">
      <div class="column first">
        <dl class="keyboard-mappings">
          <dt>j</dt>
          <dd>Move selection down</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>k</dt>
          <dd>Move selection up</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>o <em>or</em> enter</dt>
          <dd>Open notification</dd>
        </dl>
      </div><!-- /.column.first -->

      <div class="column second">
        <dl class="keyboard-mappings">
          <dt>e <em>or</em> shift i <em>or</em> y</dt>
          <dd>Mark as read</dd>
        </dl>
        <dl class="keyboard-mappings">
          <dt>shift m</dt>
          <dd>Mute thread</dd>
        </dl>
      </div><!-- /.column.first -->
    </div>
  </div>

</div>

    <div id="markdown-help" class="instapaper_ignore readability-extra">
  <h2>Markdown Cheat Sheet</h2>

  <div class="cheatsheet-content">

  <div class="mod">
    <div class="col">
      <h3>Format Text</h3>
      <p>Headers</p>
      <pre>
# This is an &lt;h1&gt; tag
## This is an &lt;h2&gt; tag
###### This is an &lt;h6&gt; tag</pre>
     <p>Text styles</p>
     <pre>
*This text will be italic*
_This will also be italic_
**This text will be bold**
__This will also be bold__

*You **can** combine them*
</pre>
    </div>
    <div class="col">
      <h3>Lists</h3>
      <p>Unordered</p>
      <pre>
* Item 1
* Item 2
  * Item 2a
  * Item 2b</pre>
     <p>Ordered</p>
     <pre>
1. Item 1
2. Item 2
3. Item 3
   * Item 3a
   * Item 3b</pre>
    </div>
    <div class="col">
      <h3>Miscellaneous</h3>
      <p>Images</p>
      <pre>
![GitHub Logo](/images/logo.png)
Format: ![Alt Text](url)
</pre>
     <p>Links</p>
     <pre>
http://github.com - automatic!
[GitHub](http://github.com)</pre>
<p>Blockquotes</p>
     <pre>
As Kanye West said:

> We're living the future so
> the present is our past.
</pre>
    </div>
  </div>
  <div class="rule"></div>

  <h3>Code Examples in Markdown</h3>
  <div class="col">
      <p>Syntax highlighting with <a href="http://github.github.com/github-flavored-markdown/" title="GitHub Flavored Markdown" target="_blank">GFM</a></p>
      <pre>
```javascript
function fancyAlert(arg) {
  if(arg) {
    $.facebox({div:'#foo'})
  }
}
```</pre>
    </div>
    <div class="col">
      <p>Or, indent your code 4 spaces</p>
      <pre>
Here is a Python code example
without syntax highlighting:

    def foo:
      if not bar:
        return true</pre>
    </div>
    <div class="col">
      <p>Inline code for comments</p>
      <pre>
I think you should use an
`&lt;addr&gt;` element here instead.</pre>
    </div>
  </div>

  </div>
</div>


    <div id="ajax-error-message" class="flash flash-error">
      <span class="mini-icon mini-icon-exclamation"></span>
      Something went wrong with that request. Please try again.
      <a href="#" class="mini-icon mini-icon-remove-close ajax-error-dismiss"></a>
    </div>

    
    
    <span id='server_response_time' data-time='0.17091' data-host='fe2'></span>
    
  </body>
</html>

