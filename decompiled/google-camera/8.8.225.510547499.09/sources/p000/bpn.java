package p000;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.Log;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import p021j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class bpn extends bzs implements Cloneable {

    /* JADX INFO: renamed from: A */
    private List f4070A;

    /* JADX INFO: renamed from: B */
    private bpn f4071B;

    /* JADX INFO: renamed from: C */
    private bpn f4072C;

    /* JADX INFO: renamed from: D */
    private Float f4073D;

    /* JADX INFO: renamed from: E */
    private boolean f4074E = true;

    /* JADX INFO: renamed from: F */
    private boolean f4075F;

    /* JADX INFO: renamed from: G */
    private boolean f4076G;

    /* JADX INFO: renamed from: u */
    private final Context f4077u;

    /* JADX INFO: renamed from: v */
    private final bpp f4078v;

    /* JADX INFO: renamed from: w */
    private final Class f4079w;

    /* JADX INFO: renamed from: x */
    private final bpc f4080x;

    /* JADX INFO: renamed from: y */
    private bpq f4081y;

    /* JADX INFO: renamed from: z */
    private Object f4082z;

    static {
    }

    protected bpn(box boxVar, bpp bppVar, Class cls, Context context) {
        this.f4078v = bppVar;
        this.f4079w = cls;
        this.f4077u = context;
        bpc bpcVar = bppVar.f4086a.f4033b;
        bpq bpqVar = (bpq) bpcVar.f4043d.get(cls);
        if (bpqVar == null) {
            for (Map.Entry entry : bpcVar.f4043d.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    bpqVar = (bpq) entry.getValue();
                }
            }
        }
        this.f4081y = bpqVar == null ? bpc.f4040a : bpqVar;
        this.f4080x = boxVar.f4033b;
        Iterator it = bppVar.f4089d.iterator();
        while (it.hasNext()) {
            m2848a((caa) it.next());
        }
        mo2855h(bppVar.m2865e());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: Q */
    private final bzw m2845Q(Object obj, cal calVar, caa caaVar, bzy bzyVar, bpq bpqVar, bpe bpeVar, int i, int i2, bzs bzsVar, Executor executor) {
        bzt bztVar;
        bzy bztVar2;
        bzw bzwVarM2846R;
        int i3;
        int i4;
        bpe bpeVar2;
        bpe bpeVar3;
        int i5;
        int i6;
        if (this.f4072C != null) {
            bztVar2 = new bzt(obj, bzyVar);
            bztVar = bztVar2;
        } else {
            bztVar = 0;
            bztVar2 = bzyVar;
        }
        bpn bpnVar = this.f4071B;
        if (bpnVar == null) {
            bzwVarM2846R = m2846R(obj, calVar, caaVar, bzsVar, bztVar2, bpqVar, bpeVar, i, i2, executor);
        } else {
            if (this.f4076G) {
                throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
            }
            bpq bpqVar2 = true == bpnVar.f4074E ? bpqVar : bpnVar.f4081y;
            if (super.m3296F(8)) {
                bpeVar3 = bpnVar.f4831c;
            } else {
                switch (bpm.f4069b[bpeVar.ordinal()]) {
                    case 1:
                        bpeVar2 = bpe.NORMAL;
                        break;
                    case 2:
                        bpeVar2 = bpe.HIGH;
                        break;
                    case 3:
                    case 4:
                        bpeVar2 = bpe.IMMEDIATE;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown priority: ".concat(String.valueOf(String.valueOf(this.f4831c))));
                }
                bpeVar3 = bpeVar2;
            }
            bpn bpnVar2 = this.f4071B;
            int i7 = bpnVar2.f4837i;
            int i8 = bpnVar2.f4836h;
            if (!cbi.m3393n(i, i2) || this.f4071B.m3297G()) {
                i5 = i8;
                i6 = i7;
            } else {
                i6 = bzsVar.f4837i;
                i5 = bzsVar.f4836h;
            }
            cae caeVar = new cae(obj, bztVar2);
            bzw bzwVarM2846R2 = m2846R(obj, calVar, caaVar, bzsVar, caeVar, bpqVar, bpeVar, i, i2, executor);
            this.f4076G = true;
            bpn bpnVar3 = this.f4071B;
            bzw bzwVarM2845Q = bpnVar3.m2845Q(obj, calVar, caaVar, caeVar, bpqVar2, bpeVar3, i6, i5, bpnVar3, executor);
            this.f4076G = false;
            caeVar.f4908a = bzwVarM2846R2;
            caeVar.f4909b = bzwVarM2845Q;
            bzwVarM2846R = caeVar;
        }
        if (bztVar == 0) {
            return bzwVarM2846R;
        }
        bpn bpnVar4 = this.f4072C;
        int i9 = bpnVar4.f4837i;
        int i10 = bpnVar4.f4836h;
        if (!cbi.m3393n(i, i2) || this.f4072C.m3297G()) {
            i3 = i10;
            i4 = i9;
        } else {
            i4 = bzsVar.f4837i;
            i3 = bzsVar.f4836h;
        }
        bpn bpnVar5 = this.f4072C;
        bzw bzwVarM2845Q2 = bpnVar5.m2845Q(obj, calVar, caaVar, bztVar, bpnVar5.f4081y, bpnVar5.f4831c, i4, i3, bpnVar5, executor);
        bztVar.f4855a = bzwVarM2846R;
        bztVar.f4856b = bzwVarM2845Q2;
        return bztVar;
    }

    /* JADX INFO: renamed from: R */
    private final bzw m2846R(Object obj, cal calVar, caa caaVar, bzs bzsVar, bzy bzyVar, bpq bpqVar, bpe bpeVar, int i, int i2, Executor executor) {
        Context context = this.f4077u;
        bpc bpcVar = this.f4080x;
        Object obj2 = this.f4082z;
        Class cls = this.f4079w;
        List list = this.f4070A;
        ljf ljfVar = bpcVar.f4047h;
        bzq bzqVar = bpqVar.f4096a;
        return new cad(context, bpcVar, obj, obj2, cls, bzsVar, i, i2, bpeVar, calVar, caaVar, list, bzyVar, ljfVar, executor, null, null, null, null);
    }

    /* JADX INFO: renamed from: S */
    private final void m2847S(cal calVar, caa caaVar, bzs bzsVar, Executor executor) {
        bzq.m3278r(calVar);
        if (!this.f4075F) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        bzw bzwVarM2845Q = m2845Q(new Object(), calVar, caaVar, null, this.f4081y, bzsVar.f4831c, bzsVar.f4837i, bzsVar.f4836h, bzsVar, executor);
        bzw bzwVarMo3337c = calVar.mo3337c();
        if (!bzwVarM2845Q.mo3333m(bzwVarMo3337c) || (!bzsVar.f4835g && bzwVarMo3337c.mo3332l())) {
            this.f4078v.m2866f(calVar);
            calVar.mo3342k(bzwVarM2845Q);
            this.f4078v.m2873m(calVar, bzwVarM2845Q);
        } else {
            bzq.m3278r(bzwVarMo3337c);
            if (bzwVarMo3337c.mo3334n()) {
                return;
            }
            bzwVarMo3337c.mo3322b();
        }
    }

    /* JADX INFO: renamed from: a */
    public final bpn m2848a(caa caaVar) {
        if (this.f4845q) {
            return clone().m2848a(caaVar);
        }
        if (caaVar != null) {
            if (this.f4070A == null) {
                this.f4070A = new ArrayList();
            }
            this.f4070A.add(caaVar);
        }
        m3305O();
        return this;
    }

    @Override // p000.bzs
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final bpn mo2855h(bzs bzsVar) {
        bzq.m3278r(bzsVar);
        return (bpn) super.mo2855h(bzsVar);
    }

    @Override // p000.bzs
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final bpn mo2856i() {
        bpn bpnVar = (bpn) super.mo2856i();
        bpnVar.f4081y = bpnVar.f4081y.clone();
        List list = bpnVar.f4070A;
        if (list != null) {
            bpnVar.f4070A = new ArrayList(list);
        }
        bpn bpnVar2 = bpnVar.f4071B;
        if (bpnVar2 != null) {
            bpnVar.f4071B = bpnVar2.clone();
        }
        bpn bpnVar3 = bpnVar.f4072C;
        if (bpnVar3 != null) {
            bpnVar.f4072C = bpnVar3.clone();
        }
        return bpnVar;
    }

    /* JADX INFO: renamed from: d */
    public final bpn m2851d(Drawable drawable) {
        return m2853f(drawable).mo2855h(cab.m3347c(bsk.f4331a));
    }

    /* JADX INFO: renamed from: e */
    public final bpn m2852e(Uri uri) {
        PackageInfo packageInfo;
        bpn bpnVarM2853f = m2853f(uri);
        if (!"android.resource".equals(uri.getScheme())) {
            return bpnVarM2853f;
        }
        bpn bpnVar = (bpn) bpnVarM2853f.m3291A(this.f4077u.getTheme());
        Context context = this.f4077u;
        int i = cap.f4921b;
        ConcurrentMap concurrentMap = caq.f4924a;
        String packageName = context.getPackageName();
        bqn bqnVar = (bqn) caq.f4924a.get(packageName);
        if (bqnVar == null) {
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException e) {
                Log.e("AppVersionSignature", "Cannot resolve info for".concat(String.valueOf(context.getPackageName())), e);
                packageInfo = null;
            }
            cat catVar = new cat(packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString());
            bqnVar = (bqn) caq.f4924a.putIfAbsent(packageName, catVar);
            if (bqnVar == null) {
                bqnVar = catVar;
            }
        }
        return (bpn) bpnVar.m3320z(new cap(context.getResources().getConfiguration().uiMode & 48, bqnVar));
    }

    @Override // p000.bzs
    public final boolean equals(Object obj) {
        if (obj instanceof bpn) {
            bpn bpnVar = (bpn) obj;
            if (super.equals(bpnVar) && Objects.equals(this.f4079w, bpnVar.f4079w) && this.f4081y.equals(bpnVar.f4081y) && Objects.equals(this.f4082z, bpnVar.f4082z) && Objects.equals(this.f4070A, bpnVar.f4070A) && Objects.equals(this.f4071B, bpnVar.f4071B) && Objects.equals(this.f4072C, bpnVar.f4072C)) {
                Float f = bpnVar.f4073D;
                if (Objects.equals(null, null) && this.f4074E == bpnVar.f4074E && this.f4075F == bpnVar.f4075F) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final bpn m2853f(Object obj) {
        if (this.f4845q) {
            return clone().m2853f(obj);
        }
        this.f4082z = obj;
        this.f4075F = true;
        m3305O();
        return this;
    }

    /* JADX INFO: renamed from: g */
    public final bpn m2854g(bpn bpnVar) {
        if (this.f4845q) {
            return clone().m2854g(bpnVar);
        }
        this.f4071B = bpnVar;
        m3305O();
        return this;
    }

    @Override // p000.bzs
    public final int hashCode() {
        return cbi.m3382c(this.f4075F ? 1 : 0, cbi.m3382c(this.f4074E ? 1 : 0, cbi.m3383d(null, cbi.m3383d(this.f4072C, cbi.m3383d(this.f4071B, cbi.m3383d(this.f4070A, cbi.m3383d(this.f4082z, cbi.m3383d(this.f4081y, cbi.m3383d(this.f4079w, super.hashCode())))))))));
    }

    /* JADX INFO: renamed from: j */
    public final bzv m2857j() {
        bzz bzzVar = new bzz();
        m2847S(bzzVar, bzzVar, this, cba.f4943b);
        return bzzVar;
    }

    /* JADX INFO: renamed from: k */
    public final can m2858k(ImageView imageView) {
        bzs bzsVarM3314t;
        can caiVar;
        cbi.m3387h();
        bzq.m3278r(imageView);
        if (!super.m3296F(2048) && this.f4840l && imageView.getScaleType() != null) {
            switch (bpm.f4068a[imageView.getScaleType().ordinal()]) {
                case 1:
                    bzsVarM3314t = clone().m3314t(bwy.f4670c, new bwn());
                    break;
                case 2:
                    bzsVarM3314t = clone().m3312r();
                    break;
                case 3:
                case 4:
                case 5:
                    bzsVarM3314t = super.m3313s(bwy.f4668a, new bxg());
                    break;
                case 6:
                    bzsVarM3314t = clone().m3312r();
                    break;
                default:
                    bzsVarM3314t = this;
                    break;
            }
        } else {
            bzsVarM3314t = this;
        }
        bpc bpcVar = this.f4080x;
        Class cls = this.f4079w;
        bzq bzqVar = bpcVar.f4046g;
        if (Bitmap.class.equals(cls)) {
            caiVar = new cag(imageView);
        } else {
            if (!Drawable.class.isAssignableFrom(cls)) {
                throw new IllegalArgumentException("Unhandled class: " + cls.toString() + ", try .as*(Class).transcode(ResourceTranscoder)");
            }
            caiVar = new cai(imageView);
        }
        m2847S(caiVar, null, bzsVarM3314t, cba.f4942a);
        return caiVar;
    }

    /* JADX INFO: renamed from: l */
    public final void m2859l(cal calVar) {
        m2847S(calVar, null, this, cba.f4942a);
    }
}
