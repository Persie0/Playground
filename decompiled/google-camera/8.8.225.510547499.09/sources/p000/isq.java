package p000;

import p021j$.util.Collection$EL;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class isq {

    /* JADX INFO: renamed from: a */
    private static final Float f32011a;

    /* JADX INFO: renamed from: b */
    private static final Float f32012b;

    /* JADX INFO: renamed from: c */
    private static final Float f32013c;

    /* JADX INFO: renamed from: d */
    private static final Float f32014d;

    /* JADX INFO: renamed from: e */
    private static final Float f32015e;

    /* JADX INFO: renamed from: f */
    private static final Float f32016f;

    /* JADX INFO: renamed from: g */
    private static final Float f32017g;

    /* JADX INFO: renamed from: h */
    private static final Float f32018h;

    /* JADX INFO: renamed from: i */
    private static final Float f32019i;

    /* JADX INFO: renamed from: j */
    private static final Float f32020j;

    /* JADX INFO: renamed from: k */
    private static final Float f32021k;

    /* JADX INFO: renamed from: l */
    private final Float f32022l;

    /* JADX INFO: renamed from: m */
    private final Float f32023m;

    /* JADX INFO: renamed from: n */
    private final Float f32024n;

    /* JADX INFO: renamed from: o */
    private final Float f32025o;

    /* JADX INFO: renamed from: p */
    private final Float f32026p;

    static {
        Float fValueOf = Float.valueOf(1.0f);
        f32011a = fValueOf;
        f32012b = Float.valueOf(2.0f);
        f32013c = fValueOf;
        f32014d = Float.valueOf(2.6f);
        Float fValueOf2 = Float.valueOf(1.4f);
        f32015e = fValueOf2;
        f32016f = Float.valueOf(1.2f);
        f32017g = Float.valueOf(1.5f);
        f32018h = fValueOf2;
        Float fValueOf3 = Float.valueOf(4.0f);
        f32019i = fValueOf3;
        f32020j = fValueOf3;
        f32021k = fValueOf3;
    }

    public isq(dhv dhvVar) {
        this.f32022l = (Float) dhvVar.mo6180h(dib.f11280an).get();
        this.f32023m = (Float) dhvVar.mo6180h(dib.f11281ao).get();
        this.f32024n = (Float) dhvVar.mo6180h(dib.f11282ap).get();
        this.f32025o = (Float) dhvVar.mo6180h(dib.f11283aq).get();
        this.f32026p = (Float) dhvVar.mo6180h(dio.f11664f).get();
    }

    /* JADX INFO: renamed from: a */
    public final mwx m11710a(int i) {
        ikw ikwVar = ikw.UNINITIALIZED;
        switch (i - 1) {
            case 0:
                return mwx.m17121p(iuk.ULTRA_WIDE, this.f32022l, iuk.WIDE, f32011a, iuk.TELE, this.f32023m);
            case 1:
                return mwx.m17122q(iuk.ULTRA_WIDE, this.f32022l, iuk.WIDE, f32011a, iuk.TELE, this.f32023m, iuk.ULTRA_TELE, this.f32024n);
            case 2:
            case 5:
            case 6:
            case 7:
                return mwx.m17120o(iuk.WIDE, f32011a, iuk.TELE, this.f32023m);
            case 3:
                iuk iukVar = iuk.WIDE;
                Float f = this.f32026p;
                iuk iukVar2 = iuk.TELE;
                float fFloatValue = f.floatValue();
                return mwx.m17120o(iukVar, f, iukVar2, Float.valueOf(fFloatValue + fFloatValue));
            case 4:
                return mwx.m17120o(iuk.WIDE, f32012b, iuk.TELE, f32014d);
            case 8:
                return mwx.m17120o(iuk.WIDE, Float.valueOf(2.0f), iuk.TELE, Float.valueOf(5.0f));
            case 9:
                iuk iukVar3 = iuk.WIDE;
                Float f2 = this.f32022l;
                iuk iukVar4 = iuk.TELE;
                float fFloatValue2 = f2.floatValue();
                return mwx.m17120o(iukVar3, f2, iukVar4, Float.valueOf(fFloatValue2 + fFloatValue2));
            case 10:
                return mwx.m17120o(iuk.WIDE, f32013c, iuk.TELE, f32015e);
            case 11:
                return mwx.m17120o(iuk.WIDE, f32013c, iuk.TELE, f32016f);
            case 12:
                return mwx.m17120o(iuk.WIDE, f32013c, iuk.TELE, f32017g);
            default:
                return mwx.m17120o(iuk.WIDE, f32013c, iuk.TELE, f32018h);
        }
    }

    /* JADX INFO: renamed from: b */
    public final mxk m11711b(int i) {
        mws mwsVarM17100o;
        ikw ikwVar = ikw.UNINITIALIZED;
        switch (i - 1) {
            case 0:
            case 4:
                mwsVarM17100o = mws.m17100o(this.f32022l, f32011a, this.f32023m, this.f32025o);
                break;
            case 1:
                mwsVarM17100o = mws.m17101p(this.f32022l, f32011a, this.f32023m, this.f32024n, this.f32025o);
                break;
            case 2:
                Float f = this.f32026p;
                float fFloatValue = f.floatValue();
                mwsVarM17100o = mws.m17099n(f, Float.valueOf(fFloatValue + fFloatValue), this.f32025o);
                break;
            case 3:
                mwsVarM17100o = mws.m17099n(f32012b, f32014d, this.f32025o);
                break;
            case 5:
                mwsVarM17100o = mws.m17099n(f32011a, this.f32023m, this.f32025o);
                break;
            case 6:
            case 9:
            case 10:
                mwsVarM17100o = mws.m17099n(f32013c, f32015e, f32019i);
                break;
            case 7:
                mwsVarM17100o = mws.m17099n(f32013c, f32017g, f32020j);
                break;
            case 8:
            default:
                mwsVarM17100o = mws.m17099n(f32013c, f32018h, f32021k);
                break;
        }
        return (mxk) Collection$EL.stream(mwsVarM17100o).map(igl.f30782o).collect(muc.f41627b);
    }
}
