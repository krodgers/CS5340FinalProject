  


<!DOCTYPE html>
<html>
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# githubog: http://ogp.me/ns/fb/githubog#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <title>CS5340FinalProject/CS5340FinalProject/src/PreProcessing.java at 20295f7ad4964baaf396ddf7ce38b1af5415fb10 · brekkie/CS5340FinalProject</title>
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
    

      <link rel='permalink' href='/brekkie/CS5340FinalProject/blob/20295f7ad4964baaf396ddf7ce38b1af5415fb10/CS5340FinalProject/src/PreProcessing.java'>
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
                      <a href="/brekkie/CS5340FinalProject/blob/master/CS5340FinalProject/src/PreProcessing.java" class="js-navigation-open" data-name="master" rel="nofollow">master</a>
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
          


<!-- blob contrib key: blob_contributors:v21:07d9f39e39721a9111d83c9fb8ffcba3 -->
<!-- blob contrib frag key: views10/v8/blob_contributors:v21:07d9f39e39721a9111d83c9fb8ffcba3 -->

<div id="slider">


    <p title="This is a placeholder element" class="js-history-link-replace hidden"></p>
    <div class="breadcrumb" data-path="CS5340FinalProject/src/PreProcessing.java/">
      <span class='bold'><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/brekkie/CS5340FinalProject/tree/20295f7ad4964baaf396ddf7ce38b1af5415fb10" class="js-slider-breadcrumb" itemscope="url" rel="nofollow"><span itemprop="title">CS5340FinalProject</span></a></span></span> / <span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/brekkie/CS5340FinalProject/tree/20295f7ad4964baaf396ddf7ce38b1af5415fb10/CS5340FinalProject" class="js-slider-breadcrumb" itemscope="url" rel="nofollow"><span itemprop="title">CS5340FinalProject</span></a></span> / <span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/brekkie/CS5340FinalProject/tree/20295f7ad4964baaf396ddf7ce38b1af5415fb10/CS5340FinalProject/src" class="js-slider-breadcrumb" itemscope="url" rel="nofollow"><span itemprop="title">src</span></a></span> / <strong class="final-path">PreProcessing.java</strong> <span class="js-clippy mini-icon mini-icon-clippy " data-clipboard-text="CS5340FinalProject/src/PreProcessing.java" data-copied-hint="copied!" data-copy-hint="copy to clipboard"></span>
    </div>

    <a href="/brekkie/CS5340FinalProject/find/20295f7ad4964baaf396ddf7ce38b1af5415fb10" class="js-slide-to" data-hotkey="t" style="display:none">Show File Finder</a>

      <div class="commit commit-loader file-history-tease js-deferred-content" data-url="/brekkie/CS5340FinalProject/contributors/20295f7ad4964baaf396ddf7ce38b1af5415fb10/CS5340FinalProject/src/PreProcessing.java" data-path="CS5340FinalProject/src/PreProcessing.java/">
        Fetching contributors…

        <div class="participation">
          <p class="loader-loading"><img alt="Octocat-spinner-32-eaf2f5" height="16" src="https://a248.e.akamai.net/assets.github.com/images/spinners/octocat-spinner-32-EAF2F5.gif?1338945075" width="16" /></p>
          <p class="loader-error">Cannot retrieve contributors at this time</p>
        </div>
      </div>

    <div class="frames">
      <div class="frame frame-center" data-path="CS5340FinalProject/src/PreProcessing.java/" data-permalink-url="/brekkie/CS5340FinalProject/blob/20295f7ad4964baaf396ddf7ce38b1af5415fb10/CS5340FinalProject/src/PreProcessing.java" data-title="CS5340FinalProject/CS5340FinalProject/src/PreProcessing.java at 20295f7ad4964baaf396ddf7ce38b1af5415fb10 · brekkie/CS5340FinalProject · GitHub" data-type="blob">

        <div id="files" class="bubble">
          <div class="file">
            <div class="meta">
              <div class="info">
                <span class="icon"><b class="mini-icon mini-icon-text-file"></b></span>
                <span class="mode" title="File Mode">file</span>
                  <span>477 lines (429 sloc)</span>
                <span>16.244 kb</span>
              </div>
              <ul class="button-group actions">
                <li><a href="/brekkie/CS5340FinalProject/raw/20295f7ad4964baaf396ddf7ce38b1af5415fb10/CS5340FinalProject/src/PreProcessing.java" class="minibutton grouped-button bigger lighter" id="raw-url">Raw</a></li>
                  <li><a href="/brekkie/CS5340FinalProject/blame/20295f7ad4964baaf396ddf7ce38b1af5415fb10/CS5340FinalProject/src/PreProcessing.java" class="minibutton grouped-button bigger lighter">Blame</a></li>
                <li><a href="/brekkie/CS5340FinalProject/commits/20295f7ad4964baaf396ddf7ce38b1af5415fb10/CS5340FinalProject/src/PreProcessing.java" class="minibutton grouped-button bigger lighter" rel="nofollow">History</a></li>
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
<span id="L229" rel="#L229">229</span>
<span id="L230" rel="#L230">230</span>
<span id="L231" rel="#L231">231</span>
<span id="L232" rel="#L232">232</span>
<span id="L233" rel="#L233">233</span>
<span id="L234" rel="#L234">234</span>
<span id="L235" rel="#L235">235</span>
<span id="L236" rel="#L236">236</span>
<span id="L237" rel="#L237">237</span>
<span id="L238" rel="#L238">238</span>
<span id="L239" rel="#L239">239</span>
<span id="L240" rel="#L240">240</span>
<span id="L241" rel="#L241">241</span>
<span id="L242" rel="#L242">242</span>
<span id="L243" rel="#L243">243</span>
<span id="L244" rel="#L244">244</span>
<span id="L245" rel="#L245">245</span>
<span id="L246" rel="#L246">246</span>
<span id="L247" rel="#L247">247</span>
<span id="L248" rel="#L248">248</span>
<span id="L249" rel="#L249">249</span>
<span id="L250" rel="#L250">250</span>
<span id="L251" rel="#L251">251</span>
<span id="L252" rel="#L252">252</span>
<span id="L253" rel="#L253">253</span>
<span id="L254" rel="#L254">254</span>
<span id="L255" rel="#L255">255</span>
<span id="L256" rel="#L256">256</span>
<span id="L257" rel="#L257">257</span>
<span id="L258" rel="#L258">258</span>
<span id="L259" rel="#L259">259</span>
<span id="L260" rel="#L260">260</span>
<span id="L261" rel="#L261">261</span>
<span id="L262" rel="#L262">262</span>
<span id="L263" rel="#L263">263</span>
<span id="L264" rel="#L264">264</span>
<span id="L265" rel="#L265">265</span>
<span id="L266" rel="#L266">266</span>
<span id="L267" rel="#L267">267</span>
<span id="L268" rel="#L268">268</span>
<span id="L269" rel="#L269">269</span>
<span id="L270" rel="#L270">270</span>
<span id="L271" rel="#L271">271</span>
<span id="L272" rel="#L272">272</span>
<span id="L273" rel="#L273">273</span>
<span id="L274" rel="#L274">274</span>
<span id="L275" rel="#L275">275</span>
<span id="L276" rel="#L276">276</span>
<span id="L277" rel="#L277">277</span>
<span id="L278" rel="#L278">278</span>
<span id="L279" rel="#L279">279</span>
<span id="L280" rel="#L280">280</span>
<span id="L281" rel="#L281">281</span>
<span id="L282" rel="#L282">282</span>
<span id="L283" rel="#L283">283</span>
<span id="L284" rel="#L284">284</span>
<span id="L285" rel="#L285">285</span>
<span id="L286" rel="#L286">286</span>
<span id="L287" rel="#L287">287</span>
<span id="L288" rel="#L288">288</span>
<span id="L289" rel="#L289">289</span>
<span id="L290" rel="#L290">290</span>
<span id="L291" rel="#L291">291</span>
<span id="L292" rel="#L292">292</span>
<span id="L293" rel="#L293">293</span>
<span id="L294" rel="#L294">294</span>
<span id="L295" rel="#L295">295</span>
<span id="L296" rel="#L296">296</span>
<span id="L297" rel="#L297">297</span>
<span id="L298" rel="#L298">298</span>
<span id="L299" rel="#L299">299</span>
<span id="L300" rel="#L300">300</span>
<span id="L301" rel="#L301">301</span>
<span id="L302" rel="#L302">302</span>
<span id="L303" rel="#L303">303</span>
<span id="L304" rel="#L304">304</span>
<span id="L305" rel="#L305">305</span>
<span id="L306" rel="#L306">306</span>
<span id="L307" rel="#L307">307</span>
<span id="L308" rel="#L308">308</span>
<span id="L309" rel="#L309">309</span>
<span id="L310" rel="#L310">310</span>
<span id="L311" rel="#L311">311</span>
<span id="L312" rel="#L312">312</span>
<span id="L313" rel="#L313">313</span>
<span id="L314" rel="#L314">314</span>
<span id="L315" rel="#L315">315</span>
<span id="L316" rel="#L316">316</span>
<span id="L317" rel="#L317">317</span>
<span id="L318" rel="#L318">318</span>
<span id="L319" rel="#L319">319</span>
<span id="L320" rel="#L320">320</span>
<span id="L321" rel="#L321">321</span>
<span id="L322" rel="#L322">322</span>
<span id="L323" rel="#L323">323</span>
<span id="L324" rel="#L324">324</span>
<span id="L325" rel="#L325">325</span>
<span id="L326" rel="#L326">326</span>
<span id="L327" rel="#L327">327</span>
<span id="L328" rel="#L328">328</span>
<span id="L329" rel="#L329">329</span>
<span id="L330" rel="#L330">330</span>
<span id="L331" rel="#L331">331</span>
<span id="L332" rel="#L332">332</span>
<span id="L333" rel="#L333">333</span>
<span id="L334" rel="#L334">334</span>
<span id="L335" rel="#L335">335</span>
<span id="L336" rel="#L336">336</span>
<span id="L337" rel="#L337">337</span>
<span id="L338" rel="#L338">338</span>
<span id="L339" rel="#L339">339</span>
<span id="L340" rel="#L340">340</span>
<span id="L341" rel="#L341">341</span>
<span id="L342" rel="#L342">342</span>
<span id="L343" rel="#L343">343</span>
<span id="L344" rel="#L344">344</span>
<span id="L345" rel="#L345">345</span>
<span id="L346" rel="#L346">346</span>
<span id="L347" rel="#L347">347</span>
<span id="L348" rel="#L348">348</span>
<span id="L349" rel="#L349">349</span>
<span id="L350" rel="#L350">350</span>
<span id="L351" rel="#L351">351</span>
<span id="L352" rel="#L352">352</span>
<span id="L353" rel="#L353">353</span>
<span id="L354" rel="#L354">354</span>
<span id="L355" rel="#L355">355</span>
<span id="L356" rel="#L356">356</span>
<span id="L357" rel="#L357">357</span>
<span id="L358" rel="#L358">358</span>
<span id="L359" rel="#L359">359</span>
<span id="L360" rel="#L360">360</span>
<span id="L361" rel="#L361">361</span>
<span id="L362" rel="#L362">362</span>
<span id="L363" rel="#L363">363</span>
<span id="L364" rel="#L364">364</span>
<span id="L365" rel="#L365">365</span>
<span id="L366" rel="#L366">366</span>
<span id="L367" rel="#L367">367</span>
<span id="L368" rel="#L368">368</span>
<span id="L369" rel="#L369">369</span>
<span id="L370" rel="#L370">370</span>
<span id="L371" rel="#L371">371</span>
<span id="L372" rel="#L372">372</span>
<span id="L373" rel="#L373">373</span>
<span id="L374" rel="#L374">374</span>
<span id="L375" rel="#L375">375</span>
<span id="L376" rel="#L376">376</span>
<span id="L377" rel="#L377">377</span>
<span id="L378" rel="#L378">378</span>
<span id="L379" rel="#L379">379</span>
<span id="L380" rel="#L380">380</span>
<span id="L381" rel="#L381">381</span>
<span id="L382" rel="#L382">382</span>
<span id="L383" rel="#L383">383</span>
<span id="L384" rel="#L384">384</span>
<span id="L385" rel="#L385">385</span>
<span id="L386" rel="#L386">386</span>
<span id="L387" rel="#L387">387</span>
<span id="L388" rel="#L388">388</span>
<span id="L389" rel="#L389">389</span>
<span id="L390" rel="#L390">390</span>
<span id="L391" rel="#L391">391</span>
<span id="L392" rel="#L392">392</span>
<span id="L393" rel="#L393">393</span>
<span id="L394" rel="#L394">394</span>
<span id="L395" rel="#L395">395</span>
<span id="L396" rel="#L396">396</span>
<span id="L397" rel="#L397">397</span>
<span id="L398" rel="#L398">398</span>
<span id="L399" rel="#L399">399</span>
<span id="L400" rel="#L400">400</span>
<span id="L401" rel="#L401">401</span>
<span id="L402" rel="#L402">402</span>
<span id="L403" rel="#L403">403</span>
<span id="L404" rel="#L404">404</span>
<span id="L405" rel="#L405">405</span>
<span id="L406" rel="#L406">406</span>
<span id="L407" rel="#L407">407</span>
<span id="L408" rel="#L408">408</span>
<span id="L409" rel="#L409">409</span>
<span id="L410" rel="#L410">410</span>
<span id="L411" rel="#L411">411</span>
<span id="L412" rel="#L412">412</span>
<span id="L413" rel="#L413">413</span>
<span id="L414" rel="#L414">414</span>
<span id="L415" rel="#L415">415</span>
<span id="L416" rel="#L416">416</span>
<span id="L417" rel="#L417">417</span>
<span id="L418" rel="#L418">418</span>
<span id="L419" rel="#L419">419</span>
<span id="L420" rel="#L420">420</span>
<span id="L421" rel="#L421">421</span>
<span id="L422" rel="#L422">422</span>
<span id="L423" rel="#L423">423</span>
<span id="L424" rel="#L424">424</span>
<span id="L425" rel="#L425">425</span>
<span id="L426" rel="#L426">426</span>
<span id="L427" rel="#L427">427</span>
<span id="L428" rel="#L428">428</span>
<span id="L429" rel="#L429">429</span>
<span id="L430" rel="#L430">430</span>
<span id="L431" rel="#L431">431</span>
<span id="L432" rel="#L432">432</span>
<span id="L433" rel="#L433">433</span>
<span id="L434" rel="#L434">434</span>
<span id="L435" rel="#L435">435</span>
<span id="L436" rel="#L436">436</span>
<span id="L437" rel="#L437">437</span>
<span id="L438" rel="#L438">438</span>
<span id="L439" rel="#L439">439</span>
<span id="L440" rel="#L440">440</span>
<span id="L441" rel="#L441">441</span>
<span id="L442" rel="#L442">442</span>
<span id="L443" rel="#L443">443</span>
<span id="L444" rel="#L444">444</span>
<span id="L445" rel="#L445">445</span>
<span id="L446" rel="#L446">446</span>
<span id="L447" rel="#L447">447</span>
<span id="L448" rel="#L448">448</span>
<span id="L449" rel="#L449">449</span>
<span id="L450" rel="#L450">450</span>
<span id="L451" rel="#L451">451</span>
<span id="L452" rel="#L452">452</span>
<span id="L453" rel="#L453">453</span>
<span id="L454" rel="#L454">454</span>
<span id="L455" rel="#L455">455</span>
<span id="L456" rel="#L456">456</span>
<span id="L457" rel="#L457">457</span>
<span id="L458" rel="#L458">458</span>
<span id="L459" rel="#L459">459</span>
<span id="L460" rel="#L460">460</span>
<span id="L461" rel="#L461">461</span>
<span id="L462" rel="#L462">462</span>
<span id="L463" rel="#L463">463</span>
<span id="L464" rel="#L464">464</span>
<span id="L465" rel="#L465">465</span>
<span id="L466" rel="#L466">466</span>
<span id="L467" rel="#L467">467</span>
<span id="L468" rel="#L468">468</span>
<span id="L469" rel="#L469">469</span>
<span id="L470" rel="#L470">470</span>
<span id="L471" rel="#L471">471</span>
<span id="L472" rel="#L472">472</span>
<span id="L473" rel="#L473">473</span>
<span id="L474" rel="#L474">474</span>
<span id="L475" rel="#L475">475</span>
<span id="L476" rel="#L476">476</span>
<span id="L477" rel="#L477">477</span>
</pre>
          </td>
          <td width="100%">
                <div class="highlight"><pre><div class='line' id='LC1'><span class="kn">import</span> <span class="nn">java.io.BufferedWriter</span><span class="o">;</span></div><div class='line' id='LC2'><span class="kn">import</span> <span class="nn">java.io.File</span><span class="o">;</span></div><div class='line' id='LC3'><span class="kn">import</span> <span class="nn">java.io.FileInputStream</span><span class="o">;</span></div><div class='line' id='LC4'><span class="kn">import</span> <span class="nn">java.io.FileWriter</span><span class="o">;</span></div><div class='line' id='LC5'><span class="kn">import</span> <span class="nn">java.io.IOException</span><span class="o">;</span></div><div class='line' id='LC6'><span class="kn">import</span> <span class="nn">java.io.InputStream</span><span class="o">;</span></div><div class='line' id='LC7'><span class="kn">import</span> <span class="nn">java.io.StringReader</span><span class="o">;</span></div><div class='line' id='LC8'><span class="kn">import</span> <span class="nn">java.util.ArrayList</span><span class="o">;</span></div><div class='line' id='LC9'><br/></div><div class='line' id='LC10'><span class="kn">import</span> <span class="nn">javax.xml.parsers.DocumentBuilder</span><span class="o">;</span></div><div class='line' id='LC11'><span class="kn">import</span> <span class="nn">javax.xml.parsers.DocumentBuilderFactory</span><span class="o">;</span></div><div class='line' id='LC12'><br/></div><div class='line' id='LC13'><span class="kn">import</span> <span class="nn">opennlp.tools.chunker.ChunkerME</span><span class="o">;</span></div><div class='line' id='LC14'><span class="kn">import</span> <span class="nn">opennlp.tools.chunker.ChunkerModel</span><span class="o">;</span></div><div class='line' id='LC15'><span class="kn">import</span> <span class="nn">opennlp.tools.postag.POSModel</span><span class="o">;</span></div><div class='line' id='LC16'><span class="kn">import</span> <span class="nn">opennlp.tools.postag.POSTaggerME</span><span class="o">;</span></div><div class='line' id='LC17'><span class="kn">import</span> <span class="nn">opennlp.tools.sentdetect.SentenceDetectorME</span><span class="o">;</span></div><div class='line' id='LC18'><span class="kn">import</span> <span class="nn">opennlp.tools.sentdetect.SentenceModel</span><span class="o">;</span></div><div class='line' id='LC19'><span class="kn">import</span> <span class="nn">opennlp.tools.tokenize.TokenizerME</span><span class="o">;</span></div><div class='line' id='LC20'><span class="kn">import</span> <span class="nn">opennlp.tools.tokenize.TokenizerModel</span><span class="o">;</span></div><div class='line' id='LC21'><span class="kn">import</span> <span class="nn">opennlp.tools.util.InvalidFormatException</span><span class="o">;</span></div><div class='line' id='LC22'><br/></div><div class='line' id='LC23'><span class="kn">import</span> <span class="nn">org.w3c.dom.Document</span><span class="o">;</span></div><div class='line' id='LC24'><span class="kn">import</span> <span class="nn">org.w3c.dom.NodeList</span><span class="o">;</span></div><div class='line' id='LC25'><span class="kn">import</span> <span class="nn">org.xml.sax.InputSource</span><span class="o">;</span></div><div class='line' id='LC26'><br/></div><div class='line' id='LC27'><span class="kn">import</span> <span class="nn">edu.stanford.nlp.dcoref.Dictionaries</span><span class="o">;</span></div><div class='line' id='LC28'><span class="kn">import</span> <span class="nn">edu.stanford.nlp.ie.AbstractSequenceClassifier</span><span class="o">;</span></div><div class='line' id='LC29'><span class="kn">import</span> <span class="nn">edu.stanford.nlp.trees.CollinsHeadFinder</span><span class="o">;</span></div><div class='line' id='LC30'><span class="kn">import</span> <span class="nn">edu.stanford.nlp.trees.Tree</span><span class="o">;</span></div><div class='line' id='LC31'><span class="kn">import</span> <span class="nn">edu.stanford.nlp.trees.Trees</span><span class="o">;</span></div><div class='line' id='LC32'><br/></div><div class='line' id='LC33'><br/></div><div class='line' id='LC34'><br/></div><div class='line' id='LC35'><span class="cm">/**</span></div><div class='line' id='LC36'><span class="cm"> * Methods to for preprocessing input files</span></div><div class='line' id='LC37'><span class="cm"> * </span></div><div class='line' id='LC38'><span class="cm"> * @author Kathryn Rodgers &amp; James Mitchell</span></div><div class='line' id='LC39'><span class="cm"> *</span></div><div class='line' id='LC40'><span class="cm"> */</span></div><div class='line' id='LC41'><span class="kd">public</span> <span class="kd">class</span> <span class="nc">PreProcessing</span> <span class="o">{</span></div><div class='line' id='LC42'><br/></div><div class='line' id='LC43'>	<span class="kd">private</span> <span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">NounPhrase</span><span class="o">&gt;</span> <span class="n">corefs</span> <span class="o">=</span> <span class="k">new</span> <span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">NounPhrase</span><span class="o">&gt;();</span></div><div class='line' id='LC44'>	<span class="cm">/**</span></div><div class='line' id='LC45'><span class="cm">	 * Strips the XML tags out of the file.  </span></div><div class='line' id='LC46'><span class="cm">	 * Creates a list of NounPhrases that are in the coref brackets</span></div><div class='line' id='LC47'><span class="cm">	 * @param file  the xml file</span></div><div class='line' id='LC48'><span class="cm">	 */</span></div><div class='line' id='LC49'>	<span class="kd">public</span> <span class="kt">void</span> <span class="nf">stripXML</span><span class="o">(</span><span class="n">File</span> <span class="n">file</span><span class="o">)</span></div><div class='line' id='LC50'>	<span class="o">{</span></div><div class='line' id='LC51'>		<span class="n">DocumentBuilderFactory</span> <span class="n">fact</span> <span class="o">=</span> <span class="n">DocumentBuilderFactory</span><span class="o">.</span><span class="na">newInstance</span><span class="o">();</span></div><div class='line' id='LC52'>		<span class="n">DocumentBuilder</span> <span class="n">builder</span><span class="o">;</span></div><div class='line' id='LC53'>		<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC54'>			<span class="n">builder</span> <span class="o">=</span> <span class="n">fact</span><span class="o">.</span><span class="na">newDocumentBuilder</span><span class="o">();</span></div><div class='line' id='LC55'>			<span class="n">Document</span> <span class="n">input</span> <span class="o">=</span> <span class="n">builder</span><span class="o">.</span><span class="na">parse</span><span class="o">(</span><span class="n">file</span><span class="o">);</span></div><div class='line' id='LC56'>			<span class="n">input</span><span class="o">.</span><span class="na">getDocumentElement</span><span class="o">().</span><span class="na">normalize</span><span class="o">();</span></div><div class='line' id='LC57'>			<span class="n">NodeList</span> <span class="n">corefNodes</span> <span class="o">=</span> <span class="n">input</span><span class="o">.</span><span class="na">getElementsByTagName</span><span class="o">(</span><span class="s">&quot;COREF&quot;</span><span class="o">);</span></div><div class='line' id='LC58'>			<span class="k">for</span><span class="o">(</span><span class="kt">int</span> <span class="n">x</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">x</span> <span class="o">&lt;</span> <span class="n">corefNodes</span><span class="o">.</span><span class="na">getLength</span><span class="o">();</span> <span class="n">x</span><span class="o">++)</span></div><div class='line' id='LC59'>			<span class="o">{</span></div><div class='line' id='LC60'>				<span class="c1">//NounPhrase temp = new NounPhrase(corefNodes.item(x).getTextContent());</span></div><div class='line' id='LC61'>				<span class="c1">//corefs.add(temp);</span></div><div class='line' id='LC62'>			<span class="o">}</span></div><div class='line' id='LC63'>			<span class="n">NodeList</span> <span class="n">textNodes</span> <span class="o">=</span> <span class="n">input</span><span class="o">.</span><span class="na">getElementsByTagName</span><span class="o">(</span><span class="s">&quot;TXT&quot;</span><span class="o">);</span></div><div class='line' id='LC64'>			<span class="n">String</span> <span class="n">s</span> <span class="o">=</span> <span class="n">textNodes</span><span class="o">.</span><span class="na">item</span><span class="o">(</span><span class="mi">0</span><span class="o">).</span><span class="na">getTextContent</span><span class="o">();</span></div><div class='line' id='LC65'>			<span class="n">File</span> <span class="n">tempXML</span> <span class="o">=</span> <span class="k">new</span> <span class="n">File</span><span class="o">(</span><span class="s">&quot;tempXML.txt&quot;</span><span class="o">);</span></div><div class='line' id='LC66'>			<span class="n">BufferedWriter</span> <span class="n">bw</span> <span class="o">=</span> <span class="k">new</span> <span class="n">BufferedWriter</span><span class="o">(</span><span class="k">new</span> <span class="n">FileWriter</span><span class="o">(</span><span class="n">tempXML</span><span class="o">));</span></div><div class='line' id='LC67'>			<span class="n">bw</span><span class="o">.</span><span class="na">write</span><span class="o">(</span><span class="n">s</span><span class="o">);</span></div><div class='line' id='LC68'>			<span class="n">bw</span><span class="o">.</span><span class="na">close</span><span class="o">();</span></div><div class='line' id='LC69'><br/></div><div class='line' id='LC70'>		<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">Exception</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC71'>			<span class="n">System</span><span class="o">.</span><span class="na">err</span><span class="o">.</span><span class="na">println</span><span class="o">(</span><span class="s">&quot;Problems stripping XML&quot;</span><span class="o">);</span></div><div class='line' id='LC72'>			<span class="n">e</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();</span></div><div class='line' id='LC73'>		<span class="o">}</span></div><div class='line' id='LC74'><br/></div><div class='line' id='LC75'><br/></div><div class='line' id='LC76'>	<span class="o">}</span></div><div class='line' id='LC77'>		<span class="kd">private</span> <span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">String</span><span class="o">&gt;</span> <span class="n">sentences</span><span class="o">;</span></div><div class='line' id='LC78'>		<span class="kd">private</span> <span class="n">NounPhrase</span><span class="o">[]</span> <span class="n">nounPhrases</span><span class="o">;</span></div><div class='line' id='LC79'>		<span class="kd">private</span> <span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">String</span><span class="o">[]&gt;</span> <span class="n">tokenizedSentences</span><span class="o">;</span><span class="c1">//the sentences tokenized</span></div><div class='line' id='LC80'>		<span class="kd">private</span> <span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">String</span><span class="o">[]&gt;</span> <span class="n">tokenPosTags</span><span class="o">;</span><span class="c1">//tags directly mapped to the tokenizedSentence ArrayList</span></div><div class='line' id='LC81'>		<span class="c1">//open nlp tools</span></div><div class='line' id='LC82'>		<span class="n">InputStream</span> <span class="n">modelIn</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span><span class="c1">//different models need to be loaded for each task</span></div><div class='line' id='LC83'><br/></div><div class='line' id='LC84'><br/></div><div class='line' id='LC85'>		<span class="kd">public</span> <span class="nf">PreProcessing</span><span class="o">(){</span></div><div class='line' id='LC86'>			<span class="n">sentences</span> <span class="o">=</span> <span class="k">new</span> <span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">String</span><span class="o">&gt;(</span><span class="mi">20</span><span class="o">);</span></div><div class='line' id='LC87'>			<span class="n">tokenizedSentences</span> <span class="o">=</span> <span class="k">new</span> <span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">String</span><span class="o">[]&gt;();</span></div><div class='line' id='LC88'>			<span class="n">tokenPosTags</span> <span class="o">=</span> <span class="k">new</span> <span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">String</span><span class="o">[]&gt;();</span></div><div class='line' id='LC89'>			<span class="n">corefs</span> <span class="o">=</span> <span class="k">new</span> <span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">NounPhrase</span><span class="o">&gt;();</span></div><div class='line' id='LC90'>		<span class="o">}</span></div><div class='line' id='LC91'><br/></div><div class='line' id='LC92'>		<span class="c1">//begin sentence splitting code</span></div><div class='line' id='LC93'><br/></div><div class='line' id='LC94'>		<span class="cm">/**</span></div><div class='line' id='LC95'><span class="cm">		 * Splits sentences by writing paragraphs to file then writing to file;</span></div><div class='line' id='LC96'><span class="cm">		 * @param file</span></div><div class='line' id='LC97'><span class="cm">		 */</span></div><div class='line' id='LC98'>		<span class="kd">public</span> <span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">String</span><span class="o">&gt;</span> <span class="n">splitSentences</span><span class="o">(</span><span class="n">String</span> <span class="n">currentChunk</span><span class="o">,</span> <span class="n">String</span> <span class="n">currentDir</span><span class="o">){</span></div><div class='line' id='LC99'>			<span class="n">SentenceModel</span> <span class="n">model</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC100'>			<span class="n">SentenceDetectorME</span> <span class="n">splitter</span> <span class="o">=</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC101'>			<span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">String</span><span class="o">&gt;</span> <span class="n">returnSentences</span> <span class="o">=</span> <span class="k">new</span> <span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">String</span><span class="o">&gt;();</span></div><div class='line' id='LC102'>			<span class="k">try</span><span class="o">{</span></div><div class='line' id='LC103'>				<span class="n">modelIn</span> <span class="o">=</span> <span class="k">new</span> <span class="n">FileInputStream</span><span class="o">(</span><span class="n">currentDir</span> <span class="o">+</span> <span class="s">&quot;/classifiers/en-sent.bin&quot;</span><span class="o">);</span></div><div class='line' id='LC104'>				<span class="n">model</span> <span class="o">=</span> <span class="k">new</span> <span class="n">SentenceModel</span><span class="o">(</span><span class="n">modelIn</span><span class="o">);</span></div><div class='line' id='LC105'>				<span class="n">splitter</span> <span class="o">=</span> <span class="k">new</span> <span class="n">SentenceDetectorME</span><span class="o">(</span><span class="n">model</span><span class="o">);</span></div><div class='line' id='LC106'><br/></div><div class='line' id='LC107'>				<span class="c1">//open the temp out file and parse the paragraphs one line at a time</span></div><div class='line' id='LC108'><br/></div><div class='line' id='LC109'>				<span class="n">String</span> <span class="n">line</span> <span class="o">=</span> <span class="n">currentChunk</span><span class="o">;</span></div><div class='line' id='LC110'>				<span class="n">String</span><span class="o">[]</span> <span class="n">temp</span><span class="o">;</span></div><div class='line' id='LC111'><br/></div><div class='line' id='LC112'>				<span class="n">line</span> <span class="o">=</span> <span class="n">line</span><span class="o">.</span><span class="na">trim</span><span class="o">();</span></div><div class='line' id='LC113'>				<span class="n">temp</span> <span class="o">=</span> <span class="n">splitter</span><span class="o">.</span><span class="na">sentDetect</span><span class="o">(</span><span class="n">line</span><span class="o">);</span> <span class="c1">//run the splitter which returns an array</span></div><div class='line' id='LC114'>				<span class="k">for</span><span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">temp</span><span class="o">.</span><span class="na">length</span><span class="o">;</span> <span class="n">i</span><span class="o">++)</span><span class="c1">//add each split sentence to the list of sentences</span></div><div class='line' id='LC115'>					<span class="n">returnSentences</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="n">temp</span><span class="o">[</span><span class="n">i</span><span class="o">]);</span></div><div class='line' id='LC116'>			<span class="o">}</span></div><div class='line' id='LC117'>			<span class="k">catch</span><span class="o">(</span><span class="n">Exception</span> <span class="n">e</span><span class="o">){</span></div><div class='line' id='LC118'>				<span class="n">e</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();</span></div><div class='line' id='LC119'>				<span class="k">return</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC120'>			<span class="o">}</span></div><div class='line' id='LC121'>			<span class="k">return</span> <span class="n">returnSentences</span><span class="o">;</span></div><div class='line' id='LC122'>		<span class="o">}</span></div><div class='line' id='LC123'>		<span class="c1">//end sentence splitting code</span></div><div class='line' id='LC124'>		<span class="cm">/**</span></div><div class='line' id='LC125'><span class="cm">		 * Tokenizes the sentence arrayList. The result of</span></div><div class='line' id='LC126'><span class="cm">		 * the tokenizer is an array of the sentence split up into tokens</span></div><div class='line' id='LC127'><span class="cm">		 * this method puts those arrays into an arrayList of token arrays.</span></div><div class='line' id='LC128'><span class="cm">		 * could possibly read out to file if that is desired.</span></div><div class='line' id='LC129'><span class="cm">		 */</span></div><div class='line' id='LC130'>		<span class="kd">public</span> <span class="n">String</span><span class="o">[]</span> <span class="nf">tokenize</span><span class="o">(</span><span class="n">String</span> <span class="n">currChunk</span><span class="o">){</span></div><div class='line' id='LC131'>			<span class="c1">//set up tokenizer</span></div><div class='line' id='LC132'>			<span class="n">TokenizerME</span> <span class="n">tokenizer</span><span class="o">;</span></div><div class='line' id='LC133'>			<span class="n">TokenizerModel</span> <span class="n">model</span><span class="o">;</span></div><div class='line' id='LC134'>			<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC135'>				<span class="n">modelIn</span> <span class="o">=</span> <span class="k">new</span> <span class="n">FileInputStream</span><span class="o">(</span><span class="s">&quot;en-token.bin&quot;</span><span class="o">);</span></div><div class='line' id='LC136'>				<span class="n">model</span> <span class="o">=</span> <span class="k">new</span> <span class="n">TokenizerModel</span><span class="o">(</span><span class="n">modelIn</span><span class="o">);</span><span class="c1">//initialize model</span></div><div class='line' id='LC137'>				<span class="n">tokenizer</span> <span class="o">=</span> <span class="k">new</span> <span class="n">TokenizerME</span><span class="o">(</span><span class="n">model</span><span class="o">);</span></div><div class='line' id='LC138'><br/></div><div class='line' id='LC139'>				<span class="c1">//Tokenize each sentence</span></div><div class='line' id='LC140'>				<span class="k">return</span> <span class="n">tokenizer</span><span class="o">.</span><span class="na">tokenize</span><span class="o">(</span><span class="n">currChunk</span><span class="o">);</span></div><div class='line' id='LC141'>			<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">Exception</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC142'>				<span class="n">e</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();</span></div><div class='line' id='LC143'>				<span class="k">return</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC144'>			<span class="o">}</span></div><div class='line' id='LC145'>		<span class="o">}</span></div><div class='line' id='LC146'><br/></div><div class='line' id='LC147'>		<span class="cm">/**</span></div><div class='line' id='LC148'><span class="cm">		 * This method will POSTag the array list of tokenized sentences</span></div><div class='line' id='LC149'><span class="cm">		 * The result of the tagging will be an arrayList of posTags</span></div><div class='line' id='LC150'><span class="cm">		 * stored in</span></div><div class='line' id='LC151'><span class="cm">		 */</span></div><div class='line' id='LC152'>		<span class="kd">public</span> <span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">String</span><span class="o">[]&gt;</span> <span class="n">posTag</span><span class="o">(</span><span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">String</span><span class="o">[]&gt;</span> <span class="n">sentArrays</span><span class="o">){</span></div><div class='line' id='LC153'>			<span class="c1">//set up tagger</span></div><div class='line' id='LC154'>			<span class="n">POSTaggerME</span> <span class="n">tagger</span><span class="o">;</span></div><div class='line' id='LC155'>			<span class="n">POSModel</span> <span class="n">model</span><span class="o">;</span></div><div class='line' id='LC156'>			<span class="k">try</span><span class="o">{</span></div><div class='line' id='LC157'>				<span class="n">modelIn</span> <span class="o">=</span> <span class="k">new</span> <span class="n">FileInputStream</span><span class="o">(</span><span class="s">&quot;en-pos-maxent.bin&quot;</span><span class="o">);</span></div><div class='line' id='LC158'>				<span class="n">model</span> <span class="o">=</span> <span class="k">new</span> <span class="n">POSModel</span><span class="o">(</span><span class="n">modelIn</span><span class="o">);</span></div><div class='line' id='LC159'>				<span class="n">tagger</span> <span class="o">=</span> <span class="k">new</span> <span class="n">POSTaggerME</span><span class="o">(</span><span class="n">model</span><span class="o">);</span></div><div class='line' id='LC160'>				<span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">String</span><span class="o">[]&gt;</span><span class="n">posTags</span> <span class="o">=</span> <span class="k">new</span> <span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">String</span><span class="o">[]&gt;();</span></div><div class='line' id='LC161'>				<span class="c1">//tag each tokenized sentence array</span></div><div class='line' id='LC162'>				<span class="k">for</span><span class="o">(</span><span class="n">String</span><span class="o">[]</span> <span class="n">sentArray</span> <span class="o">:</span> <span class="n">sentArrays</span><span class="o">){</span></div><div class='line' id='LC163'>					<span class="n">posTags</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="n">tagger</span><span class="o">.</span><span class="na">tag</span><span class="o">(</span><span class="n">sentArray</span><span class="o">));</span></div><div class='line' id='LC164'>				<span class="o">}</span></div><div class='line' id='LC165'>				<span class="k">return</span> <span class="n">posTags</span><span class="o">;</span></div><div class='line' id='LC166'><br/></div><div class='line' id='LC167'>			<span class="o">}</span><span class="k">catch</span><span class="o">(</span><span class="n">Exception</span> <span class="n">e</span><span class="o">){</span></div><div class='line' id='LC168'>				<span class="n">e</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();</span></div><div class='line' id='LC169'>				<span class="k">return</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC170'>			<span class="o">}</span></div><div class='line' id='LC171'><br/></div><div class='line' id='LC172'>		<span class="o">}</span></div><div class='line' id='LC173'><br/></div><div class='line' id='LC174'>		<span class="cm">/**</span></div><div class='line' id='LC175'><span class="cm">		 * NOT USED --combines the tokenized sentences with the tags in the form &quot;word/tag&quot;.</span></div><div class='line' id='LC176'><span class="cm">		 * @return an array list of fused tokens</span></div><div class='line' id='LC177'><span class="cm">		 */</span></div><div class='line' id='LC178'>		<span class="kd">public</span> <span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">String</span><span class="o">[]&gt;</span> <span class="n">fuseTagsForFunAndProfit</span><span class="o">(){</span></div><div class='line' id='LC179'>			<span class="k">if</span><span class="o">(</span><span class="n">tokenPosTags</span><span class="o">.</span><span class="na">isEmpty</span><span class="o">()</span> <span class="o">||</span> <span class="n">tokenizedSentences</span><span class="o">.</span><span class="na">isEmpty</span><span class="o">())</span></div><div class='line' id='LC180'>				<span class="k">return</span> <span class="kc">null</span><span class="o">;</span></div><div class='line' id='LC181'>			<span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">String</span><span class="o">[]&gt;</span> <span class="n">fused</span> <span class="o">=</span> <span class="k">new</span> <span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">String</span><span class="o">[]&gt;();</span></div><div class='line' id='LC182'>			<span class="c1">//cycle through each sentence</span></div><div class='line' id='LC183'>			<span class="k">for</span><span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">tokenizedSentences</span><span class="o">.</span><span class="na">size</span><span class="o">();</span> <span class="n">i</span><span class="o">++){</span></div><div class='line' id='LC184'>				<span class="n">String</span><span class="o">[]</span> <span class="n">tempToken</span> <span class="o">=</span> <span class="k">new</span> <span class="n">String</span><span class="o">[</span><span class="n">tokenizedSentences</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">i</span><span class="o">).</span><span class="na">length</span><span class="o">];</span><span class="c1">// this array will contain fused tokens</span></div><div class='line' id='LC185'>				<span class="c1">//cycle through each sentences tokens</span></div><div class='line' id='LC186'>				<span class="k">for</span><span class="o">(</span><span class="kt">int</span> <span class="n">j</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">j</span> <span class="o">&lt;</span> <span class="n">tokenizedSentences</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">i</span><span class="o">).</span><span class="na">length</span><span class="o">;</span> <span class="n">j</span><span class="o">++){</span></div><div class='line' id='LC187'>					<span class="c1">//fuse the tokens</span></div><div class='line' id='LC188'>					<span class="n">String</span> <span class="n">fusedString</span> <span class="o">=</span> <span class="s">&quot;&quot;</span><span class="o">;</span></div><div class='line' id='LC189'>					<span class="k">if</span><span class="o">(</span><span class="n">tokenPosTags</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">i</span><span class="o">)[</span><span class="n">j</span><span class="o">]</span> <span class="o">!=</span> <span class="kc">null</span> <span class="o">&amp;&amp;</span> <span class="n">tokenizedSentences</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">i</span><span class="o">)[</span><span class="n">j</span><span class="o">]</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">){</span></div><div class='line' id='LC190'>						<span class="n">fusedString</span> <span class="o">=</span> <span class="n">tokenizedSentences</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">i</span><span class="o">)[</span><span class="n">j</span><span class="o">];</span></div><div class='line' id='LC191'>						<span class="n">fusedString</span> <span class="o">+=</span>	<span class="s">&quot;/&quot;</span> <span class="o">+</span> <span class="n">tokenPosTags</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">i</span><span class="o">)[</span><span class="n">j</span><span class="o">];</span></div><div class='line' id='LC192'><br/></div><div class='line' id='LC193'>					<span class="o">}</span></div><div class='line' id='LC194'>					<span class="n">tempToken</span><span class="o">[</span><span class="n">j</span><span class="o">]</span> <span class="o">=</span> <span class="n">fusedString</span><span class="o">;</span><span class="c1">//add the fused string to the temp tokenized sentenc</span></div><div class='line' id='LC195'>				<span class="o">}</span></div><div class='line' id='LC196'>				<span class="n">fused</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="n">tempToken</span><span class="o">);</span></div><div class='line' id='LC197'>			<span class="o">}</span></div><div class='line' id='LC198'>			<span class="k">return</span> <span class="n">fused</span><span class="o">;</span></div><div class='line' id='LC199'>		<span class="o">}</span></div><div class='line' id='LC200'><br/></div><div class='line' id='LC201'>		<span class="cm">/**</span></div><div class='line' id='LC202'><span class="cm">		 * NOT USED--uses the open nlp chunker</span></div><div class='line' id='LC203'><span class="cm">		 * @param sentArr</span></div><div class='line' id='LC204'><span class="cm">		 * @param posArr</span></div><div class='line' id='LC205'><span class="cm">		 * @return</span></div><div class='line' id='LC206'><span class="cm">		 */</span></div><div class='line' id='LC207'>		<span class="kd">public</span> <span class="n">String</span><span class="o">[]</span> <span class="nf">partialParse</span><span class="o">(</span><span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">String</span><span class="o">[]&gt;</span> <span class="n">sentArr</span><span class="o">,</span> <span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">String</span><span class="o">[]&gt;</span> <span class="n">posArr</span><span class="o">){</span></div><div class='line' id='LC208'>			<span class="n">ChunkerME</span> <span class="n">chunker</span><span class="o">;</span></div><div class='line' id='LC209'>			<span class="n">ChunkerModel</span> <span class="n">model</span><span class="o">;</span></div><div class='line' id='LC210'>			<span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">String</span><span class="o">[]&gt;</span> <span class="n">chunks</span> <span class="o">=</span> <span class="k">new</span> <span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">String</span><span class="o">[]&gt;();</span></div><div class='line' id='LC211'><br/></div><div class='line' id='LC212'>			<span class="k">try</span> <span class="o">{</span></div><div class='line' id='LC213'>				<span class="n">modelIn</span> <span class="o">=</span> <span class="k">new</span> <span class="n">FileInputStream</span><span class="o">(</span><span class="s">&quot;/en-chunker.bin&quot;</span><span class="o">);</span></div><div class='line' id='LC214'>				<span class="n">model</span> <span class="o">=</span> <span class="k">new</span> <span class="n">ChunkerModel</span><span class="o">(</span><span class="n">modelIn</span><span class="o">);</span></div><div class='line' id='LC215'>				<span class="n">chunker</span> <span class="o">=</span> <span class="k">new</span> <span class="n">ChunkerME</span><span class="o">(</span><span class="n">model</span><span class="o">);</span></div><div class='line' id='LC216'><br/></div><div class='line' id='LC217'>				<span class="k">for</span><span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">sentArr</span><span class="o">.</span><span class="na">size</span><span class="o">();</span> <span class="n">i</span><span class="o">++){</span></div><div class='line' id='LC218'>						 <span class="n">chunks</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="n">chunker</span><span class="o">.</span><span class="na">chunk</span><span class="o">(</span><span class="n">sentArr</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">i</span><span class="o">),</span> <span class="n">posArr</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">i</span><span class="o">)));</span></div><div class='line' id='LC219'>					<span class="o">}</span></div><div class='line' id='LC220'>			<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">InvalidFormatException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC221'>				<span class="c1">// TODO Auto-generated catch block</span></div><div class='line' id='LC222'>				<span class="n">e</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();</span></div><div class='line' id='LC223'>			<span class="o">}</span> <span class="k">catch</span> <span class="o">(</span><span class="n">IOException</span> <span class="n">e</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC224'>				<span class="c1">// TODO Auto-generated catch block</span></div><div class='line' id='LC225'>				<span class="n">e</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();</span></div><div class='line' id='LC226'>			<span class="o">}</span></div><div class='line' id='LC227'>			<span class="k">return</span> <span class="nf">chunksToNP</span><span class="o">(</span><span class="n">chunks</span><span class="o">,</span> <span class="n">sentArr</span><span class="o">);</span></div><div class='line' id='LC228'><br/></div><div class='line' id='LC229'>		<span class="o">}</span></div><div class='line' id='LC230'><br/></div><div class='line' id='LC231'>		<span class="cm">/**</span></div><div class='line' id='LC232'><span class="cm">		 * NOT USED--takes input from the opennlp chunker and turns it into a noun</span></div><div class='line' id='LC233'><span class="cm">		 * phrase </span></div><div class='line' id='LC234'><span class="cm">		 * @param chunks</span></div><div class='line' id='LC235'><span class="cm">		 * @param tokSent</span></div><div class='line' id='LC236'><span class="cm">		 * @return</span></div><div class='line' id='LC237'><span class="cm">		 */</span></div><div class='line' id='LC238'>		<span class="kd">private</span> <span class="n">String</span><span class="o">[]</span> <span class="nf">chunksToNP</span><span class="o">(</span><span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">String</span><span class="o">[]&gt;</span> <span class="n">chunks</span><span class="o">,</span> <span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">String</span><span class="o">[]&gt;</span> <span class="n">tokSent</span><span class="o">){</span></div><div class='line' id='LC239'>			<span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">String</span><span class="o">&gt;</span> <span class="n">NPs</span> <span class="o">=</span> <span class="k">new</span> <span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">String</span><span class="o">&gt;(</span><span class="n">chunks</span><span class="o">.</span><span class="na">size</span><span class="o">()*</span><span class="mi">2</span><span class="o">);</span></div><div class='line' id='LC240'><br/></div><div class='line' id='LC241'>			<span class="k">for</span><span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">chunks</span><span class="o">.</span><span class="na">size</span><span class="o">();</span> <span class="n">i</span><span class="o">++){</span><span class="c1">//cycle through each sentence</span></div><div class='line' id='LC242'>				<span class="kt">int</span> <span class="n">arrSize</span> <span class="o">=</span> <span class="n">chunks</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">i</span><span class="o">).</span><span class="na">length</span><span class="o">;</span><span class="c1">//cycle through the sentences np chunks</span></div><div class='line' id='LC243'>				<span class="k">for</span><span class="o">(</span><span class="kt">int</span> <span class="n">j</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">j</span> <span class="o">&lt;</span> <span class="n">arrSize</span><span class="o">;</span> <span class="n">j</span><span class="o">++){</span></div><div class='line' id='LC244'>					<span class="k">if</span><span class="o">(</span><span class="n">chunks</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">i</span><span class="o">)[</span><span class="n">j</span><span class="o">].</span><span class="na">equals</span><span class="o">(</span><span class="s">&quot;B-NP&quot;</span><span class="o">)){</span></div><div class='line' id='LC245'>						<span class="n">String</span> <span class="n">theNP</span> <span class="o">=</span> <span class="n">tokSent</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">i</span><span class="o">)[</span><span class="n">j</span><span class="o">]</span> <span class="o">+</span> <span class="s">&quot; &quot;</span><span class="o">;</span></div><div class='line' id='LC246'>						<span class="n">j</span><span class="o">++;</span></div><div class='line' id='LC247'>						<span class="k">while</span><span class="o">(</span><span class="n">j</span> <span class="o">&lt;</span> <span class="n">arrSize</span> <span class="o">&amp;&amp;</span> <span class="o">!</span><span class="n">chunks</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">i</span><span class="o">)[</span><span class="n">j</span><span class="o">].</span><span class="na">contains</span><span class="o">(</span><span class="s">&quot;B-&quot;</span><span class="o">)){</span></div><div class='line' id='LC248'>							<span class="n">theNP</span> <span class="o">+=</span> <span class="n">tokSent</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">i</span><span class="o">)[</span><span class="n">j</span><span class="o">]</span> <span class="o">+</span> <span class="s">&quot; &quot;</span><span class="o">;</span></div><div class='line' id='LC249'>							<span class="n">j</span><span class="o">++;</span></div><div class='line' id='LC250'>						<span class="o">}</span></div><div class='line' id='LC251'>						<span class="n">NPs</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="n">theNP</span><span class="o">);</span></div><div class='line' id='LC252'>					<span class="o">}</span></div><div class='line' id='LC253'>				<span class="o">}</span></div><div class='line' id='LC254'>			<span class="o">}</span></div><div class='line' id='LC255'>			<span class="n">String</span><span class="o">[]</span> <span class="n">nounPhrases</span> <span class="o">=</span> <span class="k">new</span> <span class="n">String</span><span class="o">[</span><span class="n">NPs</span><span class="o">.</span><span class="na">size</span><span class="o">()];</span></div><div class='line' id='LC256'>			<span class="k">return</span> <span class="n">NPs</span><span class="o">.</span><span class="na">toArray</span><span class="o">(</span><span class="n">nounPhrases</span><span class="o">);</span></div><div class='line' id='LC257'>		<span class="o">}</span></div><div class='line' id='LC258'><br/></div><div class='line' id='LC259'>		<span class="cm">/**</span></div><div class='line' id='LC260'><span class="cm">		 * this method runs the stanford ner classifier</span></div><div class='line' id='LC261'><span class="cm">		 * @param nounPhrase the phrase to classify</span></div><div class='line' id='LC262'><span class="cm">		 * @param classifier the classifier to use</span></div><div class='line' id='LC263'><span class="cm">		 */</span></div><div class='line' id='LC264'>		<span class="kd">public</span> <span class="kt">void</span> <span class="nf">FindNer</span><span class="o">(</span><span class="n">NounPhrase</span> <span class="n">nounPhrase</span><span class="o">,</span> <span class="n">AbstractSequenceClassifier</span> <span class="n">classifier</span><span class="o">){</span></div><div class='line' id='LC265'>			<span class="n">String</span> <span class="n">serializedClassifier</span> <span class="o">=</span> <span class="s">&quot;&quot;</span><span class="o">;</span></div><div class='line' id='LC266'>			<span class="n">String</span> <span class="n">classification</span> <span class="o">=</span> <span class="n">classifier</span><span class="o">.</span><span class="na">classifyWithInlineXML</span><span class="o">(</span><span class="n">nounPhrase</span><span class="o">.</span><span class="na">getPhrase</span><span class="o">());</span></div><div class='line' id='LC267'>			<span class="n">setNE</span><span class="o">(</span><span class="n">classification</span><span class="o">,</span> <span class="n">nounPhrase</span><span class="o">);</span></div><div class='line' id='LC268'>		<span class="o">}</span></div><div class='line' id='LC269'><br/></div><div class='line' id='LC270'>		<span class="cm">/**</span></div><div class='line' id='LC271'><span class="cm">		 * This method takes a Named Entity classification(created by FindNER which uses Stanford NER)</span></div><div class='line' id='LC272'><span class="cm">		 * and extracts the noun phrases and puts them into the np sent in as a param.</span></div><div class='line' id='LC273'><span class="cm">		 * @param np</span></div><div class='line' id='LC274'><span class="cm">		 * @param classification</span></div><div class='line' id='LC275'><span class="cm">		 */</span></div><div class='line' id='LC276'>		<span class="kd">private</span> <span class="kt">void</span>  <span class="nf">setNE</span><span class="o">(</span><span class="n">String</span> <span class="n">classification</span><span class="o">,</span> <span class="n">NounPhrase</span> <span class="n">np</span><span class="o">){</span></div><div class='line' id='LC277'>					<span class="n">classification</span> <span class="o">=</span> <span class="s">&quot;&lt;TEXT&gt;&quot;</span> <span class="o">+</span> <span class="n">classification</span> <span class="o">+</span><span class="s">&quot;&lt;/TEXT&gt;&quot;</span><span class="o">;</span></div><div class='line' id='LC278'>			        <span class="n">DocumentBuilderFactory</span> <span class="n">factory</span> <span class="o">=</span> <span class="n">DocumentBuilderFactory</span><span class="o">.</span><span class="na">newInstance</span><span class="o">();</span></div><div class='line' id='LC279'>			        <span class="k">try</span><span class="o">{</span></div><div class='line' id='LC280'>			        <span class="n">DocumentBuilder</span> <span class="n">builder</span> <span class="o">=</span> <span class="n">factory</span><span class="o">.</span><span class="na">newDocumentBuilder</span><span class="o">();</span></div><div class='line' id='LC281'>			        <span class="n">classification</span> <span class="o">=</span> <span class="n">classification</span><span class="o">.</span><span class="na">replaceAll</span><span class="o">(</span><span class="s">&quot;&amp;&quot;</span><span class="o">,</span> <span class="s">&quot;&quot;</span><span class="o">);</span></div><div class='line' id='LC282'>			        <span class="n">InputSource</span> <span class="n">is</span> <span class="o">=</span> <span class="k">new</span> <span class="n">InputSource</span><span class="o">(</span><span class="k">new</span> <span class="n">StringReader</span><span class="o">(</span><span class="n">classification</span><span class="o">));</span></div><div class='line' id='LC283'>			        <span class="n">Document</span> <span class="n">doc</span> <span class="o">=</span> <span class="n">builder</span><span class="o">.</span><span class="na">parse</span><span class="o">(</span><span class="n">is</span><span class="o">);</span></div><div class='line' id='LC284'>					<span class="c1">//classification = classification.replaceAll(&quot;&lt;&quot;, &quot;&amp;lt&quot;);</span></div><div class='line' id='LC285'>					<span class="c1">//classification = classification.replaceAll(&quot;&gt;&quot;, &quot;&amp;gt&quot;);</span></div><div class='line' id='LC286'>			        <span class="n">NodeList</span> <span class="n">nodes</span> <span class="o">=</span> <span class="n">doc</span><span class="o">.</span><span class="na">getElementsByTagName</span><span class="o">(</span><span class="s">&quot;ORGANIZATION&quot;</span><span class="o">);</span></div><div class='line' id='LC287'><br/></div><div class='line' id='LC288'>			        <span class="k">for</span><span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">nodes</span><span class="o">.</span><span class="na">getLength</span><span class="o">();</span> <span class="n">i</span><span class="o">++){</span></div><div class='line' id='LC289'>			        	<span class="n">String</span> <span class="n">bob</span> <span class="o">=</span> <span class="n">nodes</span><span class="o">.</span><span class="na">item</span><span class="o">(</span><span class="mi">0</span><span class="o">).</span><span class="na">getTextContent</span><span class="o">();</span></div><div class='line' id='LC290'>			        	<span class="n">np</span><span class="o">.</span><span class="na">addNamedEntity</span><span class="o">(</span><span class="n">nodes</span><span class="o">.</span><span class="na">item</span><span class="o">(</span><span class="n">i</span><span class="o">).</span><span class="na">getTextContent</span><span class="o">(),</span> <span class="n">NounPhrase</span><span class="o">.</span><span class="na">Classification</span><span class="o">.</span><span class="na">ORGANIZATION</span><span class="o">);</span></div><div class='line' id='LC291'>			        	<span class="c1">//System.out.println(bob + &quot; Org&quot;);</span></div><div class='line' id='LC292'>			        <span class="o">}</span> </div><div class='line' id='LC293'>			        <span class="n">nodes</span> <span class="o">=</span> <span class="n">doc</span><span class="o">.</span><span class="na">getElementsByTagName</span><span class="o">(</span><span class="s">&quot;PERSON&quot;</span><span class="o">);</span></div><div class='line' id='LC294'>			        <span class="k">for</span><span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">nodes</span><span class="o">.</span><span class="na">getLength</span><span class="o">();</span> <span class="n">i</span><span class="o">++){</span></div><div class='line' id='LC295'>			        	<span class="n">String</span> <span class="n">bob</span> <span class="o">=</span> <span class="n">nodes</span><span class="o">.</span><span class="na">item</span><span class="o">(</span><span class="n">i</span><span class="o">).</span><span class="na">getTextContent</span><span class="o">();</span></div><div class='line' id='LC296'>			        	<span class="n">np</span><span class="o">.</span><span class="na">addNamedEntity</span><span class="o">(</span><span class="n">nodes</span><span class="o">.</span><span class="na">item</span><span class="o">(</span><span class="n">i</span><span class="o">).</span><span class="na">getTextContent</span><span class="o">(),</span> <span class="n">NounPhrase</span><span class="o">.</span><span class="na">Classification</span><span class="o">.</span><span class="na">PERSON</span><span class="o">);</span></div><div class='line' id='LC297'>			        	<span class="c1">//System.out.println(bob + &quot; Pers&quot;);</span></div><div class='line' id='LC298'>			        <span class="o">}</span></div><div class='line' id='LC299'>			        <span class="n">nodes</span> <span class="o">=</span> <span class="n">doc</span><span class="o">.</span><span class="na">getElementsByTagName</span><span class="o">(</span><span class="s">&quot;LOCATION&quot;</span><span class="o">);</span></div><div class='line' id='LC300'>		        	 <span class="k">for</span><span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">nodes</span><span class="o">.</span><span class="na">getLength</span><span class="o">();</span> <span class="n">i</span><span class="o">++){</span></div><div class='line' id='LC301'>			        	<span class="n">String</span> <span class="n">bob</span> <span class="o">=</span> <span class="n">nodes</span><span class="o">.</span><span class="na">item</span><span class="o">(</span><span class="mi">0</span><span class="o">).</span><span class="na">getTextContent</span><span class="o">();</span></div><div class='line' id='LC302'>			        	<span class="n">np</span><span class="o">.</span><span class="na">addNamedEntity</span><span class="o">(</span><span class="n">nodes</span><span class="o">.</span><span class="na">item</span><span class="o">(</span><span class="mi">0</span><span class="o">).</span><span class="na">getTextContent</span><span class="o">(),</span> <span class="n">NounPhrase</span><span class="o">.</span><span class="na">Classification</span><span class="o">.</span><span class="na">LOCATION</span><span class="o">);</span></div><div class='line' id='LC303'>			          	<span class="c1">//System.out.println(bob + &quot; Loc&quot;);</span></div><div class='line' id='LC304'>		        	 <span class="o">}</span></div><div class='line' id='LC305'>		        	 <span class="n">nodes</span> <span class="o">=</span> <span class="n">doc</span><span class="o">.</span><span class="na">getElementsByTagName</span><span class="o">(</span><span class="s">&quot;MISC&quot;</span><span class="o">);</span></div><div class='line' id='LC306'>		        	 <span class="k">for</span><span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">nodes</span><span class="o">.</span><span class="na">getLength</span><span class="o">();</span> <span class="n">i</span><span class="o">++){</span></div><div class='line' id='LC307'>			        	<span class="n">String</span> <span class="n">bob</span> <span class="o">=</span> <span class="n">nodes</span><span class="o">.</span><span class="na">item</span><span class="o">(</span><span class="mi">0</span><span class="o">).</span><span class="na">getTextContent</span><span class="o">();</span></div><div class='line' id='LC308'>			        	<span class="n">np</span><span class="o">.</span><span class="na">addNamedEntity</span><span class="o">(</span><span class="n">nodes</span><span class="o">.</span><span class="na">item</span><span class="o">(</span><span class="mi">0</span><span class="o">).</span><span class="na">getTextContent</span><span class="o">(),</span> <span class="n">NounPhrase</span><span class="o">.</span><span class="na">Classification</span><span class="o">.</span><span class="na">MISC</span><span class="o">);</span></div><div class='line' id='LC309'>			          	<span class="c1">//System.out.println(bob + &quot; Loc&quot;);</span></div><div class='line' id='LC310'>		        	 <span class="o">}</span></div><div class='line' id='LC311'>		        	 <span class="n">nodes</span> <span class="o">=</span> <span class="n">doc</span><span class="o">.</span><span class="na">getElementsByTagName</span><span class="o">(</span><span class="s">&quot;DATE&quot;</span><span class="o">);</span></div><div class='line' id='LC312'>		        	 <span class="k">for</span><span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">nodes</span><span class="o">.</span><span class="na">getLength</span><span class="o">();</span> <span class="n">i</span><span class="o">++){</span></div><div class='line' id='LC313'>			        	<span class="n">String</span> <span class="n">bob</span> <span class="o">=</span> <span class="n">nodes</span><span class="o">.</span><span class="na">item</span><span class="o">(</span><span class="mi">0</span><span class="o">).</span><span class="na">getTextContent</span><span class="o">();</span></div><div class='line' id='LC314'>			        	<span class="n">np</span><span class="o">.</span><span class="na">addNamedEntity</span><span class="o">(</span><span class="n">nodes</span><span class="o">.</span><span class="na">item</span><span class="o">(</span><span class="mi">0</span><span class="o">).</span><span class="na">getTextContent</span><span class="o">(),</span> <span class="n">NounPhrase</span><span class="o">.</span><span class="na">Classification</span><span class="o">.</span><span class="na">DATE</span><span class="o">);</span></div><div class='line' id='LC315'>			          	<span class="c1">//System.out.println(bob + &quot; Loc&quot;);</span></div><div class='line' id='LC316'>		        	 <span class="o">}</span></div><div class='line' id='LC317'>		        	 <span class="n">nodes</span> <span class="o">=</span> <span class="n">doc</span><span class="o">.</span><span class="na">getElementsByTagName</span><span class="o">(</span><span class="s">&quot;MONEY&quot;</span><span class="o">);</span></div><div class='line' id='LC318'>		        	 <span class="k">for</span><span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">nodes</span><span class="o">.</span><span class="na">getLength</span><span class="o">();</span> <span class="n">i</span><span class="o">++){</span></div><div class='line' id='LC319'>			        	<span class="n">String</span> <span class="n">bob</span> <span class="o">=</span> <span class="n">nodes</span><span class="o">.</span><span class="na">item</span><span class="o">(</span><span class="mi">0</span><span class="o">).</span><span class="na">getTextContent</span><span class="o">();</span></div><div class='line' id='LC320'>			        	<span class="n">np</span><span class="o">.</span><span class="na">addNamedEntity</span><span class="o">(</span><span class="n">nodes</span><span class="o">.</span><span class="na">item</span><span class="o">(</span><span class="mi">0</span><span class="o">).</span><span class="na">getTextContent</span><span class="o">(),</span> <span class="n">NounPhrase</span><span class="o">.</span><span class="na">Classification</span><span class="o">.</span><span class="na">MONEY</span><span class="o">);</span></div><div class='line' id='LC321'>			          	<span class="c1">//System.out.println(bob + &quot; Loc&quot;);</span></div><div class='line' id='LC322'>		        	 <span class="o">}</span></div><div class='line' id='LC323'>		        	 <span class="n">nodes</span> <span class="o">=</span> <span class="n">doc</span><span class="o">.</span><span class="na">getElementsByTagName</span><span class="o">(</span><span class="s">&quot;PERCENT&quot;</span><span class="o">);</span></div><div class='line' id='LC324'>		        	 <span class="k">for</span><span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">nodes</span><span class="o">.</span><span class="na">getLength</span><span class="o">();</span> <span class="n">i</span><span class="o">++){</span></div><div class='line' id='LC325'>			        	<span class="n">String</span> <span class="n">bob</span> <span class="o">=</span> <span class="n">nodes</span><span class="o">.</span><span class="na">item</span><span class="o">(</span><span class="mi">0</span><span class="o">).</span><span class="na">getTextContent</span><span class="o">();</span></div><div class='line' id='LC326'>			        	<span class="n">np</span><span class="o">.</span><span class="na">addNamedEntity</span><span class="o">(</span><span class="n">nodes</span><span class="o">.</span><span class="na">item</span><span class="o">(</span><span class="mi">0</span><span class="o">).</span><span class="na">getTextContent</span><span class="o">(),</span> <span class="n">NounPhrase</span><span class="o">.</span><span class="na">Classification</span><span class="o">.</span><span class="na">PERCENT</span><span class="o">);</span></div><div class='line' id='LC327'>			          	<span class="c1">//System.out.println(bob + &quot; Loc&quot;);</span></div><div class='line' id='LC328'>		        	 <span class="o">}</span></div><div class='line' id='LC329'>		        	 <span class="n">nodes</span> <span class="o">=</span> <span class="n">doc</span><span class="o">.</span><span class="na">getElementsByTagName</span><span class="o">(</span><span class="s">&quot;TIME&quot;</span><span class="o">);</span></div><div class='line' id='LC330'>		        	 <span class="k">for</span><span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">nodes</span><span class="o">.</span><span class="na">getLength</span><span class="o">();</span> <span class="n">i</span><span class="o">++){</span></div><div class='line' id='LC331'>			        	<span class="n">String</span> <span class="n">bob</span> <span class="o">=</span> <span class="n">nodes</span><span class="o">.</span><span class="na">item</span><span class="o">(</span><span class="mi">0</span><span class="o">).</span><span class="na">getTextContent</span><span class="o">();</span></div><div class='line' id='LC332'>			        	<span class="n">np</span><span class="o">.</span><span class="na">addNamedEntity</span><span class="o">(</span><span class="n">nodes</span><span class="o">.</span><span class="na">item</span><span class="o">(</span><span class="mi">0</span><span class="o">).</span><span class="na">getTextContent</span><span class="o">(),</span> <span class="n">NounPhrase</span><span class="o">.</span><span class="na">Classification</span><span class="o">.</span><span class="na">TIME</span><span class="o">);</span></div><div class='line' id='LC333'>			          	<span class="c1">//System.out.println(bob + &quot; Loc&quot;);</span></div><div class='line' id='LC334'>		        	 <span class="o">}</span></div><div class='line' id='LC335'><br/></div><div class='line' id='LC336'>			        <span class="o">}</span><span class="k">catch</span><span class="o">(</span><span class="n">Exception</span> <span class="n">e</span><span class="o">){</span><span class="n">e</span><span class="o">.</span><span class="na">printStackTrace</span><span class="o">();}</span></div><div class='line' id='LC337'>		<span class="o">}</span></div><div class='line' id='LC338'><br/></div><div class='line' id='LC339'>		<span class="cm">/**</span></div><div class='line' id='LC340'><span class="cm">		 * Checks to see if the nounphrase contains pronouns.</span></div><div class='line' id='LC341'><span class="cm">		 * Sets the nounPhrase&#39;s pronoun boolean to true if</span></div><div class='line' id='LC342'><span class="cm">		 * it&#39;s phrase contains a pronoun.</span></div><div class='line' id='LC343'><span class="cm">		 * See parserUtil.tagIsPronoun for tags that are considered</span></div><div class='line' id='LC344'><span class="cm">		 * prounouns.</span></div><div class='line' id='LC345'><span class="cm">		 * @param phrase</span></div><div class='line' id='LC346'><span class="cm">		 */</span></div><div class='line' id='LC347'>		<span class="kd">private</span> <span class="kt">void</span> <span class="nf">setPronouns</span><span class="o">(</span><span class="n">NounPhrase</span> <span class="n">phrase</span><span class="o">){</span></div><div class='line' id='LC348'>			<span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">String</span><span class="o">&gt;</span> <span class="n">posTags</span> <span class="o">=</span> <span class="n">phrase</span><span class="o">.</span><span class="na">getPosTags</span><span class="o">();</span></div><div class='line' id='LC349'>			<span class="k">for</span><span class="o">(</span><span class="kt">int</span> <span class="n">i</span> <span class="o">=</span> <span class="mi">0</span><span class="o">;</span> <span class="n">i</span> <span class="o">&lt;</span> <span class="n">posTags</span><span class="o">.</span><span class="na">size</span><span class="o">();</span> <span class="n">i</span><span class="o">++){</span></div><div class='line' id='LC350'>				<span class="k">if</span><span class="o">(</span><span class="n">parserUtil</span><span class="o">.</span><span class="na">tagIsProunoun</span><span class="o">(</span><span class="n">posTags</span><span class="o">.</span><span class="na">get</span><span class="o">(</span><span class="n">i</span><span class="o">))){</span></div><div class='line' id='LC351'>					<span class="n">phrase</span><span class="o">.</span><span class="na">setPronoun</span><span class="o">(</span><span class="kc">true</span><span class="o">,</span> <span class="n">phrase</span><span class="o">.</span><span class="na">getPhraseAsList</span><span class="o">().</span><span class="na">get</span><span class="o">(</span><span class="n">i</span><span class="o">));</span></div><div class='line' id='LC352'>					<span class="k">return</span><span class="o">;</span></div><div class='line' id='LC353'>				<span class="o">}</span></div><div class='line' id='LC354'>			<span class="o">}</span></div><div class='line' id='LC355'>		<span class="o">}</span></div><div class='line' id='LC356'><br/></div><div class='line' id='LC357'>		<span class="cm">/**</span></div><div class='line' id='LC358'><span class="cm">		 * This will determine if a nounphrase is plural or not.</span></div><div class='line' id='LC359'><span class="cm">		 * See parserUtil for tags that are considered plural</span></div><div class='line' id='LC360'><span class="cm">		 * @param phrase the phrase to check</span></div><div class='line' id='LC361'><span class="cm">		 */</span></div><div class='line' id='LC362'>		<span class="kd">private</span> <span class="kt">void</span> <span class="nf">determineNumber</span><span class="o">(</span><span class="n">NounPhrase</span> <span class="n">phrase</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC363'>			<span class="c1">//look at the pos tag of the head noun first</span></div><div class='line' id='LC364'>			<span class="k">if</span><span class="o">(</span><span class="n">phrase</span><span class="o">.</span><span class="na">getHeadPhrase</span><span class="o">()</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">){</span></div><div class='line' id='LC365'>				<span class="kt">int</span> <span class="n">index</span> <span class="o">=</span> <span class="n">phrase</span><span class="o">.</span><span class="na">getHeadPhraseIndex</span><span class="o">();</span></div><div class='line' id='LC366'>				<span class="k">if</span><span class="o">(</span><span class="n">index</span> <span class="o">&gt;</span> <span class="o">-</span><span class="mi">1</span><span class="o">){</span></div><div class='line' id='LC367'>					<span class="n">String</span> <span class="n">tag</span> <span class="o">=</span> <span class="n">phrase</span><span class="o">.</span><span class="na">getPosTags</span><span class="o">().</span><span class="na">get</span><span class="o">(</span><span class="n">index</span><span class="o">);</span></div><div class='line' id='LC368'>					<span class="c1">//nns and nnps are the two plural noun phrase tags</span></div><div class='line' id='LC369'>					<span class="n">phrase</span><span class="o">.</span><span class="na">setPlural</span><span class="o">(</span><span class="n">parserUtil</span><span class="o">.</span><span class="na">tagIsPluralNoun</span><span class="o">(</span><span class="n">tag</span><span class="o">)</span> <span class="o">?</span> <span class="kc">true</span> <span class="o">:</span> <span class="kc">false</span><span class="o">);</span></div><div class='line' id='LC370'>				<span class="o">}</span></div><div class='line' id='LC371'>			<span class="o">}</span></div><div class='line' id='LC372'>			<span class="c1">//this part is probably not needed</span></div><div class='line' id='LC373'>			<span class="k">else</span><span class="o">{</span></div><div class='line' id='LC374'>				<span class="k">for</span><span class="o">(</span><span class="n">String</span> <span class="nl">tag:</span> <span class="n">phrase</span><span class="o">.</span><span class="na">getPosTags</span><span class="o">()){</span></div><div class='line' id='LC375'>					<span class="n">phrase</span><span class="o">.</span><span class="na">setPlural</span><span class="o">(</span><span class="n">parserUtil</span><span class="o">.</span><span class="na">tagIsPluralNoun</span><span class="o">(</span><span class="n">tag</span><span class="o">)</span> <span class="o">?</span> <span class="kc">true</span> <span class="o">:</span> <span class="kc">false</span><span class="o">);</span></div><div class='line' id='LC376'>				<span class="o">}</span></div><div class='line' id='LC377'>			<span class="o">}</span></div><div class='line' id='LC378'><br/></div><div class='line' id='LC379'>		<span class="o">}</span></div><div class='line' id='LC380'><br/></div><div class='line' id='LC381'>		<span class="cm">/**</span></div><div class='line' id='LC382'><span class="cm">		 * Returns the member variable Sentences</span></div><div class='line' id='LC383'><span class="cm">		 * @return</span></div><div class='line' id='LC384'><span class="cm">		 */</span></div><div class='line' id='LC385'>		<span class="kd">public</span> <span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">String</span><span class="o">&gt;</span> <span class="n">getSentences</span><span class="o">()</span> <span class="o">{</span></div><div class='line' id='LC386'>			<span class="k">return</span> <span class="k">this</span><span class="o">.</span><span class="na">sentences</span><span class="o">;</span></div><div class='line' id='LC387'>		<span class="o">}</span></div><div class='line' id='LC388'><br/></div><div class='line' id='LC389'>		<span class="cm">/**</span></div><div class='line' id='LC390'><span class="cm">		 * This method will create a nounphrase from a npTree. Then, this</span></div><div class='line' id='LC391'><span class="cm">		 * method will call all methods requisite to populating the new noun</span></div><div class='line' id='LC392'><span class="cm">		 * phrase&#39;s properties.</span></div><div class='line' id='LC393'><span class="cm">		 * @param npTree</span></div><div class='line' id='LC394'><span class="cm">		 * @param classifier</span></div><div class='line' id='LC395'><span class="cm">		 * @param d </span></div><div class='line' id='LC396'><span class="cm">		 * @return</span></div><div class='line' id='LC397'><span class="cm">		 */</span></div><div class='line' id='LC398'>		<span class="kd">public</span> <span class="n">NounPhrase</span> <span class="nf">createNP</span><span class="o">(</span><span class="n">Tree</span> <span class="n">npTree</span><span class="o">,</span> <span class="n">AbstractSequenceClassifier</span> <span class="n">classifier</span><span class="o">,</span> <span class="n">Dictionaries</span> <span class="n">d</span><span class="o">){</span></div><div class='line' id='LC399'>			<span class="c1">//extract pos tags</span></div><div class='line' id='LC400'>			<span class="n">NounPhrase</span> <span class="n">temp</span> <span class="o">=</span> <span class="k">new</span> <span class="n">NounPhrase</span><span class="o">();</span><span class="c1">//a new nounphrase cadidate</span></div><div class='line' id='LC401'>			<span class="k">for</span><span class="o">(</span><span class="n">Tree</span> <span class="n">t</span> <span class="o">:</span> <span class="n">npTree</span><span class="o">){</span></div><div class='line' id='LC402'>				<span class="k">if</span><span class="o">(</span><span class="n">t</span><span class="o">.</span><span class="na">isPreTerminal</span><span class="o">()){</span><span class="c1">//checks if the noun phrase tree is the parent of some leaves</span></div><div class='line' id='LC403'>					<span class="k">for</span><span class="o">(</span><span class="n">Tree</span> <span class="n">leaf</span> <span class="o">:</span><span class="n">t</span><span class="o">.</span><span class="na">getLeaves</span><span class="o">()){</span><span class="c1">//get all the leaves of the parent node</span></div><div class='line' id='LC404'>						<span class="k">if</span><span class="o">(!</span><span class="n">leaf</span><span class="o">.</span><span class="na">value</span><span class="o">().</span><span class="na">equals</span><span class="o">(</span><span class="s">&quot;-LRB-&quot;</span><span class="o">)</span> <span class="o">&amp;&amp;</span> <span class="o">!</span><span class="n">leaf</span><span class="o">.</span><span class="na">value</span><span class="o">().</span><span class="na">equals</span><span class="o">(</span><span class="s">&quot;-RRB-&quot;</span><span class="o">))</span></div><div class='line' id='LC405'>							<span class="n">temp</span><span class="o">.</span><span class="na">addToPhrase</span><span class="o">(</span><span class="n">leaf</span><span class="o">.</span><span class="na">value</span><span class="o">(),</span> <span class="n">t</span><span class="o">.</span><span class="na">value</span><span class="o">());</span></div><div class='line' id='LC406'>					<span class="o">}</span></div><div class='line' id='LC407'>				<span class="o">}</span></div><div class='line' id='LC408'>			<span class="o">}</span>	</div><div class='line' id='LC409'>			<span class="k">if</span><span class="o">(</span><span class="n">temp</span><span class="o">.</span><span class="na">getPhrase</span><span class="o">()</span> <span class="o">==</span> <span class="kc">null</span><span class="o">)</span><span class="c1">//if the noun phrase was not extracted properly then quietly escape</span></div><div class='line' id='LC410'>			<span class="o">{</span>								<span class="c1">//this happens when a noun phrase like &quot;here&quot; is extracted with</span></div><div class='line' id='LC411'>				<span class="k">return</span> <span class="kc">null</span><span class="o">;</span>				<span class="c1">//a non nounphrase label</span></div><div class='line' id='LC412'>			<span class="o">}</span></div><div class='line' id='LC413'>			<span class="c1">//find head nouns</span></div><div class='line' id='LC414'>			<span class="n">CollinsHeadFinder</span> <span class="n">headFinder</span> <span class="o">=</span> <span class="k">new</span> <span class="n">CollinsHeadFinder</span><span class="o">();</span><span class="c1">//Stanford nlp&#39;s head finder</span></div><div class='line' id='LC415'>			<span class="n">Tree</span> <span class="n">head</span> <span class="o">=</span> <span class="n">headFinder</span><span class="o">.</span><span class="na">determineHead</span><span class="o">(</span><span class="n">npTree</span><span class="o">);</span><span class="c1">//exctracts the head from the npTree argument</span></div><div class='line' id='LC416'>			<span class="n">String</span> <span class="n">headPhrase</span> <span class="o">=</span> <span class="s">&quot;&quot;</span><span class="o">;</span><span class="c1">//need to reconstruct the head before putting it in the NP head variable</span></div><div class='line' id='LC417'>			<span class="c1">//reconstruct the head phrase and add it to the temp noun phrase</span></div><div class='line' id='LC418'>			<span class="k">for</span><span class="o">(</span><span class="n">Tree</span> <span class="nl">t:</span> <span class="n">head</span><span class="o">.</span><span class="na">getChildrenAsList</span><span class="o">()){</span></div><div class='line' id='LC419'>					<span class="k">for</span><span class="o">(</span><span class="n">Tree</span> <span class="n">leaf</span> <span class="o">:</span> <span class="n">Trees</span><span class="o">.</span><span class="na">leaves</span><span class="o">(</span><span class="n">t</span><span class="o">)){</span></div><div class='line' id='LC420'>						<span class="n">headPhrase</span> <span class="o">+=</span> <span class="n">leaf</span><span class="o">.</span><span class="na">value</span><span class="o">()</span> <span class="o">+</span> <span class="s">&quot; &quot;</span><span class="o">;</span></div><div class='line' id='LC421'>					<span class="o">}</span></div><div class='line' id='LC422'>					<span class="n">temp</span><span class="o">.</span><span class="na">addHeadPhrase</span><span class="o">(</span><span class="n">headPhrase</span><span class="o">);</span></div><div class='line' id='LC423'>			<span class="o">}</span></div><div class='line' id='LC424'>			<span class="n">setPronouns</span><span class="o">(</span><span class="n">temp</span><span class="o">);</span></div><div class='line' id='LC425'>			<span class="c1">//find NER</span></div><div class='line' id='LC426'>			<span class="n">FindNer</span><span class="o">(</span><span class="n">temp</span><span class="o">,</span> <span class="n">classifier</span><span class="o">);</span></div><div class='line' id='LC427'>			<span class="c1">//determine number</span></div><div class='line' id='LC428'>			<span class="n">determineNumber</span><span class="o">(</span><span class="n">temp</span><span class="o">);</span></div><div class='line' id='LC429'>			<span class="cm">/*remove determiners</span></div><div class='line' id='LC430'><span class="cm">			find gender</span></div><div class='line' id='LC431'><span class="cm">			</span></div><div class='line' id='LC432'><span class="cm">			all need to be done*/</span></div><div class='line' id='LC433'>			<span class="c1">//determineGender(temp);</span></div><div class='line' id='LC434'>			<span class="c1">//check if the nounphrase contains a pronoun</span></div><div class='line' id='LC435'><br/></div><div class='line' id='LC436'>			<span class="n">setViewPoint</span><span class="o">(</span><span class="n">temp</span><span class="o">,</span> <span class="n">d</span><span class="o">);</span></div><div class='line' id='LC437'>			<span class="k">return</span> <span class="n">temp</span><span class="o">;</span></div><div class='line' id='LC438'>		<span class="o">}</span>		</div><div class='line' id='LC439'><br/></div><div class='line' id='LC440'>		<span class="kd">private</span> <span class="kt">void</span> <span class="nf">setViewPoint</span><span class="o">(</span><span class="n">NounPhrase</span> <span class="n">temp</span><span class="o">,</span> <span class="n">Dictionaries</span> <span class="n">d</span><span class="o">)</span> <span class="o">{</span></div><div class='line' id='LC441'>			<span class="k">if</span><span class="o">(</span><span class="n">temp</span><span class="o">.</span><span class="na">hasPronoun</span><span class="o">()){</span></div><div class='line' id='LC442'>				<span class="n">String</span> <span class="n">pronoun</span> <span class="o">=</span> <span class="n">temp</span><span class="o">.</span><span class="na">getPronoun</span><span class="o">().</span><span class="na">trim</span><span class="o">().</span><span class="na">toLowerCase</span><span class="o">();</span></div><div class='line' id='LC443'>				<span class="k">if</span><span class="o">(</span><span class="n">pronoun</span> <span class="o">!=</span> <span class="kc">null</span><span class="o">){</span></div><div class='line' id='LC444'><br/></div><div class='line' id='LC445'>					<span class="c1">//check if the pronoun is second person</span></div><div class='line' id='LC446'>					<span class="k">if</span><span class="o">(</span><span class="n">d</span><span class="o">.</span><span class="na">secondPersonPronouns</span><span class="o">.</span><span class="na">contains</span><span class="o">(</span><span class="n">pronoun</span><span class="o">))</span></div><div class='line' id='LC447'>						<span class="n">temp</span><span class="o">.</span><span class="na">setPerson</span><span class="o">(</span><span class="n">NounPhrase</span><span class="o">.</span><span class="na">Person</span><span class="o">.</span><span class="na">SECOND</span><span class="o">);</span></div><div class='line' id='LC448'>					<span class="k">else</span></div><div class='line' id='LC449'>						<span class="c1">//check if pronoun is first person</span></div><div class='line' id='LC450'>						<span class="k">if</span><span class="o">(</span><span class="n">d</span><span class="o">.</span><span class="na">firstPersonPronouns</span><span class="o">.</span><span class="na">contains</span><span class="o">(</span><span class="n">pronoun</span><span class="o">))</span></div><div class='line' id='LC451'>							<span class="n">temp</span><span class="o">.</span><span class="na">setPerson</span><span class="o">(</span><span class="n">NounPhrase</span><span class="o">.</span><span class="na">Person</span><span class="o">.</span><span class="na">FIRST</span><span class="o">);</span></div><div class='line' id='LC452'>						<span class="c1">//default is third person</span></div><div class='line' id='LC453'>				<span class="o">}</span></div><div class='line' id='LC454'><br/></div><div class='line' id='LC455'>			<span class="o">}</span></div><div class='line' id='LC456'><br/></div><div class='line' id='LC457'><br/></div><div class='line' id='LC458'>		<span class="o">}</span></div><div class='line' id='LC459'><br/></div><div class='line' id='LC460'>		<span class="kd">public</span> <span class="kd">static</span> <span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">Tree</span><span class="o">&gt;</span> <span class="n">splitNP</span><span class="o">(</span><span class="n">Tree</span> <span class="n">npTree</span><span class="o">){</span></div><div class='line' id='LC461'>			<span class="c1">//ArrayList&lt;Tree&gt; temp = new ArrayList&lt;Tree&gt;();</span></div><div class='line' id='LC462'>			<span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">Tree</span><span class="o">&gt;</span> <span class="n">returnTrees</span> <span class="o">=</span> <span class="k">new</span> <span class="n">ArrayList</span><span class="o">&lt;</span><span class="n">Tree</span><span class="o">&gt;();</span></div><div class='line' id='LC463'>			<span class="k">for</span><span class="o">(</span><span class="n">Tree</span> <span class="nl">t:</span> <span class="n">npTree</span><span class="o">){</span></div><div class='line' id='LC464'>				<span class="k">if</span><span class="o">(</span><span class="n">t</span><span class="o">.</span><span class="na">value</span><span class="o">().</span><span class="na">equals</span><span class="o">(</span><span class="s">&quot;S&quot;</span><span class="o">)){</span></div><div class='line' id='LC465'>					<span class="k">for</span><span class="o">(</span><span class="n">Tree</span> <span class="nl">s:</span> <span class="n">t</span><span class="o">)</span></div><div class='line' id='LC466'>						<span class="k">if</span><span class="o">(</span><span class="n">s</span><span class="o">.</span><span class="na">isPrePreTerminal</span><span class="o">()</span> <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">s</span><span class="o">.</span><span class="na">value</span><span class="o">().</span><span class="na">equals</span><span class="o">(</span><span class="s">&quot;NP&quot;</span><span class="o">)))</span></div><div class='line' id='LC467'>							<span class="n">returnTrees</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="n">s</span><span class="o">);</span></div><div class='line' id='LC468'>				<span class="o">}</span></div><div class='line' id='LC469'>				<span class="k">else</span> </div><div class='line' id='LC470'>					<span class="nf">if</span><span class="o">((</span><span class="n">t</span><span class="o">.</span><span class="na">isPrePreTerminal</span><span class="o">())</span> <span class="o">&amp;&amp;</span> <span class="o">(</span><span class="n">t</span><span class="o">.</span><span class="na">value</span><span class="o">().</span><span class="na">equals</span><span class="o">(</span><span class="s">&quot;NP&quot;</span><span class="o">)</span> <span class="o">||</span> <span class="n">t</span><span class="o">.</span><span class="na">value</span><span class="o">().</span><span class="na">equals</span><span class="o">(</span><span class="s">&quot;PP&quot;</span><span class="o">)))</span></div><div class='line' id='LC471'>						<span class="k">if</span><span class="o">(!</span><span class="n">returnTrees</span><span class="o">.</span><span class="na">contains</span><span class="o">(</span><span class="n">t</span><span class="o">))</span></div><div class='line' id='LC472'>							<span class="n">returnTrees</span><span class="o">.</span><span class="na">add</span><span class="o">(</span><span class="n">t</span><span class="o">);</span></div><div class='line' id='LC473'>			<span class="o">}</span></div><div class='line' id='LC474'>			<span class="k">return</span> <span class="n">returnTrees</span><span class="o">;</span></div><div class='line' id='LC475'><br/></div><div class='line' id='LC476'>		<span class="o">}</span></div><div class='line' id='LC477'><span class="o">}</span></div></pre></div>
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


    <p class="right">&copy; 2012 <span title="0.20325s from fe2.rs.github.com">GitHub</span> Inc. All rights reserved.</p>
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

    
    
    <span id='server_response_time' data-time='0.20462' data-host='fe2'></span>
    
  </body>
</html>

