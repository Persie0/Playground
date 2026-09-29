package cc;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Parcelable;
import android.os.SystemClock;
import android.support.v4.media.C0141b;
import android.text.TextUtils;
import androidx.fragment.app.C0987y;
import com.google.android.gms.internal.measurement.C2586a3;
import com.google.android.gms.internal.measurement.C2600b3;
import com.google.android.gms.internal.measurement.C2676g9;
import com.google.android.gms.internal.measurement.C2726k3;
import com.google.android.gms.internal.measurement.C2734kb;
import com.google.android.gms.internal.measurement.C2740l3;
import com.google.android.gms.internal.measurement.C2788oa;
import com.google.android.gms.internal.measurement.C2854tb;
import com.google.android.gms.internal.measurement.InterfaceC2690h9;
import com.google.android.gms.internal.measurement.InterfaceC2867ub;
import com.google.android.gms.measurement.internal.zzac;
import com.google.android.gms.measurement.internal.zzaw;
import com.google.android.gms.measurement.internal.zzli;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p176ib.C6272i;

/* JADX INFO: renamed from: cc.j */
/* JADX INFO: loaded from: classes.dex */
public final class C1847j extends AbstractC1774a7 {

    /* JADX INFO: renamed from: d */
    public final C1838i f9911d;

    /* JADX INFO: renamed from: e */
    public final C1980x6 f9912e;

    /* JADX INFO: renamed from: f */
    public static final String[] f9904f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: g */
    public static final String[] f9905g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: h */
    public static final String[] f9906h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;"};

    /* JADX INFO: renamed from: i */
    public static final String[] f9907i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* JADX INFO: renamed from: j */
    public static final String[] f9908j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: k */
    public static final String[] f9909k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: l */
    public static final String[] f9910l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: H */
    public static final String[] f9903H = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    public C1847j(C1846i7 c1846i7) {
        super(c1846i7);
        this.f9912e = new C1980x6(((C1897o4) this.f10430a).f10058I);
        ((C1897o4) this.f10430a).getClass();
        this.f9911d = new C1838i(this, ((C1897o4) this.f10430a).f10076a);
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: u */
    public static final void m5666u(ContentValues contentValues, Object obj) {
        C6272i.m12912f("value");
        C6272i.m12915i(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else {
            if (!(obj instanceof Double)) {
                throw new IllegalArgumentException("Invalid value type");
            }
            contentValues.put("value", (Double) obj);
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: A */
    public final SQLiteDatabase m5667A() {
        mo5748g();
        try {
            return this.f9911d.getWritableDatabase();
        } catch (SQLiteException e10) {
            C1860k3 c1860k3 = ((C1897o4) this.f10430a).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9945i.m5624b(e10, "Error opening database");
            throw e10;
        }
    }

    /* JADX INFO: renamed from: B */
    public final C1790c5 m5668B(String str) {
        Cursor cursorQuery;
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        C6272i.m12912f(str);
        mo5748g();
        m5494h();
        Cursor cursor = null;
        try {
            boolean z10 = true;
            cursorQuery = m5667A().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    C1790c5 c1790c5 = new C1790c5(this.f10436b.f9902l, str);
                    C1897o4 c1897o4 = c1790c5.f9721a;
                    c1790c5.m5543b(cursorQuery.getString(0));
                    c1790c5.m5557p(cursorQuery.getString(1));
                    c1790c5.m5564w(cursorQuery.getString(2));
                    c1790c5.m5561t(cursorQuery.getLong(3));
                    c1790c5.m5562u(cursorQuery.getLong(4));
                    c1790c5.m5560s(cursorQuery.getLong(5));
                    c1790c5.m5545d(cursorQuery.getString(6));
                    c1790c5.m5544c(cursorQuery.getString(7));
                    c1790c5.m5558q(cursorQuery.getLong(8));
                    c1790c5.m5554m(cursorQuery.getLong(9));
                    c1790c5.m5563v(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                    c1790c5.m5553l(cursorQuery.getLong(11));
                    c1790c5.m5551j(cursorQuery.getLong(12));
                    c1790c5.m5550i(cursorQuery.getLong(13));
                    c1790c5.m5548g(cursorQuery.getLong(14));
                    c1790c5.m5547f(cursorQuery.getLong(15));
                    long j10 = cursorQuery.getLong(16);
                    C1879m4 c1879m4 = c1897o4.f10087j;
                    C1897o4.m5776k(c1879m4);
                    c1879m4.mo5748g();
                    c1790c5.f9718E |= c1790c5.f9720G != j10;
                    c1790c5.f9720G = j10;
                    c1790c5.m5546e(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                    c1790c5.m5556o(cursorQuery.getString(18));
                    c1790c5.m5549h(cursorQuery.getLong(19));
                    c1790c5.m5552k(cursorQuery.getLong(20));
                    c1790c5.m5559r(cursorQuery.getString(21));
                    boolean z11 = cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0;
                    C1879m4 c1879m5 = c1897o4.f10087j;
                    C1897o4.m5776k(c1879m5);
                    c1879m5.mo5748g();
                    c1790c5.f9718E |= c1790c5.f9736p != z11;
                    c1790c5.f9736p = z11;
                    c1790c5.m5542a(cursorQuery.getString(24));
                    c1790c5.m5555n(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                    if (!cursorQuery.isNull(26)) {
                        c1790c5.m5565x(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                    }
                    C2734kb.m7924a();
                    if (((C1897o4) interfaceC1781b5).f10084g.m5582q(str, C1985y2.f10362l0) || ((C1897o4) interfaceC1781b5).f10084g.m5582q(null, C1985y2.f10358j0)) {
                        String string = cursorQuery.getString(28);
                        C1879m4 c1879m6 = c1897o4.f10087j;
                        C1897o4.m5776k(c1879m6);
                        c1879m6.mo5748g();
                        c1790c5.f9718E |= !C0987y.m3838t(c1790c5.f9741u, string);
                        c1790c5.f9741u = string;
                    }
                    ((InterfaceC2867ub) C2854tb.f14447b.f14448a.zza()).zza();
                    if (((C1897o4) interfaceC1781b5).f10084g.m5582q(null, C1985y2.f10364m0)) {
                        boolean z12 = (cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true;
                        C1879m4 c1879m7 = c1897o4.f10087j;
                        C1897o4.m5776k(c1879m7);
                        c1879m7.mo5748g();
                        c1790c5.f9718E |= c1790c5.f9742v != z12;
                        c1790c5.f9742v = z12;
                    }
                    C2788oa.m8149a();
                    if (((C1897o4) interfaceC1781b5).f10084g.m5582q(null, C1985y2.f10384w0)) {
                        long j11 = cursorQuery.getLong(30);
                        C1879m4 c1879m8 = c1897o4.f10087j;
                        C1897o4.m5776k(c1879m8);
                        c1879m8.mo5748g();
                        boolean z13 = c1790c5.f9718E;
                        if (c1790c5.f9743w == j11) {
                            z10 = false;
                        }
                        c1790c5.f9718E = z10 | z13;
                        c1790c5.f9743w = j11;
                    }
                    C1879m4 c1879m9 = c1897o4.f10087j;
                    C1897o4.m5776k(c1879m9);
                    c1879m9.mo5748g();
                    c1790c5.f9718E = false;
                    if (cursorQuery.moveToNext()) {
                        C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
                        C1897o4.m5776k(c1860k3);
                        c1860k3.f9942f.m5624b(C1860k3.m5700q(str), "Got multiple records for app, expected one. appId");
                    }
                    cursorQuery.close();
                    return c1790c5;
                } catch (SQLiteException e10) {
                    e = e10;
                    C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
                    C1897o4.m5776k(c1860k4);
                    c1860k4.f9942f.m5625c(C1860k3.m5700q(str), e, "Error querying app. appId");
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
        }
        th = th2;
        cursor = cursorQuery;
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    /* JADX INFO: renamed from: C */
    public final zzac m5669C(String str, String str2) throws Throwable {
        Cursor cursorQuery;
        C1846i7 c1846i7 = this.f10436b;
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        C6272i.m12912f(str);
        C6272i.m12912f(str2);
        mo5748g();
        m5494h();
        Cursor cursor = null;
        try {
            cursorQuery = m5667A().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str3 = string;
                    Object objM5674H = m5674H(cursorQuery, 1);
                    boolean z10 = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j10 = cursorQuery.getLong(4);
                    C1864k7 c1864k7 = c1846i7.f9897g;
                    C1864k7 c1864k8 = c1846i7.f9897g;
                    C1846i7.m5629H(c1864k7);
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<zzaw> creator = zzaw.CREATOR;
                    zzaw zzawVar = (zzaw) c1864k7.m5736x(blob, creator);
                    long j11 = cursorQuery.getLong(6);
                    C1846i7.m5629H(c1864k8);
                    zzaw zzawVar2 = (zzaw) c1864k8.m5736x(cursorQuery.getBlob(7), creator);
                    long j12 = cursorQuery.getLong(8);
                    long j13 = cursorQuery.getLong(9);
                    C1846i7.m5629H(c1864k8);
                    zzac zzacVar = new zzac(str, str3, new zzli(j12, objM5674H, str2, str3), j11, z10, string2, zzawVar, j10, zzawVar2, j13, (zzaw) c1864k8.m5736x(cursorQuery.getBlob(10), creator));
                    if (cursorQuery.moveToNext()) {
                        C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
                        C1897o4.m5776k(c1860k3);
                        c1860k3.f9942f.m5625c(C1860k3.m5700q(str), ((C1897o4) interfaceC1781b5).f10057H.m5605f(str2), "Got multiple records for conditional property, expected one");
                    }
                    cursorQuery.close();
                    return zzacVar;
                } catch (SQLiteException e10) {
                    e = e10;
                    C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
                    C1897o4.m5776k(c1860k4);
                    c1860k4.f9942f.m5626d("Error querying conditional property", C1860k3.m5700q(str), ((C1897o4) interfaceC1781b5).f10057H.m5605f(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
        }
        th = th2;
        cursor = cursorQuery;
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    /* JADX INFO: renamed from: D */
    public final C1829h m5670D(long j10, String str, boolean z10, boolean z11) {
        return m5671E(j10, str, 1L, false, false, z10, false, z11);
    }

    /* JADX INFO: renamed from: E */
    public final C1829h m5671E(long j10, String str, long j11, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        C6272i.m12912f(str);
        mo5748g();
        m5494h();
        String[] strArr = {str};
        C1829h c1829h = new C1829h();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM5667A = m5667A();
                Cursor cursorQuery = sQLiteDatabaseM5667A.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
                    C1897o4.m5776k(c1860k3);
                    c1860k3.f9945i.m5624b(C1860k3.m5700q(str), "Not updating daily counts, app is not known. appId");
                    cursorQuery.close();
                    return c1829h;
                }
                if (cursorQuery.getLong(0) == j10) {
                    c1829h.f9825b = cursorQuery.getLong(1);
                    c1829h.f9824a = cursorQuery.getLong(2);
                    c1829h.f9826c = cursorQuery.getLong(3);
                    c1829h.f9827d = cursorQuery.getLong(4);
                    c1829h.f9828e = cursorQuery.getLong(5);
                }
                if (z10) {
                    c1829h.f9825b += j11;
                }
                if (z11) {
                    c1829h.f9824a += j11;
                }
                if (z12) {
                    c1829h.f9826c += j11;
                }
                if (z13) {
                    c1829h.f9827d += j11;
                }
                if (z14) {
                    c1829h.f9828e += j11;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j10));
                contentValues.put("daily_public_events_count", Long.valueOf(c1829h.f9824a));
                contentValues.put("daily_events_count", Long.valueOf(c1829h.f9825b));
                contentValues.put("daily_conversions_count", Long.valueOf(c1829h.f9826c));
                contentValues.put("daily_error_events_count", Long.valueOf(c1829h.f9827d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(c1829h.f9828e));
                sQLiteDatabaseM5667A.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return c1829h;
            } catch (SQLiteException e10) {
                C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
                C1897o4.m5776k(c1860k4);
                c1860k4.f9942f.m5625c(C1860k3.m5700q(str), e10, "Error updating daily counts. appId");
                if (0 != 0) {
                    cursor.close();
                }
                return c1829h;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0164  */
    /* JADX INFO: renamed from: F */
    public final C1901p m5672F(String str, String str2) {
        InterfaceC1781b5 interfaceC1781b5;
        Cursor cursor;
        Cursor cursor2;
        Boolean boolValueOf;
        String str3 = str2;
        InterfaceC1781b5 interfaceC1781b6 = this.f10430a;
        C6272i.m12912f(str);
        C6272i.m12912f(str2);
        mo5748g();
        m5494h();
        Cursor cursor3 = null;
        try {
            Cursor cursorQuery = m5667A().query("events", (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str, str3}, null, null, null);
            try {
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return null;
                }
                long j10 = cursorQuery.getLong(0);
                long j11 = cursorQuery.getLong(1);
                long j12 = cursorQuery.getLong(2);
                long j13 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                if (cursorQuery.isNull(7)) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                }
                interfaceC1781b5 = interfaceC1781b6;
                cursor2 = cursorQuery;
                try {
                    C1901p c1901p = new C1901p(str, str2, j10, j11, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j12, j13, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                    if (cursor2.moveToNext()) {
                        C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
                        C1897o4.m5776k(c1860k3);
                        c1860k3.f9942f.m5624b(C1860k3.m5700q(str), "Got multiple records for event aggregates, expected one. appId");
                    }
                    cursor2.close();
                    return c1901p;
                } catch (SQLiteException e10) {
                    e = e10;
                } catch (Throwable th2) {
                    th = th2;
                    cursor3 = cursor2;
                    if (cursor3 != null) {
                        cursor3.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e11) {
                e = e11;
                interfaceC1781b5 = interfaceC1781b6;
                cursor2 = cursorQuery;
            } catch (Throwable th3) {
                th = th3;
                cursor2 = cursorQuery;
            }
            cursor = cursor2;
        } catch (SQLiteException e12) {
            e = e12;
            interfaceC1781b5 = interfaceC1781b6;
            str3 = str3;
            cursor = null;
        } catch (Throwable th4) {
            th = th4;
        }
        try {
            C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k4);
            c1860k4.f9942f.m5626d("Error querying events. appId", C1860k3.m5700q(str), ((C1897o4) interfaceC1781b5).f10057H.m5603d(str3), e);
            if (cursor != null) {
                cursor.close();
            }
            return null;
        } catch (Throwable th5) {
            th = th5;
            cursor3 = cursor;
            if (cursor3 != null) {
                cursor3.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: G */
    public final C1882m7 m5673G(String str, String str2) {
        Cursor cursorQuery;
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        C6272i.m12912f(str);
        C6272i.m12912f(str2);
        mo5748g();
        m5494h();
        Cursor cursor = null;
        try {
            cursorQuery = m5667A().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j10 = cursorQuery.getLong(0);
                    Object objM5674H = m5674H(cursorQuery, 1);
                    if (objM5674H == null) {
                        cursorQuery.close();
                        return null;
                    }
                    C1882m7 c1882m7 = new C1882m7(str, cursorQuery.getString(2), str2, j10, objM5674H);
                    if (cursorQuery.moveToNext()) {
                        C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
                        C1897o4.m5776k(c1860k3);
                        c1860k3.f9942f.m5624b(C1860k3.m5700q(str), "Got multiple records for user property, expected one. appId");
                    }
                    cursorQuery.close();
                    return c1882m7;
                } catch (SQLiteException e10) {
                    e = e10;
                    C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
                    C1897o4.m5776k(c1860k4);
                    c1860k4.f9942f.m5626d("Error querying user property. appId", C1860k3.m5700q(str), ((C1897o4) interfaceC1781b5).f10057H.m5605f(str2), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
            }
        } catch (SQLiteException e11) {
            e = e11;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
        }
        th = th2;
        cursor = cursorQuery;
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    /* JADX INFO: renamed from: H */
    public final Object m5674H(Cursor cursor, int i10) {
        int type = cursor.getType(i10);
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        if (type == 0) {
            C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9942f.m5623a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i10));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i10));
        }
        if (type == 3) {
            return cursor.getString(i10);
        }
        if (type == 4) {
            C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k4);
            c1860k4.f9942f.m5623a("Loaded invalid blob type value, ignoring it");
            return null;
        }
        C1860k3 c1860k5 = ((C1897o4) interfaceC1781b5).f10086i;
        C1897o4.m5776k(c1860k5);
        c1860k5.f9942f.m5624b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
        return null;
    }

    /* JADX INFO: renamed from: I */
    public final String m5675I() throws Throwable {
        SQLiteException e10;
        Cursor cursorRawQuery;
        Cursor cursor = null;
        try {
            cursorRawQuery = m5667A().rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
            try {
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        cursorRawQuery.close();
                        return null;
                    }
                    String string = cursorRawQuery.getString(0);
                    cursorRawQuery.close();
                    return string;
                } catch (SQLiteException e11) {
                    e10 = e11;
                    C1860k3 c1860k3 = ((C1897o4) this.f10430a).f10086i;
                    C1897o4.m5776k(c1860k3);
                    c1860k3.f9942f.m5624b(e10, "Database error getting next bundle app id");
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                cursor = cursorRawQuery;
                th = th2;
            }
        } catch (SQLiteException e12) {
            e10 = e12;
            cursorRawQuery = null;
        } catch (Throwable th3) {
            th = th3;
        }
        cursor = cursorRawQuery;
        th = th2;
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    /* JADX INFO: renamed from: J */
    public final List m5676J(String str, String str2, String str3) {
        C6272i.m12912f(str);
        mo5748g();
        m5494h();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return m5677K(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX INFO: renamed from: K */
    public final List m5677K(String str, String[] strArr) {
        C1846i7 c1846i7 = this.f10436b;
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        mo5748g();
        m5494h();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                ((C1897o4) interfaceC1781b5).getClass();
                cursorQuery = m5667A().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    int size = arrayList.size();
                    ((C1897o4) interfaceC1781b5).getClass();
                    if (size >= 1000) {
                        C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
                        C1897o4.m5776k(c1860k3);
                        C1842i3 c1842i3 = c1860k3.f9942f;
                        ((C1897o4) interfaceC1781b5).getClass();
                        c1842i3.m5624b(1000, "Read more than the max allowed conditional properties, ignoring extra");
                        break;
                    }
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    String string3 = cursorQuery.getString(2);
                    Object objM5674H = m5674H(cursorQuery, 3);
                    boolean z10 = cursorQuery.getInt(4) != 0;
                    String string4 = cursorQuery.getString(5);
                    long j10 = cursorQuery.getLong(6);
                    C1864k7 c1864k7 = c1846i7.f9897g;
                    C1864k7 c1864k8 = c1846i7.f9897g;
                    C1846i7.m5629H(c1864k7);
                    byte[] blob = cursorQuery.getBlob(7);
                    Parcelable.Creator<zzaw> creator = zzaw.CREATOR;
                    zzaw zzawVar = (zzaw) c1864k7.m5736x(blob, creator);
                    long j11 = cursorQuery.getLong(8);
                    C1846i7.m5629H(c1864k8);
                    zzaw zzawVar2 = (zzaw) c1864k8.m5736x(cursorQuery.getBlob(9), creator);
                    long j12 = cursorQuery.getLong(10);
                    long j13 = cursorQuery.getLong(11);
                    C1846i7.m5629H(c1864k8);
                    arrayList.add(new zzac(string, string2, new zzli(j12, objM5674H, string3, string2), j11, z10, string4, zzawVar, j10, zzawVar2, j13, (zzaw) c1864k8.m5736x(cursorQuery.getBlob(12), creator)));
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e10) {
                C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
                C1897o4.m5776k(c1860k4);
                c1860k4.f9942f.m5624b(e10, "Error querying conditional user property value");
                List listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: L */
    public final List m5678L(String str) {
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        C6272i.m12912f(str);
        mo5748g();
        m5494h();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                ((C1897o4) interfaceC1781b5).getClass();
                cursorQuery = m5667A().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str2 = string2;
                    long j10 = cursorQuery.getLong(2);
                    Object objM5674H = m5674H(cursorQuery, 3);
                    if (objM5674H == null) {
                        C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
                        C1897o4.m5776k(c1860k3);
                        c1860k3.f9942f.m5624b(C1860k3.m5700q(str), "Read invalid user property value, ignoring it. appId");
                    } else {
                        arrayList.add(new C1882m7(str, str2, string, j10, objM5674H));
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e10) {
                C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
                C1897o4.m5776k(c1860k4);
                c1860k4.f9942f.m5625c(C1860k3.m5700q(str), e10, "Error querying user properties. appId");
                List listEmptyList = Collections.emptyList();
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return listEmptyList;
            }
        } catch (Throwable th2) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0135  */
    /* JADX INFO: renamed from: M */
    public final List m5679M(String str, String str2, String str3) throws Throwable {
        String string;
        Cursor cursorQuery;
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        C6272i.m12912f(str);
        mo5748g();
        m5494h();
        ArrayList arrayList = new ArrayList();
        try {
            try {
                try {
                    ArrayList arrayList2 = new ArrayList(3);
                    try {
                        arrayList2.add(str);
                        StringBuilder sb2 = new StringBuilder("app_id=?");
                        if (!TextUtils.isEmpty(str2)) {
                            arrayList2.add(str2);
                            sb2.append(" and origin=?");
                        }
                        if (!TextUtils.isEmpty(str3)) {
                            arrayList2.add(str3 + "*");
                            sb2.append(" and name glob ?");
                        }
                        String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
                        String string2 = sb2.toString();
                        ((C1897o4) interfaceC1781b5).getClass();
                        cursorQuery = m5667A().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, string2, strArr, null, null, "rowid", "1001");
                        try {
                            if (!cursorQuery.moveToFirst()) {
                                cursorQuery.close();
                                return arrayList;
                            }
                            string = str2;
                            do {
                                try {
                                    int size = arrayList.size();
                                    ((C1897o4) interfaceC1781b5).getClass();
                                    if (size >= 1000) {
                                        C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
                                        C1897o4.m5776k(c1860k3);
                                        C1842i3 c1842i3 = c1860k3.f9942f;
                                        ((C1897o4) interfaceC1781b5).getClass();
                                        c1842i3.m5624b(1000, "Read more than the max allowed user properties, ignoring excess");
                                        break;
                                    }
                                    String string3 = cursorQuery.getString(0);
                                    long j10 = cursorQuery.getLong(1);
                                    Object objM5674H = m5674H(cursorQuery, 2);
                                    string = cursorQuery.getString(3);
                                    if (objM5674H == null) {
                                        C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
                                        C1897o4.m5776k(c1860k4);
                                        c1860k4.f9942f.m5626d("(2)Read invalid user property value, ignoring it", C1860k3.m5700q(str), string, str3);
                                    } else {
                                        arrayList.add(new C1882m7(str, string, string3, j10, objM5674H));
                                    }
                                } catch (SQLiteException e10) {
                                    e = e10;
                                    C1860k3 c1860k5 = ((C1897o4) interfaceC1781b5).f10086i;
                                    C1897o4.m5776k(c1860k5);
                                    c1860k5.f9942f.m5626d("(2)Error querying user properties", C1860k3.m5700q(str), string, e);
                                    List listEmptyList = Collections.emptyList();
                                    if (cursorQuery != null) {
                                        cursorQuery.close();
                                    }
                                    return listEmptyList;
                                }
                            } while (cursorQuery.moveToNext());
                            cursorQuery.close();
                            return arrayList;
                        } catch (SQLiteException e11) {
                            e = e11;
                            string = str2;
                        }
                    } catch (SQLiteException e12) {
                        e = e12;
                        string = str2;
                        cursorQuery = null;
                        C1860k3 c1860k6 = ((C1897o4) interfaceC1781b5).f10086i;
                        C1897o4.m5776k(c1860k6);
                        c1860k6.f9942f.m5626d("(2)Error querying user properties", C1860k3.m5700q(str), string, e);
                        List listEmptyList2 = Collections.emptyList();
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return listEmptyList2;
                    }
                } catch (SQLiteException e13) {
                    e = e13;
                }
            } catch (Throwable th2) {
                th = th2;
                Cursor cursor = null;
                if (0 != 0) {
                    cursor.close();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m5680N() {
        m5494h();
        m5667A().beginTransaction();
    }

    /* JADX INFO: renamed from: O */
    public final void m5681O() {
        m5494h();
        m5667A().endTransaction();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: P */
    public final void m5682P(List list) {
        mo5748g();
        m5494h();
        if (list.size() == 0) {
            throw new IllegalArgumentException("Given Integer is zero");
        }
        if (m5688p()) {
            String strM611g = C0141b.m611g("(", TextUtils.join(",", list), ")");
            long jM5693v = m5693v("SELECT COUNT(1) FROM queue WHERE rowid IN " + strM611g + " AND retry_count =  2147483647 LIMIT 1", null);
            InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
            if (jM5693v > 0) {
                C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
                C1897o4.m5776k(c1860k3);
                c1860k3.f9945i.m5623a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                m5667A().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + strM611g + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e10) {
                C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
                C1897o4.m5776k(c1860k4);
                c1860k4.f9942f.m5624b(e10, "Error incrementing retry count. error");
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m5683Q() {
        mo5748g();
        m5494h();
        if (m5688p()) {
            C1846i7 c1846i7 = this.f10436b;
            long jM5897a = c1846i7.f9899i.f10094e.m5897a();
            C1897o4 c1897o4 = (C1897o4) this.f10430a;
            c1897o4.f10058I.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long jAbs = Math.abs(jElapsedRealtime - jM5897a);
            c1897o4.getClass();
            if (jAbs > ((Long) C1985y2.f10388z.m5912a(null)).longValue()) {
                c1846i7.f9899i.f10094e.m5898b(jElapsedRealtime);
                mo5748g();
                m5494h();
                if (m5688p()) {
                    SQLiteDatabase sQLiteDatabaseM5667A = m5667A();
                    c1897o4.f10058I.getClass();
                    c1897o4.getClass();
                    int iDelete = sQLiteDatabaseM5667A.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) C1985y2.f10317E.m5912a(null)).longValue())});
                    if (iDelete > 0) {
                        C1860k3 c1860k3 = c1897o4.f10086i;
                        C1897o4.m5776k(c1860k3);
                        c1860k3.f9938I.m5624b(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    @Override // cc.AbstractC1774a7
    /* JADX INFO: renamed from: k */
    public final void mo5496k() {
    }

    /* JADX INFO: renamed from: l */
    public final void m5684l(String str, String str2) {
        C6272i.m12912f(str);
        C6272i.m12912f(str2);
        mo5748g();
        m5494h();
        try {
            m5667A().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            C1897o4 c1897o4 = (C1897o4) this.f10430a;
            C1860k3 c1860k3 = c1897o4.f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9942f.m5626d("Error deleting user property. appId", C1860k3.m5700q(str), c1897o4.f10057H.m5605f(str2), e10);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m5685m() {
        m5494h();
        m5667A().setTransactionSuccessful();
    }

    /* JADX INFO: renamed from: n */
    public final void m5686n(C1790c5 c1790c5) {
        mo5748g();
        m5494h();
        String strM5537E = c1790c5.m5537E();
        C6272i.m12915i(strM5537E);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strM5537E);
        contentValues.put("app_instance_id", c1790c5.m5538F());
        contentValues.put("gmp_app_id", c1790c5.m5541I());
        C1897o4 c1897o4 = c1790c5.f9721a;
        C1879m4 c1879m4 = c1897o4.f10087j;
        C1897o4.m5776k(c1879m4);
        c1879m4.mo5748g();
        contentValues.put("resettable_device_id_hash", c1790c5.f9725e);
        C1879m4 c1879m5 = c1897o4.f10087j;
        C1897o4.m5776k(c1879m5);
        c1879m5.mo5748g();
        contentValues.put("last_bundle_index", Long.valueOf(c1790c5.f9727g));
        C1879m4 c1879m6 = c1897o4.f10087j;
        C1897o4.m5776k(c1879m6);
        c1879m6.mo5748g();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c1790c5.f9728h));
        C1879m4 c1879m7 = c1897o4.f10087j;
        C1897o4.m5776k(c1879m7);
        c1879m7.mo5748g();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c1790c5.f9729i));
        contentValues.put("app_version", c1790c5.m5539G());
        C1879m4 c1879m8 = c1897o4.f10087j;
        C1897o4.m5776k(c1879m8);
        c1879m8.mo5748g();
        contentValues.put("app_store", c1790c5.f9732l);
        C1879m4 c1879m9 = c1897o4.f10087j;
        C1897o4.m5776k(c1879m9);
        c1879m9.mo5748g();
        contentValues.put("gmp_version", Long.valueOf(c1790c5.f9733m));
        C1879m4 c1879m10 = c1897o4.f10087j;
        C1897o4.m5776k(c1879m10);
        c1879m10.mo5748g();
        contentValues.put("dev_cert_hash", Long.valueOf(c1790c5.f9734n));
        C1879m4 c1879m11 = c1897o4.f10087j;
        C1897o4.m5776k(c1879m11);
        c1879m11.mo5748g();
        contentValues.put("measurement_enabled", Boolean.valueOf(c1790c5.f9735o));
        C1879m4 c1879m12 = c1897o4.f10087j;
        C1897o4.m5776k(c1879m12);
        c1879m12.mo5748g();
        contentValues.put("day", Long.valueOf(c1790c5.f9744x));
        C1879m4 c1879m13 = c1897o4.f10087j;
        C1897o4.m5776k(c1879m13);
        c1879m13.mo5748g();
        contentValues.put("daily_public_events_count", Long.valueOf(c1790c5.f9745y));
        C1897o4.m5776k(c1879m13);
        c1879m13.mo5748g();
        contentValues.put("daily_events_count", Long.valueOf(c1790c5.f9746z));
        C1897o4.m5776k(c1879m13);
        c1879m13.mo5748g();
        contentValues.put("daily_conversions_count", Long.valueOf(c1790c5.f9714A));
        C1879m4 c1879m14 = c1897o4.f10087j;
        C1897o4.m5776k(c1879m14);
        c1879m14.mo5748g();
        contentValues.put("config_fetched_time", Long.valueOf(c1790c5.f9719F));
        C1879m4 c1879m15 = c1897o4.f10087j;
        C1897o4.m5776k(c1879m15);
        c1879m15.mo5748g();
        contentValues.put("failed_config_fetch_time", Long.valueOf(c1790c5.f9720G));
        contentValues.put("app_version_int", Long.valueOf(c1790c5.m5533A()));
        contentValues.put("firebase_instance_id", c1790c5.m5540H());
        C1897o4.m5776k(c1879m13);
        c1879m13.mo5748g();
        contentValues.put("daily_error_events_count", Long.valueOf(c1790c5.f9715B));
        C1897o4.m5776k(c1879m13);
        c1879m13.mo5748g();
        contentValues.put("daily_realtime_events_count", Long.valueOf(c1790c5.f9716C));
        C1897o4.m5776k(c1879m13);
        c1879m13.mo5748g();
        contentValues.put("health_monitor_sample", c1790c5.f9717D);
        C1879m4 c1879m16 = c1897o4.f10087j;
        C1897o4.m5776k(c1879m16);
        c1879m16.mo5748g();
        contentValues.put("android_id", (Long) 0L);
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c1790c5.m5566y()));
        contentValues.put("admob_app_id", c1790c5.m5535C());
        contentValues.put("dynamite_version", Long.valueOf(c1790c5.m5534B()));
        C1879m4 c1879m17 = c1897o4.f10087j;
        C1897o4.m5776k(c1879m17);
        c1879m17.mo5748g();
        contentValues.put("session_stitching_token", c1790c5.f9741u);
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(c1790c5.m5567z()));
        C1879m4 c1879m18 = c1897o4.f10087j;
        C1897o4.m5776k(c1879m18);
        c1879m18.mo5748g();
        contentValues.put("target_os_version", Long.valueOf(c1790c5.f9743w));
        C1879m4 c1879m19 = c1897o4.f10087j;
        C1897o4.m5776k(c1879m19);
        c1879m19.mo5748g();
        ArrayList arrayList = c1790c5.f9740t;
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
                C1897o4.m5776k(c1860k3);
                c1860k3.f9945i.m5624b(strM5537E, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        ((InterfaceC2690h9) C2676g9.f14217b.f14218a.zza()).zza();
        C1897o4 c1897o5 = (C1897o4) interfaceC1781b5;
        if (c1897o5.f10084g.m5582q(null, C1985y2.f10354h0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase sQLiteDatabaseM5667A = m5667A();
            if (sQLiteDatabaseM5667A.update("apps", contentValues, "app_id = ?", new String[]{strM5537E}) == 0 && sQLiteDatabaseM5667A.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
                C1897o4.m5776k(c1860k4);
                c1860k4.f9942f.m5624b(C1860k3.m5700q(strM5537E), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e10) {
            C1860k3 c1860k5 = c1897o5.f10086i;
            C1897o4.m5776k(c1860k5);
            c1860k5.f9942f.m5625c(C1860k3.m5700q(strM5537E), e10, "Error storing app. appId");
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m5687o(C1901p c1901p) {
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        C6272i.m12915i(c1901p);
        mo5748g();
        m5494h();
        ContentValues contentValues = new ContentValues();
        String str = c1901p.f10105a;
        contentValues.put("app_id", str);
        contentValues.put("name", c1901p.f10106b);
        contentValues.put("lifetime_count", Long.valueOf(c1901p.f10107c));
        contentValues.put("current_bundle_count", Long.valueOf(c1901p.f10108d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c1901p.f10110f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c1901p.f10111g));
        contentValues.put("last_bundled_day", c1901p.f10112h);
        contentValues.put("last_sampled_complex_event_id", c1901p.f10113i);
        contentValues.put("last_sampling_rate", c1901p.f10114j);
        contentValues.put("current_session_count", Long.valueOf(c1901p.f10109e));
        Boolean bool = c1901p.f10115k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (m5667A().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
                C1897o4.m5776k(c1860k3);
                c1860k3.f9942f.m5624b(C1860k3.m5700q(str), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e10) {
            C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k4);
            c1860k4.f9942f.m5625c(C1860k3.m5700q(str), e10, "Error storing event aggregates. appId");
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m5688p() {
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        Context context = ((C1897o4) interfaceC1781b5).f10076a;
        ((C1897o4) interfaceC1781b5).getClass();
        return context.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX INFO: renamed from: q */
    public final void m5689q(String str, Long l10, long j10, C2600b3 c2600b3) {
        mo5748g();
        m5494h();
        C6272i.m12915i(c2600b3);
        C6272i.m12912f(str);
        byte[] bArrM8066g = c2600b3.m8066g();
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        C1897o4 c1897o4 = (C1897o4) interfaceC1781b5;
        C1860k3 c1860k3 = c1897o4.f10086i;
        C1897o4.m5776k(c1860k3);
        c1860k3.f9938I.m5625c(c1897o4.f10057H.m5603d(str), Integer.valueOf(bArrM8066g.length), "Saving complex main event, appId, data size");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l10);
        contentValues.put("children_to_process", Long.valueOf(j10));
        contentValues.put("main_event", bArrM8066g);
        try {
            if (m5667A().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
                C1897o4.m5776k(c1860k4);
                c1860k4.f9942f.m5624b(C1860k3.m5700q(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e10) {
            C1860k3 c1860k5 = c1897o4.f10086i;
            C1897o4.m5776k(c1860k5);
            c1860k5.f9942f.m5625c(C1860k3.m5700q(str), e10, "Error storing complex main event. appId");
        }
    }

    /* JADX INFO: renamed from: r */
    public final boolean m5690r(zzac zzacVar) {
        mo5748g();
        m5494h();
        String str = zzacVar.f14601a;
        C6272i.m12915i(str);
        C1882m7 c1882m7M5673G = m5673G(str, zzacVar.f14603c.f14618b);
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        if (c1882m7M5673G == null) {
            long jM5693v = m5693v("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            ((C1897o4) interfaceC1781b5).getClass();
            if (jM5693v >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzacVar.f14602b);
        contentValues.put("name", zzacVar.f14603c.f14618b);
        Object objM8536q = zzacVar.f14603c.m8536q();
        C6272i.m12915i(objM8536q);
        m5666u(contentValues, objM8536q);
        contentValues.put("active", Boolean.valueOf(zzacVar.f14605e));
        contentValues.put("trigger_event_name", zzacVar.f14606f);
        contentValues.put("trigger_timeout", Long.valueOf(zzacVar.f14608h));
        C1897o4 c1897o4 = (C1897o4) interfaceC1781b5;
        C1900o7 c1900o7 = c1897o4.f10089l;
        C1897o4.m5774i(c1900o7);
        c1900o7.getClass();
        contentValues.put("timed_out_event", C1900o7.m5796Z(zzacVar.f14607g));
        contentValues.put("creation_timestamp", Long.valueOf(zzacVar.f14604d));
        C1900o7 c1900o8 = c1897o4.f10089l;
        C1897o4.m5774i(c1900o8);
        zzaw zzawVar = zzacVar.f14609i;
        c1900o8.getClass();
        contentValues.put("triggered_event", C1900o7.m5796Z(zzawVar));
        contentValues.put("triggered_timestamp", Long.valueOf(zzacVar.f14603c.f14619c));
        contentValues.put("time_to_live", Long.valueOf(zzacVar.f14610j));
        C1900o7 c1900o9 = c1897o4.f10089l;
        C1897o4.m5774i(c1900o9);
        c1900o9.getClass();
        contentValues.put("expired_event", C1900o7.m5796Z(zzacVar.f14611k));
        try {
            if (m5667A().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
                C1897o4.m5776k(c1860k3);
                c1860k3.f9942f.m5624b(C1860k3.m5700q(str), "Failed to insert/update conditional user property (got -1)");
            }
        } catch (SQLiteException e10) {
            C1860k3 c1860k4 = c1897o4.f10086i;
            C1897o4.m5776k(c1860k4);
            c1860k4.f9942f.m5625c(C1860k3.m5700q(str), e10, "Error storing conditional user property");
        }
        return true;
    }

    /* JADX INFO: renamed from: s */
    public final boolean m5691s(C1882m7 c1882m7) {
        mo5748g();
        m5494h();
        String str = c1882m7.f10013a;
        String str2 = c1882m7.f10015c;
        C1882m7 c1882m7M5673G = m5673G(str, str2);
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        String str3 = c1882m7.f10014b;
        if (c1882m7M5673G == null) {
            if (C1900o7.m5793W(str2)) {
                if (m5693v("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str}) >= ((C1897o4) interfaceC1781b5).f10084g.m5577l(str, C1985y2.f10320H, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(str2)) {
                long jM5693v = m5693v("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str, str3});
                ((C1897o4) interfaceC1781b5).getClass();
                if (jM5693v >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", str3);
        contentValues.put("name", str2);
        contentValues.put("set_timestamp", Long.valueOf(c1882m7.f10016d));
        m5666u(contentValues, c1882m7.f10017e);
        try {
            if (m5667A().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
                C1897o4.m5776k(c1860k3);
                c1860k3.f9942f.m5624b(C1860k3.m5700q(str), "Failed to insert/update user property (got -1). appId");
            }
        } catch (SQLiteException e10) {
            C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
            C1897o4.m5776k(c1860k4);
            c1860k4.f9942f.m5625c(C1860k3.m5700q(str), e10, "Error storing user property. appId");
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:83:0x022a  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: t */
    public final void m5692t(long j10, long j11, C1828g7 c1828g7) throws Throwable {
        SQLiteCursor sQLiteCursor;
        String string;
        char c10;
        boolean z10;
        String str;
        String[] strArr;
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        mo5748g();
        m5494h();
        SQLiteCursor sQLiteCursor2 = 0;
        String string2 = null;
        String str2 = null;
        try {
            SQLiteDatabase sQLiteDatabaseM5667A = m5667A();
            try {
                if (TextUtils.isEmpty(null)) {
                    Cursor cursorRawQuery = sQLiteDatabaseM5667A.rawQuery("select app_id, metadata_fingerprint from raw_events where " + (j11 != -1 ? "rowid <= ? and " : "") + "app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;", j11 != -1 ? new String[]{String.valueOf(j11), String.valueOf(j10)} : new String[]{String.valueOf(j10)});
                    if (!cursorRawQuery.moveToFirst()) {
                        cursorRawQuery.close();
                        return;
                    } else {
                        string2 = cursorRawQuery.getString(0);
                        string = cursorRawQuery.getString(1);
                        cursorRawQuery.close();
                    }
                } else {
                    Cursor cursorRawQuery2 = sQLiteDatabaseM5667A.rawQuery("select metadata_fingerprint from raw_events where app_id = ?" + (j11 != -1 ? " and rowid <= ?" : "") + " order by rowid limit 1;", j11 != -1 ? new String[]{null, String.valueOf(j11)} : new String[]{null});
                    if (!cursorRawQuery2.moveToFirst()) {
                        cursorRawQuery2.close();
                        return;
                    } else {
                        string = cursorRawQuery2.getString(0);
                        cursorRawQuery2.close();
                    }
                }
                Cursor cursorQuery = sQLiteDatabaseM5667A.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{string2, string}, null, null, "rowid", "2");
                if (!cursorQuery.moveToFirst()) {
                    C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
                    C1897o4.m5776k(c1860k3);
                    c1860k3.f9942f.m5624b(C1860k3.m5700q(string2), "Raw event metadata record is missing. appId");
                    cursorQuery.close();
                    return;
                }
                try {
                    C2740l3 c2740l3 = (C2740l3) ((C2726k3) C1864k7.m5726z(C2740l3.m7932G1(), cursorQuery.getBlob(0))).m7897h();
                    if (cursorQuery.moveToNext()) {
                        C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
                        C1897o4.m5776k(c1860k4);
                        c1860k4.f9945i.m5624b(C1860k3.m5700q(string2), "Get multiple raw event metadata records, expected one. appId");
                    }
                    cursorQuery.close();
                    c1828g7.f9819a = c2740l3;
                    if (j11 != -1) {
                        str = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                        z10 = true;
                        c10 = 2;
                        strArr = new String[]{string2, string, String.valueOf(j11)};
                    } else {
                        c10 = 2;
                        z10 = true;
                        str = "app_id = ? and metadata_fingerprint = ?";
                        strArr = new String[]{string2, string};
                    }
                    Cursor cursorQuery2 = sQLiteDatabaseM5667A.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str, strArr, null, null, "rowid", null);
                    if (!cursorQuery2.moveToFirst()) {
                        C1860k3 c1860k5 = ((C1897o4) interfaceC1781b5).f10086i;
                        C1897o4.m5776k(c1860k5);
                        c1860k5.f9945i.m5624b(C1860k3.m5700q(string2), "Raw event data disappeared while in transaction. appId");
                        cursorQuery2.close();
                        return;
                    }
                    do {
                        long j12 = cursorQuery2.getLong(0);
                        try {
                            C2586a3 c2586a3 = (C2586a3) C1864k7.m5726z(C2600b3.m7672x(), cursorQuery2.getBlob(3));
                            String string3 = cursorQuery2.getString(1);
                            c2586a3.m7899j();
                            C2600b3.m7669H((C2600b3) c2586a3.f14271b, string3);
                            long j13 = cursorQuery2.getLong(2);
                            c2586a3.m7899j();
                            C2600b3.m7670I(j13, (C2600b3) c2586a3.f14271b);
                            if (!c1828g7.m5611a(j12, (C2600b3) c2586a3.m7897h())) {
                                cursorQuery2.close();
                                return;
                            }
                        } catch (IOException e10) {
                            C1860k3 c1860k6 = ((C1897o4) interfaceC1781b5).f10086i;
                            C1897o4.m5776k(c1860k6);
                            c1860k6.f9942f.m5625c(C1860k3.m5700q(string2), e10, "Data loss. Failed to merge raw event. appId");
                        }
                    } while (cursorQuery2.moveToNext());
                    cursorQuery2.close();
                } catch (IOException e11) {
                    C1860k3 c1860k7 = ((C1897o4) interfaceC1781b5).f10086i;
                    C1897o4.m5776k(c1860k7);
                    c1860k7.f9942f.m5625c(C1860k3.m5700q(string2), e11, "Data loss. Failed to merge raw event metadata. appId");
                    cursorQuery.close();
                }
            } catch (SQLiteException e12) {
                e = e12;
                str2 = null;
                sQLiteCursor = "select metadata_fingerprint from raw_events where app_id = ?";
                try {
                    C1860k3 c1860k8 = ((C1897o4) interfaceC1781b5).f10086i;
                    C1897o4.m5776k(c1860k8);
                    c1860k8.f9942f.m5625c(C1860k3.m5700q(str2), e, "Data loss. Error selecting raw event. appId");
                    if (sQLiteCursor != 0) {
                        sQLiteCursor.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    sQLiteCursor2 = sQLiteCursor;
                    if (sQLiteCursor2 != 0) {
                        sQLiteCursor2.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                sQLiteCursor2 = "select metadata_fingerprint from raw_events where app_id = ?";
                if (sQLiteCursor2 != 0) {
                    sQLiteCursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e13) {
            e = e13;
            sQLiteCursor = 0;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: v */
    public final long m5693v(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = m5667A().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j10 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j10;
            } catch (SQLiteException e10) {
                C1860k3 c1860k3 = ((C1897o4) this.f10430a).f10086i;
                C1897o4.m5776k(c1860k3);
                c1860k3.f9942f.m5625c(str, e10, "Database error");
                throw e10;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m5694w(String str, String str2) {
        C6272i.m12912f(str);
        C6272i.m12912f(str2);
        mo5748g();
        m5494h();
        try {
            m5667A().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e10) {
            C1897o4 c1897o4 = (C1897o4) this.f10430a;
            C1860k3 c1860k3 = c1897o4.f10086i;
            C1897o4.m5776k(c1860k3);
            c1860k3.f9942f.m5626d("Error deleting conditional property", C1860k3.m5700q(str), c1897o4.f10057H.m5605f(str2), e10);
        }
    }

    /* JADX INFO: renamed from: x */
    public final long m5695x(String str, String[] strArr, long j10) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m5667A().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return j10;
                }
                long j11 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j11;
            } catch (SQLiteException e10) {
                C1860k3 c1860k3 = ((C1897o4) this.f10430a).f10086i;
                C1897o4.m5776k(c1860k3);
                c1860k3.f9942f.m5625c(str, e10, "Database error");
                throw e10;
            }
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    /* JADX INFO: renamed from: y */
    public final long m5696y(String str) {
        InterfaceC1781b5 interfaceC1781b5 = this.f10430a;
        C6272i.m12912f(str);
        C6272i.m12912f("first_open_count");
        mo5748g();
        m5494h();
        SQLiteDatabase sQLiteDatabaseM5667A = m5667A();
        sQLiteDatabaseM5667A.beginTransaction();
        long j10 = 0;
        try {
            try {
                long jM5695x = m5695x("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
                if (jM5695x == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseM5667A.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
                        C1897o4.m5776k(c1860k3);
                        c1860k3.f9942f.m5625c(C1860k3.m5700q(str), "first_open_count", "Failed to insert column (got -1). appId");
                        return -1L;
                    }
                    jM5695x = 0;
                    C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
                    C1897o4.m5776k(c1860k4);
                    c1860k4.f9942f.m5626d("Error inserting column. appId", C1860k3.m5700q(str), "first_open_count", e);
                    return j10;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", Long.valueOf(1 + jM5695x));
                    if (sQLiteDatabaseM5667A.update("app2", contentValues2, "app_id = ?", new String[]{str}) != 0) {
                        sQLiteDatabaseM5667A.setTransactionSuccessful();
                        return jM5695x;
                    }
                    C1860k3 c1860k5 = ((C1897o4) interfaceC1781b5).f10086i;
                    C1897o4.m5776k(c1860k5);
                    c1860k5.f9942f.m5625c(C1860k3.m5700q(str), "first_open_count", "Failed to update column (got 0). appId");
                    return -1L;
                } catch (SQLiteException e10) {
                    e = e10;
                    j10 = jM5695x;
                }
            } catch (SQLiteException e11) {
                e = e11;
            }
        } finally {
            sQLiteDatabaseM5667A.endTransaction();
        }
    }

    /* JADX INFO: renamed from: z */
    public final long m5697z(String str) {
        C6272i.m12912f(str);
        return m5695x("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }
}
