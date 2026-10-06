package p000;

import android.graphics.Rect;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class fcw {

    /* JADX INFO: renamed from: a */
    public final boolean f21313a;

    /* JADX INFO: renamed from: b */
    public final float f21314b;

    /* JADX INFO: renamed from: c */
    public final String f21315c;

    /* JADX INFO: renamed from: d */
    public final boolean f21316d;

    /* JADX INFO: renamed from: e */
    public final boolean f21317e;

    /* JADX INFO: renamed from: f */
    public final boolean f21318f;

    /* JADX INFO: renamed from: g */
    public final float f21319g;

    /* JADX INFO: renamed from: h */
    public final Boolean f21320h;

    /* JADX INFO: renamed from: i */
    public final Rect f21321i;

    /* JADX INFO: renamed from: j */
    public final Boolean f21322j;

    /* JADX INFO: renamed from: k */
    public final Boolean f21323k;

    /* JADX INFO: renamed from: l */
    public final nip f21324l;

    /* JADX INFO: renamed from: m */
    public final mrm f21325m;

    /* JADX INFO: renamed from: n */
    public final nji f21326n;

    /* JADX INFO: renamed from: o */
    public final boolean f21327o;

    /* JADX INFO: renamed from: p */
    public final nim f21328p;

    /* JADX INFO: renamed from: q */
    public final boolean f21329q;

    /* JADX INFO: renamed from: r */
    public final mrm f21330r;

    /* JADX INFO: renamed from: s */
    public final int f21331s;

    /* JADX INFO: renamed from: t */
    public final int f21332t;

    /* JADX INFO: renamed from: u */
    private final String f21333u;

    public fcw() {
    }

    public fcw(int i, String str, boolean z, float f, String str2, boolean z2, boolean z3, boolean z4, float f2, Boolean bool, Rect rect, Boolean bool2, Boolean bool3, int i2, nip nipVar, mrm mrmVar, nji njiVar, boolean z5, nim nimVar, boolean z6, mrm mrmVar2) {
        this.f21331s = i;
        this.f21333u = str;
        this.f21313a = z;
        this.f21314b = f;
        this.f21315c = str2;
        this.f21316d = z2;
        this.f21317e = z3;
        this.f21318f = z4;
        this.f21319g = f2;
        this.f21320h = bool;
        this.f21321i = rect;
        this.f21322j = bool2;
        this.f21323k = bool3;
        this.f21332t = i2;
        this.f21324l = nipVar;
        this.f21325m = mrmVar;
        this.f21326n = njiVar;
        this.f21327o = z5;
        this.f21328p = nimVar;
        this.f21329q = z6;
        this.f21330r = mrmVar2;
    }

    /* JADX INFO: renamed from: a */
    public static fcv m8223a() {
        fcv fcvVar = new fcv(null);
        fcvVar.f21296f = 1;
        fcvVar.m8211e(nip.f42751h);
        fcvVar.f21293c = mqu.f41450a;
        fcvVar.m8213g(nji.f42924d);
        fcvVar.m8210d(nim.f42730e);
        fcvVar.m8220n(false);
        fcvVar.f21294d = mqu.f41450a;
        return fcvVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof fcw)) {
            return false;
        }
        fcw fcwVar = (fcw) obj;
        int i = this.f21331s;
        int i2 = fcwVar.f21331s;
        if (i == 0) {
            throw null;
        }
        if (i == i2 && this.f21333u.equals(fcwVar.f21333u) && this.f21313a == fcwVar.f21313a && Float.floatToIntBits(this.f21314b) == Float.floatToIntBits(fcwVar.f21314b) && this.f21315c.equals(fcwVar.f21315c) && this.f21316d == fcwVar.f21316d && this.f21317e == fcwVar.f21317e && this.f21318f == fcwVar.f21318f && Float.floatToIntBits(this.f21319g) == Float.floatToIntBits(fcwVar.f21319g) && this.f21320h.equals(fcwVar.f21320h) && this.f21321i.equals(fcwVar.f21321i) && this.f21322j.equals(fcwVar.f21322j) && this.f21323k.equals(fcwVar.f21323k)) {
            int i3 = this.f21332t;
            int i4 = fcwVar.f21332t;
            if (i3 == 0) {
                throw null;
            }
            if (i3 == i4 && this.f21324l.equals(fcwVar.f21324l) && this.f21325m.equals(fcwVar.f21325m) && this.f21326n.equals(fcwVar.f21326n) && this.f21327o == fcwVar.f21327o && this.f21328p.equals(fcwVar.f21328p) && this.f21329q == fcwVar.f21329q && this.f21330r.equals(fcwVar.f21330r)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iM18134L;
        int iM18134L2;
        int iM18134L3;
        int i = this.f21331s;
        if (i == 0) {
            throw null;
        }
        int iHashCode = ((((((((i ^ 1000003) * 1000003) ^ this.f21333u.hashCode()) * 1000003) ^ (true != this.f21313a ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.f21314b)) * 1000003) ^ this.f21315c.hashCode();
        int i2 = true != this.f21316d ? 1237 : 1231;
        int iFloatToIntBits = (((((((((((((((iHashCode * 1000003) ^ i2) * 1000003) ^ (true != this.f21317e ? 1237 : 1231)) * 1000003) ^ (true != this.f21318f ? 1237 : 1231)) * 1000003) ^ Float.floatToIntBits(this.f21319g)) * 1000003) ^ this.f21320h.hashCode()) * 1000003) ^ this.f21321i.hashCode()) * 1000003) ^ this.f21322j.hashCode()) * 1000003) ^ this.f21323k.hashCode();
        int i3 = this.f21332t;
        if (i3 == 0) {
            throw null;
        }
        int i4 = iFloatToIntBits * 1000003;
        nip nipVar = this.f21324l;
        if (nipVar.m18142ac()) {
            iM18134L = nipVar.m18134L();
        } else {
            int iM18134L4 = nipVar.f44820aG;
            if (iM18134L4 == 0) {
                iM18134L4 = nipVar.m18134L();
                nipVar.f44820aG = iM18134L4;
            }
            iM18134L = iM18134L4;
        }
        int iHashCode2 = (((((i4 ^ i3) * 1000003) ^ iM18134L) * 1000003) ^ this.f21325m.hashCode()) * 1000003;
        nji njiVar = this.f21326n;
        if (njiVar.m18142ac()) {
            iM18134L2 = njiVar.m18134L();
        } else {
            int iM18134L5 = njiVar.f44820aG;
            if (iM18134L5 == 0) {
                iM18134L5 = njiVar.m18134L();
                njiVar.f44820aG = iM18134L5;
            }
            iM18134L2 = iM18134L5;
        }
        int i5 = (((iHashCode2 ^ iM18134L2) * 1000003) ^ (true != this.f21327o ? 1237 : 1231)) * 1000003;
        nim nimVar = this.f21328p;
        if (nimVar.m18142ac()) {
            iM18134L3 = nimVar.m18134L();
        } else {
            int iM18134L6 = nimVar.f44820aG;
            if (iM18134L6 == 0) {
                iM18134L6 = nimVar.m18134L();
                nimVar.f44820aG = iM18134L6;
            }
            iM18134L3 = iM18134L6;
        }
        return ((((i5 ^ iM18134L3) * 1000003) ^ (true == this.f21329q ? 1231 : 1237)) * 1000003) ^ this.f21330r.hashCode();
    }

    public final String toString() {
        int i = this.f21331s;
        String string = i != 0 ? Integer.toString(i - 1) : "null";
        String str = this.f21333u;
        boolean z = this.f21313a;
        float f = this.f21314b;
        String str2 = this.f21315c;
        boolean z2 = this.f21316d;
        boolean z3 = this.f21317e;
        boolean z4 = this.f21318f;
        float f2 = this.f21319g;
        Boolean bool = this.f21320h;
        String strValueOf = String.valueOf(this.f21321i);
        Boolean bool2 = this.f21322j;
        Boolean bool3 = this.f21323k;
        int i2 = this.f21332t;
        return "DecorateAtTimeCaptureRequestData{mode=" + string + ", filename=" + str + ", frontFacing=" + z + ", zoom=" + f + ", flashSetting=" + str2 + ", anglerfishOn=" + z2 + ", gridLinesOn=" + z3 + ", selfieMirrorOn=" + z4 + ", timerSeconds=" + f2 + ", volumeButtonShutter=" + bool + ", activeSensorSize=" + strValueOf + ", isSelfieFlashOn=" + bool2 + ", rawMode=" + bool3 + ", afLockState=" + (i2 != 0 ? Integer.toString(i2 - 1) : "null") + ", dualEvStats=" + String.valueOf(this.f21324l) + ", manualWhiteBalanceStats=" + String.valueOf(this.f21325m) + ", frequentFaceMetadata=" + String.valueOf(this.f21326n) + ", isPrivateStorage=" + this.f21327o + ", deviceFoldState=" + String.valueOf(this.f21328p) + ", talkBackEnabled=" + this.f21329q + ", hotshotData=" + String.valueOf(this.f21330r) + "}";
    }
}
