package p000;

import android.R;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Base64;
import android.util.Log;
import android.view.ActionMode;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsSeekBar;
import androidx.cardview.widget.CardView;
import androidx.room.RoomDatabase$JournalMode;
import com.google.android.datatransport.cct.internal.ClientInfo$ClientType;
import com.google.android.datatransport.cct.internal.ComplianceData$ProductIdOrigin;
import com.google.android.gms.internal.play_billing.zzbw;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.play.core.review.ReviewException;
import com.google.android.play.core.review.ReviewInfo;
import com.google.firebase.crashlytics.internal.common.C1148a;
import com.lingq.core.data.repository.C1307w;
import com.lingq.core.player.C1808b;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.nio.channels.FileChannel;
import java.security.InvalidAlgorithmParameterException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: jq */
/* JADX INFO: loaded from: classes2.dex */
public class C3156jq implements ck8, fn9, am0, ar2, id9, jx2, kd8 {

    /* JADX INFO: renamed from: c */
    public static final int[] f45987c = {R.attr.indeterminateDrawable, R.attr.progressDrawable};

    /* JADX INFO: renamed from: d */
    public static final Object f45988d = new Object();

    /* JADX INFO: renamed from: e */
    public static i7b f45989e;

    /* JADX INFO: renamed from: a */
    public Object f45990a;

    /* JADX INFO: renamed from: b */
    public Object f45991b;

    public C3156jq(int i) {
        switch (i) {
            case 6:
                this.f45990a = new Rect();
                this.f45991b = new Rect();
                break;
            case 25:
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
                this.f45990a = byteArrayOutputStream;
                this.f45991b = new DataOutputStream(byteArrayOutputStream);
                break;
            default:
                this.f45990a = null;
                this.f45991b = C3404oc.f54158e;
                break;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m14584i(Context context, String str, rx1 rx1Var) {
        rx1Var.f59994a = context.getApplicationContext();
        Intent intent = new Intent("android.support.customtabs.action.CustomTabsService");
        if (str.isEmpty()) {
            C3386nv.m17626m("Service Intents must be explicit");
            return false;
        }
        intent.setPackage(str);
        return context.bindService(intent, rx1Var, 33);
    }

    /* JADX INFO: renamed from: o */
    public static Task m14585o(Context context, Intent intent, boolean z) {
        i7b i7bVar;
        int i = 3;
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Binding to service");
        }
        synchronized (f45988d) {
            try {
                if (f45989e == null) {
                    f45989e = new i7b(context);
                }
                i7bVar = f45989e;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z) {
            return i7bVar.m13713b(intent).mo5964f(new ExecutorC3014fu(1), new fg2(i));
        }
        if (ny8.m17672A().m17677D(context)) {
            synchronized (vxc.f66071a) {
                try {
                    vxc.m23589a(context);
                    boolean booleanExtra = intent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
                    intent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", true);
                    if (!booleanExtra) {
                        vxc.f66072b.m3197a();
                    }
                    i7bVar.m13713b(intent).m22200o(new dw6(intent, 21));
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } else {
            i7bVar.m13713b(intent);
        }
        return Tasks.m5975c(-1);
    }

    /* JADX INFO: renamed from: z */
    public static void m14586z(Context context, String str) {
        if (str == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        try {
            m14584i(applicationContext, str, new px1(applicationContext));
        } catch (SecurityException unused) {
        }
    }

    /* JADX INFO: renamed from: A */
    public void mo14587A(AttributeSet attributeSet, int i) {
        AbsSeekBar absSeekBar = (AbsSeekBar) this.f45990a;
        sq5 sq5VarM21551w = sq5.m21551w(i, 0, absSeekBar.getContext(), attributeSet, f45987c);
        Drawable drawableM21569k = sq5VarM21551w.m21569k(0);
        if (drawableM21569k != null) {
            if (drawableM21569k instanceof AnimationDrawable) {
                AnimationDrawable animationDrawable = (AnimationDrawable) drawableM21569k;
                int numberOfFrames = animationDrawable.getNumberOfFrames();
                AnimationDrawable animationDrawable2 = new AnimationDrawable();
                animationDrawable2.setOneShot(animationDrawable.isOneShot());
                for (int i2 = 0; i2 < numberOfFrames; i2++) {
                    Drawable drawableM14606T = m14606T(animationDrawable.getFrame(i2), true);
                    drawableM14606T.setLevel(10000);
                    animationDrawable2.addFrame(drawableM14606T, animationDrawable.getDuration(i2));
                }
                animationDrawable2.setLevel(10000);
                drawableM21569k = animationDrawable2;
            }
            absSeekBar.setIndeterminateDrawable(drawableM21569k);
        }
        Drawable drawableM21569k2 = sq5VarM21551w.m21569k(1);
        if (drawableM21569k2 != null) {
            absSeekBar.setProgressDrawable(m14606T(drawableM21569k2, false));
        }
        sq5VarM21551w.m21582y();
    }

    /* JADX INFO: renamed from: B */
    public boolean m14588B(AbstractC0799b6 abstractC0799b6, Menu menu) {
        return ((C3329mb) this.f45990a).m16730g(abstractC0799b6, menu);
    }

    /* JADX INFO: renamed from: C */
    public void m14589C(AbstractC0799b6 abstractC0799b6) {
        C3329mb c3329mb = (C3329mb) this.f45990a;
        ((ActionMode.Callback) c3329mb.f50860b).onDestroyActionMode(c3329mb.m16727d(abstractC0799b6));
        LayoutInflaterFactory2C3804yp layoutInflaterFactory2C3804yp = (LayoutInflaterFactory2C3804yp) this.f45991b;
        if (layoutInflaterFactory2C3804yp.f70194Q != null) {
            layoutInflaterFactory2C3804yp.f70217l.getDecorView().removeCallbacks(layoutInflaterFactory2C3804yp.f70195R);
        }
        if (layoutInflaterFactory2C3804yp.f70193P != null) {
            xua xuaVar = layoutInflaterFactory2C3804yp.f70196S;
            if (xuaVar != null) {
                xuaVar.m24704b();
            }
            xua xuaVarM10630a = dta.m10630a(layoutInflaterFactory2C3804yp.f70193P);
            xuaVarM10630a.m24703a(0.0f);
            layoutInflaterFactory2C3804yp.f70196S = xuaVarM10630a;
            xuaVarM10630a.m24706d(new C3421op(this, 2));
        }
        layoutInflaterFactory2C3804yp.f70192O = null;
        ViewGroup viewGroup = layoutInflaterFactory2C3804yp.f70198U;
        WeakHashMap weakHashMap = dta.f36217a;
        viewGroup.requestApplyInsets();
        layoutInflaterFactory2C3804yp.m25228G();
    }

    /* JADX INFO: renamed from: D */
    public boolean m14590D(AbstractC0799b6 abstractC0799b6, Menu menu) {
        ViewGroup viewGroup = ((LayoutInflaterFactory2C3804yp) this.f45991b).f70198U;
        WeakHashMap weakHashMap = dta.f36217a;
        viewGroup.requestApplyInsets();
        C3329mb c3329mb = (C3329mb) this.f45990a;
        ActionMode.Callback callback = (ActionMode.Callback) c3329mb.f50860b;
        qn9 qn9VarM16727d = c3329mb.m16727d(abstractC0799b6);
        l79 l79Var = (l79) c3329mb.f50863e;
        Menu jx5Var = (Menu) l79Var.get(menu);
        if (jx5Var == null) {
            jx5Var = new jx5((Context) c3329mb.f50861c, (hw5) menu);
            l79Var.put(menu, jx5Var);
        }
        return callback.onPrepareActionMode(qn9VarM16727d, jx5Var);
    }

    /* JADX INFO: renamed from: E */
    public void m14591E(mb3 mb3Var) {
        f78 f78Var = (f78) this.f45991b;
        hi8 hi8Var = (hi8) this.f45990a;
        int i = mb3Var.f50879b;
        if (i != 0) {
            f78Var.execute(new ea0(hi8Var, i, 1));
        } else {
            f78Var.execute(new kj3(2, hi8Var, mb3Var.f50878a));
        }
    }

    /* JADX INFO: renamed from: F */
    public Task m14592F(final Intent intent) {
        String stringExtra = intent.getStringExtra("gcm.rawData64");
        int i = 0;
        if (stringExtra != null) {
            intent.putExtra("rawData", Base64.decode(stringExtra, 0));
            intent.removeExtra("gcm.rawData64");
        }
        final Context context = (Context) this.f45990a;
        ExecutorC3014fu executorC3014fu = (ExecutorC3014fu) this.f45991b;
        boolean z = context.getApplicationInfo().targetSdkVersion >= 26;
        final boolean z2 = (intent.getFlags() & 268435456) != 0;
        return (!z || z2) ? Tasks.m5973a(new e13(i, context, intent), executorC3014fu).mo5965g(executorC3014fu, new bm1() { // from class: f13
            @Override // p000.bm1
            /* JADX INFO: renamed from: e */
            public final Object mo393e(Task task) {
                return ((Integer) task.mo5967i()).intValue() != 402 ? task : C3156jq.m14585o(context, intent, z2).mo5964f(new ExecutorC3014fu(1), new fg2(2));
            }
        }) : m14585o(context, intent, z2);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, um] */
    /* JADX INFO: renamed from: G */
    public void m14593G() {
        if (((C3653um) this.f45990a) == null) {
            ?? r0 = new ValueAnimator.DurationScaleChangeListener() { // from class: um
                @Override // android.animation.ValueAnimator.DurationScaleChangeListener
                public final void onChanged(float f) {
                    ((C3727wm) this.f64055a.f45991b).f67039g = f;
                }
            };
            this.f45990a = r0;
            ValueAnimator.registerDurationScaleChangeListener(r0);
        }
    }

    /* JADX INFO: renamed from: H */
    public void m14594H(r20 r20Var) {
        this.f45991b = r20Var;
    }

    /* JADX INFO: renamed from: I */
    public void m14595I(byte[] bArr) {
        this.f45990a = bArr;
    }

    /* JADX INFO: renamed from: J */
    public void m14596J(ClientInfo$ClientType clientInfo$ClientType) {
        this.f45990a = clientInfo$ClientType;
    }

    /* JADX INFO: renamed from: K */
    public void m14597K(byte[] bArr) {
        this.f45991b = bArr;
    }

    /* JADX INFO: renamed from: L */
    public void m14598L(List list) {
        if (list != null) {
            this.f45990a = list;
        } else {
            C3386nv.m17635v("Null files");
        }
    }

    /* JADX INFO: renamed from: M */
    public void m14599M(int i) {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 16-byte and 32-byte AES keys are supported", Integer.valueOf(i)));
        }
        this.f45990a = Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: N */
    public void m14600N(String str) {
        this.f45991b = str;
    }

    /* JADX INFO: renamed from: O */
    public void m14601O(p40 p40Var) {
        this.f45990a = p40Var;
    }

    /* JADX INFO: renamed from: P */
    public void m14602P(ql7 ql7Var) {
        this.f45990a = ql7Var;
        if (ql7Var.m20019a() != null) {
            ql7Var.m20019a().getClass();
            String str = ql7Var.m20019a().f52919a;
            if (str != null) {
                this.f45991b = str;
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m14603Q(ComplianceData$ProductIdOrigin complianceData$ProductIdOrigin) {
        this.f45991b = complianceData$ProductIdOrigin;
    }

    /* JADX INFO: renamed from: R */
    public void m14604R(int i, int i2, int i3, int i4) {
        CardView cardView = (CardView) this.f45991b;
        cardView.f1232d.set(i, i2, i3, i4);
        Rect rect = cardView.f1231c;
        super/*android.view.View*/.setPadding(i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    /* JADX INFO: renamed from: S */
    public void m14605S(C3404oc c3404oc) {
        this.f45991b = c3404oc;
    }

    /* JADX INFO: renamed from: T */
    public Drawable m14606T(Drawable drawable, boolean z) {
        if (!(drawable instanceof LayerDrawable)) {
            if (!(drawable instanceof BitmapDrawable)) {
                return drawable;
            }
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.f45991b) == null) {
                this.f45991b = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            return z ? new ClipDrawable(shapeDrawable, 3, 1) : shapeDrawable;
        }
        LayerDrawable layerDrawable = (LayerDrawable) drawable;
        int numberOfLayers = layerDrawable.getNumberOfLayers();
        Drawable[] drawableArr = new Drawable[numberOfLayers];
        for (int i = 0; i < numberOfLayers; i++) {
            int id = layerDrawable.getId(i);
            drawableArr[i] = m14606T(layerDrawable.getDrawable(i), id == 16908301 || id == 16908303);
        }
        LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
        for (int i2 = 0; i2 < numberOfLayers; i2++) {
            layerDrawable2.setId(i2, layerDrawable.getId(i2));
            layerDrawable2.setLayerGravity(i2, layerDrawable.getLayerGravity(i2));
            layerDrawable2.setLayerWidth(i2, layerDrawable.getLayerWidth(i2));
            layerDrawable2.setLayerHeight(i2, layerDrawable.getLayerHeight(i2));
            layerDrawable2.setLayerInsetLeft(i2, layerDrawable.getLayerInsetLeft(i2));
            layerDrawable2.setLayerInsetRight(i2, layerDrawable.getLayerInsetRight(i2));
            layerDrawable2.setLayerInsetTop(i2, layerDrawable.getLayerInsetTop(i2));
            layerDrawable2.setLayerInsetBottom(i2, layerDrawable.getLayerInsetBottom(i2));
            layerDrawable2.setLayerInsetStart(i2, layerDrawable.getLayerInsetStart(i2));
            layerDrawable2.setLayerInsetEnd(i2, layerDrawable.getLayerInsetEnd(i2));
        }
        return layerDrawable2;
    }

    /* JADX INFO: renamed from: U */
    public void m14607U() {
        ValueAnimator.unregisterDurationScaleChangeListener((C3653um) this.f45990a);
        this.f45990a = null;
    }

    @Override // p000.jx2
    /* JADX INFO: renamed from: a */
    public int mo12897a() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) ((vj6) this.f45990a).f65506b;
        ExtendedFloatingActionButton extendedFloatingActionButton2 = (ExtendedFloatingActionButton) this.f45991b;
        int i = extendedFloatingActionButton2.f12963F0;
        if (i != -1) {
            return (i == 0 || i == -2) ? extendedFloatingActionButton.getMeasuredHeight() : i;
        }
        if (!(extendedFloatingActionButton2.getParent() instanceof View)) {
            return extendedFloatingActionButton.getMeasuredHeight();
        }
        View view = (View) extendedFloatingActionButton2.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.height != -2) {
            return (view.getHeight() - ((!(extendedFloatingActionButton2.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton2.getLayoutParams()) == null) ? 0 : marginLayoutParams.topMargin + marginLayoutParams.bottomMargin)) - (view.getPaddingBottom() + view.getPaddingTop());
        }
        return extendedFloatingActionButton.getMeasuredHeight();
    }

    @Override // p000.kd8
    /* JADX INFO: renamed from: b */
    public tld mo6255b(Activity activity, ReviewInfo reviewInfo) {
        return reviewInfo != ((ReviewInfo) this.f45991b) ? Tasks.m5974b(new ReviewException(-2)) : Tasks.m5975c(null);
    }

    @Override // p000.id9
    /* JADX INFO: renamed from: c */
    public yd9 mo13795c() {
        return (pu2) this.f45991b;
    }

    @Override // p000.jx2
    /* JADX INFO: renamed from: d */
    public int mo12900d() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        vj6 vj6Var = (vj6) this.f45990a;
        ExtendedFloatingActionButton extendedFloatingActionButton = (ExtendedFloatingActionButton) this.f45991b;
        if (!(extendedFloatingActionButton.getParent() instanceof View)) {
            return vj6Var.mo12900d();
        }
        View view = (View) extendedFloatingActionButton.getParent();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null || layoutParams.width != -2) {
            return (view.getWidth() - ((!(extendedFloatingActionButton.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) extendedFloatingActionButton.getLayoutParams()) == null) ? 0 : marginLayoutParams.leftMargin + marginLayoutParams.rightMargin)) - (view.getPaddingRight() + view.getPaddingLeft());
        }
        return vj6Var.mo12900d();
    }

    @Override // p000.ar2
    /* JADX INFO: renamed from: e */
    public Object mo2998e() {
        return (gga) this.f45990a;
    }

    @Override // p000.jx2
    /* JADX INFO: renamed from: f */
    public int mo12902f() {
        return ((ExtendedFloatingActionButton) this.f45991b).f12972y0;
    }

    @Override // p000.kd8
    /* JADX INFO: renamed from: g */
    public tld mo6256g() {
        ReviewInfo reviewInfoM6254a = ReviewInfo.m6254a(PendingIntent.getBroadcast((Context) this.f45990a, 0, new Intent(), 67108864));
        this.f45991b = reviewInfoM6254a;
        return Tasks.m5975c(reviewInfoM6254a);
    }

    @Override // p000.ar2
    /* JADX INFO: renamed from: h */
    public boolean mo2999h(CharSequence charSequence, int i, int i2, rda rdaVar) {
        if ((rdaVar.f59141c & 4) > 0) {
            return true;
        }
        if (((gga) this.f45990a) == null) {
            this.f45990a = new gga(charSequence instanceof Spannable ? (Spannable) charSequence : new SpannableString(charSequence));
        }
        ((p58) this.f45991b).getClass();
        ((gga) this.f45990a).setSpan(new sda(rdaVar), i, i2, 33);
        return true;
    }

    @Override // p000.jx2
    /* JADX INFO: renamed from: j */
    public ViewGroup.LayoutParams mo12903j() {
        int i = ((ExtendedFloatingActionButton) this.f45991b).f12963F0;
        if (i == 0) {
            i = -2;
        }
        return new ViewGroup.LayoutParams(-1, i);
    }

    @Override // p000.fn9
    /* JADX INFO: renamed from: k */
    public Task mo91k(Object obj) {
        Boolean bool = (Boolean) obj;
        C1148a c1148a = (C1148a) this.f45991b;
        if (bool.booleanValue()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Sending cached crash reports...", null);
            }
            boolean zBooleanValue = bool.booleanValue();
            tz1 tz1Var = c1148a.f13651b;
            if (zBooleanValue) {
                ((wr9) tz1Var.f63126e).m24140d(null);
                return ((Task) this.f45990a).mo5972n(c1148a.f13654e.f13668a, new ck6(this, 8));
            }
            tz1Var.getClass();
            C3386nv.m17633t("An invalid data collection token was used.");
            return null;
        }
        if (Log.isLoggable("FirebaseCrashlytics", 2)) {
            Log.v("FirebaseCrashlytics", "Deleting cached crash reports...", null);
        }
        t33 t33Var = c1148a.f13656g;
        Iterator it = t33.m21829e(((File) t33Var.f61788c).listFiles(C1148a.f13648r)).iterator();
        while (it.hasNext()) {
            ((File) it.next()).delete();
        }
        t33 t33Var2 = ((zq1) c1148a.f13662m.f37034b).f71962b;
        zq1.m25739a(t33.m21829e(((File) t33Var2.f61790e).listFiles()));
        zq1.m25739a(t33.m21829e(((File) t33Var2.f61791f).listFiles()));
        zq1.m25739a(t33.m21829e(((File) t33Var2.f61792g).listFiles()));
        c1148a.f13666q.m24140d(null);
        return Tasks.m5975c(null);
    }

    @Override // p000.am0
    /* JADX INFO: renamed from: l */
    public void mo553l(ul0 ul0Var, i88 i88Var) {
        ((w52) this.f45991b).f66402a.execute(new RunnableC3725wk(this, (am0) this.f45990a, i88Var, 6));
    }

    @Override // p000.ck8
    /* JADX INFO: renamed from: m */
    public bk8 mo4512m(String str) {
        FileChannel fileChannel;
        FileChannel fileChannel2;
        str.getClass();
        sb2 sb2Var = (sb2) this.f45991b;
        if (!str.equals(":memory:")) {
            str = ((s02) sb2Var.f60614d).f60112a.getDatabasePath(str).getAbsolutePath();
            str.getClass();
        }
        boolean z = true;
        uu2 uu2Var = new uu2(str, (sb2Var.f60612b || sb2Var.f60613c || str.equals(":memory:")) ? false : true);
        ReentrantLock reentrantLock = uu2Var.f64363a;
        reentrantLock.lock();
        p33 p33Var = uu2Var.f64364b;
        if (p33Var != null) {
            try {
                p33Var.m18874R();
            } catch (Throwable th) {
                th = th;
                z = false;
            }
        }
        try {
            try {
                if (sb2Var.f60613c) {
                    throw new IllegalStateException("Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?");
                }
                bk8 bk8VarMo4512m = ((ck8) this.f45990a).mo4512m(str);
                if (sb2Var.f60612b) {
                    sb2.m21193f(bk8VarMo4512m);
                    if (((s02) sb2Var.f60614d).f60118g == RoomDatabase$JournalMode.WRITE_AHEAD_LOGGING) {
                        AbstractC3695vr.m23496g(bk8VarMo4512m, "PRAGMA synchronous = NORMAL");
                    } else {
                        AbstractC3695vr.m23496g(bk8VarMo4512m, "PRAGMA synchronous = FULL");
                    }
                    ((lq2) sb2Var.f60615e).mo16461s(bk8VarMo4512m);
                } else {
                    try {
                        sb2Var.f60613c = true;
                        sb2.m21192a(sb2Var, bk8VarMo4512m);
                        sb2Var.f60613c = false;
                    } catch (Throwable th2) {
                        sb2Var.f60613c = false;
                        throw th2;
                    }
                }
                if (p33Var != null && (fileChannel2 = (FileChannel) p33Var.f55514c) != null) {
                    try {
                        fileChannel2.close();
                        p33Var.f55514c = null;
                    } catch (Throwable th3) {
                        p33Var.f55514c = null;
                        throw th3;
                    }
                }
                reentrantLock.unlock();
                return bk8VarMo4512m;
            } catch (Throwable th4) {
                if (p33Var != null && (fileChannel = (FileChannel) p33Var.f55514c) != null) {
                    try {
                        fileChannel.close();
                    } finally {
                        p33Var.f55514c = null;
                    }
                }
                throw th4;
            }
        } catch (Throwable th5) {
            th = th5;
        }
        th = th5;
        try {
            if (z) {
                throw th;
            }
            throw new IllegalStateException("Unable to open database '" + str + "'. Was a proper path / name used in Room's database builder?", th);
        } catch (Throwable th6) {
            reentrantLock.unlock();
            throw th6;
        }
    }

    @Override // p000.id9
    /* JADX INFO: renamed from: n */
    public t89 mo13796n() {
        return (ou2) this.f45990a;
    }

    @Override // p000.am0
    /* JADX INFO: renamed from: p */
    public void mo554p(ul0 ul0Var, Throwable th) {
        ((w52) this.f45991b).f66402a.execute(new RunnableC3725wk(this, (am0) this.f45990a, th, 7));
    }

    @Override // p000.jx2
    /* JADX INFO: renamed from: q */
    public int mo12909q() {
        return ((ExtendedFloatingActionButton) this.f45991b).f12971x0;
    }

    @Override // p000.ck8
    /* JADX INFO: renamed from: r */
    public boolean mo4516r() {
        return ((ck8) this.f45990a).mo4516r();
    }

    /* JADX INFO: renamed from: s */
    public C3455pc m14608s() {
        Integer num = (Integer) this.f45990a;
        if (num != null) {
            return new C3455pc(num.intValue(), (C3404oc) this.f45991b);
        }
        v63.m23147y("Key size is not set");
        return null;
    }

    /* JADX INFO: renamed from: t */
    public u20 m14609t() {
        return new u20((ClientInfo$ClientType) this.f45990a, (r20) this.f45991b);
    }

    /* JADX INFO: renamed from: u */
    public v20 m14610u() {
        return new v20((p40) this.f45990a, (ComplianceData$ProductIdOrigin) this.f45991b);
    }

    /* JADX INFO: renamed from: v */
    public d30 m14611v() {
        List list = (List) this.f45990a;
        if (list != null) {
            return new d30(list, (String) this.f45991b);
        }
        C3386nv.m17633t("Missing required properties: files");
        return null;
    }

    /* JADX INFO: renamed from: w */
    public n40 m14612w() {
        return new n40((byte[]) this.f45990a, (byte[]) this.f45991b);
    }

    /* JADX INFO: renamed from: x */
    public lc0 m14613x() {
        if (((ql7) this.f45990a) != null) {
            return new lc0(this);
        }
        C3386nv.m17635v("ProductDetails is required for constructing ProductDetailsParams.");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public nc0 m14614y() {
        ArrayList arrayList = (ArrayList) this.f45990a;
        boolean z = true;
        int i = 0;
        Object[] objArr = 0;
        Object[] objArr2 = (arrayList == null || arrayList.isEmpty()) ? false : true;
        gp0 gp0Var = null;
        if (objArr2 != true) {
            C3386nv.m17626m("Details of the products must be provided.");
            return null;
        }
        ArrayList arrayList2 = (ArrayList) this.f45990a;
        if (arrayList2 != null) {
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                if (((lc0) it.next()) == null) {
                    C3386nv.m17626m("ProductDetailsParams cannot be null.");
                    return null;
                }
            }
        }
        nc0 nc0Var = new nc0(i, (boolean) (objArr == true ? 1 : 0));
        nc0Var.f52584b = objArr2 == true && !((lc0) ((ArrayList) this.f45990a).get(0)).f49421a.f57905b.optString("packageName").isEmpty();
        mc0 mc0Var = (mc0) this.f45991b;
        if (TextUtils.isEmpty(mc0Var.f51054c) && TextUtils.isEmpty(null)) {
            z = false;
        }
        boolean zIsEmpty = TextUtils.isEmpty(null);
        if (z && !zIsEmpty) {
            C3386nv.m17626m("Please provide Old SKU purchase information(token/id) or original external transaction id, not both.");
        } else if (mc0Var.f51053b || z || !zIsEmpty) {
            gp0Var = new gp0(3);
            gp0Var.f41124b = mc0Var.f51054c;
        } else {
            C3386nv.m17626m("Old SKU purchase information(token/id) or original external transaction id must be provided.");
        }
        nc0Var.f52585c = gp0Var;
        nc0Var.f52587e = new ArrayList();
        ArrayList arrayList3 = (ArrayList) this.f45990a;
        nc0Var.f52586d = arrayList3 != null ? zzbw.m5668m(arrayList3) : zzbw.m5669n();
        return nc0Var;
    }

    public /* synthetic */ C3156jq(Object obj, Object obj2) {
        this.f45990a = obj;
        this.f45991b = obj2;
    }

    public /* synthetic */ C3156jq(Object obj, Object obj2, boolean z) {
        this.f45991b = obj;
        this.f45990a = obj2;
    }

    public /* synthetic */ C3156jq(Object obj, boolean z) {
        this.f45991b = obj;
    }

    public C3156jq(C1808b c1808b, xd7 xd7Var) {
        c1808b.getClass();
        xd7Var.getClass();
        this.f45990a = c1808b;
        this.f45991b = xd7Var;
    }

    public C3156jq(C1307w c1307w, cma cmaVar) {
        c1307w.getClass();
        cmaVar.getClass();
        this.f45990a = c1307w;
        this.f45991b = cmaVar;
    }

    public C3156jq(Context context) {
        this.f45990a = context;
        this.f45991b = new ExecutorC3014fu(1);
    }

    public /* synthetic */ C3156jq(char c) {
    }

    public C3156jq(sb2 sb2Var, ck8 ck8Var) {
        ck8Var.getClass();
        this.f45991b = sb2Var;
        this.f45990a = ck8Var;
    }

    public C3156jq(C3552rx c3552rx) {
        ru2 ru2Var = (ru2) c3552rx.f59989d;
        this.f45990a = new ou2(c3552rx, ru2Var.mo12227g().mo13796n(), -1L, true);
        this.f45991b = new pu2(c3552rx, ru2Var.mo12227g().mo13795c(), -1L, true);
    }
}
