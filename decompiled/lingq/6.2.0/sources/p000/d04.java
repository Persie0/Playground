package p000;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.widget.ImageView;
import coil.request.CachePolicy;
import coil.size.Precision;
import coil.size.Scale;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.AbstractC3194a;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes.dex */
public final class d04 {

    /* JADX INFO: renamed from: a */
    public final Context f34776a;

    /* JADX INFO: renamed from: b */
    public s72 f34777b;

    /* JADX INFO: renamed from: c */
    public Object f34778c;

    /* JADX INFO: renamed from: d */
    public lr9 f34779d;

    /* JADX INFO: renamed from: e */
    public Precision f34780e;

    /* JADX INFO: renamed from: f */
    public List f34781f;

    /* JADX INFO: renamed from: g */
    public zl6 f34782g;

    /* JADX INFO: renamed from: h */
    public final or3 f34783h;

    /* JADX INFO: renamed from: i */
    public final LinkedHashMap f34784i;

    /* JADX INFO: renamed from: j */
    public final boolean f34785j;

    /* JADX INFO: renamed from: k */
    public Boolean f34786k;

    /* JADX INFO: renamed from: l */
    public final boolean f34787l;

    /* JADX INFO: renamed from: m */
    public CachePolicy f34788m;

    /* JADX INFO: renamed from: n */
    public final bn5 f34789n;

    /* JADX INFO: renamed from: o */
    public Integer f34790o;

    /* JADX INFO: renamed from: p */
    public i99 f34791p;

    /* JADX INFO: renamed from: q */
    public Scale f34792q;

    /* JADX INFO: renamed from: r */
    public AbstractC3572sf f34793r;

    /* JADX INFO: renamed from: s */
    public i99 f34794s;

    /* JADX INFO: renamed from: t */
    public Scale f34795t;

    public d04(e04 e04Var, Context context) {
        this.f34776a = context;
        this.f34777b = e04Var.f36501A;
        this.f34778c = e04Var.f36503b;
        this.f34779d = e04Var.f36504c;
        ba2 ba2Var = e04Var.f36527z;
        this.f34780e = ba2Var.f8216d;
        this.f34781f = e04Var.f36507f;
        this.f34782g = ba2Var.f8215c;
        this.f34783h = e04Var.f36509h.m20123g();
        this.f34784i = AbstractC3194a.m15372Y(e04Var.f36510i.f34433a);
        this.f34785j = e04Var.f36511j;
        this.f34786k = ba2Var.f8217e;
        this.f34787l = e04Var.f36514m;
        this.f34788m = ba2Var.f8218f;
        z37 z37Var = e04Var.f36525x;
        z37Var.getClass();
        this.f34789n = new bn5(z37Var);
        this.f34790o = e04Var.f36526y;
        this.f34791p = ba2Var.f8213a;
        this.f34792q = ba2Var.f8214b;
        if (e04Var.f36502a == context) {
            this.f34793r = e04Var.f36522u;
            this.f34794s = e04Var.f36523v;
            this.f34795t = e04Var.f36524w;
        } else {
            this.f34793r = null;
            this.f34794s = null;
            this.f34795t = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final e04 m9960a() {
        nn1 nn1Var;
        ImageView imageView;
        Object obj = this.f34778c;
        if (obj == null) {
            obj = p84.f55746h;
        }
        Object obj2 = obj;
        lr9 lr9Var = this.f34779d;
        s72 s72Var = this.f34777b;
        Bitmap.Config config = s72Var.f60454g;
        Precision precision = this.f34780e;
        if (precision == null) {
            precision = s72Var.f60453f;
        }
        Precision precision2 = precision;
        List list = this.f34781f;
        zl6 zl6Var = this.f34782g;
        if (zl6Var == null) {
            zl6Var = s72Var.f60452e;
        }
        zl6 zl6Var2 = zl6Var;
        or3 or3Var = this.f34783h;
        qr3 qr3VarM18309w = or3Var != null ? or3Var.m18309w() : null;
        if (qr3VarM18309w == null) {
            qr3VarM18309w = AbstractC3057h.f41583c;
        } else {
            Bitmap.Config[] configArr = AbstractC3057h.f41581a;
        }
        qr3 qr3Var = qr3VarM18309w;
        LinkedHashMap linkedHashMap = this.f34784i;
        cr9 cr9Var = linkedHashMap != null ? new cr9(l70.m15919J(linkedHashMap)) : null;
        if (cr9Var == null) {
            cr9Var = cr9.f34432b;
        }
        cr9 cr9Var2 = cr9Var;
        Boolean bool = this.f34786k;
        boolean zBooleanValue = bool != null ? bool.booleanValue() : this.f34777b.f60455h;
        this.f34777b.getClass();
        s72 s72Var2 = this.f34777b;
        CachePolicy cachePolicy = s72Var2.f60456i;
        CachePolicy cachePolicy2 = this.f34788m;
        if (cachePolicy2 == null) {
            cachePolicy2 = s72Var2.f60457j;
        }
        CachePolicy cachePolicy3 = cachePolicy2;
        CachePolicy cachePolicy4 = s72Var2.f60458k;
        nn1 nn1Var2 = s72Var2.f60448a;
        nn1 nn1Var3 = s72Var2.f60449b;
        nn1 nn1Var4 = s72Var2.f60450c;
        nn1 nn1Var5 = s72Var2.f60451d;
        AbstractC3572sf abstractC3572sfMo256K = this.f34793r;
        Context context = this.f34776a;
        if (abstractC3572sfMo256K == null) {
            lr9 lr9Var2 = this.f34779d;
            nn1Var = nn1Var5;
            Object context2 = lr9Var2 instanceof t04 ? ((t04) lr9Var2).f61703b.getContext() : context;
            while (true) {
                if (context2 instanceof ub5) {
                    abstractC3572sfMo256K = ((ub5) context2).mo256K();
                    break;
                }
                if (!(context2 instanceof ContextWrapper)) {
                    abstractC3572sfMo256K = null;
                    break;
                }
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
            if (abstractC3572sfMo256K == null) {
                abstractC3572sfMo256K = sn3.f61056b;
            }
        } else {
            nn1Var = nn1Var5;
        }
        AbstractC3572sf abstractC3572sf = abstractC3572sfMo256K;
        i99 uh2Var = this.f34791p;
        if (uh2Var == null && (uh2Var = this.f34794s) == null) {
            lr9 lr9Var3 = this.f34779d;
            if (lr9Var3 instanceof t04) {
                ImageView imageView2 = ((t04) lr9Var3).f61703b;
                ImageView.ScaleType scaleType = imageView2.getScaleType();
                uh2Var = (scaleType == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX) ? new q18(w89.f66530c) : new t18(imageView2);
            } else {
                uh2Var = new uh2(context);
            }
        }
        i99 i99Var = uh2Var;
        Scale scale = this.f34792q;
        if (scale == null && (scale = this.f34795t) == null) {
            i99 i99Var2 = this.f34791p;
            t18 t18Var = i99Var2 instanceof t18 ? (t18) i99Var2 : null;
            if (t18Var != null) {
                imageView = t18Var.f61746a;
            } else {
                lr9 lr9Var4 = this.f34779d;
                t04 t04Var = lr9Var4 instanceof t04 ? (t04) lr9Var4 : null;
                imageView = t04Var != null ? t04Var.f61703b : null;
            }
            if (imageView != null) {
                Bitmap.Config[] configArr2 = AbstractC3057h.f41581a;
                ImageView.ScaleType scaleType2 = imageView.getScaleType();
                int i = scaleType2 == null ? -1 : AbstractC3020g.f39978a[scaleType2.ordinal()];
                scale = (i == 1 || i == 2 || i == 3 || i == 4) ? Scale.FIT : Scale.FILL;
            } else {
                scale = Scale.FIT;
            }
        }
        Scale scale2 = scale;
        bn5 bn5Var = this.f34789n;
        z37 z37Var = bn5Var != null ? new z37(l70.m15919J(bn5Var.f8715a)) : null;
        if (z37Var == null) {
            z37Var = z37.f70834b;
        }
        return new e04(context, obj2, lr9Var, config, precision2, list, zl6Var2, qr3Var, cr9Var2, this.f34785j, zBooleanValue, false, this.f34787l, cachePolicy, cachePolicy3, cachePolicy4, nn1Var2, nn1Var3, nn1Var4, nn1Var, abstractC3572sf, i99Var, scale2, z37Var, this.f34790o, new ba2(this.f34791p, this.f34792q, this.f34782g, this.f34780e, this.f34786k, this.f34788m), this.f34777b);
    }

    /* JADX INFO: renamed from: b */
    public final void m9961b() {
        this.f34793r = null;
        this.f34794s = null;
        this.f34795t = null;
    }

    /* JADX INFO: renamed from: c */
    public final void m9962c(int i, int i2) {
        this.f34791p = new q18(new w89(new lg2(i), new lg2(i2)));
        m9961b();
    }

    public d04(Context context) {
        this.f34776a = context;
        this.f34777b = AbstractC2983f.f38126a;
        this.f34778c = null;
        this.f34779d = null;
        this.f34780e = null;
        this.f34781f = EmptyList.f47638a;
        this.f34782g = null;
        this.f34783h = null;
        this.f34784i = null;
        this.f34785j = true;
        this.f34786k = null;
        this.f34787l = true;
        this.f34788m = null;
        this.f34789n = null;
        this.f34790o = null;
        this.f34791p = null;
        this.f34792q = null;
        this.f34793r = null;
        this.f34794s = null;
        this.f34795t = null;
    }
}
