package p476x7;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import dm.C5207g;
import java.util.UUID;
import p291o7.C8004n;

/* JADX INFO: renamed from: x7.j */
/* JADX INFO: loaded from: classes.dex */
public final class C10111j {

    /* JADX INFO: renamed from: a */
    public final Long f51278a;

    /* JADX INFO: renamed from: b */
    public Long f51279b;

    /* JADX INFO: renamed from: c */
    public UUID f51280c;

    /* JADX INFO: renamed from: d */
    public int f51281d;

    /* JADX INFO: renamed from: e */
    public Long f51282e;

    /* JADX INFO: renamed from: f */
    public C10113l f51283f;

    public C10111j(Long l10, Long l11) {
        UUID uuidRandomUUID = UUID.randomUUID();
        C5207g.m11110e(uuidRandomUUID, "randomUUID()");
        this.f51278a = l10;
        this.f51279b = l11;
        this.f51280c = uuidRandomUUID;
    }

    /* JADX INFO: renamed from: a */
    public final void m18969a() {
        SharedPreferences.Editor editorEdit = PreferenceManager.getDefaultSharedPreferences(C8004n.m15871a()).edit();
        long jLongValue = 0;
        Long l10 = this.f51278a;
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionStartTime", l10 == null ? 0L : l10.longValue());
        Long l11 = this.f51279b;
        if (l11 != null) {
            jLongValue = l11.longValue();
        }
        editorEdit.putLong("com.facebook.appevents.SessionInfo.sessionEndTime", jLongValue);
        editorEdit.putInt("com.facebook.appevents.SessionInfo.interruptionCount", this.f51281d);
        editorEdit.putString("com.facebook.appevents.SessionInfo.sessionId", this.f51280c.toString());
        editorEdit.apply();
        C10113l c10113l = this.f51283f;
        if (c10113l != null) {
            if (c10113l == null) {
                return;
            }
            SharedPreferences.Editor editorEdit2 = PreferenceManager.getDefaultSharedPreferences(C8004n.m15871a()).edit();
            editorEdit2.putString("com.facebook.appevents.SourceApplicationInfo.callingApplicationPackage", c10113l.f51287a);
            editorEdit2.putBoolean("com.facebook.appevents.SourceApplicationInfo.openedByApplink", c10113l.f51288b);
            editorEdit2.apply();
        }
    }
}
