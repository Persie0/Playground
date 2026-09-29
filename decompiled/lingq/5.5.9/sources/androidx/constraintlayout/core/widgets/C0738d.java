package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.C0726c;
import androidx.constraintlayout.core.widgets.analyzer.WidgetRun;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.kochava.tracker.BuildConfig;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import p061d2.C5039b;
import p061d2.C5040c;
import p083e2.C5354b;
import p083e2.C5355c;
import p083e2.C5357e;
import p083e2.C5358f;
import p083e2.C5359g;
import p083e2.C5362j;

/* JADX INFO: renamed from: androidx.constraintlayout.core.widgets.d */
/* JADX INFO: loaded from: classes.dex */
public final class C0738d extends C5040c {

    /* JADX INFO: renamed from: D0 */
    public int f4965D0;

    /* JADX INFO: renamed from: E0 */
    public int f4966E0;

    /* JADX INFO: renamed from: z0 */
    public int f4982z0;

    /* JADX INFO: renamed from: x0 */
    public final C5354b f4980x0 = new C5354b(this);

    /* JADX INFO: renamed from: y0 */
    public final C5357e f4981y0 = new C5357e(this);

    /* JADX INFO: renamed from: A0 */
    public C5354b.b f4962A0 = null;

    /* JADX INFO: renamed from: B0 */
    public boolean f4963B0 = false;

    /* JADX INFO: renamed from: C0 */
    public final C0726c f4964C0 = new C0726c();

    /* JADX INFO: renamed from: F0 */
    public int f4967F0 = 0;

    /* JADX INFO: renamed from: G0 */
    public int f4968G0 = 0;

    /* JADX INFO: renamed from: H0 */
    public C0737c[] f4969H0 = new C0737c[4];

    /* JADX INFO: renamed from: I0 */
    public C0737c[] f4970I0 = new C0737c[4];

    /* JADX INFO: renamed from: J0 */
    public int f4971J0 = 257;

    /* JADX INFO: renamed from: K0 */
    public boolean f4972K0 = false;

    /* JADX INFO: renamed from: L0 */
    public boolean f4973L0 = false;

    /* JADX INFO: renamed from: M0 */
    public WeakReference<ConstraintAnchor> f4974M0 = null;

    /* JADX INFO: renamed from: N0 */
    public WeakReference<ConstraintAnchor> f4975N0 = null;

    /* JADX INFO: renamed from: O0 */
    public WeakReference<ConstraintAnchor> f4976O0 = null;

    /* JADX INFO: renamed from: P0 */
    public WeakReference<ConstraintAnchor> f4977P0 = null;

    /* JADX INFO: renamed from: Q0 */
    public final HashSet<ConstraintWidget> f4978Q0 = new HashSet<>();

    /* JADX INFO: renamed from: R0 */
    public final C5354b.a f4979R0 = new C5354b.a();

    /* JADX INFO: renamed from: Y */
    public static void m2763Y(ConstraintWidget constraintWidget, C5354b.b bVar, C5354b.a aVar) {
        int i10;
        int i11;
        if (bVar == null) {
            return;
        }
        if (constraintWidget.f4881j0 != 8 && !(constraintWidget instanceof C0740f)) {
            if (!(constraintWidget instanceof C0730a)) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget.f4857V;
                aVar.f33661a = dimensionBehaviourArr[0];
                aVar.f33662b = dimensionBehaviourArr[1];
                aVar.f33663c = constraintWidget.m2735u();
                aVar.f33664d = constraintWidget.m2731o();
                aVar.f33669i = false;
                aVar.f33670j = 0;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour = aVar.f33661a;
                ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                boolean z10 = dimensionBehaviour == dimensionBehaviour2;
                boolean z11 = aVar.f33662b == dimensionBehaviour2;
                boolean z12 = z10 && constraintWidget.f4861Z > 0.0f;
                boolean z13 = z11 && constraintWidget.f4861Z > 0.0f;
                if (z10 && constraintWidget.m2738x(0) && constraintWidget.f4898s == 0 && !z12) {
                    aVar.f33661a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (z11 && constraintWidget.f4900t == 0) {
                        aVar.f33661a = ConstraintWidget.DimensionBehaviour.FIXED;
                    }
                    z10 = false;
                }
                if (z11 && constraintWidget.m2738x(1) && constraintWidget.f4900t == 0 && !z13) {
                    aVar.f33662b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (z10 && constraintWidget.f4898s == 0) {
                        aVar.f33662b = ConstraintWidget.DimensionBehaviour.FIXED;
                    }
                    z11 = false;
                }
                if (constraintWidget.mo2706E()) {
                    aVar.f33661a = ConstraintWidget.DimensionBehaviour.FIXED;
                    z10 = false;
                }
                if (constraintWidget.mo2707F()) {
                    aVar.f33662b = ConstraintWidget.DimensionBehaviour.FIXED;
                    z11 = false;
                }
                int[] iArr = constraintWidget.f4902u;
                if (z12) {
                    if (iArr[0] == 4) {
                        aVar.f33661a = ConstraintWidget.DimensionBehaviour.FIXED;
                    } else if (!z11) {
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = aVar.f33662b;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.FIXED;
                        if (dimensionBehaviour3 == dimensionBehaviour4) {
                            i11 = aVar.f33664d;
                        } else {
                            aVar.f33661a = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                            ((ConstraintLayout.C0760c) bVar).m2873b(constraintWidget, aVar);
                            i11 = aVar.f33666f;
                        }
                        aVar.f33661a = dimensionBehaviour4;
                        aVar.f33663c = (int) (constraintWidget.f4861Z * i11);
                    }
                }
                if (z13) {
                    if (iArr[1] == 4) {
                        aVar.f33662b = ConstraintWidget.DimensionBehaviour.FIXED;
                    } else if (!z10) {
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour5 = aVar.f33661a;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.FIXED;
                        if (dimensionBehaviour5 == dimensionBehaviour6) {
                            i10 = aVar.f33663c;
                        } else {
                            aVar.f33662b = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                            ((ConstraintLayout.C0760c) bVar).m2873b(constraintWidget, aVar);
                            i10 = aVar.f33665e;
                        }
                        aVar.f33662b = dimensionBehaviour6;
                        if (constraintWidget.f4863a0 == -1) {
                            aVar.f33664d = (int) (i10 / constraintWidget.f4861Z);
                        } else {
                            aVar.f33664d = (int) (constraintWidget.f4861Z * i10);
                        }
                    }
                }
                ((ConstraintLayout.C0760c) bVar).m2873b(constraintWidget, aVar);
                constraintWidget.m2717R(aVar.f33665e);
                constraintWidget.m2714O(aVar.f33666f);
                constraintWidget.f4841F = aVar.f33668h;
                int i12 = aVar.f33667g;
                constraintWidget.f4869d0 = i12;
                constraintWidget.f4841F = i12 > 0;
                aVar.f33670j = 0;
                return;
            }
        }
        aVar.f33665e = 0;
        aVar.f33666f = 0;
    }

    @Override // p061d2.C5040c, androidx.constraintlayout.core.widgets.ConstraintWidget
    /* JADX INFO: renamed from: G */
    public final void mo2708G() {
        this.f4964C0.m2683t();
        this.f4965D0 = 0;
        this.f4966E0 = 0;
        super.mo2708G();
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* JADX INFO: renamed from: S */
    public final void mo2718S(boolean z10, boolean z11) {
        super.mo2718S(z10, z11);
        int size = this.f32872w0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f32872w0.get(i10).mo2718S(z10, z11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:352:0x0622  */
    /* JADX WARN: Code duplicated, block: B:355:0x062f  */
    /* JADX WARN: Code duplicated, block: B:362:0x0646  */
    /* JADX WARN: Code duplicated, block: B:363:0x064f  */
    /* JADX WARN: Code duplicated, block: B:381:0x067f  */
    /* JADX WARN: Code duplicated, block: B:386:0x0695  */
    /* JADX WARN: Code duplicated, block: B:398:0x06c7  */
    /* JADX WARN: Code duplicated, block: B:403:0x06da  */
    /* JADX WARN: Code duplicated, block: B:410:0x06ec  */
    /* JADX WARN: Code duplicated, block: B:413:0x06f7  */
    /* JADX WARN: Code duplicated, block: B:415:0x0703  */
    /* JADX WARN: Code duplicated, block: B:419:0x0715  */
    /* JADX WARN: Code duplicated, block: B:422:0x0728 A[Catch: Exception -> 0x07e9, LOOP:12: B:421:0x0726->B:422:0x0728, LOOP_END, TryCatch #3 {Exception -> 0x07e9, blocks: (B:420:0x0719, B:422:0x0728, B:423:0x0736), top: B:544:0x0719 }] */
    /* JADX WARN: Code duplicated, block: B:435:0x0764 A[Catch: Exception -> 0x07db, PHI: r22
      0x0764: PHI (r22v8 androidx.constraintlayout.core.widgets.ConstraintAnchor) = 
      (r22v3 androidx.constraintlayout.core.widgets.ConstraintAnchor)
      (r22v3 androidx.constraintlayout.core.widgets.ConstraintAnchor)
      (r22v10 androidx.constraintlayout.core.widgets.ConstraintAnchor)
     binds: [B:425:0x073c, B:427:0x0742, B:432:0x0759] A[DONT_GENERATE, DONT_INLINE], TryCatch #2 {Exception -> 0x07db, blocks: (B:424:0x0739, B:426:0x073e, B:428:0x0744, B:432:0x0759, B:435:0x0764, B:437:0x0768, B:439:0x076e, B:440:0x0789, B:442:0x078d, B:444:0x0793, B:448:0x07a9, B:455:0x07b6, B:457:0x07ba, B:459:0x07c0), top: B:542:0x0739 }] */
    /* JADX WARN: Code duplicated, block: B:437:0x0768 A[Catch: Exception -> 0x07db, TryCatch #2 {Exception -> 0x07db, blocks: (B:424:0x0739, B:426:0x073e, B:428:0x0744, B:432:0x0759, B:435:0x0764, B:437:0x0768, B:439:0x076e, B:440:0x0789, B:442:0x078d, B:444:0x0793, B:448:0x07a9, B:455:0x07b6, B:457:0x07ba, B:459:0x07c0), top: B:542:0x0739 }] */
    /* JADX WARN: Code duplicated, block: B:442:0x078d A[Catch: Exception -> 0x07db, TryCatch #2 {Exception -> 0x07db, blocks: (B:424:0x0739, B:426:0x073e, B:428:0x0744, B:432:0x0759, B:435:0x0764, B:437:0x0768, B:439:0x076e, B:440:0x0789, B:442:0x078d, B:444:0x0793, B:448:0x07a9, B:455:0x07b6, B:457:0x07ba, B:459:0x07c0), top: B:542:0x0739 }] */
    /* JADX WARN: Code duplicated, block: B:457:0x07ba A[Catch: Exception -> 0x07db, TryCatch #2 {Exception -> 0x07db, blocks: (B:424:0x0739, B:426:0x073e, B:428:0x0744, B:432:0x0759, B:435:0x0764, B:437:0x0768, B:439:0x076e, B:440:0x0789, B:442:0x078d, B:444:0x0793, B:448:0x07a9, B:455:0x07b6, B:457:0x07ba, B:459:0x07c0), top: B:542:0x0739 }] */
    /* JADX WARN: Code duplicated, block: B:464:0x07dd  */
    /* JADX WARN: Code duplicated, block: B:474:0x0808  */
    /* JADX WARN: Code duplicated, block: B:476:0x0824  */
    /* JADX WARN: Code duplicated, block: B:478:0x083b  */
    /* JADX WARN: Code duplicated, block: B:47:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:482:0x0842  */
    /* JADX WARN: Code duplicated, block: B:484:0x0846  */
    /* JADX WARN: Code duplicated, block: B:487:0x0858  */
    /* JADX WARN: Code duplicated, block: B:489:0x0861 A[LOOP:15: B:488:0x085f->B:489:0x0861, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:493:0x0879 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:498:0x0885 A[LOOP:14: B:497:0x0883->B:498:0x0885, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:501:0x08ba  */
    /* JADX WARN: Code duplicated, block: B:505:0x08cf  */
    /* JADX WARN: Code duplicated, block: B:510:0x08f6  */
    /* JADX WARN: Code duplicated, block: B:513:0x0919  */
    /* JADX WARN: Code duplicated, block: B:514:0x0929  */
    /* JADX WARN: Code duplicated, block: B:516:0x092d  */
    /* JADX WARN: Code duplicated, block: B:518:0x0936 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:521:0x093e  */
    /* JADX WARN: Code duplicated, block: B:524:0x0953 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:528:0x096e A[PHI: r21 r26
      0x096e: PHI (r21v8 ??) = (r21v7 ??), (r21v10 ??), (r21v10 ??), (r21v10 ??) binds: [B:515:0x092b, B:523:0x0951, B:524:0x0953, B:526:0x0959] A[DONT_GENERATE, DONT_INLINE]
      0x096e: PHI (r26v6 boolean) = (r26v5 boolean), (r26v7 boolean), (r26v7 boolean), (r26v7 boolean) binds: [B:515:0x092b, B:523:0x0951, B:524:0x0953, B:526:0x0959] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:530:0x0974  */
    /* JADX WARN: Code duplicated, block: B:531:0x0976  */
    /* JADX WARN: Code duplicated, block: B:535:0x0983  */
    /* JADX WARN: Code duplicated, block: B:597:0x0708 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:604:0x084a A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v11 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [boolean] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v31 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v48 */
    /* JADX WARN: Type inference failed for: r13v49 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r21v10 */
    /* JADX WARN: Type inference failed for: r21v11 */
    /* JADX WARN: Type inference failed for: r21v12 */
    /* JADX WARN: Type inference failed for: r21v13 */
    /* JADX WARN: Type inference failed for: r21v36 */
    /* JADX WARN: Type inference failed for: r21v37 */
    /* JADX WARN: Type inference failed for: r21v38 */
    /* JADX WARN: Type inference failed for: r21v39 */
    /* JADX WARN: Type inference failed for: r21v40 */
    /* JADX WARN: Type inference failed for: r21v41 */
    /* JADX WARN: Type inference failed for: r21v7 */
    /* JADX WARN: Type inference failed for: r21v8 */
    /* JADX WARN: Type inference failed for: r21v9 */
    /* JADX WARN: Type inference failed for: r23v0 */
    /* JADX WARN: Type inference failed for: r23v1 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r28v0, types: [androidx.constraintlayout.core.widgets.ConstraintWidget, androidx.constraintlayout.core.widgets.d, d2.c] */
    @Override // p061d2.C5040c
    /* JADX INFO: renamed from: U */
    public final void mo2764U() {
        int i10;
        ConstraintAnchor constraintAnchor;
        int i11;
        C0726c c0726c;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2;
        ConstraintAnchor constraintAnchor2;
        int i12;
        int iM2735u;
        int iM2731o;
        boolean z10;
        boolean z11;
        char c10;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour3;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour4;
        boolean z12;
        int i13;
        int i14;
        boolean zM2768Z;
        boolean z13;
        int i15;
        ?? r13;
        boolean z14;
        int i16;
        ?? r23;
        boolean[] zArr;
        boolean z15;
        int i17;
        boolean z16;
        int iMax;
        boolean z17;
        int iMax2;
        ?? r12;
        ?? r21;
        int i18;
        ?? r22;
        ?? r14;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour5;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour6;
        int i19;
        int iMax3;
        int iMax4;
        int iMax5;
        int iMax6;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour7;
        boolean zM2768Z2;
        int size;
        int i20;
        boolean z18;
        ConstraintWidget constraintWidget;
        boolean z19;
        ?? r15;
        int i21;
        WeakReference<ConstraintAnchor> weakReference;
        WeakReference<ConstraintAnchor> weakReference2;
        WeakReference<ConstraintAnchor> weakReference3;
        WeakReference<ConstraintAnchor> weakReference4;
        ConstraintAnchor constraintAnchor3;
        ConstraintWidget constraintWidget2;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour8;
        int i22;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour9;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour10;
        C5362j c5362j;
        C5362j c5362j2;
        boolean z20;
        int i23;
        int iM11502b;
        C0726c c0726c2;
        C5362j c5362j3;
        C5362j c5362j4;
        int i24;
        int i25;
        int i26;
        this.f4865b0 = 0;
        this.f4867c0 = 0;
        this.f4972K0 = false;
        this.f4973L0 = false;
        int size2 = this.f32872w0.size();
        int iMax7 = Math.max(0, m2735u());
        int iMax8 = Math.max(0, m2731o());
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = this.f4857V;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour11 = dimensionBehaviourArr[1];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour12 = dimensionBehaviourArr[0];
        int i27 = this.f4982z0;
        ConstraintAnchor constraintAnchor4 = this.f4847L;
        ConstraintAnchor constraintAnchor5 = this.f4846K;
        if (i27 == 0 && C0741g.m2781b(this.f4971J0, 1)) {
            C5354b.b bVar = this.f4962A0;
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr2 = this.f4857V;
            ConstraintWidget.DimensionBehaviour dimensionBehaviour13 = dimensionBehaviourArr2[0];
            ConstraintWidget.DimensionBehaviour dimensionBehaviour14 = dimensionBehaviourArr2[1];
            m2710I();
            ArrayList<ConstraintWidget> arrayList = this.f32872w0;
            int size3 = arrayList.size();
            for (int i28 = 0; i28 < size3; i28++) {
                arrayList.get(i28).m2710I();
            }
            boolean z21 = this.f4963B0;
            if (dimensionBehaviour13 == ConstraintWidget.DimensionBehaviour.FIXED) {
                m2712M(0, m2735u());
            } else {
                constraintAnchor5.m2697l(0);
                this.f4865b0 = 0;
            }
            boolean z22 = false;
            int i29 = 0;
            boolean z23 = false;
            while (i29 < size3) {
                ConstraintWidget constraintWidget3 = arrayList.get(i29);
                ConstraintAnchor constraintAnchor6 = constraintAnchor5;
                if (constraintWidget3 instanceof C0740f) {
                    C0740f c0740f = (C0740f) constraintWidget3;
                    i26 = iMax8;
                    if (c0740f.f5026A0 == 1) {
                        int i30 = c0740f.f5029x0;
                        if (i30 != -1) {
                            c0740f.m2778U(i30);
                        } else if (c0740f.f5030y0 != -1 && mo2706E()) {
                            c0740f.m2778U(m2735u() - c0740f.f5030y0);
                        } else if (mo2706E()) {
                            c0740f.m2778U((int) ((c0740f.f5028w0 * m2735u()) + 0.5f));
                        }
                        z22 = true;
                    }
                } else {
                    i26 = iMax8;
                    if ((constraintWidget3 instanceof C0730a) && ((C0730a) constraintWidget3).m2742W() == 0) {
                        z23 = true;
                    }
                }
                i29++;
                constraintAnchor5 = constraintAnchor6;
                iMax8 = i26;
            }
            i10 = iMax8;
            constraintAnchor = constraintAnchor5;
            if (z22) {
                for (int i31 = 0; i31 < size3; i31++) {
                    ConstraintWidget constraintWidget4 = arrayList.get(i31);
                    if (constraintWidget4 instanceof C0740f) {
                        C0740f c0740f2 = (C0740f) constraintWidget4;
                        if (c0740f2.f5026A0 == 1) {
                            C5358f.m11490b(0, c0740f2, bVar, z21);
                        }
                    }
                }
            }
            C5358f.m11490b(0, this, bVar, z21);
            if (z23) {
                for (int i32 = 0; i32 < size3; i32++) {
                    ConstraintWidget constraintWidget5 = arrayList.get(i32);
                    if (constraintWidget5 instanceof C0730a) {
                        C0730a c0730a = (C0730a) constraintWidget5;
                        if (c0730a.m2742W() == 0 && c0730a.m2741V()) {
                            C5358f.m11490b(1, c0730a, bVar, z21);
                        }
                    }
                }
            }
            if (dimensionBehaviour14 == ConstraintWidget.DimensionBehaviour.FIXED) {
                m2713N(0, m2731o());
            } else {
                constraintAnchor4.m2697l(0);
                this.f4867c0 = 0;
            }
            boolean z24 = false;
            boolean z25 = false;
            for (int i33 = 0; i33 < size3; i33++) {
                ConstraintWidget constraintWidget6 = arrayList.get(i33);
                if (constraintWidget6 instanceof C0740f) {
                    C0740f c0740f3 = (C0740f) constraintWidget6;
                    if (c0740f3.f5026A0 == 0) {
                        int i34 = c0740f3.f5029x0;
                        if (i34 != -1) {
                            c0740f3.m2778U(i34);
                        } else if (c0740f3.f5030y0 != -1 && mo2707F()) {
                            c0740f3.m2778U(m2731o() - c0740f3.f5030y0);
                        } else if (mo2707F()) {
                            c0740f3.m2778U((int) ((c0740f3.f5028w0 * m2731o()) + 0.5f));
                        }
                        z24 = true;
                    }
                } else if ((constraintWidget6 instanceof C0730a) && ((C0730a) constraintWidget6).m2742W() == 1) {
                    z25 = true;
                }
            }
            if (z24) {
                for (int i35 = 0; i35 < size3; i35++) {
                    ConstraintWidget constraintWidget7 = arrayList.get(i35);
                    if (constraintWidget7 instanceof C0740f) {
                        C0740f c0740f4 = (C0740f) constraintWidget7;
                        if (c0740f4.f5026A0 == 0) {
                            C5358f.m11495g(1, c0740f4, bVar);
                        }
                    }
                }
            }
            C5358f.m11495g(0, this, bVar);
            if (z25) {
                for (int i36 = 0; i36 < size3; i36++) {
                    ConstraintWidget constraintWidget8 = arrayList.get(i36);
                    if (constraintWidget8 instanceof C0730a) {
                        C0730a c0730a2 = (C0730a) constraintWidget8;
                        if (c0730a2.m2742W() == 1 && c0730a2.m2741V()) {
                            C5358f.m11495g(1, c0730a2, bVar);
                        }
                    }
                }
            }
            for (int i37 = 0; i37 < size3; i37++) {
                ConstraintWidget constraintWidget9 = arrayList.get(i37);
                if (constraintWidget9.m2705D() && C5358f.m11489a(constraintWidget9)) {
                    m2763Y(constraintWidget9, bVar, C5358f.f33681a);
                    if (!(constraintWidget9 instanceof C0740f)) {
                        C5358f.m11490b(0, constraintWidget9, bVar, z21);
                        C5358f.m11495g(0, constraintWidget9, bVar);
                    } else if (((C0740f) constraintWidget9).f5026A0 == 0) {
                        C5358f.m11495g(0, constraintWidget9, bVar);
                    } else {
                        C5358f.m11490b(0, constraintWidget9, bVar, z21);
                    }
                }
            }
            for (int i38 = 0; i38 < size2; i38++) {
                ConstraintWidget constraintWidget10 = this.f32872w0.get(i38);
                if (constraintWidget10.m2705D() && !(constraintWidget10 instanceof C0740f) && !(constraintWidget10 instanceof C0730a) && !(constraintWidget10 instanceof C0743i) && !constraintWidget10.f4843H) {
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourM2730n = constraintWidget10.m2730n(0);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviourM2730n2 = constraintWidget10.m2730n(1);
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour15 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                    if (!(dimensionBehaviourM2730n == dimensionBehaviour15 && constraintWidget10.f4898s != 1 && dimensionBehaviourM2730n2 == dimensionBehaviour15 && constraintWidget10.f4900t != 1)) {
                        m2763Y(constraintWidget10, this.f4962A0, new C5354b.a());
                    }
                }
            }
        } else {
            i10 = iMax8;
            constraintAnchor = constraintAnchor5;
        }
        C0726c c0726c3 = this.f4964C0;
        if (size2 > 2 && ((dimensionBehaviour12 == (dimensionBehaviour8 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviour11 == dimensionBehaviour8) && C0741g.m2781b(this.f4971J0, 1024))) {
            C5354b.b bVar2 = this.f4962A0;
            ArrayList<ConstraintWidget> arrayList2 = this.f32872w0;
            int size4 = arrayList2.size();
            int i39 = 0;
            while (true) {
                if (i39 >= size4) {
                    constraintAnchor2 = constraintAnchor4;
                    ArrayList arrayList3 = null;
                    ArrayList<C5039b> arrayList4 = null;
                    ArrayList arrayList5 = null;
                    ArrayList<C5039b> arrayList6 = null;
                    ArrayList arrayList7 = null;
                    ArrayList arrayList8 = null;
                    int i40 = 0;
                    while (i40 < size4) {
                        int i41 = size2;
                        ConstraintWidget constraintWidget11 = arrayList2.get(i40);
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour16 = dimensionBehaviour11;
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr3 = this.f4857V;
                        int i42 = iMax7;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour17 = dimensionBehaviourArr3[0];
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour18 = dimensionBehaviourArr3[1];
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour19 = dimensionBehaviour12;
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr4 = constraintWidget11.f4857V;
                        C0726c c0726c4 = c0726c3;
                        if (!C5359g.m11497b(dimensionBehaviour17, dimensionBehaviour18, dimensionBehaviourArr4[0], dimensionBehaviourArr4[1])) {
                            m2763Y(constraintWidget11, bVar2, this.f4979R0);
                        }
                        boolean z26 = constraintWidget11 instanceof C0740f;
                        if (z26) {
                            C0740f c0740f5 = (C0740f) constraintWidget11;
                            if (c0740f5.f5026A0 == 0) {
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                }
                                arrayList5.add(c0740f5);
                            }
                            if (c0740f5.f5026A0 == 1) {
                                if (arrayList3 == null) {
                                    arrayList3 = new ArrayList();
                                }
                                arrayList3.add(c0740f5);
                            }
                        }
                        if (constraintWidget11 instanceof C5039b) {
                            if (constraintWidget11 instanceof C0730a) {
                                C0730a c0730a3 = (C0730a) constraintWidget11;
                                if (c0730a3.m2742W() == 0) {
                                    if (arrayList4 == null) {
                                        arrayList4 = new ArrayList();
                                    }
                                    arrayList4.add(c0730a3);
                                }
                                if (c0730a3.m2742W() == 1) {
                                    if (arrayList6 == null) {
                                        arrayList6 = new ArrayList();
                                    }
                                    arrayList6.add(c0730a3);
                                }
                            } else {
                                C5039b c5039b = (C5039b) constraintWidget11;
                                if (arrayList4 == null) {
                                    arrayList4 = new ArrayList();
                                }
                                arrayList4.add(c5039b);
                                if (arrayList6 == null) {
                                    arrayList6 = new ArrayList();
                                }
                                arrayList6.add(c5039b);
                            }
                        }
                        if (constraintWidget11.f4846K.f4831f == null && constraintWidget11.f4848M.f4831f == null && !z26 && !(constraintWidget11 instanceof C0730a)) {
                            if (arrayList7 == null) {
                                arrayList7 = new ArrayList();
                            }
                            arrayList7.add(constraintWidget11);
                        }
                        if (constraintWidget11.f4847L.f4831f == null && constraintWidget11.f4849N.f4831f == null && constraintWidget11.f4850O.f4831f == null && !z26 && !(constraintWidget11 instanceof C0730a)) {
                            if (arrayList8 == null) {
                                arrayList8 = new ArrayList();
                            }
                            arrayList8.add(constraintWidget11);
                        }
                        i40++;
                        dimensionBehaviour11 = dimensionBehaviour16;
                        size2 = i41;
                        iMax7 = i42;
                        dimensionBehaviour12 = dimensionBehaviour19;
                        c0726c3 = c0726c4;
                    }
                    i22 = iMax7;
                    i11 = size2;
                    C0726c c0726c5 = c0726c3;
                    dimensionBehaviour9 = dimensionBehaviour12;
                    dimensionBehaviour10 = dimensionBehaviour11;
                    ArrayList<C5362j> arrayList9 = new ArrayList<>();
                    if (arrayList3 != null) {
                        Iterator it = arrayList3.iterator();
                        while (it.hasNext()) {
                            C5359g.m11496a((C0740f) it.next(), 0, arrayList9, null);
                        }
                    }
                    C5362j c5362j5 = null;
                    int i43 = 0;
                    if (arrayList4 != null) {
                        for (C5039b c5039b2 : arrayList4) {
                            C5362j c5362jM11496a = C5359g.m11496a(c5039b2, i43, arrayList9, c5362j5);
                            c5039b2.m10721U(i43, c5362jM11496a, arrayList9);
                            c5362jM11496a.m11501a(arrayList9);
                            c5362j5 = null;
                            i43 = 0;
                        }
                    }
                    HashSet<ConstraintAnchor> hashSet = mo2729m(ConstraintAnchor.Type.LEFT).f4826a;
                    if (hashSet != null) {
                        Iterator<ConstraintAnchor> it2 = hashSet.iterator();
                        while (it2.hasNext()) {
                            C5359g.m11496a(it2.next().f4829d, 0, arrayList9, null);
                        }
                    }
                    HashSet<ConstraintAnchor> hashSet2 = mo2729m(ConstraintAnchor.Type.RIGHT).f4826a;
                    if (hashSet2 != null) {
                        Iterator<ConstraintAnchor> it3 = hashSet2.iterator();
                        while (it3.hasNext()) {
                            C5359g.m11496a(it3.next().f4829d, 0, arrayList9, null);
                        }
                    }
                    HashSet<ConstraintAnchor> hashSet3 = mo2729m(ConstraintAnchor.Type.CENTER).f4826a;
                    if (hashSet3 != null) {
                        Iterator<ConstraintAnchor> it4 = hashSet3.iterator();
                        while (it4.hasNext()) {
                            C5359g.m11496a(it4.next().f4829d, 0, arrayList9, null);
                        }
                    }
                    C5362j c5362j6 = null;
                    if (arrayList7 != null) {
                        Iterator it5 = arrayList7.iterator();
                        while (it5.hasNext()) {
                            C5359g.m11496a((ConstraintWidget) it5.next(), 0, arrayList9, null);
                        }
                    }
                    if (arrayList5 != null) {
                        Iterator it6 = arrayList5.iterator();
                        while (it6.hasNext()) {
                            C5359g.m11496a((C0740f) it6.next(), 1, arrayList9, null);
                        }
                    }
                    int i44 = 1;
                    if (arrayList6 != null) {
                        for (C5039b c5039b3 : arrayList6) {
                            C5362j c5362jM11496a2 = C5359g.m11496a(c5039b3, i44, arrayList9, c5362j6);
                            c5039b3.m10721U(i44, c5362jM11496a2, arrayList9);
                            c5362jM11496a2.m11501a(arrayList9);
                            c5362j6 = null;
                            i44 = 1;
                        }
                    }
                    HashSet<ConstraintAnchor> hashSet4 = mo2729m(ConstraintAnchor.Type.TOP).f4826a;
                    if (hashSet4 != null) {
                        Iterator<ConstraintAnchor> it7 = hashSet4.iterator();
                        while (it7.hasNext()) {
                            C5359g.m11496a(it7.next().f4829d, 1, arrayList9, null);
                        }
                    }
                    HashSet<ConstraintAnchor> hashSet5 = mo2729m(ConstraintAnchor.Type.BASELINE).f4826a;
                    if (hashSet5 != null) {
                        Iterator<ConstraintAnchor> it8 = hashSet5.iterator();
                        while (it8.hasNext()) {
                            C5359g.m11496a(it8.next().f4829d, 1, arrayList9, null);
                        }
                    }
                    HashSet<ConstraintAnchor> hashSet6 = mo2729m(ConstraintAnchor.Type.BOTTOM).f4826a;
                    if (hashSet6 != null) {
                        Iterator<ConstraintAnchor> it9 = hashSet6.iterator();
                        while (it9.hasNext()) {
                            C5359g.m11496a(it9.next().f4829d, 1, arrayList9, null);
                        }
                    }
                    HashSet<ConstraintAnchor> hashSet7 = mo2729m(ConstraintAnchor.Type.CENTER).f4826a;
                    if (hashSet7 != null) {
                        Iterator<ConstraintAnchor> it10 = hashSet7.iterator();
                        while (it10.hasNext()) {
                            C5359g.m11496a(it10.next().f4829d, 1, arrayList9, null);
                        }
                    }
                    if (arrayList8 != null) {
                        Iterator it11 = arrayList8.iterator();
                        while (it11.hasNext()) {
                            C5359g.m11496a((ConstraintWidget) it11.next(), 1, arrayList9, null);
                        }
                    }
                    for (int i45 = 0; i45 < size4; i45++) {
                        ConstraintWidget constraintWidget12 = arrayList2.get(i45);
                        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr5 = constraintWidget12.f4857V;
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour20 = dimensionBehaviourArr5[0];
                        ConstraintWidget.DimensionBehaviour dimensionBehaviour21 = ConstraintWidget.DimensionBehaviour.MATCH_CONSTRAINT;
                        if (dimensionBehaviour20 == dimensionBehaviour21 && dimensionBehaviourArr5[1] == dimensionBehaviour21) {
                            int i46 = constraintWidget12.f4903u0;
                            int size5 = arrayList9.size();
                            int i47 = 0;
                            while (true) {
                                if (i47 >= size5) {
                                    c5362j3 = null;
                                    break;
                                }
                                c5362j3 = arrayList9.get(i47);
                                if (i46 == c5362j3.f33686b) {
                                    break;
                                } else {
                                    i47++;
                                }
                            }
                            int i48 = constraintWidget12.f4905v0;
                            int size6 = arrayList9.size();
                            int i49 = 0;
                            while (true) {
                                if (i49 >= size6) {
                                    c5362j4 = null;
                                    break;
                                }
                                c5362j4 = arrayList9.get(i49);
                                if (i48 == c5362j4.f33686b) {
                                    break;
                                } else {
                                    i49++;
                                }
                            }
                            if (c5362j3 != null && c5362j4 != null) {
                                c5362j3.m11503c(0, c5362j4);
                                c5362j4.f33687c = 2;
                                arrayList9.remove(c5362j3);
                            }
                        }
                    }
                    if (arrayList9.size() > 1) {
                        if (this.f4857V[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                            c5362j = null;
                            int i50 = 0;
                            for (C5362j c5362j7 : arrayList9) {
                                if (c5362j7.f33687c == 1) {
                                    c0726c2 = c0726c5;
                                } else {
                                    c0726c2 = c0726c5;
                                    int iM11502b2 = c5362j7.m11502b(c0726c2, 0);
                                    if (iM11502b2 > i50) {
                                        c5362j = c5362j7;
                                        c0726c5 = c0726c2;
                                        i50 = iM11502b2;
                                    }
                                }
                                c0726c5 = c0726c2;
                            }
                            c0726c = c0726c5;
                            if (c5362j != null) {
                                m2715P(ConstraintWidget.DimensionBehaviour.FIXED);
                                m2717R(i50);
                            }
                            if (this.f4857V[1] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                                c5362j2 = null;
                                i23 = 0;
                                for (C5362j c5362j8 : arrayList9) {
                                    if (c5362j8.f33687c != 0 && (iM11502b = c5362j8.m11502b(c0726c, 1)) > i23) {
                                        c5362j2 = c5362j8;
                                        i23 = iM11502b;
                                    }
                                }
                                if (c5362j2 != null) {
                                    m2716Q(ConstraintWidget.DimensionBehaviour.FIXED);
                                    m2714O(i23);
                                } else {
                                    c5362j2 = null;
                                }
                            } else {
                                c5362j2 = null;
                            }
                            if (c5362j == null || c5362j2 != null) {
                                z20 = true;
                                break;
                            }
                        } else {
                            c0726c = c0726c5;
                        }
                        c5362j = null;
                        if (this.f4857V[1] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                            c5362j2 = null;
                            i23 = 0;
                            while (r0.hasNext()) {
                                if (c5362j8.f33687c != 0) {
                                    c5362j2 = c5362j8;
                                    i23 = iM11502b;
                                }
                            }
                            if (c5362j2 != null) {
                                m2716Q(ConstraintWidget.DimensionBehaviour.FIXED);
                                m2714O(i23);
                            } else {
                                c5362j2 = null;
                            }
                        } else {
                            c5362j2 = null;
                        }
                        if (c5362j == null) {
                        }
                        z20 = true;
                        break;
                    }
                    c0726c = c0726c5;
                } else {
                    ConstraintWidget constraintWidget13 = arrayList2.get(i39);
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr6 = this.f4857V;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour22 = dimensionBehaviourArr6[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour23 = dimensionBehaviourArr6[1];
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr7 = constraintWidget13.f4857V;
                    constraintAnchor2 = constraintAnchor4;
                    if (C5359g.m11497b(dimensionBehaviour22, dimensionBehaviour23, dimensionBehaviourArr7[0], dimensionBehaviourArr7[1]) && !(constraintWidget13 instanceof C0739e)) {
                        i39++;
                        constraintAnchor4 = constraintAnchor2;
                    } else {
                        i22 = iMax7;
                        i11 = size2;
                        c0726c = c0726c3;
                        dimensionBehaviour9 = dimensionBehaviour12;
                        dimensionBehaviour10 = dimensionBehaviour11;
                    }
                }
                z20 = false;
                break;
            }
            if (z20) {
                ConstraintWidget.DimensionBehaviour dimensionBehaviour24 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                dimensionBehaviour = dimensionBehaviour9;
                if (dimensionBehaviour == dimensionBehaviour24) {
                    i24 = i22;
                    if (i24 >= m2735u() || i24 <= 0) {
                        iM2735u = m2735u();
                    } else {
                        m2717R(i24);
                        this.f4972K0 = true;
                    }
                    dimensionBehaviour2 = dimensionBehaviour10;
                    if (dimensionBehaviour2 == dimensionBehaviour24) {
                        i25 = i10;
                        if (i25 < m2731o() || i25 <= 0) {
                            iM2731o = m2731o();
                        } else {
                            m2714O(i25);
                            this.f4973L0 = true;
                        }
                        z10 = true;
                    } else {
                        i25 = i10;
                    }
                    iM2731o = i25;
                    z10 = true;
                } else {
                    i24 = i22;
                }
                iM2735u = i24;
                dimensionBehaviour2 = dimensionBehaviour10;
                if (dimensionBehaviour2 == dimensionBehaviour24) {
                    i25 = i10;
                    if (i25 < m2731o()) {
                    }
                    iM2731o = m2731o();
                    z10 = true;
                } else {
                    i25 = i10;
                }
                iM2731o = i25;
                z10 = true;
            } else {
                dimensionBehaviour2 = dimensionBehaviour10;
                i12 = i22;
                dimensionBehaviour = dimensionBehaviour9;
            }
            if (!m2768Z(64) || m2768Z(BuildConfig.SDK_TRUNCATE_LENGTH)) {
                z11 = true;
            } else {
                z11 = false;
            }
            c0726c.getClass();
            c0726c.f4811g = false;
            if (this.f4971J0 == 0 && z11) {
                c10 = 1;
                c0726c.f4811g = true;
            } else {
                c10 = 1;
            }
            ArrayList<ConstraintWidget> arrayList10 = this.f32872w0;
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr8 = this.f4857V;
            dimensionBehaviour3 = dimensionBehaviourArr8[0];
            dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
            if (dimensionBehaviour3 != dimensionBehaviour4 || dimensionBehaviourArr8[c10] == dimensionBehaviour4) {
                z12 = true;
            } else {
                z12 = false;
            }
            this.f4967F0 = 0;
            this.f4968G0 = 0;
            i13 = i11;
            for (i14 = 0; i14 < i13; i14++) {
                constraintWidget2 = this.f32872w0.get(i14);
                if (constraintWidget2 instanceof C5040c) {
                    ((C5040c) constraintWidget2).mo2764U();
                }
            }
            zM2768Z = m2768Z(64);
            z13 = z10;
            i15 = 0;
            r13 = 1;
            while (r13 != 0) {
                i16 = i15 + 1;
                try {
                    c0726c.m2683t();
                    this.f4967F0 = 0;
                    this.f4968G0 = 0;
                    m2727k(c0726c);
                    for (i21 = 0; i21 < i13; i21++) {
                        this.f32872w0.get(i21).m2727k(c0726c);
                    }
                    m2766W(c0726c);
                    try {
                        weakReference = this.f4974M0;
                        if (weakReference != null || weakReference.get() == null) {
                            weakReference2 = this.f4976O0;
                            if (weakReference2 != null && weakReference2.get() != null) {
                                c0726c.m2670f(c0726c.m2675k(this.f4849N), c0726c.m2675k(this.f4976O0.get()), 0, 5);
                                this.f4976O0 = null;
                            }
                            weakReference3 = this.f4975N0;
                            if (weakReference3 != null && weakReference3.get() != null) {
                                constraintAnchor3 = constraintAnchor;
                                try {
                                    constraintAnchor = constraintAnchor3;
                                    c0726c.m2670f(c0726c.m2675k(this.f4975N0.get()), c0726c.m2675k(constraintAnchor3), 0, 5);
                                    try {
                                        this.f4975N0 = null;
                                    } catch (Exception e10) {
                                        e = e10;
                                        r15 = 1;
                                        e.printStackTrace();
                                        r23 = r15;
                                        System.out.println("EXCEPTION : " + e);
                                    }
                                } catch (Exception e11) {
                                    e = e11;
                                    constraintAnchor = constraintAnchor3;
                                    r15 = 1;
                                    e.printStackTrace();
                                    r23 = r15;
                                    System.out.println("EXCEPTION : " + e);
                                    zArr = C0741g.f5033a;
                                    if (r23 != 0) {
                                        zArr[2] = false;
                                        zM2768Z2 = m2768Z(64);
                                        mo2719T(c0726c, zM2768Z2);
                                        size = this.f32872w0.size();
                                        i20 = 0;
                                        z18 = false;
                                        while (i20 < size) {
                                            int i51 = size;
                                            constraintWidget = this.f32872w0.get(i20);
                                            constraintWidget.mo2719T(c0726c, zM2768Z2);
                                            boolean z27 = zM2768Z2;
                                            boolean z28 = z13;
                                            if (constraintWidget.f4878i == -1) {
                                                z19 = true;
                                            } else {
                                                z19 = true;
                                            }
                                            if (z19) {
                                                z18 = true;
                                            }
                                            i20++;
                                            size = i51;
                                            zM2768Z2 = z27;
                                            z13 = z28 ? 1 : 0;
                                            z18 = z18;
                                        }
                                        z15 = z13;
                                        z16 = z18;
                                    } else {
                                        z15 = z13 ? 1 : 0;
                                        mo2719T(c0726c, zM2768Z);
                                        for (i17 = 0; i17 < i13; i17++) {
                                            this.f32872w0.get(i17).mo2719T(c0726c, zM2768Z);
                                        }
                                        z16 = false;
                                    }
                                    if (z12) {
                                        iMax3 = 0;
                                        iMax4 = 0;
                                        for (i19 = 0; i19 < i13; i19++) {
                                            ConstraintWidget constraintWidget14 = this.f32872w0.get(i19);
                                            iMax4 = Math.max(iMax4, constraintWidget14.m2735u() + constraintWidget14.f4865b0);
                                            iMax3 = Math.max(iMax3, constraintWidget14.m2731o() + constraintWidget14.f4867c0);
                                        }
                                        iMax5 = Math.max(this.f4871e0, iMax4);
                                        iMax6 = Math.max(this.f4873f0, iMax3);
                                        dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                                        z16 = z16;
                                        if (dimensionBehaviour == dimensionBehaviour7) {
                                            z16 = z16;
                                            m2717R(iMax5);
                                            this.f4857V[0] = dimensionBehaviour7;
                                            z16 = true;
                                            z15 = true;
                                        }
                                        if (dimensionBehaviour2 == dimensionBehaviour7) {
                                            m2714O(iMax6);
                                            this.f4857V[1] = dimensionBehaviour7;
                                            z16 = true;
                                            z15 = true;
                                        }
                                    }
                                    iMax = Math.max(this.f4871e0, m2735u());
                                    z17 = z16;
                                    if (iMax > m2735u()) {
                                        m2717R(iMax);
                                        this.f4857V[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                                        z17 = true;
                                        z15 = true;
                                    }
                                    iMax2 = Math.max(this.f4873f0, m2731o());
                                    if (iMax2 > m2731o()) {
                                        m2714O(iMax2);
                                        r12 = 1;
                                        this.f4857V[1] = ConstraintWidget.DimensionBehaviour.FIXED;
                                        r21 = 1;
                                        z15 = true;
                                    } else {
                                        r12 = 1;
                                    }
                                    if (z15) {
                                        r21 = z17;
                                        z13 = z15;
                                        i18 = 8;
                                        r22 = r21;
                                    } else {
                                        r21 = z17;
                                        dimensionBehaviour5 = this.f4857V[0];
                                        dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                                        if (dimensionBehaviour5 == dimensionBehaviour6) {
                                            r21 = r21;
                                            if (m2735u() > iM2735u) {
                                                this.f4972K0 = r12;
                                                this.f4857V[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                                                m2717R(iM2735u);
                                                ?? r24 = r12;
                                                z15 = r24 == true ? 1 : 0;
                                                r21 = r24;
                                            }
                                        }
                                        r21 = r21;
                                        r21 = r21;
                                        if (this.f4857V[r12] == dimensionBehaviour6) {
                                            r21 = z17;
                                            z13 = z15;
                                            i18 = 8;
                                            r22 = r21;
                                        } else {
                                            r21 = z17;
                                            z13 = z15;
                                            i18 = 8;
                                            r22 = r21;
                                        }
                                    }
                                    if (i16 > i18) {
                                        r14 = 0;
                                    } else {
                                        r14 = r22;
                                    }
                                    i15 = i16;
                                    r13 = r14;
                                }
                            }
                            weakReference4 = this.f4977P0;
                            if (weakReference4 == null && weakReference4.get() != null) {
                                c0726c.m2670f(c0726c.m2675k(this.f4848M), c0726c.m2675k(this.f4977P0.get()), 0, 5);
                                this.f4977P0 = null;
                            }
                            c0726c.m2679p();
                            r23 = 1;
                        } else {
                            ConstraintAnchor constraintAnchor7 = constraintAnchor2;
                            try {
                                constraintAnchor2 = constraintAnchor7;
                                c0726c.m2670f(c0726c.m2675k(this.f4974M0.get()), c0726c.m2675k(constraintAnchor7), 0, 5);
                                this.f4974M0 = null;
                                weakReference2 = this.f4976O0;
                                if (weakReference2 != null) {
                                    c0726c.m2670f(c0726c.m2675k(this.f4849N), c0726c.m2675k(this.f4976O0.get()), 0, 5);
                                    this.f4976O0 = null;
                                }
                                weakReference3 = this.f4975N0;
                                if (weakReference3 != null) {
                                    constraintAnchor3 = constraintAnchor;
                                    constraintAnchor = constraintAnchor3;
                                    c0726c.m2670f(c0726c.m2675k(this.f4975N0.get()), c0726c.m2675k(constraintAnchor3), 0, 5);
                                    this.f4975N0 = null;
                                }
                                weakReference4 = this.f4977P0;
                                if (weakReference4 == null) {
                                }
                                c0726c.m2679p();
                                r23 = 1;
                            } catch (Exception e12) {
                                e = e12;
                                constraintAnchor2 = constraintAnchor7;
                                r15 = 1;
                                e.printStackTrace();
                                r23 = r15;
                                System.out.println("EXCEPTION : " + e);
                                zArr = C0741g.f5033a;
                                if (r23 != 0) {
                                    zArr[2] = false;
                                    zM2768Z2 = m2768Z(64);
                                    mo2719T(c0726c, zM2768Z2);
                                    size = this.f32872w0.size();
                                    i20 = 0;
                                    z18 = false;
                                    while (i20 < size) {
                                        int i52 = size;
                                        constraintWidget = this.f32872w0.get(i20);
                                        constraintWidget.mo2719T(c0726c, zM2768Z2);
                                        boolean z29 = zM2768Z2;
                                        boolean z210 = z13;
                                        if (constraintWidget.f4878i == -1) {
                                            z19 = true;
                                        } else {
                                            z19 = true;
                                        }
                                        if (z19) {
                                            z18 = true;
                                        }
                                        i20++;
                                        size = i52;
                                        zM2768Z2 = z29;
                                        z13 = z210 ? 1 : 0;
                                        z18 = z18;
                                    }
                                    z15 = z13;
                                    z16 = z18;
                                } else {
                                    z15 = z13 ? 1 : 0;
                                    mo2719T(c0726c, zM2768Z);
                                    while (i17 < i13) {
                                        this.f32872w0.get(i17).mo2719T(c0726c, zM2768Z);
                                    }
                                    z16 = false;
                                }
                                if (z12) {
                                    iMax3 = 0;
                                    iMax4 = 0;
                                    while (i19 < i13) {
                                        ConstraintWidget constraintWidget15 = this.f32872w0.get(i19);
                                        iMax4 = Math.max(iMax4, constraintWidget15.m2735u() + constraintWidget15.f4865b0);
                                        iMax3 = Math.max(iMax3, constraintWidget15.m2731o() + constraintWidget15.f4867c0);
                                    }
                                    iMax5 = Math.max(this.f4871e0, iMax4);
                                    iMax6 = Math.max(this.f4873f0, iMax3);
                                    dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                                    z16 = z16;
                                    if (dimensionBehaviour == dimensionBehaviour7) {
                                        z16 = z16;
                                        m2717R(iMax5);
                                        this.f4857V[0] = dimensionBehaviour7;
                                        z16 = true;
                                        z15 = true;
                                    }
                                    if (dimensionBehaviour2 == dimensionBehaviour7) {
                                        m2714O(iMax6);
                                        this.f4857V[1] = dimensionBehaviour7;
                                        z16 = true;
                                        z15 = true;
                                    }
                                }
                                iMax = Math.max(this.f4871e0, m2735u());
                                z17 = z16;
                                if (iMax > m2735u()) {
                                    m2717R(iMax);
                                    this.f4857V[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                                    z17 = true;
                                    z15 = true;
                                }
                                iMax2 = Math.max(this.f4873f0, m2731o());
                                if (iMax2 > m2731o()) {
                                    m2714O(iMax2);
                                    r12 = 1;
                                    this.f4857V[1] = ConstraintWidget.DimensionBehaviour.FIXED;
                                    r21 = 1;
                                    z15 = true;
                                } else {
                                    r12 = 1;
                                }
                                if (z15) {
                                    r21 = z17;
                                    dimensionBehaviour5 = this.f4857V[0];
                                    dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                                    if (dimensionBehaviour5 == dimensionBehaviour6) {
                                        r21 = r21;
                                        if (m2735u() > iM2735u) {
                                            this.f4972K0 = r12;
                                            this.f4857V[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                                            m2717R(iM2735u);
                                            ?? r25 = r12;
                                            z15 = r25 == true ? 1 : 0;
                                            r21 = r25;
                                        }
                                    }
                                    r21 = r21;
                                    r21 = r21;
                                    if (this.f4857V[r12] == dimensionBehaviour6) {
                                        r21 = z17;
                                        z13 = z15;
                                        i18 = 8;
                                        r22 = r21;
                                    } else {
                                        r21 = z17;
                                        z13 = z15;
                                        i18 = 8;
                                        r22 = r21;
                                    }
                                } else {
                                    r21 = z17;
                                    z13 = z15;
                                    i18 = 8;
                                    r22 = r21;
                                }
                                if (i16 > i18) {
                                    r14 = 0;
                                } else {
                                    r14 = r22;
                                }
                                i15 = i16;
                                r13 = r14;
                            }
                        }
                    } catch (Exception e13) {
                        e = e13;
                    }
                } catch (Exception e14) {
                    e = e14;
                    r15 = r13;
                }
                zArr = C0741g.f5033a;
                if (r23 != 0) {
                    zArr[2] = false;
                    zM2768Z2 = m2768Z(64);
                    mo2719T(c0726c, zM2768Z2);
                    size = this.f32872w0.size();
                    i20 = 0;
                    z18 = false;
                    while (i20 < size) {
                        int i53 = size;
                        constraintWidget = this.f32872w0.get(i20);
                        constraintWidget.mo2719T(c0726c, zM2768Z2);
                        boolean z211 = zM2768Z2;
                        boolean z212 = z13;
                        if (constraintWidget.f4878i == -1 || constraintWidget.f4880j != -1) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (z19) {
                            z18 = true;
                        }
                        i20++;
                        size = i53;
                        zM2768Z2 = z211;
                        z13 = z212 ? 1 : 0;
                        z18 = z18;
                    }
                    z15 = z13;
                    z16 = z18;
                } else {
                    z15 = z13 ? 1 : 0;
                    mo2719T(c0726c, zM2768Z);
                    while (i17 < i13) {
                        this.f32872w0.get(i17).mo2719T(c0726c, zM2768Z);
                    }
                    z16 = false;
                }
                if (z12 && i16 < 8 && zArr[2]) {
                    iMax3 = 0;
                    iMax4 = 0;
                    while (i19 < i13) {
                        ConstraintWidget constraintWidget16 = this.f32872w0.get(i19);
                        iMax4 = Math.max(iMax4, constraintWidget16.m2735u() + constraintWidget16.f4865b0);
                        iMax3 = Math.max(iMax3, constraintWidget16.m2731o() + constraintWidget16.f4867c0);
                    }
                    iMax5 = Math.max(this.f4871e0, iMax4);
                    iMax6 = Math.max(this.f4873f0, iMax3);
                    dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    z16 = z16;
                    if (dimensionBehaviour == dimensionBehaviour7 && m2735u() < iMax5) {
                        z16 = z16;
                        m2717R(iMax5);
                        this.f4857V[0] = dimensionBehaviour7;
                        z16 = true;
                        z15 = true;
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour7 && m2731o() < iMax6) {
                        m2714O(iMax6);
                        this.f4857V[1] = dimensionBehaviour7;
                        z16 = true;
                        z15 = true;
                    }
                }
                iMax = Math.max(this.f4871e0, m2735u());
                z17 = z16;
                if (iMax > m2735u()) {
                    m2717R(iMax);
                    this.f4857V[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                    z17 = true;
                    z15 = true;
                }
                iMax2 = Math.max(this.f4873f0, m2731o());
                if (iMax2 > m2731o()) {
                    m2714O(iMax2);
                    r12 = 1;
                    this.f4857V[1] = ConstraintWidget.DimensionBehaviour.FIXED;
                    r21 = 1;
                    z15 = true;
                } else {
                    r12 = 1;
                }
                if (z15) {
                    r21 = z17;
                    dimensionBehaviour5 = this.f4857V[0];
                    dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour5 == dimensionBehaviour6 && iM2735u > 0) {
                        r21 = r21;
                        if (m2735u() > iM2735u) {
                            this.f4972K0 = r12;
                            this.f4857V[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                            m2717R(iM2735u);
                            ?? r26 = r12;
                            z15 = r26 == true ? 1 : 0;
                            r21 = r26;
                        }
                    }
                    r21 = r21;
                    r21 = r21;
                    if (this.f4857V[r12] == dimensionBehaviour6 || iM2731o <= 0 || m2731o() <= iM2731o) {
                        r21 = z17;
                        z13 = z15;
                        i18 = 8;
                        r22 = r21;
                    } else {
                        this.f4973L0 = r12;
                        this.f4857V[r12] = ConstraintWidget.DimensionBehaviour.FIXED;
                        m2714O(iM2731o);
                        i18 = 8;
                        z13 = true;
                        r22 = 1;
                    }
                } else {
                    r21 = z17;
                    z13 = z15;
                    i18 = 8;
                    r22 = r21;
                }
                if (i16 > i18) {
                    r14 = 0;
                } else {
                    r14 = r22;
                }
                i15 = i16;
                r13 = r14;
            }
            z14 = z13 ? 1 : 0;
            this.f32872w0 = arrayList10;
            if (z14) {
                ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr9 = this.f4857V;
                dimensionBehaviourArr9[0] = dimensionBehaviour;
                dimensionBehaviourArr9[1] = dimensionBehaviour2;
            }
            mo2711J(c0726c.f4816l);
        }
        i11 = size2;
        c0726c = c0726c3;
        dimensionBehaviour = dimensionBehaviour12;
        dimensionBehaviour2 = dimensionBehaviour11;
        constraintAnchor2 = constraintAnchor4;
        i12 = iMax7;
        iM2735u = i12;
        iM2731o = i10;
        z10 = false;
        if (m2768Z(64)) {
            z11 = true;
        } else {
            z11 = true;
        }
        c0726c.getClass();
        c0726c.f4811g = false;
        if (this.f4971J0 == 0) {
            c10 = 1;
        } else {
            c10 = 1;
        }
        ArrayList<ConstraintWidget> arrayList11 = this.f32872w0;
        ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr10 = this.f4857V;
        dimensionBehaviour3 = dimensionBehaviourArr10[0];
        dimensionBehaviour4 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        if (dimensionBehaviour3 != dimensionBehaviour4) {
            z12 = true;
        } else {
            z12 = true;
        }
        this.f4967F0 = 0;
        this.f4968G0 = 0;
        i13 = i11;
        while (i14 < i13) {
            constraintWidget2 = this.f32872w0.get(i14);
            if (constraintWidget2 instanceof C5040c) {
                ((C5040c) constraintWidget2).mo2764U();
            }
        }
        zM2768Z = m2768Z(64);
        z13 = z10;
        i15 = 0;
        r13 = 1;
        while (r13 != 0) {
            i16 = i15 + 1;
            c0726c.m2683t();
            this.f4967F0 = 0;
            this.f4968G0 = 0;
            m2727k(c0726c);
            while (i21 < i13) {
                this.f32872w0.get(i21).m2727k(c0726c);
            }
            m2766W(c0726c);
            weakReference = this.f4974M0;
            if (weakReference != null) {
                weakReference2 = this.f4976O0;
                if (weakReference2 != null) {
                    c0726c.m2670f(c0726c.m2675k(this.f4849N), c0726c.m2675k(this.f4976O0.get()), 0, 5);
                    this.f4976O0 = null;
                }
                weakReference3 = this.f4975N0;
                if (weakReference3 != null) {
                    constraintAnchor3 = constraintAnchor;
                    constraintAnchor = constraintAnchor3;
                    c0726c.m2670f(c0726c.m2675k(this.f4975N0.get()), c0726c.m2675k(constraintAnchor3), 0, 5);
                    this.f4975N0 = null;
                }
                weakReference4 = this.f4977P0;
                if (weakReference4 == null) {
                }
                c0726c.m2679p();
                r23 = 1;
            } else {
                weakReference2 = this.f4976O0;
                if (weakReference2 != null) {
                    c0726c.m2670f(c0726c.m2675k(this.f4849N), c0726c.m2675k(this.f4976O0.get()), 0, 5);
                    this.f4976O0 = null;
                }
                weakReference3 = this.f4975N0;
                if (weakReference3 != null) {
                    constraintAnchor3 = constraintAnchor;
                    constraintAnchor = constraintAnchor3;
                    c0726c.m2670f(c0726c.m2675k(this.f4975N0.get()), c0726c.m2675k(constraintAnchor3), 0, 5);
                    this.f4975N0 = null;
                }
                weakReference4 = this.f4977P0;
                if (weakReference4 == null) {
                }
                c0726c.m2679p();
                r23 = 1;
            }
            zArr = C0741g.f5033a;
            if (r23 != 0) {
                zArr[2] = false;
                zM2768Z2 = m2768Z(64);
                mo2719T(c0726c, zM2768Z2);
                size = this.f32872w0.size();
                i20 = 0;
                z18 = false;
                while (i20 < size) {
                    int i54 = size;
                    constraintWidget = this.f32872w0.get(i20);
                    constraintWidget.mo2719T(c0726c, zM2768Z2);
                    boolean z213 = zM2768Z2;
                    boolean z214 = z13;
                    if (constraintWidget.f4878i == -1) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    if (z19) {
                        z18 = true;
                    }
                    i20++;
                    size = i54;
                    zM2768Z2 = z213;
                    z13 = z214 ? 1 : 0;
                    z18 = z18;
                }
                z15 = z13;
                z16 = z18;
            } else {
                z15 = z13 ? 1 : 0;
                mo2719T(c0726c, zM2768Z);
                while (i17 < i13) {
                    this.f32872w0.get(i17).mo2719T(c0726c, zM2768Z);
                }
                z16 = false;
            }
            if (z12) {
                iMax3 = 0;
                iMax4 = 0;
                while (i19 < i13) {
                    ConstraintWidget constraintWidget17 = this.f32872w0.get(i19);
                    iMax4 = Math.max(iMax4, constraintWidget17.m2735u() + constraintWidget17.f4865b0);
                    iMax3 = Math.max(iMax3, constraintWidget17.m2731o() + constraintWidget17.f4867c0);
                }
                iMax5 = Math.max(this.f4871e0, iMax4);
                iMax6 = Math.max(this.f4873f0, iMax3);
                dimensionBehaviour7 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                z16 = z16;
                if (dimensionBehaviour == dimensionBehaviour7) {
                    z16 = z16;
                    m2717R(iMax5);
                    this.f4857V[0] = dimensionBehaviour7;
                    z16 = true;
                    z15 = true;
                }
                if (dimensionBehaviour2 == dimensionBehaviour7) {
                    m2714O(iMax6);
                    this.f4857V[1] = dimensionBehaviour7;
                    z16 = true;
                    z15 = true;
                }
            }
            iMax = Math.max(this.f4871e0, m2735u());
            z17 = z16;
            if (iMax > m2735u()) {
                m2717R(iMax);
                this.f4857V[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                z17 = true;
                z15 = true;
            }
            iMax2 = Math.max(this.f4873f0, m2731o());
            if (iMax2 > m2731o()) {
                m2714O(iMax2);
                r12 = 1;
                this.f4857V[1] = ConstraintWidget.DimensionBehaviour.FIXED;
                r21 = 1;
                z15 = true;
            } else {
                r12 = 1;
            }
            if (z15) {
                r21 = z17;
                dimensionBehaviour5 = this.f4857V[0];
                dimensionBehaviour6 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                if (dimensionBehaviour5 == dimensionBehaviour6) {
                    r21 = r21;
                    if (m2735u() > iM2735u) {
                        this.f4972K0 = r12;
                        this.f4857V[0] = ConstraintWidget.DimensionBehaviour.FIXED;
                        m2717R(iM2735u);
                        ?? r27 = r12;
                        z15 = r27 == true ? 1 : 0;
                        r21 = r27;
                    }
                }
                r21 = r21;
                r21 = r21;
                if (this.f4857V[r12] == dimensionBehaviour6) {
                    r21 = z17;
                    z13 = z15;
                    i18 = 8;
                    r22 = r21;
                } else {
                    r21 = z17;
                    z13 = z15;
                    i18 = 8;
                    r22 = r21;
                }
            } else {
                r21 = z17;
                z13 = z15;
                i18 = 8;
                r22 = r21;
            }
            if (i16 > i18) {
                r14 = 0;
            } else {
                r14 = r22;
            }
            i15 = i16;
            r13 = r14;
        }
        z14 = z13 ? 1 : 0;
        this.f32872w0 = arrayList11;
        if (z14) {
            ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr11 = this.f4857V;
            dimensionBehaviourArr11[0] = dimensionBehaviour;
            dimensionBehaviourArr11[1] = dimensionBehaviour2;
        }
        mo2711J(c0726c.f4816l);
    }

    /* JADX INFO: renamed from: V */
    public final void m2765V(int i10, ConstraintWidget constraintWidget) {
        if (i10 == 0) {
            int i11 = this.f4967F0 + 1;
            C0737c[] c0737cArr = this.f4970I0;
            if (i11 >= c0737cArr.length) {
                this.f4970I0 = (C0737c[]) Arrays.copyOf(c0737cArr, c0737cArr.length * 2);
            }
            C0737c[] c0737cArr2 = this.f4970I0;
            int i12 = this.f4967F0;
            c0737cArr2[i12] = new C0737c(constraintWidget, 0, this.f4963B0);
            this.f4967F0 = i12 + 1;
            return;
        }
        if (i10 == 1) {
            int i13 = this.f4968G0 + 1;
            C0737c[] c0737cArr3 = this.f4969H0;
            if (i13 >= c0737cArr3.length) {
                this.f4969H0 = (C0737c[]) Arrays.copyOf(c0737cArr3, c0737cArr3.length * 2);
            }
            C0737c[] c0737cArr4 = this.f4969H0;
            int i14 = this.f4968G0;
            c0737cArr4[i14] = new C0737c(constraintWidget, 1, this.f4963B0);
            this.f4968G0 = i14 + 1;
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m2766W(C0726c c0726c) {
        boolean z10;
        boolean zM2768Z = m2768Z(64);
        mo2721e(c0726c, zM2768Z);
        int size = this.f32872w0.size();
        boolean z11 = false;
        for (int i10 = 0; i10 < size; i10++) {
            ConstraintWidget constraintWidget = this.f32872w0.get(i10);
            boolean[] zArr = constraintWidget.f4856U;
            zArr[0] = false;
            zArr[1] = false;
            if (constraintWidget instanceof C0730a) {
                z11 = true;
            }
        }
        if (z11) {
            for (int i11 = 0; i11 < size; i11++) {
                ConstraintWidget constraintWidget2 = this.f32872w0.get(i11);
                if (constraintWidget2 instanceof C0730a) {
                    C0730a c0730a = (C0730a) constraintWidget2;
                    for (int i12 = 0; i12 < c0730a.f32871x0; i12++) {
                        ConstraintWidget constraintWidget3 = c0730a.f32870w0[i12];
                        if (c0730a.f4915z0 || constraintWidget3.mo2722f()) {
                            int i13 = c0730a.f4914y0;
                            if (i13 == 0 || i13 == 1) {
                                constraintWidget3.f4856U[0] = true;
                            } else if (i13 == 2 || i13 == 3) {
                                constraintWidget3.f4856U[1] = true;
                            }
                        }
                    }
                }
            }
        }
        HashSet<ConstraintWidget> hashSet = this.f4978Q0;
        hashSet.clear();
        for (int i14 = 0; i14 < size; i14++) {
            ConstraintWidget constraintWidget4 = this.f32872w0.get(i14);
            constraintWidget4.getClass();
            if ((constraintWidget4 instanceof C0743i) || (constraintWidget4 instanceof C0740f)) {
                if (constraintWidget4 instanceof C0743i) {
                    hashSet.add(constraintWidget4);
                } else {
                    constraintWidget4.mo2721e(c0726c, zM2768Z);
                }
            }
        }
        while (hashSet.size() > 0) {
            int size2 = hashSet.size();
            Iterator<ConstraintWidget> it = hashSet.iterator();
            while (it.hasNext()) {
                C0743i c0743i = (C0743i) it.next();
                int i15 = 0;
                while (true) {
                    if (i15 >= c0743i.f32871x0) {
                        z10 = false;
                        break;
                    } else {
                        if (hashSet.contains(c0743i.f32870w0[i15])) {
                            z10 = true;
                            break;
                        }
                        i15++;
                    }
                }
                if (z10) {
                    c0743i.mo2721e(c0726c, zM2768Z);
                    hashSet.remove(c0743i);
                    break;
                }
            }
            if (size2 == hashSet.size()) {
                Iterator<ConstraintWidget> it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    it2.next().mo2721e(c0726c, zM2768Z);
                }
                hashSet.clear();
            }
        }
        if (C0726c.f4803p) {
            HashSet<ConstraintWidget> hashSet2 = new HashSet<>();
            for (int i16 = 0; i16 < size; i16++) {
                ConstraintWidget constraintWidget5 = this.f32872w0.get(i16);
                constraintWidget5.getClass();
                if (!((constraintWidget5 instanceof C0743i) || (constraintWidget5 instanceof C0740f))) {
                    hashSet2.add(constraintWidget5);
                }
            }
            m2720d(this, c0726c, hashSet2, this.f4857V[0] == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT ? 0 : 1, false);
            for (ConstraintWidget constraintWidget6 : hashSet2) {
                C0741g.m2780a(this, c0726c, constraintWidget6);
                constraintWidget6.mo2721e(c0726c, zM2768Z);
            }
        } else {
            for (int i17 = 0; i17 < size; i17++) {
                ConstraintWidget constraintWidget7 = this.f32872w0.get(i17);
                if (constraintWidget7 instanceof C0738d) {
                    ConstraintWidget.DimensionBehaviour[] dimensionBehaviourArr = constraintWidget7.f4857V;
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour = dimensionBehaviourArr[0];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = dimensionBehaviourArr[1];
                    ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget7.m2715P(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget7.m2716Q(ConstraintWidget.DimensionBehaviour.FIXED);
                    }
                    constraintWidget7.mo2721e(c0726c, zM2768Z);
                    if (dimensionBehaviour == dimensionBehaviour3) {
                        constraintWidget7.m2715P(dimensionBehaviour);
                    }
                    if (dimensionBehaviour2 == dimensionBehaviour3) {
                        constraintWidget7.m2716Q(dimensionBehaviour2);
                    }
                } else {
                    C0741g.m2780a(this, c0726c, constraintWidget7);
                    if (!((constraintWidget7 instanceof C0743i) || (constraintWidget7 instanceof C0740f))) {
                        constraintWidget7.mo2721e(c0726c, zM2768Z);
                    }
                }
            }
        }
        if (this.f4967F0 > 0) {
            C0736b.m2762a(this, c0726c, null, 0);
        }
        if (this.f4968G0 > 0) {
            C0736b.m2762a(this, c0726c, null, 1);
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00d0  */
    /* JADX INFO: renamed from: X */
    public final boolean m2767X(int i10, boolean z10) {
        boolean z11;
        WidgetRun next;
        ConstraintWidget.DimensionBehaviour dimensionBehaviour;
        boolean z12 = true;
        boolean z13 = z10 & true;
        C5357e c5357e = this.f4981y0;
        C0738d c0738d = c5357e.f33673a;
        ConstraintWidget.DimensionBehaviour dimensionBehaviourM2730n = c0738d.m2730n(0);
        ConstraintWidget.DimensionBehaviour dimensionBehaviourM2730n2 = c0738d.m2730n(1);
        int iM2736v = c0738d.m2736v();
        int iM2737w = c0738d.m2737w();
        ArrayList<WidgetRun> arrayList = c5357e.f33677e;
        if (z13 && (dimensionBehaviourM2730n == (dimensionBehaviour = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) || dimensionBehaviourM2730n2 == dimensionBehaviour)) {
            for (WidgetRun widgetRun : arrayList) {
                if (widgetRun.f4933f == i10 && !widgetRun.mo2756k()) {
                    z13 = false;
                    break;
                }
            }
            if (i10 == 0) {
                if (z13 && dimensionBehaviourM2730n == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                    c0738d.m2715P(ConstraintWidget.DimensionBehaviour.FIXED);
                    c0738d.m2717R(c5357e.m11485d(c0738d, 0));
                    c0738d.f4868d.f4932e.mo2746d(c0738d.m2735u());
                }
            } else if (z13 && dimensionBehaviourM2730n2 == ConstraintWidget.DimensionBehaviour.WRAP_CONTENT) {
                c0738d.m2716Q(ConstraintWidget.DimensionBehaviour.FIXED);
                c0738d.m2714O(c5357e.m11485d(c0738d, 1));
                c0738d.f4870e.f4932e.mo2746d(c0738d.m2731o());
            }
        }
        if (i10 == 0) {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = c0738d.f4857V[0];
            if (dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour2 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int iM2735u = c0738d.m2735u() + iM2736v;
                c0738d.f4868d.f4936i.mo2746d(iM2735u);
                c0738d.f4868d.f4932e.mo2746d(iM2735u - iM2736v);
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            ConstraintWidget.DimensionBehaviour dimensionBehaviour3 = c0738d.f4857V[1];
            if (dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.FIXED || dimensionBehaviour3 == ConstraintWidget.DimensionBehaviour.MATCH_PARENT) {
                int iM2731o = c0738d.m2731o() + iM2737w;
                c0738d.f4870e.f4936i.mo2746d(iM2731o);
                c0738d.f4870e.f4932e.mo2746d(iM2731o - iM2737w);
                z11 = true;
            } else {
                z11 = false;
            }
        }
        c5357e.m11488g();
        for (WidgetRun widgetRun2 : arrayList) {
            if (widgetRun2.f4933f == i10 && (widgetRun2.f4929b != c0738d || widgetRun2.f4934g)) {
                widgetRun2.mo2752e();
            }
        }
        Iterator<WidgetRun> it = arrayList.iterator();
        while (true) {
            while (true) {
                if (it.hasNext()) {
                    next = it.next();
                    if (next.f4933f == i10 && (z11 || next.f4929b != c0738d)) {
                        break;
                    }
                }
                c0738d.m2715P(dimensionBehaviourM2730n);
                c0738d.m2716Q(dimensionBehaviourM2730n2);
                return z12;
            }
            if (!next.f4935h.f4925j || !next.f4936i.f4925j || (!(next instanceof C5355c) && !next.f4932e.f4925j)) {
                break;
                break;
                break;
            }
        }
        z12 = false;
        c0738d.m2715P(dimensionBehaviourM2730n);
        c0738d.m2716Q(dimensionBehaviourM2730n2);
        return z12;
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m2768Z(int i10) {
        return (this.f4971J0 & i10) == i10;
    }

    @Override // androidx.constraintlayout.core.widgets.ConstraintWidget
    /* JADX INFO: renamed from: r */
    public final void mo2734r(StringBuilder sb2) {
        sb2.append(this.f4882k + ":{\n");
        StringBuilder sb3 = new StringBuilder("  actualWidth:");
        sb3.append(this.f4859X);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("  actualHeight:" + this.f4860Y);
        sb2.append("\n");
        Iterator<ConstraintWidget> it = this.f32872w0.iterator();
        while (it.hasNext()) {
            it.next().mo2734r(sb2);
            sb2.append(",\n");
        }
        sb2.append("}");
    }
}
