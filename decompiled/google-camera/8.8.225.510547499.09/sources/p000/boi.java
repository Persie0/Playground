package p000;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class boi {

    /* JADX INFO: renamed from: a */
    private static final boo f3986a = new boo("CamSet");

    /* JADX INFO: renamed from: d */
    protected final Map f3987d;

    /* JADX INFO: renamed from: e */
    protected final List f3988e;

    /* JADX INFO: renamed from: f */
    protected final List f3989f;

    /* JADX INFO: renamed from: g */
    protected boolean f3990g;

    /* JADX INFO: renamed from: h */
    protected int f3991h;

    /* JADX INFO: renamed from: i */
    protected int f3992i;

    /* JADX INFO: renamed from: j */
    protected int f3993j;

    /* JADX INFO: renamed from: k */
    protected bon f3994k;

    /* JADX INFO: renamed from: l */
    public int f3995l;

    /* JADX INFO: renamed from: m */
    protected bon f3996m;

    /* JADX INFO: renamed from: n */
    protected byte f3997n;

    /* JADX INFO: renamed from: o */
    protected int f3998o;

    /* JADX INFO: renamed from: p */
    protected float f3999p;

    /* JADX INFO: renamed from: q */
    public int f4000q;

    /* JADX INFO: renamed from: r */
    public bnx f4001r;

    /* JADX INFO: renamed from: s */
    public bny f4002s;

    /* JADX INFO: renamed from: t */
    public bnz f4003t;

    /* JADX INFO: renamed from: u */
    protected boa f4004u;

    /* JADX INFO: renamed from: v */
    protected boolean f4005v;

    /* JADX INFO: renamed from: w */
    protected boolean f4006w;

    /* JADX INFO: renamed from: x */
    protected boolean f4007x;

    /* JADX INFO: renamed from: y */
    protected boolean f4008y;

    /* JADX INFO: renamed from: z */
    public bon f4009z;

    protected boi() {
        this.f3987d = new TreeMap();
        this.f3988e = new ArrayList();
        this.f3989f = new ArrayList();
    }

    /* JADX INFO: renamed from: a */
    public abstract boi mo2753a();

    /* JADX INFO: renamed from: d */
    public void mo2756d() {
        this.f3999p = 1.0f;
    }

    /* JADX INFO: renamed from: e */
    public final bon m2792e() {
        return new bon(this.f3996m);
    }

    /* JADX INFO: renamed from: f */
    public final bon m2793f() {
        return new bon(this.f3994k);
    }

    /* JADX INFO: renamed from: g */
    public final List m2794g() {
        return new ArrayList(this.f3989f);
    }

    /* JADX INFO: renamed from: h */
    public final List m2795h() {
        return new ArrayList(this.f3988e);
    }

    /* JADX INFO: renamed from: i */
    public final void m2796i(int i) {
        if (i <= 0 || i > 100) {
            bop.m2814c(f3986a, "Ignoring JPEG quality that falls outside the expected range");
        } else {
            this.f3997n = (byte) i;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m2797j(int i, int i2) {
        this.f3992i = i > i2 ? i : i2;
        if (i > i2) {
            i = i2;
        }
        this.f3991h = i;
        this.f3993j = -1;
    }

    /* JADX INFO: renamed from: k */
    public final void m2798k(bon bonVar) {
        if (this.f3990g) {
            bop.m2814c(f3986a, "Attempt to change photo size while locked");
        } else {
            this.f3996m = new bon(bonVar);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m2799l(bon bonVar) {
        if (this.f3990g) {
            bop.m2814c(f3986a, "Attempt to change preview size while locked");
        } else {
            this.f3994k = new bon(bonVar);
        }
    }

    protected boi(boi boiVar) {
        TreeMap treeMap = new TreeMap();
        this.f3987d = treeMap;
        ArrayList arrayList = new ArrayList();
        this.f3988e = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f3989f = arrayList2;
        treeMap.putAll(boiVar.f3987d);
        arrayList.addAll(boiVar.f3988e);
        arrayList2.addAll(boiVar.f3989f);
        this.f3990g = boiVar.f3990g;
        this.f3991h = boiVar.f3991h;
        this.f3992i = boiVar.f3992i;
        this.f3993j = boiVar.f3993j;
        bon bonVar = boiVar.f3994k;
        this.f3994k = bonVar == null ? null : new bon(bonVar);
        this.f3995l = boiVar.f3995l;
        bon bonVar2 = boiVar.f3996m;
        this.f3996m = bonVar2 != null ? new bon(bonVar2) : null;
        this.f3997n = boiVar.f3997n;
        this.f3998o = boiVar.f3998o;
        this.f3999p = boiVar.f3999p;
        this.f4000q = boiVar.f4000q;
        this.f4001r = boiVar.f4001r;
        this.f4002s = boiVar.f4002s;
        this.f4003t = boiVar.f4003t;
        this.f4004u = boiVar.f4004u;
        this.f4005v = boiVar.f4005v;
        this.f4006w = boiVar.f4006w;
        this.f4007x = boiVar.f4007x;
        this.f4008y = boiVar.f4008y;
        this.f4009z = boiVar.f4009z;
    }
}
