package p000;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.TreeSet;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class bob {

    /* JADX INFO: renamed from: a */
    public static final boo f3955a = new boo("CamCapabs");

    /* JADX INFO: renamed from: b */
    public final ArrayList f3956b;

    /* JADX INFO: renamed from: c */
    public final ArrayList f3957c;

    /* JADX INFO: renamed from: d */
    protected final TreeSet f3958d;

    /* JADX INFO: renamed from: e */
    protected final ArrayList f3959e;

    /* JADX INFO: renamed from: f */
    public final ArrayList f3960f;

    /* JADX INFO: renamed from: g */
    protected final TreeSet f3961g;

    /* JADX INFO: renamed from: h */
    public final EnumSet f3962h;

    /* JADX INFO: renamed from: i */
    protected final EnumSet f3963i;

    /* JADX INFO: renamed from: j */
    protected final EnumSet f3964j;

    /* JADX INFO: renamed from: k */
    protected final EnumSet f3965k;

    /* JADX INFO: renamed from: l */
    protected final EnumSet f3966l;

    /* JADX INFO: renamed from: m */
    protected bon f3967m;

    /* JADX INFO: renamed from: n */
    protected int f3968n;

    /* JADX INFO: renamed from: o */
    protected int f3969o;

    /* JADX INFO: renamed from: p */
    protected float f3970p;

    /* JADX INFO: renamed from: q */
    protected int f3971q;

    /* JADX INFO: renamed from: r */
    protected int f3972r;

    /* JADX INFO: renamed from: s */
    protected int f3973s;

    /* JADX INFO: renamed from: t */
    protected float f3974t;

    /* JADX INFO: renamed from: u */
    public float f3975u;

    /* JADX INFO: renamed from: v */
    protected float f3976v;

    /* JADX INFO: renamed from: w */
    public final bzq f3977w;

    public bob(bzq bzqVar, byte[] bArr, byte[] bArr2, byte[] bArr3) {
        this.f3956b = new ArrayList();
        this.f3957c = new ArrayList();
        this.f3958d = new TreeSet();
        this.f3959e = new ArrayList();
        this.f3960f = new ArrayList();
        this.f3961g = new TreeSet();
        this.f3962h = EnumSet.noneOf(bnz.class);
        this.f3963i = EnumSet.noneOf(bnx.class);
        this.f3964j = EnumSet.noneOf(bny.class);
        this.f3965k = EnumSet.noneOf(boa.class);
        this.f3966l = EnumSet.noneOf(bnw.class);
        this.f3977w = bzqVar;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m2784d(bnw bnwVar) {
        return bnwVar != null && this.f3966l.contains(bnwVar);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m2785e(bnx bnxVar) {
        return bnxVar != null && this.f3963i.contains(bnxVar);
    }

    /* JADX INFO: renamed from: f */
    public final boolean m2786f(bny bnyVar) {
        return bnyVar != null && this.f3964j.contains(bnyVar);
    }

    public bob(bob bobVar) {
        ArrayList arrayList = new ArrayList();
        this.f3956b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f3957c = arrayList2;
        TreeSet treeSet = new TreeSet();
        this.f3958d = treeSet;
        ArrayList arrayList3 = new ArrayList();
        this.f3959e = arrayList3;
        ArrayList arrayList4 = new ArrayList();
        this.f3960f = arrayList4;
        TreeSet treeSet2 = new TreeSet();
        this.f3961g = treeSet2;
        EnumSet enumSetNoneOf = EnumSet.noneOf(bnz.class);
        this.f3962h = enumSetNoneOf;
        EnumSet enumSetNoneOf2 = EnumSet.noneOf(bnx.class);
        this.f3963i = enumSetNoneOf2;
        EnumSet enumSetNoneOf3 = EnumSet.noneOf(bny.class);
        this.f3964j = enumSetNoneOf3;
        EnumSet enumSetNoneOf4 = EnumSet.noneOf(boa.class);
        this.f3965k = enumSetNoneOf4;
        EnumSet enumSetNoneOf5 = EnumSet.noneOf(bnw.class);
        this.f3966l = enumSetNoneOf5;
        arrayList.addAll(bobVar.f3956b);
        arrayList2.addAll(bobVar.f3957c);
        treeSet.addAll(bobVar.f3958d);
        arrayList3.addAll(bobVar.f3959e);
        arrayList4.addAll(bobVar.f3960f);
        treeSet2.addAll(bobVar.f3961g);
        enumSetNoneOf.addAll(bobVar.f3962h);
        enumSetNoneOf2.addAll(bobVar.f3963i);
        enumSetNoneOf3.addAll(bobVar.f3964j);
        enumSetNoneOf4.addAll(bobVar.f3965k);
        enumSetNoneOf5.addAll(bobVar.f3966l);
        this.f3967m = bobVar.f3967m;
        this.f3969o = bobVar.f3969o;
        this.f3968n = bobVar.f3968n;
        this.f3970p = bobVar.f3970p;
        this.f3971q = bobVar.f3971q;
        this.f3972r = bobVar.f3972r;
        this.f3973s = bobVar.f3973s;
        this.f3974t = bobVar.f3974t;
        this.f3975u = bobVar.f3975u;
        this.f3976v = bobVar.f3976v;
        this.f3977w = bobVar.f3977w;
    }
}
