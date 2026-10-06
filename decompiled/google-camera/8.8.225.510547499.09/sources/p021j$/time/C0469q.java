package p021j$.time;

import p021j$.time.zone.AbstractC0497g;
import p021j$.time.zone.C0493c;

/* JADX INFO: renamed from: j$.time.q */
/* JADX INFO: loaded from: classes3.dex */
final class C0469q extends ZoneId {

    /* JADX INFO: renamed from: b */
    private final String f33029b;

    /* JADX INFO: renamed from: c */
    private final transient C0493c f33030c;

    C0469q(String str, C0493c c0493c) {
        this.f33029b = str;
        this.f33030c = c0493c;
    }

    /* JADX INFO: renamed from: y */
    static C0469q m12403y(String str) {
        int length = str.length();
        if (length < 2) {
            throw new C0417b("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
        }
        for (int i = 0; i < length; i++) {
            char cCharAt = str.charAt(i);
            if ((cCharAt < 'a' || cCharAt > 'z') && ((cCharAt < 'A' || cCharAt > 'Z') && ((cCharAt != '/' || i == 0) && ((cCharAt < '0' || cCharAt > '9' || i == 0) && ((cCharAt != '~' || i == 0) && ((cCharAt != '.' || i == 0) && ((cCharAt != '_' || i == 0) && ((cCharAt != '+' || i == 0) && (cCharAt != '-' || i == 0))))))))) {
                throw new C0417b("Invalid ID for region-based ZoneId, invalid format: ".concat(str));
            }
        }
        return new C0469q(str, AbstractC0497g.m12497a(str, true));
    }

    @Override // p021j$.time.ZoneId
    /* JADX INFO: renamed from: q */
    public final String mo12260q() {
        return this.f33029b;
    }

    @Override // p021j$.time.ZoneId
    /* JADX INFO: renamed from: r */
    public final C0493c mo12261r() {
        C0493c c0493c = this.f33030c;
        return c0493c != null ? c0493c : AbstractC0497g.m12497a(this.f33029b, false);
    }
}
