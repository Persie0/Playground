package kotlinx.datetime.format;

import p000.bha;
import p000.vn7;

/* JADX INFO: renamed from: kotlinx.datetime.format.c */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3252c {

    /* JADX INFO: renamed from: a */
    public static final bha f48215a;

    /* JADX INFO: renamed from: b */
    public static final bha f48216b;

    /* JADX INFO: renamed from: c */
    public static final bha f48217c;

    static {
        C3251b c3251b = new C3251b();
        f48215a = new bha(new vn7(OffsetFields$totalHoursAbs$1.f48204i), 18, c3251b, 8);
        f48216b = new bha(new vn7(OffsetFields$minutesOfHour$1.f48201i), 59, c3251b, 8);
        f48217c = new bha(new vn7(OffsetFields$secondsOfMinute$1.f48202i), 59, c3251b, 8);
    }
}
