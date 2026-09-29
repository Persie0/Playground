package p000;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.animation.AnimationUtils;
import android.view.animation.PathInterpolator;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.material3.C0233h;
import androidx.compose.runtime.internal.C0282a;
import com.google.android.material.R$styleable;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.FunctionReference;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import p000.C3472pt;
import p000.am8;
import p000.bk2;
import p000.oha;
import p000.pk9;
import p000.tj3;
import p000.ui3;
import p000.we1;
import p000.xfa;
import p000.ye1;

/* JADX INFO: loaded from: classes.dex */
public abstract class r46 {

    /* JADX INFO: renamed from: b */
    public static final C0282a f58672b;

    /* JADX INFO: renamed from: c */
    public static final C0282a f58673c;

    /* JADX INFO: renamed from: e */
    public static final C0282a f58675e;

    /* JADX INFO: renamed from: f */
    public static final C0282a f58676f;

    /* JADX INFO: renamed from: g */
    public static final C0282a f58677g;

    /* JADX INFO: renamed from: h */
    public static final C0282a f58678h;

    /* JADX INFO: renamed from: i */
    public static final C0282a f58679i;

    /* JADX INFO: renamed from: j */
    public static final C0282a f58680j;

    /* JADX INFO: renamed from: k */
    public static final float[] f58681k;

    /* JADX INFO: renamed from: l */
    public static final long[] f58682l;

    /* JADX INFO: renamed from: m */
    public static final Object f58683m;

    /* JADX INFO: renamed from: n */
    public static sj5 f58684n;

    /* JADX INFO: renamed from: o */
    public static final th8 f58685o;

    /* JADX INFO: renamed from: p */
    public static final C0842cc f58686p;

    /* JADX INFO: renamed from: q */
    public static final jw9 f58687q;

    /* JADX INFO: renamed from: r */
    public static final jw9 f58688r;

    /* JADX INFO: renamed from: s */
    public static final jw9 f58689s;

    /* JADX INFO: renamed from: t */
    public static final /* synthetic */ int f58690t = 0;

    /* JADX INFO: renamed from: u */
    public static final /* synthetic */ int f58691u = 0;

    /* JADX INFO: renamed from: v */
    public static final /* synthetic */ int f58692v = 0;

    /* JADX INFO: renamed from: w */
    public static final /* synthetic */ int f58693w = 0;

    /* JADX INFO: renamed from: x */
    public static final /* synthetic */ int f58694x = 0;

    /* JADX INFO: renamed from: y */
    public static final /* synthetic */ int f58695y = 0;

    /* JADX INFO: renamed from: a */
    public static final C0282a f58671a = new C0282a(2094288676, false, new oh0(12));

    /* JADX INFO: renamed from: d */
    public static final C0282a f58674d = new C0282a(2136598717, false, new C2914d4(2));

    static {
        int i = 5;
        f58672b = new C0282a(-1342205566, false, new C2914d4(i));
        int i2 = 6;
        f58673c = new C0282a(-684072357, false, new oh0(i2));
        new C0282a(-229000834, false, new oh0(i));
        f58675e = new C0282a(-1276513184, false, new C2914d4(3));
        f58676f = new C0282a(-780193532, false, new oh0(7));
        int i3 = 4;
        new C0282a(-1846660506, false, new C2914d4(i3));
        f58677g = new C0282a(-661145402, false, new oh0(8));
        f58678h = new C0282a(-1113422563, false, new oh0(9));
        f58679i = new C0282a(-2101264077, false, new oh0(10));
        f58680j = new C0282a(37575796, false, new oh0(11));
        f58681k = new float[]{1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
        f58682l = new long[]{-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};
        f58683m = new Object();
        f58685o = new th8(new sh8());
        f58686p = new C0842cc("NO_THREAD_ELEMENTS", i);
        f58687q = new jw9(i3);
        f58688r = new jw9(i);
        f58689s = new jw9(i2);
    }

    /* JADX INFO: renamed from: A */
    public static void m20360A(sq5 sq5Var, String str) {
        ((sj5) sq5Var.f61249c).m21420a(4, "Kochava Diagnostic - ".concat(str), (String) sq5Var.f61248b, (String) sq5Var.f61250d);
    }

    /* JADX INFO: renamed from: D */
    public static boolean m20361D(String str, String str2) {
        return str.startsWith(str2.concat("(")) && str.endsWith(")");
    }

    /* JADX WARN: Code duplicated, block: B:135:0x020a  */
    /* JADX INFO: renamed from: E */
    public static final long m20362E(int i, String str, int i2) {
        char cCharAt;
        int i3;
        long j;
        char c;
        char c2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        long j2;
        char c3;
        int i9;
        int i10;
        int i11;
        long j3 = 4294967295L;
        if (i == i2) {
            return (((long) i) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
        }
        char cCharAt2 = str.charAt(i);
        boolean z = cCharAt2 == '-';
        if (z) {
            i3 = i + 1;
            if (i3 == i2) {
                return (((long) i3) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
            }
            cCharAt = str.charAt(i3);
            if (((char) (cCharAt - '0')) >= '\n' && cCharAt != '.') {
                return (((long) i3) << 32) | (((long) Float.floatToRawIntBits(Float.NaN)) & 4294967295L);
            }
        } else {
            cCharAt = cCharAt2;
            i3 = i;
        }
        int length = str.length();
        int i12 = i3;
        long j4 = 0;
        while (true) {
            if (i12 == i2) {
                j = j3;
                break;
            }
            j = j3;
            int i13 = cCharAt - '0';
            if (((char) i13) >= '\n') {
                break;
            }
            j4 = (j4 * 10) + ((long) i13);
            i12++;
            cCharAt = i12 < length ? str.charAt(i12) : (char) 0;
            j3 = j;
        }
        int i14 = i12 - i3;
        char c4 = '0';
        if (i12 == i2 || cCharAt != '.') {
            c = ' ';
            c2 = 1;
            i4 = i12;
            i5 = i4;
            i6 = 0;
        } else {
            int i15 = i12 + 1;
            c = ' ';
            i4 = i15;
            while (true) {
                c2 = 1;
                if (i2 - i4 < 4) {
                    i11 = i15;
                    break;
                }
                i11 = i15;
                long jCharAt = ((long) str.charAt(i4)) | (((long) str.charAt(i4 + 1)) << 16) | (((long) str.charAt(i4 + 2)) << 32) | (((long) str.charAt(i4 + 3)) << 48);
                long j5 = jCharAt - 13511005043687472L;
                int i16 = (((jCharAt + 19703549022044230L) | j5) & (-35747867511423104L)) != 0 ? -1 : (int) ((j5 * 281475406208040961L) >>> 48);
                if (i16 < 0) {
                    break;
                }
                j4 = (j4 * 10000) + ((long) i16);
                i4 += 4;
                i15 = i11;
            }
            char cCharAt3 = i4 < length ? str.charAt(i4) : (char) 0;
            loop2: while (true) {
                cCharAt = cCharAt3;
                while (true) {
                    if (i4 == i2) {
                        break loop2;
                    }
                    int i17 = cCharAt - '0';
                    if (((char) i17) >= '\n') {
                        break loop2;
                    }
                    j4 = (j4 * 10) + ((long) i17);
                    i4++;
                    if (i4 < length) {
                        break;
                    }
                    cCharAt = 0;
                }
                cCharAt3 = str.charAt(i4);
            }
            i6 = i11 - i4;
            i14 -= i6;
            i5 = i11;
        }
        if (i14 == 0) {
            return (((long) i4) << c) | (((long) Float.floatToRawIntBits(Float.NaN)) & j);
        }
        if ((cCharAt | ' ') == 101) {
            i7 = i4 + 1;
            char cCharAt4 = i7 < length ? str.charAt(i7) : (char) 0;
            char c5 = cCharAt4 == '-' ? c2 : (char) 0;
            if (c5 != 0 || cCharAt4 == '+') {
                i7 = i4 + 2;
            }
            char cCharAt5 = str.charAt(i7);
            i8 = 0;
            while (true) {
                if (i7 == i2) {
                    i10 = i6;
                    break;
                }
                int i18 = cCharAt5 - c4;
                i10 = i6;
                if (((char) i18) >= '\n') {
                    break;
                }
                if (i8 < 1024) {
                    i8 = (i8 * 10) + i18;
                }
                i7++;
                cCharAt5 = i7 < length ? str.charAt(i7) : (char) 0;
                i6 = i10;
                c4 = '0';
            }
            if (c5 != 0) {
                i8 = -i8;
            }
            i6 = i10 + i8;
        } else {
            i7 = i4;
            i8 = 0;
        }
        int i19 = 19;
        if (i14 > 19) {
            char cCharAt6 = str.charAt(i3);
            int i20 = i3;
            while (true) {
                if (i7 == i2) {
                    i9 = i19;
                    break;
                }
                if (cCharAt6 != '0' && cCharAt6 != '.') {
                    i9 = 19;
                    break;
                }
                if (cCharAt6 == '0') {
                    i14--;
                }
                i20++;
                cCharAt6 = i20 < length ? str.charAt(i20) : (char) 0;
                i19 = 19;
            }
            if (i14 > i9) {
                char cCharAt7 = str.charAt(i3);
                j2 = 0;
                while (i3 != i12 && Long.compareUnsigned(j2, 1000000000000000000L) < 0) {
                    j2 = (j2 * 10) + ((long) (cCharAt7 - '0'));
                    i3++;
                    cCharAt7 = i3 < length ? str.charAt(i3) : (char) 0;
                }
                if (Long.compareUnsigned(j2, 1000000000000000000L) >= 0) {
                    i6 = (i12 - i3) + i8;
                } else {
                    char cCharAt8 = str.charAt(i5);
                    int i21 = i5;
                    while (i21 != i4 && Long.compareUnsigned(j2, 1000000000000000000L) < 0) {
                        j2 = (j2 * 10) + ((long) (cCharAt8 - '0'));
                        i21++;
                        cCharAt8 = i21 < length ? str.charAt(i21) : (char) 0;
                    }
                    i6 = (i5 - i21) + i8;
                }
                c3 = c2;
            } else {
                j2 = j4;
                c3 = 0;
            }
        } else {
            j2 = j4;
            c3 = 0;
        }
        if (-10 <= i6 && i6 < 11 && c3 == 0 && Long.compareUnsigned(j2, 16777216L) <= 0) {
            float f = j2;
            float[] fArr = f58681k;
            float f2 = i6 < 0 ? f / fArr[-i6] : f * fArr[i6];
            if (z) {
                f2 = -f2;
            }
            return (((long) i7) << c) | (((long) Float.floatToRawIntBits(f2)) & j);
        }
        if (j2 == 0) {
            return (((long) i7) << c) | (((long) Float.floatToRawIntBits(z != 0 ? -0.0f : 0.0f)) & j);
        }
        if (-126 > i6 || i6 >= 128) {
            return (((long) i7) << c) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i, i7)))) & j);
        }
        long j6 = f58682l[i6 + 325];
        int iNumberOfLeadingZeros = Long.numberOfLeadingZeros(j2);
        long j7 = j2 << iNumberOfLeadingZeros;
        long j8 = j7 & j;
        long j9 = j7 >>> c;
        long j10 = j6 & j;
        long j11 = j6 >>> c;
        long j12 = j9 * j11;
        long j13 = j11 * j8;
        long j14 = j12 + ((((j9 * j10) + ((j8 * j10) >>> c)) + (j13 & j)) >>> c) + (j13 >>> c);
        int i22 = (int) (j14 >>> 63);
        long j15 = j14 >>> (i22 + 9);
        int i23 = iNumberOfLeadingZeros + (i22 ^ 1);
        long j16 = j14 & 511;
        if (j16 == 511 || (j16 == 0 && (j15 & 3) == 1)) {
            return (((long) i7) << c) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i, i7)))) & j);
        }
        long j17 = (j15 + 1) >>> c2;
        if (j17 >= 9007199254740992L) {
            i23--;
            j17 = 4503599627370496L;
        }
        long j18 = j17 & (-4503599627370497L);
        long j19 = (((((long) i6) * 217706) >> 16) + 1087) - ((long) i23);
        if (j19 < 1 || j19 > 2046) {
            return (((long) i7) << c) | (((long) Float.floatToRawIntBits(Float.parseFloat(str.substring(i, i7)))) & j);
        }
        return (((long) i7) << c) | (((long) Float.floatToRawIntBits((float) Double.longBitsToDouble((j19 << 52) | j18 | (z != 0 ? Long.MIN_VALUE : 0L)))) & j);
    }

    /* JADX INFO: renamed from: F */
    public static final int m20363F(ts4 ts4Var, Orientation orientation) {
        return (int) (orientation == Orientation.Vertical ? ts4Var.f62820w & 4294967295L : ts4Var.f62820w >> 32);
    }

    /* JADX INFO: renamed from: G */
    public static int m20364G(Context context, int i, int i2) {
        TypedValue typedValueM24748U = xwc.m24748U(context.getTheme(), i);
        return (typedValueM24748U == null || typedValueM24748U.type != 16) ? i2 : typedValueM24748U.data;
    }

    /* JADX INFO: renamed from: H */
    public static TimeInterpolator m20365H(Context context, int i, TimeInterpolator timeInterpolator) {
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i, typedValue, true)) {
            return timeInterpolator;
        }
        if (typedValue.type != 3) {
            C3386nv.m17626m("Motion easing theme attribute must be an @interpolator resource for ?attr/motionEasing*Interpolator attributes or a string for ?attr/motionEasing* attributes.");
            return null;
        }
        String strValueOf = String.valueOf(typedValue.string);
        if (!m20361D(strValueOf, "cubic-bezier") && !m20361D(strValueOf, "path")) {
            return AnimationUtils.loadInterpolator(context, typedValue.resourceId);
        }
        if (!m20361D(strValueOf, "cubic-bezier")) {
            if (m20361D(strValueOf, "path")) {
                return new PathInterpolator(tzb.m22363c(wq1.m24112h(1, strValueOf, 5)));
            }
            C3386nv.m17626m("Invalid motion easing type: ".concat(strValueOf));
            return null;
        }
        String[] strArrSplit = strValueOf.substring(13, strValueOf.length() - 1).split(",");
        if (strArrSplit.length == 4) {
            return new PathInterpolator(m20398y(strArrSplit, 0), m20398y(strArrSplit, 1), m20398y(strArrSplit, 2), m20398y(strArrSplit, 3));
        }
        v63.m23130h(strArrSplit.length, "Motion easing theme attribute must have 4 control points if using bezier curve format; instead got: ");
        return null;
    }

    /* JADX INFO: renamed from: I */
    public static zf9 m20366I(Context context, int i, int i2) {
        TypedValue typedValueM24748U = xwc.m24748U(context.getTheme(), i);
        TypedArray typedArrayObtainStyledAttributes = typedValueM24748U == null ? context.obtainStyledAttributes(null, R$styleable.MaterialSpring, 0, i2) : context.obtainStyledAttributes(typedValueM24748U.resourceId, R$styleable.MaterialSpring);
        zf9 zf9Var = new zf9();
        try {
            float f = typedArrayObtainStyledAttributes.getFloat(R$styleable.MaterialSpring_stiffness, Float.MIN_VALUE);
            if (f == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have stiffness value.");
            }
            float f2 = typedArrayObtainStyledAttributes.getFloat(R$styleable.MaterialSpring_damping, Float.MIN_VALUE);
            if (f2 == Float.MIN_VALUE) {
                throw new IllegalArgumentException("A MaterialSpring style must have a damping value.");
            }
            zf9Var.m25594b(f);
            zf9Var.m25593a(f2);
            typedArrayObtainStyledAttributes.recycle();
            return zf9Var;
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: J */
    public static final void m20367J(kn1 kn1Var, Object obj) {
        if (obj == f58686p) {
            return;
        }
        if (!(obj instanceof uz9)) {
            Object objFold = kn1Var.fold(null, f58688r);
            objFold.getClass();
            ((pz9) objFold).m19579d(obj);
            return;
        }
        uz9 uz9Var = (uz9) obj;
        pz9[] pz9VarArr = uz9Var.f64628c;
        int length = pz9VarArr.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            pz9 pz9Var = pz9VarArr[length];
            pz9Var.getClass();
            pz9Var.m19579d(uz9Var.f64627b[length]);
            if (i < 0) {
                return;
            } else {
                length = i;
            }
        }
    }

    /* JADX INFO: renamed from: K */
    public static final long m20368K(float f, long j) {
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float fMax2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: L */
    public static final f64 m20369L(InputStream inputStream) {
        inputStream.getClass();
        return new f64(inputStream, new c1a());
    }

    /* JADX INFO: renamed from: M */
    public static final Object m20370M(kn1 kn1Var) {
        Object objFold = kn1Var.fold(0, f58687q);
        objFold.getClass();
        return objFold;
    }

    /* JADX INFO: renamed from: N */
    public static final String m20371N(SerialDescriptor serialDescriptor) {
        return u91.m22596N0(l70.m15922M(0, serialDescriptor.mo3697e()), ", ", serialDescriptor.mo3694a() + '(', ")", new cg7(serialDescriptor, 0), 24);
    }

    /* JADX INFO: renamed from: O */
    public static final Object m20372O(kn1 kn1Var, Object obj) {
        if (obj == null) {
            obj = m20370M(kn1Var);
        }
        if (obj == 0) {
            return f58686p;
        }
        return obj instanceof Integer ? kn1Var.fold(new uz9(((Number) obj).intValue(), kn1Var), f58689s) : ((pz9) obj).m19580f();
    }

    /* JADX INFO: renamed from: P */
    public static void m20373P(sq5 sq5Var, String str, String str2) {
        sq5Var.m21557F(str + " failure, parameter '" + str2 + "' is invalid");
    }

    /* JADX INFO: renamed from: Q */
    public static void m20374Q(sq5 sq5Var, String str, String str2) {
        sq5Var.m21557F(str + " failure, " + str2);
    }

    /* JADX INFO: renamed from: R */
    public static void m20375R(int i, sq5 sq5Var, String str, String str2) {
        sq5Var.m21557F(str + " parameter '" + str2 + "' exceeds maximum length of " + i + " and will be truncated");
    }

    /* JADX INFO: renamed from: a */
    public static C0817bn m20376a(float f, float f2, int i) {
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return new C0817bn(pk9.f56363h, Float.valueOf(f), new C2934dn(f2), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    /* JADX INFO: renamed from: b */
    public static xb1 m20377b() {
        xb1 xb1Var = new xb1(true);
        xb1Var.m15502U(null);
        return xb1Var;
    }

    /* JADX INFO: renamed from: c */
    public static final void m20378c(int i, final long j, ye1 ye1Var, zi3 zi3Var, g99 g99Var) {
        List listM23604J;
        List listM23604J2;
        List listM24911b;
        g99 g99Var2 = g99Var;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(361732211);
        zi3 zi3Var2 = zi3Var;
        int i2 = i | (tj3Var.m22120g(g99Var2) ? 4 : 2) | (tj3Var.m22118f(j) ? 32 : 16) | (tj3Var.m22124i(zi3Var2) ? 256 : 128);
        if ((i2 & 147) == 146 && tj3Var.m22086D()) {
            tj3Var.m22102U();
        } else {
            if (g99Var2 instanceof f99) {
                listM23604J = vz1.m23604J(new bk2(j));
            } else if (g99Var2 instanceof d99) {
                if (Build.VERSION.SDK_INT >= 31) {
                    tj3Var.m22111b0(291633998);
                    Bundle bundle = (Bundle) tj3Var.m22128k(xf1.m24483a());
                    boolean z = (i2 & 112) == 32;
                    Object objM22097O = tj3Var.m22097O();
                    if (z || objM22097O == we1.f66679a) {
                        objM22097O = new ui3() { // from class: a99
                            @Override // p000.ui3
                            /* JADX INFO: renamed from: a */
                            public final Object mo0a() {
                                return new bk2(j);
                            }
                        };
                        tj3Var.m22131l0(objM22097O);
                    }
                    listM24911b = y2d.m24911b(bundle, (ui3) objM22097O);
                    tj3Var.m22139q(false);
                } else {
                    tj3Var.m22111b0(291738344);
                    ArrayList arrayListM24912c = y2d.m24912c((Bundle) tj3Var.m22128k(xf1.m24483a()));
                    if (arrayListM24912c.isEmpty()) {
                        listM23604J2 = arrayListM24912c;
                        listM23604J2 = vz1.m23604J(new bk2(j));
                    }
                    listM23604J2 = arrayListM24912c;
                    listM24911b = listM23604J2;
                    tj3Var.m22139q(false);
                }
                listM23604J = listM24911b;
            } else {
                if (!(g99Var2 instanceof e99)) {
                    gm5.m12750e();
                    return;
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    tj3Var.m22111b0(292006649);
                    tj3Var.m22139q(false);
                    listM23604J = ((e99) g99Var2).f36889a;
                } else {
                    tj3Var.m22111b0(292075221);
                    Set set = ((e99) g99Var2).f36889a;
                    long j2 = ((bk2) y2d.m24917h(set).get(0)).f8632a;
                    ArrayList arrayListM24912c2 = y2d.m24912c((Bundle) tj3Var.m22128k(xf1.m24483a()));
                    ArrayList arrayList = new ArrayList(v91.m23189q0(arrayListM24912c2, 10));
                    Iterator it = arrayListM24912c2.iterator();
                    while (it.hasNext()) {
                        bk2 bk2VarM24913d = y2d.m24913d(((bk2) it.next()).f8632a, set);
                        arrayList.add(new bk2(bk2VarM24913d != null ? bk2VarM24913d.f8632a : j2));
                    }
                    boolean zIsEmpty = arrayList.isEmpty();
                    List listM23605K = arrayList;
                    if (zIsEmpty) {
                        listM23605K = vz1.m23605K(new bk2(j2), new bk2(j2));
                    }
                    tj3Var.m22139q(false);
                    listM23604J = listM23605K;
                }
            }
            List listM22622n1 = u91.m22622n1(u91.m22626r1(listM23604J));
            ArrayList arrayList2 = new ArrayList(v91.m23189q0(listM22622n1, 10));
            Iterator it2 = listM22622n1.iterator();
            while (it2.hasNext()) {
                m20383h(((i2 << 3) & 112) | (i2 & 896), ((bk2) it2.next()).f8632a, tj3Var, zi3Var2, g99Var2);
                arrayList2.add(xfa.f68157a);
                zi3Var2 = zi3Var;
                g99Var2 = g99Var;
            }
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new C3536rh(g99Var, j, zi3Var, i);
        }
    }

    /* JADX INFO: renamed from: d */
    public static final e54 m20379d(String str, KSerializer kSerializer) {
        return new e54(str, new f54(kSerializer));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    /* JADX WARN: Code duplicated, block: B:21:0x0040  */
    /* JADX WARN: Code duplicated, block: B:22:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:34:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0075  */
    /* JADX WARN: Code duplicated, block: B:49:0x0092  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:55:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:58:0x010e  */
    /* JADX WARN: Code duplicated, block: B:61:0x011c  */
    /* JADX WARN: Code duplicated, block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: e */
    public static final void m20380e(e16 e16Var, o39 o39Var, C0233h c0233h, mn0 mn0Var, ui3 ui3Var, C0282a c0282a, ye1 ye1Var, int i, int i2) {
        int i3;
        o39 o39Var2;
        mn0 mn0VarM21999m;
        int i4;
        boolean z;
        C0282a c0282a2;
        mn0 mn0Var2;
        C0233h c0233h2;
        x18 x18VarM22143u;
        int i5;
        int i6;
        o39 o39Var3;
        mn0 mn0Var3;
        C0233h c0233h3;
        int i7;
        int i8;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1283228109);
        if ((i & 6) == 0) {
            i3 = (tj3Var.m22120g(e16Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) == 0) {
            o39Var2 = o39Var;
            int i9 = tj3Var.m22120g(o39Var2) ? 32 : 16;
            int i10 = i3 | i9 | 128;
            if ((i2 & 8) == 0) {
                mn0VarM21999m = mn0Var;
                int i11 = tj3Var.m22120g(mn0VarM21999m) ? 2048 : 1024;
                i4 = i10 | i11;
                if ((i & 24576) == 0) {
                    if (tj3Var.m22124i(ui3Var)) {
                        i8 = 16384;
                    } else {
                        i8 = 8192;
                    }
                    i4 |= i8;
                }
                if ((74899 & i4) != 74898) {
                    z = true;
                } else {
                    z = false;
                }
                if (tj3Var.m22099R(i4 & 1, z)) {
                    tj3Var.m22104W();
                    if ((i & 1) != 0 || tj3Var.m22084B()) {
                        if ((i2 & 2) != 0) {
                            o39Var2 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64858d;
                            i4 &= -113;
                        }
                        C0233h c0233hM22000n = te1.m22000n(62, 0.0f);
                        i5 = i4 & (-897);
                        if ((i2 & 8) != 0) {
                            mn0VarM21999m = te1.m21999m(0, 14, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55821F, 0L, tj3Var);
                            i6 = i4 & (-8065);
                        } else {
                            i6 = i5;
                        }
                        o39Var3 = o39Var2;
                        mn0Var3 = mn0VarM21999m;
                        c0233h3 = c0233hM22000n;
                        i7 = i6;
                    } else {
                        tj3Var.m22102U();
                        if ((i2 & 2) != 0) {
                            i4 &= -113;
                        }
                        i7 = i4 & (-897);
                        if ((i2 & 8) != 0) {
                            i7 = i4 & (-8065);
                        }
                        c0233h3 = c0233h;
                        o39Var3 = o39Var2;
                        mn0Var3 = mn0VarM21999m;
                    }
                    tj3Var.m22140r();
                    c0282a2 = c0282a;
                    bq1.m4038N(ui3Var, c99.m4429v(c99.m4412e(e16Var, 1.0f)), false, o39Var3, mn0Var3, c0233h3, null, ci8.m4703P(1622672568, new mx0(c0282a2, 5), tj3Var), tj3Var, ((i7 >> 12) & 14) | 100663296 | ((i7 << 6) & 7168) | (57344 & (i7 << 3)), 196);
                    tj3Var = tj3Var;
                    o39Var2 = o39Var3;
                    mn0Var2 = mn0Var3;
                    c0233h2 = c0233h3;
                } else {
                    c0282a2 = c0282a;
                    tj3Var.m22102U();
                    mn0Var2 = mn0VarM21999m;
                    c0233h2 = c0233h;
                }
                x18VarM22143u = tj3Var.m22143u();
                if (x18VarM22143u != null) {
                    x18VarM22143u.f67642d = new nm5(e16Var, o39Var2, c0233h2, mn0Var2, ui3Var, c0282a2, i, i2);
                }
            }
            mn0VarM21999m = mn0Var;
            i4 = i10 | i11;
            if ((i & 24576) == 0) {
                if (tj3Var.m22124i(ui3Var)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i4 |= i8;
            }
            if ((74899 & i4) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i4 & 1, z)) {
                tj3Var.m22104W();
                if ((i & 1) != 0) {
                    if ((i2 & 2) != 0) {
                        o39Var2 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64858d;
                        i4 &= -113;
                    }
                    C0233h c0233hM22000n2 = te1.m22000n(62, 0.0f);
                    i5 = i4 & (-897);
                    if ((i2 & 8) != 0) {
                        mn0VarM21999m = te1.m21999m(0, 14, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55821F, 0L, tj3Var);
                        i6 = i4 & (-8065);
                    } else {
                        i6 = i5;
                    }
                    o39Var3 = o39Var2;
                    mn0Var3 = mn0VarM21999m;
                    c0233h3 = c0233hM22000n2;
                    i7 = i6;
                } else {
                    if ((i2 & 2) != 0) {
                        o39Var2 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64858d;
                        i4 &= -113;
                    }
                    C0233h c0233hM22000n3 = te1.m22000n(62, 0.0f);
                    i5 = i4 & (-897);
                    if ((i2 & 8) != 0) {
                        mn0VarM21999m = te1.m21999m(0, 14, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55821F, 0L, tj3Var);
                        i6 = i4 & (-8065);
                    } else {
                        i6 = i5;
                    }
                    o39Var3 = o39Var2;
                    mn0Var3 = mn0VarM21999m;
                    c0233h3 = c0233hM22000n3;
                    i7 = i6;
                }
                tj3Var.m22140r();
                c0282a2 = c0282a;
                bq1.m4038N(ui3Var, c99.m4429v(c99.m4412e(e16Var, 1.0f)), false, o39Var3, mn0Var3, c0233h3, null, ci8.m4703P(1622672568, new mx0(c0282a2, 5), tj3Var), tj3Var, ((i7 >> 12) & 14) | 100663296 | ((i7 << 6) & 7168) | (57344 & (i7 << 3)), 196);
                tj3Var = tj3Var;
                o39Var2 = o39Var3;
                mn0Var2 = mn0Var3;
                c0233h2 = c0233h3;
            } else {
                c0282a2 = c0282a;
                tj3Var.m22102U();
                mn0Var2 = mn0VarM21999m;
                c0233h2 = c0233h;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new nm5(e16Var, o39Var2, c0233h2, mn0Var2, ui3Var, c0282a2, i, i2);
            }
        }
        o39Var2 = o39Var;
        int i12 = i3 | i9 | 128;
        if ((i2 & 8) == 0) {
            mn0VarM21999m = mn0Var;
            if (tj3Var.m22120g(mn0VarM21999m)) {
            }
            i4 = i12 | i11;
            if ((i & 24576) == 0) {
                if (tj3Var.m22124i(ui3Var)) {
                    i8 = 16384;
                } else {
                    i8 = 8192;
                }
                i4 |= i8;
            }
            if ((74899 & i4) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i4 & 1, z)) {
                tj3Var.m22104W();
                if ((i & 1) != 0) {
                    if ((i2 & 2) != 0) {
                        o39Var2 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64858d;
                        i4 &= -113;
                    }
                    C0233h c0233hM22000n4 = te1.m22000n(62, 0.0f);
                    i5 = i4 & (-897);
                    if ((i2 & 8) != 0) {
                        mn0VarM21999m = te1.m21999m(0, 14, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55821F, 0L, tj3Var);
                        i6 = i4 & (-8065);
                    } else {
                        i6 = i5;
                    }
                    o39Var3 = o39Var2;
                    mn0Var3 = mn0VarM21999m;
                    c0233h3 = c0233hM22000n4;
                    i7 = i6;
                } else {
                    if ((i2 & 2) != 0) {
                        o39Var2 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64858d;
                        i4 &= -113;
                    }
                    C0233h c0233hM22000n5 = te1.m22000n(62, 0.0f);
                    i5 = i4 & (-897);
                    if ((i2 & 8) != 0) {
                        mn0VarM21999m = te1.m21999m(0, 14, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55821F, 0L, tj3Var);
                        i6 = i4 & (-8065);
                    } else {
                        i6 = i5;
                    }
                    o39Var3 = o39Var2;
                    mn0Var3 = mn0VarM21999m;
                    c0233h3 = c0233hM22000n5;
                    i7 = i6;
                }
                tj3Var.m22140r();
                c0282a2 = c0282a;
                bq1.m4038N(ui3Var, c99.m4429v(c99.m4412e(e16Var, 1.0f)), false, o39Var3, mn0Var3, c0233h3, null, ci8.m4703P(1622672568, new mx0(c0282a2, 5), tj3Var), tj3Var, ((i7 >> 12) & 14) | 100663296 | ((i7 << 6) & 7168) | (57344 & (i7 << 3)), 196);
                tj3Var = tj3Var;
                o39Var2 = o39Var3;
                mn0Var2 = mn0Var3;
                c0233h2 = c0233h3;
            } else {
                c0282a2 = c0282a;
                tj3Var.m22102U();
                mn0Var2 = mn0VarM21999m;
                c0233h2 = c0233h;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new nm5(e16Var, o39Var2, c0233h2, mn0Var2, ui3Var, c0282a2, i, i2);
            }
        }
        mn0VarM21999m = mn0Var;
        i4 = i12 | i11;
        if ((i & 24576) == 0) {
            if (tj3Var.m22124i(ui3Var)) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i4 |= i8;
        }
        if ((74899 & i4) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (tj3Var.m22099R(i4 & 1, z)) {
            tj3Var.m22104W();
            if ((i & 1) != 0) {
                if ((i2 & 2) != 0) {
                    o39Var2 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64858d;
                    i4 &= -113;
                }
                C0233h c0233hM22000n6 = te1.m22000n(62, 0.0f);
                i5 = i4 & (-897);
                if ((i2 & 8) != 0) {
                    mn0VarM21999m = te1.m21999m(0, 14, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55821F, 0L, tj3Var);
                    i6 = i4 & (-8065);
                } else {
                    i6 = i5;
                }
                o39Var3 = o39Var2;
                mn0Var3 = mn0VarM21999m;
                c0233h3 = c0233hM22000n6;
                i7 = i6;
            } else {
                if ((i2 & 2) != 0) {
                    o39Var2 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64858d;
                    i4 &= -113;
                }
                C0233h c0233hM22000n7 = te1.m22000n(62, 0.0f);
                i5 = i4 & (-897);
                if ((i2 & 8) != 0) {
                    mn0VarM21999m = te1.m21999m(0, 14, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55821F, 0L, tj3Var);
                    i6 = i4 & (-8065);
                } else {
                    i6 = i5;
                }
                o39Var3 = o39Var2;
                mn0Var3 = mn0VarM21999m;
                c0233h3 = c0233hM22000n7;
                i7 = i6;
            }
            tj3Var.m22140r();
            c0282a2 = c0282a;
            bq1.m4038N(ui3Var, c99.m4429v(c99.m4412e(e16Var, 1.0f)), false, o39Var3, mn0Var3, c0233h3, null, ci8.m4703P(1622672568, new mx0(c0282a2, 5), tj3Var), tj3Var, ((i7 >> 12) & 14) | 100663296 | ((i7 << 6) & 7168) | (57344 & (i7 << 3)), 196);
            tj3Var = tj3Var;
            o39Var2 = o39Var3;
            mn0Var2 = mn0Var3;
            c0233h2 = c0233h3;
        } else {
            c0282a2 = c0282a;
            tj3Var.m22102U();
            mn0Var2 = mn0VarM21999m;
            c0233h2 = c0233h;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new nm5(e16Var, o39Var2, c0233h2, mn0Var2, ui3Var, c0282a2, i, i2);
        }
    }

    /* JADX INFO: renamed from: f */
    public static final void m20381f(e16 e16Var, o39 o39Var, C0233h c0233h, mn0 mn0Var, aj3 aj3Var, ye1 ye1Var, int i, int i2) {
        e16 e16Var2;
        int i3;
        o39 o39Var2;
        C0233h c0233h2;
        mn0 mn0Var2;
        o39 o39Var3;
        C0233h c0233h3;
        mn0 mn0Var3;
        o39 o39Var4;
        C0233h c0233hM22000n;
        mn0 mn0VarM21999m;
        e16 e16Var3;
        o39 o39Var5;
        C0233h c0233h4;
        mn0 mn0Var4;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(1915383233);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            e16Var2 = e16Var;
        } else if ((i & 6) == 0) {
            e16Var2 = e16Var;
            i3 = (tj3Var.m22120g(e16Var2) ? 4 : 2) | i;
        } else {
            e16Var2 = e16Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                o39Var2 = o39Var;
                int i5 = tj3Var.m22120g(o39Var2) ? 32 : 16;
                i3 |= i5;
            } else {
                o39Var2 = o39Var;
            }
            i3 |= i5;
        } else {
            o39Var2 = o39Var;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                c0233h2 = c0233h;
                int i6 = tj3Var.m22120g(c0233h2) ? 256 : 128;
                i3 |= i6;
            } else {
                c0233h2 = c0233h;
            }
            i3 |= i6;
        } else {
            c0233h2 = c0233h;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                mn0Var2 = mn0Var;
                int i7 = tj3Var.m22120g(mn0Var2) ? 2048 : 1024;
                i3 |= i7;
            } else {
                mn0Var2 = mn0Var;
            }
            i3 |= i7;
        } else {
            mn0Var2 = mn0Var;
        }
        if ((i & 24576) == 0) {
            i3 |= tj3Var.m22124i(aj3Var) ? 16384 : 8192;
        }
        if (tj3Var.m22099R(i3 & 1, (i3 & 9363) != 9362)) {
            tj3Var.m22104W();
            if ((i & 1) == 0 || tj3Var.m22084B()) {
                e16 e16Var4 = i4 != 0 ? b16.f7762a : e16Var2;
                if ((i2 & 2) != 0) {
                    o39Var4 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64857c;
                    i3 &= -113;
                } else {
                    o39Var4 = o39Var2;
                }
                if ((i2 & 4) != 0) {
                    c0233hM22000n = te1.m22000n(62, 0.0f);
                    i3 &= -897;
                } else {
                    c0233hM22000n = c0233h2;
                }
                if ((i2 & 8) != 0) {
                    mn0VarM21999m = te1.m21999m(0, 14, ((ms5) tj3Var.m22128k(ps5.f56764b)).f51799a.f55821F, 0L, tj3Var);
                    i3 &= -7169;
                } else {
                    mn0VarM21999m = mn0Var2;
                }
                e16Var3 = e16Var4;
                o39Var5 = o39Var4;
                c0233h4 = c0233hM22000n;
                mn0Var4 = mn0VarM21999m;
            } else {
                tj3Var.m22102U();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                if ((i2 & 4) != 0) {
                    i3 &= -897;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                }
                o39Var5 = o39Var2;
                c0233h4 = c0233h2;
                mn0Var4 = mn0Var2;
                e16Var3 = e16Var2;
            }
            tj3Var.m22140r();
            bq1.m4039O(e16Var3, o39Var5, mn0Var4, c0233h4, null, ci8.m4703P(-126758769, new rm0(aj3Var, 8), tj3Var), tj3Var, (i3 & 14) | 196608 | (i3 & 112) | ((i3 >> 3) & 896) | ((i3 << 3) & 7168), 16);
            e16Var2 = e16Var3;
            o39Var3 = o39Var5;
            mn0Var3 = mn0Var4;
            c0233h3 = c0233h4;
        } else {
            tj3Var.m22102U();
            o39Var3 = o39Var2;
            c0233h3 = c0233h2;
            mn0Var3 = mn0Var2;
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new z83(e16Var2, o39Var3, c0233h3, mn0Var3, aj3Var, i, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0110  */
    /* JADX WARN: Code duplicated, block: B:101:0x0113  */
    /* JADX WARN: Code duplicated, block: B:104:0x0118  */
    /* JADX WARN: Code duplicated, block: B:105:0x0127  */
    /* JADX WARN: Code duplicated, block: B:108:0x012c  */
    /* JADX WARN: Code duplicated, block: B:109:0x0136  */
    /* JADX WARN: Code duplicated, block: B:112:0x013b  */
    /* JADX WARN: Code duplicated, block: B:115:0x0146  */
    /* JADX WARN: Code duplicated, block: B:117:0x014e  */
    /* JADX WARN: Code duplicated, block: B:121:0x0168  */
    /* JADX WARN: Code duplicated, block: B:122:0x0196  */
    /* JADX WARN: Code duplicated, block: B:124:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:127:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:99:0x010e A[DONT_INVERT] */
    /* JADX INFO: renamed from: g */
    public static final void m20382g(e16 e16Var, o39 o39Var, C0233h c0233h, mn0 mn0Var, vf0 vf0Var, ui3 ui3Var, C0282a c0282a, ye1 ye1Var, int i, int i2) {
        e16 e16Var2;
        int i3;
        o39 o39Var2;
        C0233h c0233h2;
        mn0 mn0VarM21998l;
        vf0 vf0VarM21971D;
        ui3 ui3Var2;
        boolean z;
        e16 e16Var3;
        o39 o39Var3;
        C0233h c0233h3;
        mn0 mn0Var2;
        vf0 vf0Var2;
        ui3 ui3Var3;
        x18 x18VarM22143u;
        e16 e16Var4;
        o39 o39Var4;
        C0233h c0233hM22000n;
        o39 o39Var5;
        mn0 mn0Var3;
        vf0 vf0Var3;
        ui3 ui3Var4;
        C0233h c0233h4;
        e16 e16VarM4429v;
        ui3 ui3Var5;
        int i4;
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-1940733721);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            e16Var2 = e16Var;
        } else if ((i & 6) == 0) {
            e16Var2 = e16Var;
            i3 = (tj3Var.m22120g(e16Var2) ? 4 : 2) | i;
        } else {
            e16Var2 = e16Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                o39Var2 = o39Var;
                int i6 = tj3Var.m22120g(o39Var2) ? 32 : 16;
                i3 |= i6;
            } else {
                o39Var2 = o39Var;
            }
            i3 |= i6;
        } else {
            o39Var2 = o39Var;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                c0233h2 = c0233h;
                int i7 = tj3Var.m22120g(c0233h2) ? 256 : 128;
                i3 |= i7;
            } else {
                c0233h2 = c0233h;
            }
            i3 |= i7;
        } else {
            c0233h2 = c0233h;
        }
        if ((i & 3072) == 0) {
            if ((i2 & 8) == 0) {
                mn0VarM21998l = mn0Var;
                int i8 = tj3Var.m22120g(mn0VarM21998l) ? 2048 : 1024;
                i3 |= i8;
            } else {
                mn0VarM21998l = mn0Var;
            }
            i3 |= i8;
        } else {
            mn0VarM21998l = mn0Var;
        }
        if ((i & 24576) == 0) {
            if ((i2 & 16) == 0) {
                vf0VarM21971D = vf0Var;
                int i9 = tj3Var.m22120g(vf0VarM21971D) ? 16384 : 8192;
                i3 |= i9;
            } else {
                vf0VarM21971D = vf0Var;
            }
            i3 |= i9;
        } else {
            vf0VarM21971D = vf0Var;
        }
        int i10 = i2 & 32;
        if (i10 == 0) {
            if ((i & 196608) == 0) {
                ui3Var2 = ui3Var;
                i3 |= tj3Var.m22124i(ui3Var2) ? 131072 : 65536;
            }
            if ((1572864 & i) == 0) {
                if (tj3Var.m22124i(c0282a)) {
                    i4 = 1048576;
                } else {
                    i4 = 524288;
                }
                i3 |= i4;
            }
            if ((599187 & i3) != 599186) {
                z = true;
            } else {
                z = false;
            }
            if (tj3Var.m22099R(i3 & 1, z)) {
                tj3Var.m22104W();
                if ((i & 1) != 0 || tj3Var.m22084B()) {
                    if (i5 != 0) {
                        e16Var4 = b16.f7762a;
                    } else {
                        e16Var4 = e16Var2;
                    }
                    if ((i2 & 2) != 0) {
                        o39Var4 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64858d;
                        i3 &= -113;
                    } else {
                        o39Var4 = o39Var2;
                    }
                    if ((i2 & 4) != 0) {
                        c0233hM22000n = te1.m22000n(62, 0.0f);
                        i3 &= -897;
                    } else {
                        c0233hM22000n = c0233h2;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        mn0VarM21998l = te1.m21998l(tj3Var);
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                        vf0VarM21971D = te1.m21971D(false, tj3Var, 1);
                    }
                    if (i10 != 0) {
                        ui3Var2 = null;
                    }
                    o39Var5 = o39Var4;
                    mn0Var3 = mn0VarM21998l;
                    vf0Var3 = vf0VarM21971D;
                    e16Var2 = e16Var4;
                    ui3Var4 = ui3Var2;
                    c0233h4 = c0233hM22000n;
                } else {
                    tj3Var.m22102U();
                    if ((i2 & 2) != 0) {
                        i3 &= -113;
                    }
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    if ((i2 & 16) != 0) {
                        i3 &= -57345;
                    }
                    o39Var5 = o39Var2;
                    mn0Var3 = mn0VarM21998l;
                    vf0Var3 = vf0VarM21971D;
                    ui3Var4 = ui3Var2;
                    c0233h4 = c0233h2;
                }
                tj3Var.m22140r();
                e16VarM4429v = c99.m4429v(c99.m4412e(e16Var2, 1.0f));
                if (ui3Var4 == null) {
                    tj3Var.m22111b0(-1842751880);
                    bq1.m4044T(e16VarM4429v, o39Var5, mn0Var3, c0233h4, vf0Var3, ci8.m4703P(913663542, new mx0(c0282a, 3), tj3Var), tj3Var, (i3 & 112) | 196608 | ((i3 >> 3) & 896) | ((i3 << 3) & 7168) | (i3 & 57344), 0);
                    tj3Var.m22139q(false);
                    ui3Var5 = ui3Var4;
                } else {
                    tj3Var.m22111b0(-1842510359);
                    int i11 = i3 << 6;
                    vf0 vf0Var4 = vf0Var3;
                    mn0 mn0Var4 = mn0Var3;
                    C0233h c0233h5 = c0233h4;
                    o39 o39Var6 = o39Var5;
                    ui3Var5 = ui3Var4;
                    bq1.m4043S(ui3Var5, e16VarM4429v, false, o39Var6, mn0Var4, c0233h5, vf0Var4, ci8.m4703P(1164311426, new mx0(c0282a, 4), tj3Var), tj3Var, ((i3 << 9) & 458752) | (57344 & (i3 << 3)) | ((i3 >> 15) & 14) | 100663296 | (i11 & 7168) | (3670016 & i11), 132);
                    o39Var5 = o39Var6;
                    mn0Var3 = mn0Var4;
                    c0233h4 = c0233h5;
                    vf0Var3 = vf0Var4;
                    tj3Var = tj3Var;
                    tj3Var.m22139q(false);
                }
                e16Var3 = e16Var2;
                ui3Var3 = ui3Var5;
                o39Var3 = o39Var5;
                mn0Var2 = mn0Var3;
                c0233h3 = c0233h4;
                vf0Var2 = vf0Var3;
            } else {
                tj3Var.m22102U();
                e16Var3 = e16Var2;
                o39Var3 = o39Var2;
                c0233h3 = c0233h2;
                mn0Var2 = mn0VarM21998l;
                vf0Var2 = vf0VarM21971D;
                ui3Var3 = ui3Var2;
            }
            x18VarM22143u = tj3Var.m22143u();
            if (x18VarM22143u != null) {
                x18VarM22143u.f67642d = new go4(e16Var3, o39Var3, c0233h3, mn0Var2, vf0Var2, ui3Var3, c0282a, i, i2);
            }
        }
        i3 |= 196608;
        ui3Var2 = ui3Var;
        if ((1572864 & i) == 0) {
            if (tj3Var.m22124i(c0282a)) {
                i4 = 1048576;
            } else {
                i4 = 524288;
            }
            i3 |= i4;
        }
        if ((599187 & i3) != 599186) {
            z = true;
        } else {
            z = false;
        }
        if (tj3Var.m22099R(i3 & 1, z)) {
            tj3Var.m22104W();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                    e16Var4 = b16.f7762a;
                } else {
                    e16Var4 = e16Var2;
                }
                if ((i2 & 2) != 0) {
                    o39Var4 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64858d;
                    i3 &= -113;
                } else {
                    o39Var4 = o39Var2;
                }
                if ((i2 & 4) != 0) {
                    c0233hM22000n = te1.m22000n(62, 0.0f);
                    i3 &= -897;
                } else {
                    c0233hM22000n = c0233h2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    mn0VarM21998l = te1.m21998l(tj3Var);
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    vf0VarM21971D = te1.m21971D(false, tj3Var, 1);
                }
                if (i10 != 0) {
                    ui3Var2 = null;
                }
                o39Var5 = o39Var4;
                mn0Var3 = mn0VarM21998l;
                vf0Var3 = vf0VarM21971D;
                e16Var2 = e16Var4;
                ui3Var4 = ui3Var2;
                c0233h4 = c0233hM22000n;
            } else {
                if (i5 != 0) {
                    e16Var4 = b16.f7762a;
                } else {
                    e16Var4 = e16Var2;
                }
                if ((i2 & 2) != 0) {
                    o39Var4 = ((ms5) tj3Var.m22128k(ps5.f56764b)).f51801c.f64858d;
                    i3 &= -113;
                } else {
                    o39Var4 = o39Var2;
                }
                if ((i2 & 4) != 0) {
                    c0233hM22000n = te1.m22000n(62, 0.0f);
                    i3 &= -897;
                } else {
                    c0233hM22000n = c0233h2;
                }
                if ((i2 & 8) != 0) {
                    i3 &= -7169;
                    mn0VarM21998l = te1.m21998l(tj3Var);
                }
                if ((i2 & 16) != 0) {
                    i3 &= -57345;
                    vf0VarM21971D = te1.m21971D(false, tj3Var, 1);
                }
                if (i10 != 0) {
                    ui3Var2 = null;
                }
                o39Var5 = o39Var4;
                mn0Var3 = mn0VarM21998l;
                vf0Var3 = vf0VarM21971D;
                e16Var2 = e16Var4;
                ui3Var4 = ui3Var2;
                c0233h4 = c0233hM22000n;
            }
            tj3Var.m22140r();
            e16VarM4429v = c99.m4429v(c99.m4412e(e16Var2, 1.0f));
            if (ui3Var4 == null) {
                tj3Var.m22111b0(-1842751880);
                bq1.m4044T(e16VarM4429v, o39Var5, mn0Var3, c0233h4, vf0Var3, ci8.m4703P(913663542, new mx0(c0282a, 3), tj3Var), tj3Var, (i3 & 112) | 196608 | ((i3 >> 3) & 896) | ((i3 << 3) & 7168) | (i3 & 57344), 0);
                tj3Var.m22139q(false);
                ui3Var5 = ui3Var4;
            } else {
                tj3Var.m22111b0(-1842510359);
                int i12 = i3 << 6;
                vf0 vf0Var5 = vf0Var3;
                mn0 mn0Var5 = mn0Var3;
                C0233h c0233h6 = c0233h4;
                o39 o39Var7 = o39Var5;
                ui3Var5 = ui3Var4;
                bq1.m4043S(ui3Var5, e16VarM4429v, false, o39Var7, mn0Var5, c0233h6, vf0Var5, ci8.m4703P(1164311426, new mx0(c0282a, 4), tj3Var), tj3Var, ((i3 << 9) & 458752) | (57344 & (i3 << 3)) | ((i3 >> 15) & 14) | 100663296 | (i12 & 7168) | (3670016 & i12), 132);
                o39Var5 = o39Var7;
                mn0Var3 = mn0Var5;
                c0233h4 = c0233h6;
                vf0Var3 = vf0Var5;
                tj3Var = tj3Var;
                tj3Var.m22139q(false);
            }
            e16Var3 = e16Var2;
            ui3Var3 = ui3Var5;
            o39Var3 = o39Var5;
            mn0Var2 = mn0Var3;
            c0233h3 = c0233h4;
            vf0Var2 = vf0Var3;
        } else {
            tj3Var.m22102U();
            e16Var3 = e16Var2;
            o39Var3 = o39Var2;
            c0233h3 = c0233h2;
            mn0Var2 = mn0VarM21998l;
            vf0Var2 = vf0VarM21971D;
            ui3Var3 = ui3Var2;
        }
        x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new go4(e16Var3, o39Var3, c0233h3, mn0Var2, vf0Var2, ui3Var3, c0282a, i, i2);
        }
    }

    /* JADX INFO: renamed from: h */
    public static final void m20383h(int i, final long j, ye1 ye1Var, final zi3 zi3Var, final g99 g99Var) {
        tj3 tj3Var = (tj3) ye1Var;
        tj3Var.m22115d0(-771692794);
        int i2 = (tj3Var.m22118f(j) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? tj3Var.m22120g(g99Var) : tj3Var.m22124i(g99Var) ? 32 : 16;
        }
        if (((i2 | (tj3Var.m22124i(zi3Var) ? 256 : 128)) & 147) == 146 && tj3Var.m22086D()) {
            tj3Var.m22102U();
        } else {
            pvc.m19507c(yf1.f69762a.mo1265a(new bk2(j)), ci8.m4703P(-367769018, new zi3() { // from class: androidx.glance.appwidget.m
                /* JADX WARN: Code duplicated, block: B:10:0x0025  */
                /* JADX WARN: Code duplicated, block: B:13:0x0040  */
                /* JADX WARN: Code duplicated, block: B:15:0x0047  */
                /* JADX WARN: Code duplicated, block: B:16:0x004b  */
                /* JADX WARN: Code duplicated, block: B:20:0x0082  */
                /* JADX WARN: Code duplicated, block: B:8:0x001b  */
                @Override // p000.zi3
                public final Object invoke(Object obj, Object obj2) {
                    tj3 tj3Var2;
                    Object objM22097O;
                    ui3 ui3Var;
                    ye1 ye1Var2 = (ye1) obj;
                    if ((((Integer) obj2).intValue() & 3) == 2) {
                        tj3 tj3Var3 = (tj3) ye1Var2;
                        if (tj3Var3.m22086D()) {
                            tj3Var3.m22102U();
                        } else {
                            tj3Var2 = (tj3) ye1Var2;
                            objM22097O = tj3Var2.m22097O();
                            if (objM22097O == we1.f66679a) {
                                objM22097O = SizeBoxKt$SizeBox$1$1$1.f5977i;
                                tj3Var2.m22131l0(objM22097O);
                            }
                            ui3Var = (ui3) ((FunctionReference) objM22097O);
                            tj3Var2.m22113c0(-683746039);
                            tj3Var2.m22113c0(-548224868);
                            if (tj3Var2.f62387a instanceof C3472pt) {
                                pk9.m19377r();
                                throw null;
                            }
                            tj3Var2.m22107Z();
                            if (tj3Var2.f62384S) {
                                tj3Var2.m22130l(ui3Var);
                            } else {
                                tj3Var2.m22137o0();
                            }
                            oha.m18001g(tj3Var2, new am8(25), new bk2(j));
                            oha.m18001g(tj3Var2, new am8(26), g99Var);
                            zi3Var.invoke(tj3Var2, 0);
                            tj3Var2.m22139q(true);
                            tj3Var2.m22139q(false);
                            tj3Var2.m22139q(false);
                        }
                    } else {
                        tj3Var2 = (tj3) ye1Var2;
                        objM22097O = tj3Var2.m22097O();
                        if (objM22097O == we1.f66679a) {
                            objM22097O = SizeBoxKt$SizeBox$1$1$1.f5977i;
                            tj3Var2.m22131l0(objM22097O);
                        }
                        ui3Var = (ui3) ((FunctionReference) objM22097O);
                        tj3Var2.m22113c0(-683746039);
                        tj3Var2.m22113c0(-548224868);
                        if (tj3Var2.f62387a instanceof C3472pt) {
                            pk9.m19377r();
                            throw null;
                        }
                        tj3Var2.m22107Z();
                        if (tj3Var2.f62384S) {
                            tj3Var2.m22130l(ui3Var);
                        } else {
                            tj3Var2.m22137o0();
                        }
                        oha.m18001g(tj3Var2, new am8(25), new bk2(j));
                        oha.m18001g(tj3Var2, new am8(26), g99Var);
                        zi3Var.invoke(tj3Var2, 0);
                        tj3Var2.m22139q(true);
                        tj3Var2.m22139q(false);
                        tj3Var2.m22139q(false);
                    }
                    return xfa.f68157a;
                }
            }, tj3Var), tj3Var, 56);
        }
        x18 x18VarM22143u = tj3Var.m22143u();
        if (x18VarM22143u != null) {
            x18VarM22143u.f67642d = new po7(j, g99Var, zi3Var, i, 2);
        }
    }

    /* JADX INFO: renamed from: i */
    public static nn9 m20384i() {
        return new nn9(null);
    }

    /* JADX INFO: renamed from: j */
    public static tg9 m20385j(String str) {
        String str2 = str.equals("open playlist") ? "https://www.lingq.com/library/playlist" : "https://www.lingq.com/library";
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str2));
        intent.setPackage("com.linguist");
        intent.setFlags(268468224);
        return new tg9(intent, AbstractC3064h6.m13073a((C2990f6[]) Arrays.copyOf(new C2990f6[0], 0)));
    }

    /* JADX INFO: renamed from: k */
    public static final oj3 m20386k(oj3 oj3Var) {
        if (oj3Var == null) {
            oj3Var = null;
        }
        if (oj3Var != null) {
            return oj3Var;
        }
        cf1.m4606b("Inconsistent composition");
        C3386nv.m17631r();
        return null;
    }

    /* JADX INFO: renamed from: m */
    public static final e16 m20387m(e16 e16Var, float f, long j, o39 o39Var) {
        return m20388n(e16Var, f, new pd9(j), o39Var);
    }

    /* JADX INFO: renamed from: n */
    public static final e16 m20388n(e16 e16Var, float f, pd9 pd9Var, o39 o39Var) {
        return e16Var.mo3161g(new uf0(f, pd9Var, o39Var));
    }

    /* JADX INFO: renamed from: o */
    public static final d18 m20389o(t89 t89Var) {
        t89Var.getClass();
        return new d18(t89Var);
    }

    /* JADX INFO: renamed from: p */
    public static final e18 m20390p(yd9 yd9Var) {
        yd9Var.getClass();
        return new e18(yd9Var);
    }

    /* JADX INFO: renamed from: q */
    public static String m20391q(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            int i = iIntValue / 32;
            long j = 1 << (iIntValue % 32);
            while (i >= arrayList.size()) {
                arrayList.add(0L);
            }
            arrayList.set(i, Long.valueOf(j | ((Long) arrayList.get(i)).longValue()));
        }
        if (arrayList.isEmpty()) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            sb.append(arrayList.get(i2));
            if (i2 < arrayList.size() - 1) {
                sb.append(",");
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: r */
    public static C0817bn m20392r(C0817bn c0817bn, float f, float f2, int i) {
        if ((i & 1) != 0) {
            f = ((Number) ((xc9) c0817bn.f8704b).getValue()).floatValue();
        }
        if ((i & 2) != 0) {
            f2 = ((C2934dn) c0817bn.f8705c).f35886a;
        }
        return new C0817bn(c0817bn.f8703a, Float.valueOf(f), new C2934dn(f2), c0817bn.f8706d, c0817bn.f8707e, c0817bn.f8708f);
    }

    /* JADX INFO: renamed from: t */
    public static final long m20393t() {
        return Thread.currentThread().getId();
    }

    /* JADX INFO: renamed from: u */
    public static void m20394u(sq5 sq5Var, String str) {
        ((sj5) sq5Var.f61249c).m21420a(3, "Kochava Diagnostic - ".concat(str), (String) sq5Var.f61248b, (String) sq5Var.f61250d);
    }

    /* JADX INFO: renamed from: v */
    public static String m20395v(Throwable th) {
        StringBuilder sb = new StringBuilder("Exception: ");
        sb.append(th.getMessage() != null ? th.getMessage() : "N/A");
        String string = sb.toString();
        Throwable cause = th.getCause();
        if (cause == null || cause.getMessage() == null) {
            return string;
        }
        StringBuilder sbM22999v = ux5.m22999v(string, " Cause : ");
        sbM22999v.append(cause.getMessage());
        return sbM22999v.toString();
    }

    /* JADX INFO: renamed from: w */
    public static sj5 m20396w() {
        if (f58684n == null) {
            synchronized (f58683m) {
                try {
                    if (f58684n == null) {
                        sj5 sj5Var = new sj5();
                        sj5Var.f60929a = 4;
                        sj5Var.f60930b = false;
                        sj5Var.f60931c = false;
                        f58684n = sj5Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f58684n;
    }

    /* JADX INFO: renamed from: x */
    public static final Class m20397x(z21 z21Var) {
        z21Var.getClass();
        Class clsMo16595a = z21Var.mo16595a();
        if (!clsMo16595a.isPrimitive()) {
            return clsMo16595a;
        }
        String name = clsMo16595a.getName();
        switch (name.hashCode()) {
            case -1325958191:
                return !name.equals("double") ? clsMo16595a : Double.class;
            case 104431:
                return !name.equals("int") ? clsMo16595a : Integer.class;
            case 3039496:
                return !name.equals("byte") ? clsMo16595a : Byte.class;
            case 3052374:
                return !name.equals("char") ? clsMo16595a : Character.class;
            case 3327612:
                return !name.equals("long") ? clsMo16595a : Long.class;
            case 3625364:
                return !name.equals("void") ? clsMo16595a : Void.class;
            case 64711720:
                return !name.equals("boolean") ? clsMo16595a : Boolean.class;
            case 97526364:
                return !name.equals("float") ? clsMo16595a : Float.class;
            case 109413500:
                return !name.equals("short") ? clsMo16595a : Short.class;
            default:
                return clsMo16595a;
        }
    }

    /* JADX INFO: renamed from: y */
    public static float m20398y(String[] strArr, int i) {
        float f = Float.parseFloat(strArr[i]);
        if (f >= 0.0f && f <= 1.0f) {
            return f;
        }
        ij6.m13952j("Motion easing control point value must be between 0 and 1; instead got: ", f);
        return 0.0f;
    }

    /* JADX INFO: renamed from: z */
    public static final int m20399z(SerialDescriptor serialDescriptor, SerialDescriptor[] serialDescriptorArr) {
        serialDescriptorArr.getClass();
        int iHashCode = (serialDescriptor.mo3694a().hashCode() * 31) + Arrays.hashCode(serialDescriptorArr);
        int iMo3697e = serialDescriptor.mo3697e();
        int i = 1;
        while (true) {
            int iHashCode2 = 0;
            if (!(iMo3697e > 0)) {
                break;
            }
            int i2 = iMo3697e - 1;
            int i3 = i * 31;
            String strMo3694a = serialDescriptor.mo3700i(serialDescriptor.mo3697e() - iMo3697e).mo3694a();
            if (strMo3694a != null) {
                iHashCode2 = strMo3694a.hashCode();
            }
            i = i3 + iHashCode2;
            iMo3697e = i2;
        }
        int iMo3697e2 = serialDescriptor.mo3697e();
        int iHashCode3 = 1;
        while (true) {
            if (!(iMo3697e2 > 0)) {
                return (((iHashCode * 31) + i) * 31) + iHashCode3;
            }
            int i4 = iMo3697e2 - 1;
            int i5 = iHashCode3 * 31;
            AbstractC3184kh kind = serialDescriptor.mo3700i(serialDescriptor.mo3697e() - iMo3697e2).getKind();
            iHashCode3 = i5 + (kind != null ? kind.hashCode() : 0);
            iMo3697e2 = i4;
        }
    }

    /* JADX INFO: renamed from: B */
    public void m20400B(bk8 bk8Var, Object obj) {
        bk8Var.getClass();
        if (obj == null) {
            return;
        }
        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0(mo17165s());
        try {
            mo17164l(ik8VarMo2873e0, obj);
            ik8VarMo2873e0.mo2876a0();
            AbstractC3352my.m17126j(ik8VarMo2873e0, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                AbstractC3352my.m17126j(ik8VarMo2873e0, th);
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public long m20401C(bk8 bk8Var, Object obj) throws Exception {
        bk8Var.getClass();
        if (obj == null) {
            return -1L;
        }
        ik8 ik8VarMo2873e0 = bk8Var.mo2873e0(mo17165s());
        try {
            mo17164l(ik8VarMo2873e0, obj);
            ik8VarMo2873e0.mo2876a0();
            AbstractC3352my.m17126j(ik8VarMo2873e0, null);
            if (AbstractC3489q9.m19787q(bk8Var) == 0) {
                return -1L;
            }
            ik8 ik8VarMo2873e1 = bk8Var.mo2873e0("SELECT last_insert_rowid()");
            try {
                ik8VarMo2873e1.mo2876a0();
                long j = ik8VarMo2873e1.getLong(0);
                AbstractC3352my.m17126j(ik8VarMo2873e1, null);
                return j;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3352my.m17126j(ik8VarMo2873e1, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                AbstractC3352my.m17126j(ik8VarMo2873e0, th3);
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public abstract void mo17164l(ik8 ik8Var, Object obj);

    /* JADX INFO: renamed from: s */
    public abstract String mo17165s();
}
