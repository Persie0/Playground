package p000;

import android.content.res.AssetManager;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.airbnb.lottie.C0868b;
import com.airbnb.lottie.model.content.TextRangeUnits;
import java.text.Bidi;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class ow9 extends o90 {

    /* JADX INFO: renamed from: C */
    public final StringBuilder f55082C;

    /* JADX INFO: renamed from: D */
    public final StringBuilder f55083D;

    /* JADX INFO: renamed from: E */
    public final StringBuilder f55084E;

    /* JADX INFO: renamed from: F */
    public final StringBuilder f55085F;

    /* JADX INFO: renamed from: G */
    public final RectF f55086G;

    /* JADX INFO: renamed from: H */
    public final Matrix f55087H;

    /* JADX INFO: renamed from: I */
    public final yk4 f55088I;

    /* JADX INFO: renamed from: J */
    public final yk4 f55089J;

    /* JADX INFO: renamed from: K */
    public final HashMap f55090K;

    /* JADX INFO: renamed from: L */
    public final tk5 f55091L;

    /* JADX INFO: renamed from: M */
    public final ArrayList f55092M;

    /* JADX INFO: renamed from: N */
    public final ArrayList f55093N;

    /* JADX INFO: renamed from: O */
    public final ha1 f55094O;

    /* JADX INFO: renamed from: P */
    public final C0868b f55095P;

    /* JADX INFO: renamed from: Q */
    public final gl5 f55096Q;

    /* JADX INFO: renamed from: R */
    public final TextRangeUnits f55097R;

    /* JADX INFO: renamed from: S */
    public final ha1 f55098S;

    /* JADX INFO: renamed from: T */
    public wna f55099T;

    /* JADX INFO: renamed from: U */
    public final ha1 f55100U;

    /* JADX INFO: renamed from: V */
    public wna f55101V;

    /* JADX INFO: renamed from: W */
    public final j73 f55102W;

    /* JADX INFO: renamed from: X */
    public wna f55103X;

    /* JADX INFO: renamed from: Y */
    public final j73 f55104Y;

    /* JADX INFO: renamed from: Z */
    public wna f55105Z;

    /* JADX INFO: renamed from: a0 */
    public final ha1 f55106a0;

    /* JADX INFO: renamed from: b0 */
    public wna f55107b0;

    /* JADX INFO: renamed from: c0 */
    public wna f55108c0;

    /* JADX INFO: renamed from: d0 */
    public final ha1 f55109d0;

    /* JADX INFO: renamed from: e0 */
    public final ha1 f55110e0;

    /* JADX INFO: renamed from: f0 */
    public final ha1 f55111f0;

    public ow9(C0868b c0868b, tp4 tp4Var) {
        C3329mb c3329mb;
        C3329mb c3329mb2;
        C3726wl c3726wl;
        C3329mb c3329mb3;
        C3726wl c3726wl2;
        C3329mb c3329mb4;
        C3726wl c3726wl3;
        ca1 ca1Var;
        C3726wl c3726wl4;
        ca1 ca1Var2;
        C3763xl c3763xl;
        ca1 ca1Var3;
        C3763xl c3763xl2;
        ca1 ca1Var4;
        C3726wl c3726wl5;
        ca1 ca1Var5;
        C3726wl c3726wl6;
        super(c0868b, tp4Var);
        this.f55082C = new StringBuilder(2);
        this.f55083D = new StringBuilder(0);
        this.f55084E = new StringBuilder(0);
        this.f55085F = new StringBuilder(0);
        this.f55086G = new RectF();
        this.f55087H = new Matrix();
        yk4 yk4Var = new yk4(1, 1);
        yk4Var.setStyle(Paint.Style.FILL);
        this.f55088I = yk4Var;
        yk4 yk4Var2 = new yk4(1, 2);
        yk4Var2.setStyle(Paint.Style.STROKE);
        this.f55089J = yk4Var2;
        this.f55090K = new HashMap();
        this.f55091L = new tk5((Object) null);
        this.f55092M = new ArrayList();
        this.f55093N = new ArrayList();
        this.f55097R = TextRangeUnits.INDEX;
        this.f55095P = c0868b;
        this.f55096Q = tp4Var.f62672b;
        ha1 ha1Var = new ha1(2, (List) tp4Var.f62687q.f57375b);
        this.f55094O = ha1Var;
        ha1Var.m16687a(this);
        m17863e(ha1Var);
        C3156jq c3156jq = tp4Var.f62688r;
        if (c3156jq != null && (ca1Var5 = (ca1) c3156jq.f45990a) != null && (c3726wl6 = (C3726wl) ca1Var5.f9781a) != null) {
            m90 m90VarMo550a = c3726wl6.mo550a();
            this.f55098S = (ha1) m90VarMo550a;
            m90VarMo550a.m16687a(this);
            m17863e(m90VarMo550a);
        }
        if (c3156jq != null && (ca1Var4 = (ca1) c3156jq.f45990a) != null && (c3726wl5 = (C3726wl) ca1Var4.f9782b) != null) {
            m90 m90VarMo550a2 = c3726wl5.mo550a();
            this.f55100U = (ha1) m90VarMo550a2;
            m90VarMo550a2.m16687a(this);
            m17863e(m90VarMo550a2);
        }
        if (c3156jq != null && (ca1Var3 = (ca1) c3156jq.f45990a) != null && (c3763xl2 = (C3763xl) ca1Var3.f9783c) != null) {
            j73 j73VarMo550a = c3763xl2.mo550a();
            this.f55102W = j73VarMo550a;
            j73VarMo550a.m16687a(this);
            m17863e(j73VarMo550a);
        }
        if (c3156jq != null && (ca1Var2 = (ca1) c3156jq.f45990a) != null && (c3763xl = (C3763xl) ca1Var2.f9784d) != null) {
            j73 j73VarMo550a2 = c3763xl.mo550a();
            this.f55104Y = j73VarMo550a2;
            j73VarMo550a2.m16687a(this);
            m17863e(j73VarMo550a2);
        }
        if (c3156jq != null && (ca1Var = (ca1) c3156jq.f45990a) != null && (c3726wl4 = (C3726wl) ca1Var.f9785e) != null) {
            m90 m90VarMo550a3 = c3726wl4.mo550a();
            this.f55106a0 = (ha1) m90VarMo550a3;
            m90VarMo550a3.m16687a(this);
            m17863e(m90VarMo550a3);
        }
        if (c3156jq != null && (c3329mb4 = (C3329mb) c3156jq.f45991b) != null && (c3726wl3 = (C3726wl) c3329mb4.f50860b) != null) {
            m90 m90VarMo550a4 = c3726wl3.mo550a();
            this.f55109d0 = (ha1) m90VarMo550a4;
            m90VarMo550a4.m16687a(this);
            m17863e(m90VarMo550a4);
        }
        if (c3156jq != null && (c3329mb3 = (C3329mb) c3156jq.f45991b) != null && (c3726wl2 = (C3726wl) c3329mb3.f50861c) != null) {
            m90 m90VarMo550a5 = c3726wl2.mo550a();
            this.f55110e0 = (ha1) m90VarMo550a5;
            m90VarMo550a5.m16687a(this);
            m17863e(m90VarMo550a5);
        }
        if (c3156jq != null && (c3329mb2 = (C3329mb) c3156jq.f45991b) != null && (c3726wl = (C3726wl) c3329mb2.f50862d) != null) {
            m90 m90VarMo550a6 = c3726wl.mo550a();
            this.f55111f0 = (ha1) m90VarMo550a6;
            m90VarMo550a6.m16687a(this);
            m17863e(m90VarMo550a6);
        }
        if (c3156jq == null || (c3329mb = (C3329mb) c3156jq.f45991b) == null) {
            return;
        }
        this.f55097R = (TextRangeUnits) c3329mb.f50863e;
    }

    /* JADX INFO: renamed from: t */
    public static void m18536t(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    /* JADX INFO: renamed from: u */
    public static void m18537u(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // p000.o90, p000.am2
    /* JADX INFO: renamed from: d */
    public final void mo555d(RectF rectF, Matrix matrix, boolean z) {
        super.mo555d(rectF, matrix, z);
        gl5 gl5Var = this.f55096Q;
        rectF.set(0.0f, 0.0f, gl5Var.f40967k.width(), gl5Var.f40967k.height());
    }

    @Override // p000.o90, p000.ni4
    /* JADX INFO: renamed from: f */
    public final void mo9830f(p33 p33Var, Object obj) {
        super.mo9830f(p33Var, obj);
        PointF pointF = yl5.f70005a;
        if (obj == 1) {
            wna wnaVar = this.f55099T;
            if (wnaVar != null) {
                m17867n(wnaVar);
            }
            wna wnaVar2 = new wna(p33Var, null);
            this.f55099T = wnaVar2;
            wnaVar2.m16687a(this);
            m17863e(this.f55099T);
            return;
        }
        if (obj == 2) {
            wna wnaVar3 = this.f55101V;
            if (wnaVar3 != null) {
                m17867n(wnaVar3);
            }
            wna wnaVar4 = new wna(p33Var, null);
            this.f55101V = wnaVar4;
            wnaVar4.m16687a(this);
            m17863e(this.f55101V);
            return;
        }
        if (obj == yl5.f70021q) {
            wna wnaVar5 = this.f55103X;
            if (wnaVar5 != null) {
                m17867n(wnaVar5);
            }
            wna wnaVar6 = new wna(p33Var, null);
            this.f55103X = wnaVar6;
            wnaVar6.m16687a(this);
            m17863e(this.f55103X);
            return;
        }
        if (obj == yl5.f70022r) {
            wna wnaVar7 = this.f55105Z;
            if (wnaVar7 != null) {
                m17867n(wnaVar7);
            }
            wna wnaVar8 = new wna(p33Var, null);
            this.f55105Z = wnaVar8;
            wnaVar8.m16687a(this);
            m17863e(this.f55105Z);
            return;
        }
        if (obj == yl5.f69994D) {
            wna wnaVar9 = this.f55107b0;
            if (wnaVar9 != null) {
                m17867n(wnaVar9);
            }
            wna wnaVar10 = new wna(p33Var, null);
            this.f55107b0 = wnaVar10;
            wnaVar10.m16687a(this);
            m17863e(this.f55107b0);
            return;
        }
        if (obj != yl5.f70001K) {
            if (obj == yl5.f70003M) {
                ha1 ha1Var = this.f55094O;
                ha1Var.getClass();
                ha1Var.m16695k(new iw9(new vl5(), p33Var, new pi2()));
                return;
            }
            return;
        }
        wna wnaVar11 = this.f55108c0;
        if (wnaVar11 != null) {
            m17867n(wnaVar11);
        }
        wna wnaVar12 = new wna(p33Var, null);
        this.f55108c0 = wnaVar12;
        wnaVar12.m16687a(this);
        m17863e(this.f55108c0);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x035a  */
    /* JADX WARN: Code duplicated, block: B:104:0x0362  */
    /* JADX WARN: Code duplicated, block: B:122:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:124:0x03ef  */
    /* JADX WARN: Code duplicated, block: B:125:0x03f1  */
    /* JADX WARN: Code duplicated, block: B:129:0x0404  */
    /* JADX WARN: Code duplicated, block: B:131:0x041d  */
    /* JADX WARN: Code duplicated, block: B:133:0x0434  */
    /* JADX WARN: Code duplicated, block: B:135:0x0449 A[LOOP:7: B:134:0x0447->B:135:0x0449, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:138:0x046b  */
    /* JADX WARN: Code duplicated, block: B:140:0x0489  */
    /* JADX WARN: Code duplicated, block: B:141:0x048f  */
    /* JADX WARN: Code duplicated, block: B:144:0x049d A[LOOP:9: B:142:0x0497->B:144:0x049d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:148:0x04c0  */
    /* JADX WARN: Code duplicated, block: B:152:0x04d2 A[LOOP:10: B:150:0x04cc->B:152:0x04d2, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:156:0x04e6  */
    /* JADX WARN: Code duplicated, block: B:159:0x04fd  */
    /* JADX WARN: Code duplicated, block: B:162:0x050a  */
    /* JADX WARN: Code duplicated, block: B:165:0x0520 A[LOOP:13: B:160:0x0504->B:165:0x0520, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:168:0x0538  */
    /* JADX WARN: Code duplicated, block: B:169:0x053f  */
    /* JADX WARN: Code duplicated, block: B:172:0x0559  */
    /* JADX WARN: Code duplicated, block: B:197:0x0526 A[EDGE_INSN: B:197:0x0526->B:166:0x0526 BREAK  A[LOOP:12: B:157:0x04f7->B:164:0x0517], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:22:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:24:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:25:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:29:0x0106  */
    /* JADX WARN: Code duplicated, block: B:31:0x0119  */
    /* JADX WARN: Code duplicated, block: B:34:0x0125  */
    /* JADX WARN: Code duplicated, block: B:36:0x0141  */
    /* JADX WARN: Code duplicated, block: B:37:0x0153  */
    /* JADX WARN: Code duplicated, block: B:39:0x015e  */
    /* JADX WARN: Code duplicated, block: B:40:0x016f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0186 A[LOOP:4: B:41:0x0184->B:42:0x0186, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:47:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:49:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:50:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:55:0x024f  */
    /* JADX WARN: Code duplicated, block: B:78:0x02dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:82:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:83:0x02fa  */
    /* JADX WARN: Code duplicated, block: B:85:0x0306  */
    /* JADX WARN: Code duplicated, block: B:86:0x030b  */
    /* JADX WARN: Code duplicated, block: B:88:0x030f  */
    /* JADX WARN: Code duplicated, block: B:89:0x0313  */
    /* JADX WARN: Code duplicated, block: B:94:0x0348 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x034a  */
    /* JADX WARN: Code duplicated, block: B:96:0x034d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x034f  */
    /* JADX WARN: Code duplicated, block: B:98:0x0352  */
    /* JADX WARN: Instruction removed from duplicated block: B:89:0x0313, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.o90
    /* JADX INFO: renamed from: j */
    public final void mo10091j(Canvas canvas, Matrix matrix, int i, qm2 qm2Var) {
        int i2;
        ca1 ca1VarM5006k;
        Typeface typefaceCreateFromAsset;
        mp2 mp2Var;
        HashMap map;
        Typeface typeface;
        HashMap map2;
        Typeface typeface2;
        Typeface typeface3;
        boolean zContains;
        boolean zContains2;
        int i3;
        float fFloatValue;
        float fM11957c;
        List listAsList;
        int size;
        int i4;
        int length;
        int i5;
        PointF pointF;
        float f;
        float f2;
        int i6;
        List listM18543y;
        int i7;
        nw9 nw9Var;
        int i8;
        String string;
        ArrayList arrayList;
        int length2;
        int i9;
        StringBuilder sb;
        int i10;
        String string2;
        String str;
        int i11;
        ArrayList arrayList2;
        Bidi bidi;
        int runCount;
        byte[] bArr;
        Integer[] numArr;
        int i12;
        StringBuilder sb2;
        int i13;
        int runLevel;
        String strSubstring;
        StringBuilder sb3;
        int length3;
        Canvas canvas2;
        float fFloatValue2;
        float f3;
        int i14;
        int i15;
        PointF pointF2;
        float f4;
        float f5;
        List listM18543y2;
        int i16;
        nw9 nw9Var2;
        String str2;
        int i17;
        float f6;
        gl5 gl5Var;
        sa3 sa3Var;
        HashMap map3;
        ArrayList arrayList3;
        int size2;
        ArrayList arrayList4;
        int i18;
        List list;
        int i19;
        yk4 yk4Var;
        yk4 yk4Var2;
        Path pathMo9831g;
        yk4 yk4Var3;
        yk4 yk4Var4;
        pi2 pi2Var = (pi2) this.f55094O.mo16692f();
        gl5 gl5Var2 = this.f55096Q;
        qa3 qa3Var = (qa3) gl5Var2.f40962f.get(pi2Var.f56230b);
        if (qa3Var == null) {
            return;
        }
        String str3 = qa3Var.f57490c;
        String str4 = qa3Var.f57488a;
        canvas.save();
        canvas.concat(matrix);
        m18539s(pi2Var, i, 0);
        C0868b c0868b = this.f55095P;
        Map map4 = c0868b.f10640k;
        String str5 = "\n";
        j73 j73Var = this.f55104Y;
        int i20 = 0;
        yk4 yk4Var5 = this.f55088I;
        yk4 yk4Var6 = this.f55089J;
        if (map4 == null) {
            i2 = 2;
            if (c0868b.f10620a.f40964h.m19081e() > 0) {
                wna wnaVar = this.f55107b0;
                float fFloatValue3 = wnaVar != null ? ((Float) wnaVar.mo16692f()).floatValue() : pi2Var.f56231c;
                float f7 = 0.0f;
                float[] fArr = (float[]) fna.f39351e.get();
                fArr[0] = 0.0f;
                fArr[1] = 0.0f;
                float f8 = fna.f39352f;
                fArr[2] = f8;
                fArr[3] = f8;
                float f9 = fFloatValue3 / 100.0f;
                matrix.mapPoints(fArr);
                yk4 yk4Var7 = yk4Var5;
                C0868b c0868b2 = c0868b;
                gl5 gl5Var3 = gl5Var2;
                String str6 = str3;
                Math.hypot(fArr[2] - fArr[0], fArr[3] - fArr[1]);
                List listAsList2 = Arrays.asList(pi2Var.f56229a.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll("\n", "\r").split("\r"));
                int size3 = listAsList2.size();
                float f10 = pi2Var.f56233e / 10.0f;
                wna wnaVar2 = this.f55105Z;
                if (wnaVar2 != null) {
                    fFloatValue2 = ((Float) wnaVar2.mo16692f()).floatValue();
                } else {
                    if (j73Var != null) {
                        fFloatValue2 = ((Float) j73Var.mo16692f()).floatValue();
                    }
                    f3 = f10;
                    i14 = 0;
                    i15 = -1;
                    while (i14 < size3) {
                        String str7 = (String) listAsList2.get(i14);
                        pointF2 = pi2Var.f56241m;
                        if (pointF2 == null) {
                            f4 = f7;
                        } else {
                            f4 = pointF2.x;
                        }
                        f5 = f9;
                        i16 = i20;
                        for (listM18543y2 = m18543y(str7, f4, qa3Var, f5, f3, true); i16 < listM18543y2.size(); listM18543y2 = listM18543y2) {
                            nw9Var2 = (nw9) listM18543y2.get(i16);
                            i15++;
                            canvas.save();
                            if (m18542x(canvas, pi2Var, i15, nw9Var2.f53335b)) {
                                str2 = nw9Var2.f53334a;
                                i17 = i20;
                                while (i17 < str2.length()) {
                                    List list2 = listAsList2;
                                    String str8 = str6;
                                    int i21 = i16;
                                    f6 = f3;
                                    gl5Var = gl5Var3;
                                    sa3Var = (sa3) gl5Var.f40964h.m19078b(sa3.m21187a(str2.charAt(i17), str4, str8));
                                    if (sa3Var == null) {
                                        gl5Var3 = gl5Var;
                                        str2 = str2;
                                        size3 = size3;
                                        i14 = i14;
                                        i17 = i17;
                                        yk4Var = yk4Var6;
                                        c0868b2 = c0868b2;
                                        yk4Var2 = yk4Var7;
                                    } else {
                                        m18539s(pi2Var, i, i17);
                                        map3 = this.f55090K;
                                        if (map3.containsKey(sa3Var)) {
                                            list = (List) map3.get(sa3Var);
                                        } else {
                                            arrayList3 = sa3Var.f60579a;
                                            size2 = arrayList3.size();
                                            arrayList4 = new ArrayList(size2);
                                            i18 = i20;
                                            while (i18 < size2) {
                                                arrayList4.add(new uk1(c0868b2, this, (z39) arrayList3.get(i18), gl5Var));
                                                size2 = size2;
                                                i18++;
                                                arrayList3 = arrayList3;
                                            }
                                            map3.put(sa3Var, arrayList4);
                                            list = arrayList4;
                                        }
                                        i19 = i20;
                                        while (i19 < list.size()) {
                                            pathMo9831g = ((uk1) list.get(i19)).mo9831g();
                                            gl5 gl5Var4 = gl5Var;
                                            pathMo9831g.computeBounds(this.f55086G, i20);
                                            Matrix matrix2 = this.f55087H;
                                            matrix2.reset();
                                            List list3 = list;
                                            matrix2.preTranslate(f7, (-pi2Var.f56235g) * fna.m11957c());
                                            matrix2.preScale(f5, f5);
                                            pathMo9831g.transform(matrix2);
                                            if (pi2Var.f56239k) {
                                                yk4Var4 = yk4Var7;
                                                m18537u(pathMo9831g, yk4Var4, canvas);
                                                yk4Var3 = yk4Var6;
                                                m18537u(pathMo9831g, yk4Var3, canvas);
                                            } else {
                                                yk4Var3 = yk4Var6;
                                                yk4Var4 = yk4Var7;
                                                m18537u(pathMo9831g, yk4Var3, canvas);
                                                m18537u(pathMo9831g, yk4Var4, canvas);
                                            }
                                            i19++;
                                            yk4Var6 = yk4Var3;
                                            yk4Var7 = yk4Var4;
                                            list = list3;
                                            gl5Var = gl5Var4;
                                            i20 = 0;
                                            f7 = 0.0f;
                                        }
                                        gl5Var3 = gl5Var;
                                        yk4Var = yk4Var6;
                                        yk4Var2 = yk4Var7;
                                        canvas.translate((fna.m11957c() * ((float) sa3Var.f60581c) * f5) + f6, 0.0f);
                                    }
                                    f3 = f6;
                                    yk4Var6 = yk4Var;
                                    str6 = str8;
                                    yk4Var7 = yk4Var2;
                                    c0868b2 = c0868b2;
                                    i16 = i21;
                                    listAsList2 = list2;
                                    str2 = str2;
                                    i14 = i14;
                                    size3 = size3;
                                    i20 = 0;
                                    f7 = 0.0f;
                                    i17++;
                                }
                            }
                            int i22 = i16;
                            float f11 = f3;
                            List list4 = listAsList2;
                            int i23 = size3;
                            int i24 = i14;
                            yk4 yk4Var8 = yk4Var6;
                            C0868b c0868b3 = c0868b2;
                            yk4 yk4Var9 = yk4Var7;
                            String str9 = str6;
                            canvas.restore();
                            f3 = f11;
                            yk4Var6 = yk4Var8;
                            str6 = str9;
                            yk4Var7 = yk4Var9;
                            c0868b2 = c0868b3;
                            listAsList2 = list4;
                            i14 = i24;
                            size3 = i23;
                            i20 = 0;
                            f7 = 0.0f;
                            i16 = i22 + 1;
                        }
                        f9 = f5;
                        listAsList2 = listAsList2;
                        i20 = 0;
                        f7 = 0.0f;
                        i14++;
                    }
                    canvas2 = canvas;
                }
                f10 += fFloatValue2;
                f3 = f10;
                i14 = 0;
                i15 = -1;
                while (i14 < size3) {
                    String str10 = (String) listAsList2.get(i14);
                    pointF2 = pi2Var.f56241m;
                    if (pointF2 == null) {
                        f4 = f7;
                    } else {
                        f4 = pointF2.x;
                    }
                    f5 = f9;
                    i16 = i20;
                    while (i16 < listM18543y2.size()) {
                        nw9Var2 = (nw9) listM18543y2.get(i16);
                        i15++;
                        canvas.save();
                        if (m18542x(canvas, pi2Var, i15, nw9Var2.f53335b)) {
                            str2 = nw9Var2.f53334a;
                            i17 = i20;
                            while (i17 < str2.length()) {
                                List list5 = listAsList2;
                                String str11 = str6;
                                int i25 = i16;
                                f6 = f3;
                                gl5Var = gl5Var3;
                                sa3Var = (sa3) gl5Var.f40964h.m19078b(sa3.m21187a(str2.charAt(i17), str4, str11));
                                if (sa3Var == null) {
                                    gl5Var3 = gl5Var;
                                    str2 = str2;
                                    size3 = size3;
                                    i14 = i14;
                                    i17 = i17;
                                    yk4Var = yk4Var6;
                                    c0868b2 = c0868b2;
                                    yk4Var2 = yk4Var7;
                                } else {
                                    m18539s(pi2Var, i, i17);
                                    map3 = this.f55090K;
                                    if (map3.containsKey(sa3Var)) {
                                        list = (List) map3.get(sa3Var);
                                    } else {
                                        arrayList3 = sa3Var.f60579a;
                                        size2 = arrayList3.size();
                                        arrayList4 = new ArrayList(size2);
                                        i18 = i20;
                                        while (i18 < size2) {
                                            arrayList4.add(new uk1(c0868b2, this, (z39) arrayList3.get(i18), gl5Var));
                                            size2 = size2;
                                            i18++;
                                            arrayList3 = arrayList3;
                                        }
                                        map3.put(sa3Var, arrayList4);
                                        list = arrayList4;
                                    }
                                    i19 = i20;
                                    while (i19 < list.size()) {
                                        pathMo9831g = ((uk1) list.get(i19)).mo9831g();
                                        gl5 gl5Var5 = gl5Var;
                                        pathMo9831g.computeBounds(this.f55086G, i20);
                                        Matrix matrix3 = this.f55087H;
                                        matrix3.reset();
                                        List list6 = list;
                                        matrix3.preTranslate(f7, (-pi2Var.f56235g) * fna.m11957c());
                                        matrix3.preScale(f5, f5);
                                        pathMo9831g.transform(matrix3);
                                        if (pi2Var.f56239k) {
                                            yk4Var4 = yk4Var7;
                                            m18537u(pathMo9831g, yk4Var4, canvas);
                                            yk4Var3 = yk4Var6;
                                            m18537u(pathMo9831g, yk4Var3, canvas);
                                        } else {
                                            yk4Var3 = yk4Var6;
                                            yk4Var4 = yk4Var7;
                                            m18537u(pathMo9831g, yk4Var3, canvas);
                                            m18537u(pathMo9831g, yk4Var4, canvas);
                                        }
                                        i19++;
                                        yk4Var6 = yk4Var3;
                                        yk4Var7 = yk4Var4;
                                        list = list6;
                                        gl5Var = gl5Var5;
                                        i20 = 0;
                                        f7 = 0.0f;
                                    }
                                    gl5Var3 = gl5Var;
                                    yk4Var = yk4Var6;
                                    yk4Var2 = yk4Var7;
                                    canvas.translate((fna.m11957c() * ((float) sa3Var.f60581c) * f5) + f6, 0.0f);
                                }
                                f3 = f6;
                                yk4Var6 = yk4Var;
                                str6 = str11;
                                yk4Var7 = yk4Var2;
                                c0868b2 = c0868b2;
                                i16 = i25;
                                listAsList2 = list5;
                                str2 = str2;
                                i14 = i14;
                                size3 = size3;
                                i20 = 0;
                                f7 = 0.0f;
                                i17++;
                            }
                        }
                        int i26 = i16;
                        float f12 = f3;
                        List list7 = listAsList2;
                        int i27 = size3;
                        int i28 = i14;
                        yk4 yk4Var10 = yk4Var6;
                        C0868b c0868b4 = c0868b2;
                        yk4 yk4Var11 = yk4Var7;
                        String str12 = str6;
                        canvas.restore();
                        f3 = f12;
                        yk4Var6 = yk4Var10;
                        str6 = str12;
                        yk4Var7 = yk4Var11;
                        c0868b2 = c0868b4;
                        listAsList2 = list7;
                        i14 = i28;
                        size3 = i27;
                        i20 = 0;
                        f7 = 0.0f;
                        i16 = i26 + 1;
                    }
                    f9 = f5;
                    listAsList2 = listAsList2;
                    i20 = 0;
                    f7 = 0.0f;
                    i14++;
                }
                canvas2 = canvas;
            }
            canvas2.restore();
        }
        i2 = 2;
        wna wnaVar3 = this.f55108c0;
        if (wnaVar3 == null || (typefaceCreateFromAsset = (Typeface) wnaVar3.mo16692f()) == null) {
            Map map5 = c0868b.f10640k;
            if (map5 == null) {
                ca1VarM5006k = c0868b.m5006k();
                if (ca1VarM5006k != null) {
                    mp2Var = (mp2) ca1VarM5006k.f9781a;
                    mp2Var.f51686b = str4;
                    mp2Var.f51687c = str3;
                    map = (HashMap) ca1VarM5006k.f9782b;
                    typeface = (Typeface) map.get(mp2Var);
                    if (typeface != null) {
                        typefaceCreateFromAsset = typeface;
                        str5 = "\n";
                    } else {
                        map2 = (HashMap) ca1VarM5006k.f9783c;
                        typeface2 = (Typeface) map2.get(str4);
                        if (typeface2 != null) {
                            typefaceCreateFromAsset = typeface2;
                        } else {
                            typeface3 = qa3Var.f57491d;
                            if (typeface3 != null) {
                                typefaceCreateFromAsset = typeface3;
                            } else {
                                typefaceCreateFromAsset = Typeface.createFromAsset((AssetManager) ca1VarM5006k.f9784d, "fonts/" + str4 + ((String) ca1VarM5006k.f9785e));
                                map2.put(str4, typefaceCreateFromAsset);
                            }
                        }
                        zContains = str3.contains("Italic");
                        zContains2 = str3.contains("Bold");
                        if (!zContains && zContains2) {
                            i3 = 3;
                        } else if (zContains) {
                            i3 = i2;
                        } else if (zContains2) {
                            i3 = 1;
                        } else {
                            i3 = 0;
                        }
                        if (typefaceCreateFromAsset.getStyle() != i3) {
                            typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i3);
                        }
                        map.put(mp2Var, typefaceCreateFromAsset);
                    }
                } else {
                    str5 = "\n";
                    typefaceCreateFromAsset = null;
                }
            } else {
                if (map5.containsKey(str4)) {
                    typefaceCreateFromAsset = (Typeface) map5.get(str4);
                } else {
                    String str13 = qa3Var.f57489b;
                    if (map5.containsKey(str13)) {
                        typefaceCreateFromAsset = (Typeface) map5.get(str13);
                    } else {
                        String strM17735j = AbstractC3393o1.m17735j(str4, "-", str3);
                        if (map5.containsKey(strM17735j)) {
                            typefaceCreateFromAsset = (Typeface) map5.get(strM17735j);
                        } else {
                            ca1VarM5006k = c0868b.m5006k();
                            if (ca1VarM5006k != null) {
                                mp2Var = (mp2) ca1VarM5006k.f9781a;
                                mp2Var.f51686b = str4;
                                mp2Var.f51687c = str3;
                                map = (HashMap) ca1VarM5006k.f9782b;
                                typeface = (Typeface) map.get(mp2Var);
                                if (typeface != null) {
                                    typefaceCreateFromAsset = typeface;
                                } else {
                                    map2 = (HashMap) ca1VarM5006k.f9783c;
                                    typeface2 = (Typeface) map2.get(str4);
                                    if (typeface2 != null) {
                                        typefaceCreateFromAsset = typeface2;
                                    } else {
                                        typeface3 = qa3Var.f57491d;
                                        if (typeface3 != null) {
                                            typefaceCreateFromAsset = typeface3;
                                        } else {
                                            typefaceCreateFromAsset = Typeface.createFromAsset((AssetManager) ca1VarM5006k.f9784d, "fonts/" + str4 + ((String) ca1VarM5006k.f9785e));
                                            map2.put(str4, typefaceCreateFromAsset);
                                        }
                                    }
                                    zContains = str3.contains("Italic");
                                    zContains2 = str3.contains("Bold");
                                    if (!zContains) {
                                        if (zContains) {
                                            i3 = i2;
                                        } else if (zContains2) {
                                            i3 = 1;
                                        } else {
                                            i3 = 0;
                                        }
                                    } else if (zContains) {
                                        i3 = i2;
                                    } else if (zContains2) {
                                        i3 = 1;
                                    } else {
                                        i3 = 0;
                                    }
                                    if (typefaceCreateFromAsset.getStyle() != i3) {
                                        typefaceCreateFromAsset = Typeface.create(typefaceCreateFromAsset, i3);
                                    }
                                    map.put(mp2Var, typefaceCreateFromAsset);
                                }
                            } else {
                                str5 = "\n";
                                typefaceCreateFromAsset = null;
                            }
                        }
                    }
                }
                str5 = "\n";
            }
            if (typefaceCreateFromAsset == null) {
                typefaceCreateFromAsset = qa3Var.f57491d;
            }
        } else {
            str5 = "\n";
        }
        if (typefaceCreateFromAsset != null) {
            String str14 = pi2Var.f56229a;
            yk4Var5.setTypeface(typefaceCreateFromAsset);
            wna wnaVar4 = this.f55107b0;
            float fFloatValue4 = wnaVar4 != null ? ((Float) wnaVar4.mo16692f()).floatValue() : pi2Var.f56231c;
            yk4Var5.setTextSize(fna.m11957c() * fFloatValue4);
            yk4Var6.setTypeface(yk4Var5.getTypeface());
            yk4Var6.setTextSize(yk4Var5.getTextSize());
            float f13 = pi2Var.f56233e / 10.0f;
            wna wnaVar5 = this.f55105Z;
            if (wnaVar5 != null) {
                fFloatValue = ((Float) wnaVar5.mo16692f()).floatValue();
            } else {
                if (j73Var != null) {
                    fFloatValue = ((Float) j73Var.mo16692f()).floatValue();
                }
                fM11957c = ((fna.m11957c() * f13) * fFloatValue4) / 100.0f;
                listAsList = Arrays.asList(str14.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(str5, "\r").split("\r"));
                size = listAsList.size();
                i4 = 0;
                length = 0;
                i5 = -1;
                while (i4 < size) {
                    String str15 = (String) listAsList.get(i4);
                    pointF = pi2Var.f56241m;
                    if (pointF == null) {
                        f = 0.0f;
                    } else {
                        f = pointF.x;
                    }
                    f2 = fM11957c;
                    i6 = i2;
                    i7 = 0;
                    for (listM18543y = m18543y(str15, f, qa3Var, 0.0f, f2, false); i7 < listM18543y.size(); listM18543y = listM18543y) {
                        nw9Var = (nw9) listM18543y.get(i7);
                        i5++;
                        canvas.save();
                        if (m18542x(canvas, pi2Var, i5, yk4Var5.measureText(nw9Var.f53334a))) {
                            string = nw9Var.f53334a;
                            if (Bidi.requiresBidi(string.toCharArray(), 0, string.length())) {
                                bidi = new Bidi(string, -2);
                                runCount = bidi.getRunCount();
                                bArr = new byte[runCount];
                                numArr = new Integer[runCount];
                                i12 = 0;
                                while (i12 < runCount) {
                                    bArr[i12] = (byte) bidi.getRunLevel(i12);
                                    numArr[i12] = Integer.valueOf(i12);
                                    i12++;
                                    size = size;
                                }
                                i8 = size;
                                Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
                                sb2 = this.f55084E;
                                sb2.setLength(0);
                                i13 = 0;
                                while (i13 < runCount) {
                                    int iIntValue = numArr[i13].intValue();
                                    int i29 = runCount;
                                    int runStart = bidi.getRunStart(iIntValue);
                                    Integer[] numArr2 = numArr;
                                    int runLimit = bidi.getRunLimit(iIntValue);
                                    runLevel = bidi.getRunLevel(iIntValue);
                                    strSubstring = string.substring(runStart, runLimit);
                                    if ((runLevel & 1) == 0) {
                                        sb2.append(strSubstring);
                                    } else {
                                        sb3 = this.f55085F;
                                        length3 = 0;
                                        sb3.setLength(0);
                                        while (length3 < strSubstring.length()) {
                                            String strM18538r = m18538r(length3, strSubstring);
                                            sb3.insert(0, strM18538r);
                                            length3 += strM18538r.length();
                                            strSubstring = strSubstring;
                                        }
                                        sb2.append((CharSequence) sb3);
                                    }
                                    i13++;
                                    runCount = i29;
                                    numArr = numArr2;
                                    bidi = bidi;
                                }
                                string = sb2.toString();
                            } else {
                                i8 = size;
                            }
                            arrayList = this.f55092M;
                            arrayList.clear();
                            length2 = 0;
                            while (length2 < string.length()) {
                                String strM18538r2 = m18538r(length2, string);
                                arrayList.add(strM18538r2);
                                length2 += strM18538r2.length();
                            }
                            i9 = 0;
                            while (i9 < arrayList.size()) {
                                sb = this.f55083D;
                                sb.setLength(0);
                                sb.append((String) arrayList.get(i9));
                                i10 = i9 + 1;
                                while (i10 < arrayList.size()) {
                                    str = (String) arrayList.get(i10);
                                    i11 = 0;
                                    while (true) {
                                        if (i11 < str.length()) {
                                            break;
                                        }
                                        arrayList2 = arrayList;
                                        if (Character.getDirectionality(str.codePointAt(i11)) == 2) {
                                            break;
                                        }
                                        i11++;
                                        arrayList = arrayList2;
                                    }
                                    sb.insert(0, str);
                                    i10++;
                                    arrayList = arrayList2;
                                }
                                ArrayList arrayList5 = arrayList;
                                string2 = sb.toString();
                                m18539s(pi2Var, i, i9 + length);
                                if (pi2Var.f56239k) {
                                    m18536t(string2, yk4Var5, canvas);
                                    m18536t(string2, yk4Var6, canvas);
                                } else {
                                    m18536t(string2, yk4Var6, canvas);
                                    m18536t(string2, yk4Var5, canvas);
                                }
                                canvas.translate(yk4Var5.measureText(string2) + f2, 0.0f);
                                i9 = i10;
                                arrayList = arrayList5;
                            }
                        } else {
                            f2 = f2;
                            listAsList = listAsList;
                            i8 = size;
                        }
                        length += nw9Var.f53334a.length();
                        canvas.restore();
                        i7++;
                        qa3Var = qa3Var;
                        i6 = 2;
                        f2 = f2;
                        listAsList = listAsList;
                        size = i8;
                    }
                    i4++;
                    qa3Var = qa3Var;
                    i2 = i6;
                    fM11957c = f2;
                    size = size;
                }
            }
            f13 += fFloatValue;
            fM11957c = ((fna.m11957c() * f13) * fFloatValue4) / 100.0f;
            listAsList = Arrays.asList(str14.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(str5, "\r").split("\r"));
            size = listAsList.size();
            i4 = 0;
            length = 0;
            i5 = -1;
            while (i4 < size) {
                String str16 = (String) listAsList.get(i4);
                pointF = pi2Var.f56241m;
                if (pointF == null) {
                    f = 0.0f;
                } else {
                    f = pointF.x;
                }
                f2 = fM11957c;
                i6 = i2;
                i7 = 0;
                while (i7 < listM18543y.size()) {
                    nw9Var = (nw9) listM18543y.get(i7);
                    i5++;
                    canvas.save();
                    if (m18542x(canvas, pi2Var, i5, yk4Var5.measureText(nw9Var.f53334a))) {
                        string = nw9Var.f53334a;
                        if (Bidi.requiresBidi(string.toCharArray(), 0, string.length())) {
                            bidi = new Bidi(string, -2);
                            runCount = bidi.getRunCount();
                            bArr = new byte[runCount];
                            numArr = new Integer[runCount];
                            i12 = 0;
                            while (i12 < runCount) {
                                bArr[i12] = (byte) bidi.getRunLevel(i12);
                                numArr[i12] = Integer.valueOf(i12);
                                i12++;
                                size = size;
                            }
                            i8 = size;
                            Bidi.reorderVisually(bArr, 0, numArr, 0, runCount);
                            sb2 = this.f55084E;
                            sb2.setLength(0);
                            i13 = 0;
                            while (i13 < runCount) {
                                int iIntValue2 = numArr[i13].intValue();
                                int i210 = runCount;
                                int runStart2 = bidi.getRunStart(iIntValue2);
                                Integer[] numArr3 = numArr;
                                int runLimit2 = bidi.getRunLimit(iIntValue2);
                                runLevel = bidi.getRunLevel(iIntValue2);
                                strSubstring = string.substring(runStart2, runLimit2);
                                if ((runLevel & 1) == 0) {
                                    sb2.append(strSubstring);
                                } else {
                                    sb3 = this.f55085F;
                                    length3 = 0;
                                    sb3.setLength(0);
                                    while (length3 < strSubstring.length()) {
                                        String strM18538r3 = m18538r(length3, strSubstring);
                                        sb3.insert(0, strM18538r3);
                                        length3 += strM18538r3.length();
                                        strSubstring = strSubstring;
                                    }
                                    sb2.append((CharSequence) sb3);
                                }
                                i13++;
                                runCount = i210;
                                numArr = numArr3;
                                bidi = bidi;
                            }
                            string = sb2.toString();
                        } else {
                            i8 = size;
                        }
                        arrayList = this.f55092M;
                        arrayList.clear();
                        length2 = 0;
                        while (length2 < string.length()) {
                            String strM18538r4 = m18538r(length2, string);
                            arrayList.add(strM18538r4);
                            length2 += strM18538r4.length();
                        }
                        i9 = 0;
                        while (i9 < arrayList.size()) {
                            sb = this.f55083D;
                            sb.setLength(0);
                            sb.append((String) arrayList.get(i9));
                            i10 = i9 + 1;
                            while (i10 < arrayList.size()) {
                                str = (String) arrayList.get(i10);
                                i11 = 0;
                                while (true) {
                                    if (i11 < str.length()) {
                                        break;
                                        break;
                                    }
                                    arrayList2 = arrayList;
                                    if (Character.getDirectionality(str.codePointAt(i11)) == 2) {
                                        break;
                                    }
                                    i11++;
                                    arrayList = arrayList2;
                                }
                                sb.insert(0, str);
                                i10++;
                                arrayList = arrayList2;
                            }
                            ArrayList arrayList6 = arrayList;
                            string2 = sb.toString();
                            m18539s(pi2Var, i, i9 + length);
                            if (pi2Var.f56239k) {
                                m18536t(string2, yk4Var5, canvas);
                                m18536t(string2, yk4Var6, canvas);
                            } else {
                                m18536t(string2, yk4Var6, canvas);
                                m18536t(string2, yk4Var5, canvas);
                            }
                            canvas.translate(yk4Var5.measureText(string2) + f2, 0.0f);
                            i9 = i10;
                            arrayList = arrayList6;
                        }
                    } else {
                        f2 = f2;
                        listAsList = listAsList;
                        i8 = size;
                    }
                    length += nw9Var.f53334a.length();
                    canvas.restore();
                    i7++;
                    qa3Var = qa3Var;
                    i6 = 2;
                    f2 = f2;
                    listAsList = listAsList;
                    size = i8;
                }
                i4++;
                qa3Var = qa3Var;
                i2 = i6;
                fM11957c = f2;
                size = size;
            }
        }
        canvas2 = canvas;
        canvas2.restore();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: r */
    public final String m18538r(int i, String str) {
        int iCodePointAt = str.codePointAt(i);
        int iCharCount = Character.charCount(iCodePointAt) + i;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (Character.getType(iCodePointAt2) != 16 && Character.getType(iCodePointAt2) != 27 && Character.getType(iCodePointAt2) != 6 && Character.getType(iCodePointAt2) != 28 && Character.getType(iCodePointAt2) != 8 && Character.getType(iCodePointAt2) != 19) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j = iCodePointAt;
        tk5 tk5Var = this.f55091L;
        if (tk5Var.m22177c(j) >= 0) {
            return (String) tk5Var.m22176b(j);
        }
        StringBuilder sb = this.f55082C;
        sb.setLength(0);
        while (i < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i);
            sb.appendCodePoint(iCodePointAt3);
            i += Character.charCount(iCodePointAt3);
        }
        String string = sb.toString();
        tk5Var.m22180f(string, j);
        return string;
    }

    /* JADX INFO: renamed from: s */
    public final void m18539s(pi2 pi2Var, int i, int i2) {
        wna wnaVar = this.f55099T;
        yk4 yk4Var = this.f55088I;
        if (wnaVar != null) {
            yk4Var.setColor(((Integer) wnaVar.mo16692f()).intValue());
        } else {
            ha1 ha1Var = this.f55098S;
            if (ha1Var == null || !m18541w(i2)) {
                yk4Var.setColor(pi2Var.f56236h);
            } else {
                yk4Var.setColor(((Integer) ha1Var.mo16692f()).intValue());
            }
        }
        wna wnaVar2 = this.f55101V;
        yk4 yk4Var2 = this.f55089J;
        if (wnaVar2 != null) {
            yk4Var2.setColor(((Integer) wnaVar2.mo16692f()).intValue());
        } else {
            ha1 ha1Var2 = this.f55100U;
            if (ha1Var2 == null || !m18541w(i2)) {
                yk4Var2.setColor(pi2Var.f56237i);
            } else {
                yk4Var2.setColor(((Integer) ha1Var2.mo16692f()).intValue());
            }
        }
        m90 m90Var = this.f54067w.f45257p;
        int iIntValue = 100;
        int iIntValue2 = m90Var == null ? 100 : ((Integer) m90Var.mo16692f()).intValue();
        ha1 ha1Var3 = this.f55106a0;
        if (ha1Var3 != null && m18541w(i2)) {
            iIntValue = ((Integer) ha1Var3.mo16692f()).intValue();
        }
        int iRound = Math.round((((iIntValue / 100.0f) * ((iIntValue2 * 255.0f) / 100.0f)) * i) / 255.0f);
        yk4Var.setAlpha(iRound);
        yk4Var2.setAlpha(iRound);
        wna wnaVar3 = this.f55103X;
        if (wnaVar3 != null) {
            yk4Var2.setStrokeWidth(((Float) wnaVar3.mo16692f()).floatValue());
            return;
        }
        j73 j73Var = this.f55102W;
        if (j73Var == null || !m18541w(i2)) {
            yk4Var2.setStrokeWidth(fna.m11957c() * pi2Var.f56238j);
        } else {
            yk4Var2.setStrokeWidth(((Float) j73Var.mo16692f()).floatValue());
        }
    }

    /* JADX INFO: renamed from: v */
    public final nw9 m18540v(int i) {
        ArrayList arrayList = this.f55093N;
        for (int size = arrayList.size(); size < i; size++) {
            nw9 nw9Var = new nw9();
            nw9Var.f53334a = "";
            nw9Var.f53335b = 0.0f;
            arrayList.add(nw9Var);
        }
        return (nw9) arrayList.get(i - 1);
    }

    /* JADX INFO: renamed from: w */
    public final boolean m18541w(int i) {
        ha1 ha1Var;
        int length = ((pi2) this.f55094O.mo16692f()).f56229a.length();
        ha1 ha1Var2 = this.f55109d0;
        if (ha1Var2 == null || (ha1Var = this.f55110e0) == null) {
            return true;
        }
        int iMin = Math.min(((Integer) ha1Var2.mo16692f()).intValue(), ((Integer) ha1Var.mo16692f()).intValue());
        int iMax = Math.max(((Integer) ha1Var2.mo16692f()).intValue(), ((Integer) ha1Var.mo16692f()).intValue());
        ha1 ha1Var3 = this.f55111f0;
        if (ha1Var3 != null) {
            int iIntValue = ((Integer) ha1Var3.mo16692f()).intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.f55097R == TextRangeUnits.INDEX) {
            return i >= iMin && i < iMax;
        }
        float f = (i / length) * 100.0f;
        return f >= ((float) iMin) && f < ((float) iMax);
    }

    /* JADX INFO: renamed from: x */
    public final boolean m18542x(Canvas canvas, pi2 pi2Var, int i, float f) {
        PointF pointF = pi2Var.f56240l;
        PointF pointF2 = pi2Var.f56241m;
        float fM11957c = fna.m11957c();
        float f2 = (i * pi2Var.f56234f * fM11957c) + (pointF == null ? 0.0f : (pi2Var.f56234f * fM11957c) + pointF.y);
        if (this.f55095P.f10610Q && pointF2 != null && pointF != null && f2 >= pointF.y + pointF2.y + pi2Var.f56231c) {
            return false;
        }
        float f3 = pointF == null ? 0.0f : pointF.x;
        float f4 = pointF2 != null ? pointF2.x : 0.0f;
        int i2 = mw9.f51976a[pi2Var.f56232d.ordinal()];
        if (i2 == 1) {
            canvas.translate(f3, f2);
            return true;
        }
        if (i2 == 2) {
            canvas.translate((f3 + f4) - f, f2);
            return true;
        }
        if (i2 != 3) {
            return true;
        }
        canvas.translate(((f4 / 2.0f) + f3) - (f / 2.0f), f2);
        return true;
    }

    /* JADX INFO: renamed from: y */
    public final List m18543y(String str, float f, qa3 qa3Var, float f2, float f3, boolean z) {
        float fMeasureText;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (z) {
                sa3 sa3Var = (sa3) this.f55096Q.f40964h.m19078b(sa3.m21187a(cCharAt, qa3Var.f57488a, qa3Var.f57490c));
                if (sa3Var != null) {
                    fMeasureText = (fna.m11957c() * ((float) sa3Var.f60581c) * f2) + f3;
                }
            } else {
                fMeasureText = this.f55088I.measureText(str.substring(i4, i4 + 1)) + f3;
            }
            if (cCharAt == ' ') {
                z2 = true;
                f6 = fMeasureText;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = fMeasureText;
            } else {
                f5 += fMeasureText;
            }
            f4 += fMeasureText;
            if (f > 0.0f && f4 >= f && cCharAt != ' ') {
                i++;
                nw9 nw9VarM18540v = m18540v(i);
                if (i3 == i2) {
                    String strSubstring = str.substring(i2, i4);
                    String strTrim = strSubstring.trim();
                    float length = (f4 - fMeasureText) - ((strTrim.length() - strSubstring.length()) * f6);
                    nw9VarM18540v.f53334a = strTrim;
                    nw9VarM18540v.f53335b = length;
                    i2 = i4;
                    i3 = i2;
                    f4 = fMeasureText;
                    f5 = f4;
                } else {
                    String strSubstring2 = str.substring(i2, i3 - 1);
                    String strTrim2 = strSubstring2.trim();
                    float length2 = ((f4 - f5) - ((strSubstring2.length() - strTrim2.length()) * f6)) - f6;
                    nw9VarM18540v.f53334a = strTrim2;
                    nw9VarM18540v.f53335b = length2;
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            nw9 nw9VarM18540v2 = m18540v(i);
            nw9VarM18540v2.f53334a = str.substring(i2);
            nw9VarM18540v2.f53335b = f4;
        }
        return this.f55093N.subList(0, i);
    }
}
