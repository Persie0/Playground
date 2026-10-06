package p000;

import android.graphics.PointF;
import com.google.android.apps.camera.app.silentfeedback.p004ip.TVkaNXnfP;
import com.google.android.apps.camera.rectiface.jni.cxx.hsSUWRJfoeC;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class lux {

    /* JADX INFO: renamed from: A */
    private mrm f39337A;

    /* JADX INFO: renamed from: B */
    private mrm f39338B;

    /* JADX INFO: renamed from: a */
    public boolean f39339a = false;

    /* JADX INFO: renamed from: b */
    public lva f39340b;

    /* JADX INFO: renamed from: c */
    public Float f39341c;

    /* JADX INFO: renamed from: d */
    public mrm f39342d;

    /* JADX INFO: renamed from: e */
    public mrm f39343e;

    /* JADX INFO: renamed from: f */
    public mrm f39344f;

    /* JADX INFO: renamed from: g */
    public mrm f39345g;

    /* JADX INFO: renamed from: h */
    public mrm f39346h;

    /* JADX INFO: renamed from: i */
    public byte f39347i;

    /* JADX INFO: renamed from: j */
    private lus f39348j;

    /* JADX INFO: renamed from: k */
    private luy f39349k;

    /* JADX INFO: renamed from: l */
    private mws f39350l;

    /* JADX INFO: renamed from: m */
    private mrm f39351m;

    /* JADX INFO: renamed from: n */
    private mrm f39352n;

    /* JADX INFO: renamed from: o */
    private mrm f39353o;

    /* JADX INFO: renamed from: p */
    private mrm f39354p;

    /* JADX INFO: renamed from: q */
    private mrm f39355q;

    /* JADX INFO: renamed from: r */
    private mrm f39356r;

    /* JADX INFO: renamed from: s */
    private mrm f39357s;

    /* JADX INFO: renamed from: t */
    private mrm f39358t;

    /* JADX INFO: renamed from: u */
    private mrm f39359u;

    /* JADX INFO: renamed from: v */
    private mrm f39360v;

    /* JADX INFO: renamed from: w */
    private mrm f39361w;

    /* JADX INFO: renamed from: x */
    private mrm f39362x;

    /* JADX INFO: renamed from: y */
    private mrm f39363y;

    /* JADX INFO: renamed from: z */
    private mrm f39364z;

    public lux() {
    }

    public lux(byte[] bArr) {
        mqu mquVar = mqu.f41450a;
        this.f39351m = mquVar;
        this.f39352n = mquVar;
        this.f39353o = mquVar;
        this.f39342d = mquVar;
        this.f39354p = mquVar;
        this.f39355q = mquVar;
        this.f39356r = mquVar;
        this.f39343e = mquVar;
        this.f39357s = mquVar;
        this.f39358t = mquVar;
        this.f39359u = mquVar;
        this.f39360v = mquVar;
        this.f39361w = mquVar;
        this.f39362x = mquVar;
        this.f39344f = mquVar;
        this.f39345g = mquVar;
        this.f39346h = mquVar;
        this.f39363y = mquVar;
        this.f39364z = mquVar;
        this.f39337A = mquVar;
        this.f39338B = mquVar;
    }

    /* JADX INFO: renamed from: a */
    public final luz m16064a() {
        int i;
        lku.m15614I(m16067d().floatValue() >= 0.0f && m16067d().floatValue() <= 1.0f, "Confidence must be in range [0, 1].");
        mws mwsVar = this.f39350l;
        if (mwsVar == null) {
            throw new IllegalStateException(hsSUWRJfoeC.meGDLh);
        }
        int i2 = ((mzr) mwsVar).f41859c;
        int i3 = 0;
        while (i3 < i2) {
            meg megVar = (meg) mwsVar.get(i3);
            megVar.getClass();
            lku.m15614I(megVar.f40170a.size() > 2, "At least 3 points are required for a bounding polygon.");
            Iterator it = megVar.iterator();
            while (true) {
                i = i3 + 1;
                if (it.hasNext()) {
                    ((PointF) it.next()).getClass();
                }
            }
            i3 = i;
        }
        if (m16065b() == lus.f39276m || m16065b() == lus.TEXT_DETECTION_BOUNDING_BOX) {
            lku.m15614I(false, "TextImage is required with FULL_RAW_TEXT result.");
        } else {
            lku.m15614I(true, "TextImage should not be set for non-FULL_RAW_TEXT result.");
        }
        if (m16065b() == lus.UNSTRUCTURED_TEXT) {
            lku.m15614I(false, "UnstructuredText is required with UNSTRUCTURED_TEXT result.");
        } else {
            lku.m15614I(true, "UnstructuredText should not be set for non-UNSTRUCTURED_TEXT result.");
        }
        if (this.f39339a) {
            luu luuVarM16035a = luv.m16035a();
            switch (m16065b().ordinal()) {
                case 5:
                    luuVarM16035a.m16033d(m16066c().f39376a);
                    break;
                case 8:
                    luuVarM16035a.m16031b().m17082g(m16066c().f39376a);
                    break;
                case 9:
                    luuVarM16035a.m16032c().m17082g(m16066c().f39376a);
                    break;
                case 10:
                    luuVarM16035a.m16034e(m16066c().f39376a);
                    break;
            }
            m16069f(luuVarM16035a.m16030a());
        }
        if (this.f39347i == 1 && this.f39340b != null && this.f39348j != null && this.f39349k != null && this.f39341c != null && this.f39350l != null) {
            return new luw(this.f39340b, this.f39348j, this.f39349k, this.f39341c, this.f39350l, this.f39351m, this.f39352n, this.f39353o, this.f39342d, this.f39354p, this.f39355q, this.f39356r, this.f39343e, this.f39357s, this.f39358t, this.f39359u, this.f39360v, this.f39361w, this.f39362x, this.f39344f, this.f39345g, this.f39346h, this.f39363y, this.f39364z, this.f39337A, this.f39338B);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f39340b == null) {
            sb.append(" text");
        }
        if (this.f39348j == null) {
            sb.append(" type");
        }
        if (this.f39349k == null) {
            sb.append(" engineType");
        }
        if (this.f39341c == null) {
            sb.append(" confidence");
        }
        if (this.f39350l == null) {
            sb.append(" boundingPolygons");
        }
        if (this.f39347i == 0) {
            sb.append(TVkaNXnfP.EkQAsvJnTONqle);
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* JADX INFO: renamed from: b */
    protected final lus m16065b() {
        lus lusVar = this.f39348j;
        if (lusVar != null) {
            return lusVar;
        }
        throw new IllegalStateException("Property \"type\" has not been set");
    }

    /* JADX INFO: renamed from: c */
    public final lva m16066c() {
        lva lvaVar = this.f39340b;
        if (lvaVar != null) {
            return lvaVar;
        }
        throw new IllegalStateException("Property \"text\" has not been set");
    }

    /* JADX INFO: renamed from: d */
    protected final Float m16067d() {
        Float f = this.f39341c;
        if (f != null) {
            return f;
        }
        throw new IllegalStateException("Property \"confidence\" has not been set");
    }

    /* JADX INFO: renamed from: e */
    public final void m16068e(mws mwsVar) {
        if (mwsVar == null) {
            throw new NullPointerException("Null boundingPolygons");
        }
        this.f39350l = mwsVar;
    }

    /* JADX INFO: renamed from: f */
    public final void m16069f(luv luvVar) {
        this.f39356r = mrm.m16829i(luvVar);
    }

    /* JADX INFO: renamed from: g */
    public final void m16070g(luy luyVar) {
        if (luyVar == null) {
            throw new NullPointerException("Null engineType");
        }
        this.f39349k = luyVar;
    }

    /* JADX INFO: renamed from: h */
    public final void m16071h(lus lusVar) {
        if (lusVar == null) {
            throw new NullPointerException("Null type");
        }
        this.f39348j = lusVar;
    }
}
