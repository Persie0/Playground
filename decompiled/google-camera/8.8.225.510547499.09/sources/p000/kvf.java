package p000;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kvf {

    /* JADX INFO: renamed from: a */
    public final kvp f37334a;

    /* JADX INFO: renamed from: b */
    public final kve f37335b;

    /* JADX INFO: renamed from: c */
    public final String f37336c;

    /* JADX INFO: renamed from: d */
    public final mrm f37337d;

    /* JADX INFO: renamed from: e */
    public final mrm f37338e;

    /* JADX INFO: renamed from: f */
    public final mrm f37339f;

    /* JADX INFO: renamed from: g */
    public final mrm f37340g;

    /* JADX INFO: renamed from: h */
    public final mrm f37341h;

    /* JADX INFO: renamed from: i */
    public final mrm f37342i;

    /* JADX INFO: renamed from: j */
    public final mrm f37343j;

    /* JADX INFO: renamed from: k */
    private final mrm f37344k;

    public kvf() {
    }

    public kvf(kvp kvpVar, kve kveVar, String str, mrm mrmVar, mrm mrmVar2, mrm mrmVar3, mrm mrmVar4, mrm mrmVar5, mrm mrmVar6, mrm mrmVar7, mrm mrmVar8) {
        this.f37334a = kvpVar;
        this.f37335b = kveVar;
        this.f37336c = str;
        this.f37344k = mrmVar;
        this.f37337d = mrmVar2;
        this.f37338e = mrmVar3;
        this.f37339f = mrmVar4;
        this.f37340g = mrmVar5;
        this.f37341h = mrmVar6;
        this.f37342i = mrmVar7;
        this.f37343j = mrmVar8;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof kvf) {
            kvf kvfVar = (kvf) obj;
            if (this.f37334a.equals(kvfVar.f37334a) && this.f37335b.equals(kvfVar.f37335b) && this.f37336c.equals(kvfVar.f37336c) && this.f37344k.equals(kvfVar.f37344k) && this.f37337d.equals(kvfVar.f37337d) && this.f37338e.equals(kvfVar.f37338e) && this.f37339f.equals(kvfVar.f37339f) && this.f37340g.equals(kvfVar.f37340g) && this.f37341h.equals(kvfVar.f37341h) && this.f37342i.equals(kvfVar.f37342i) && this.f37343j.equals(kvfVar.f37343j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((((this.f37334a.hashCode() ^ 1000003) * 1000003) ^ this.f37335b.hashCode()) * 1000003) ^ this.f37336c.hashCode()) * 1000003) ^ this.f37344k.hashCode()) * 1000003) ^ this.f37337d.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332) * 1000003) ^ this.f37340g.hashCode()) * 1000003) ^ this.f37341h.hashCode()) * 1000003) ^ this.f37342i.hashCode()) * 1000003) ^ this.f37343j.hashCode();
    }

    public final String toString() {
        return "ActionData{actionType=" + String.valueOf(this.f37334a) + ", engineType=" + String.valueOf(this.f37335b) + ", actionText=" + this.f37336c + ", displayText=" + String.valueOf(this.f37344k) + ", calendarEvent=" + String.valueOf(this.f37337d) + ", calendarBegin=" + String.valueOf(this.f37338e) + ", calendarEnd=" + String.valueOf(this.f37339f) + ", contact=" + String.valueOf(this.f37340g) + ", geo=" + String.valueOf(this.f37341h) + ", sms=" + String.valueOf(this.f37342i) + ", wifiNetwork=" + String.valueOf(this.f37343j) + "}";
    }
}
