package p000;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.google.android.gms.measurement.internal.C1045d;
import com.google.android.gms.measurement.internal.zzah;
import com.google.android.gms.measurement.internal.zzbh;
import com.google.android.gms.measurement.internal.zzjk;
import com.google.android.gms.measurement.internal.zzls;
import com.google.android.gms.measurement.internal.zzoh;
import com.google.android.gms.measurement.internal.zzoo;
import com.google.android.gms.measurement.internal.zzpl;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final class nnb extends h8d {

    /* JADX INFO: renamed from: d */
    public final inb f53018d;

    /* JADX INFO: renamed from: e */
    public final s01 f53019e;

    /* JADX INFO: renamed from: f */
    public static final String[] f53011f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: g */
    public static final String[] f53012g = {"associated_row_id", "ALTER TABLE upload_queue ADD COLUMN associated_row_id INTEGER;", "last_upload_timestamp", "ALTER TABLE upload_queue ADD COLUMN last_upload_timestamp INTEGER;"};

    /* JADX INFO: renamed from: h */
    public static final String[] f53013h = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: i */
    public static final String[] f53014i = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;", "client_upload_eligibility", "ALTER TABLE apps ADD COLUMN client_upload_eligibility INTEGER;", "gmp_version_for_remote_config", "ALTER TABLE apps ADD COLUMN gmp_version_for_remote_config INTEGER;", "last_diagnostics_signal_upload_timestamp", "ALTER TABLE apps ADD COLUMN last_diagnostics_signal_upload_timestamp INTEGER;"};

    /* JADX INFO: renamed from: j */
    public static final String[] f53015j = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;", "elapsed_time", "ALTER TABLE raw_events ADD COLUMN elapsed_time INTEGER;"};

    /* JADX INFO: renamed from: k */
    public static final String[] f53016k = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: l */
    public static final String[] f53017l = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: H */
    public static final String[] f53007H = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: I */
    public static final String[] f53008I = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* JADX INFO: renamed from: J */
    public static final String[] f53009J = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* JADX INFO: renamed from: K */
    public static final String[] f53010K = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    public nnb(C1045d c1045d) {
        super(c1045d);
        this.f53019e = new s01(((kjc) this.f60774a).f47443k);
        ((kjc) this.f60774a).getClass();
        this.f53018d = new inb(this, ((kjc) this.f60774a).f47433a);
    }

    /* JADX INFO: renamed from: i0 */
    public static final String m17507i0(List list) {
        return list.isEmpty() ? "" : wq1.m24118n(" AND (upload_type IN (", TextUtils.join(", ", list), "))");
    }

    /* JADX INFO: renamed from: q0 */
    public static final void m17508q0(ContentValues contentValues, Object obj) {
        lda.m16127m("value");
        lda.m16130p(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
            return;
        }
        if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            C3386nv.m17626m("Invalid value type");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* JADX INFO: renamed from: A0 */
    public final List m17509A0(String str) {
        String str2;
        SQLiteException sQLiteException;
        kjc kjcVar = (kjc) this.f60774a;
        lda.m16127m(str);
        mo12359D();
        m13144E();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                kjcVar.getClass();
                cursorQuery = m17559u0().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (cursorQuery.moveToFirst()) {
                    while (true) {
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        if (string2 == null) {
                            string2 = "";
                        }
                        String str3 = string2;
                        long j = cursorQuery.getLong(2);
                        Object objM17531Q = m17531Q(cursorQuery, 3);
                        if (objM17531Q == null) {
                            try {
                                xcc xccVar = kjcVar.f47438f;
                                kjc.m15280l(xccVar);
                                xccVar.f68080f.m17924b(xcc.m24449L(str), "Read invalid user property value, ignoring it. appId");
                                str2 = str;
                            } catch (SQLiteException e) {
                                sQLiteException = e;
                                str2 = str;
                                xcc xccVar2 = kjcVar.f47438f;
                                kjc.m15280l(xccVar2);
                                xccVar2.f68080f.m17925c("Error querying user properties. appId", xcc.m24449L(str2), sQLiteException);
                                arrayList = Collections.EMPTY_LIST;
                            }
                        } else {
                            str2 = str;
                            arrayList.add(new lad(str2, str3, string, j, objM17531Q));
                        }
                        try {
                            if (!cursorQuery.moveToNext()) {
                                break;
                            }
                            str = str2;
                        } catch (SQLiteException e2) {
                            e = e2;
                            sQLiteException = e;
                            xcc xccVar3 = kjcVar.f47438f;
                            kjc.m15280l(xccVar3);
                            xccVar3.f68080f.m17925c("Error querying user properties. appId", xcc.m24449L(str2), sQLiteException);
                            arrayList = Collections.EMPTY_LIST;
                        }
                    }
                }
            } finally {
                if (0 != 0) {
                    cursorQuery.close();
                }
            }
        } catch (SQLiteException e3) {
            e = e3;
            str2 = str;
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:49:0x012e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0135  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.util.List] */
    /* JADX INFO: renamed from: B0 */
    public final List m17510B0(String str, String str2, String str3) throws Throwable {
        Cursor cursor;
        String str4;
        Cursor cursorQuery;
        String str5;
        kjc kjcVar = (kjc) this.f60774a;
        lda.m16127m(str);
        mo12359D();
        m13144E();
        ?? arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = new ArrayList(3);
            String str6 = str;
            arrayList2.add(str6);
            StringBuilder sb = new StringBuilder("app_id=?");
            if (!TextUtils.isEmpty(str2)) {
                arrayList2.add(str2);
                sb.append(" and origin=?");
            }
            if (!TextUtils.isEmpty(str3)) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 1);
                sb2.append(str3);
                sb2.append("*");
                arrayList2.add(sb2.toString());
                sb.append(" and name glob ?");
            }
            String[] strArr = (String[]) arrayList2.toArray(new String[arrayList2.size()]);
            String string = sb.toString();
            kjcVar.getClass();
            xcc xccVar = kjcVar.f47438f;
            cursorQuery = m17559u0().query("user_attributes", new String[]{"name", "set_timestamp", "value", "origin"}, string, strArr, null, null, "rowid", "1001");
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        str4 = str2;
                        while (true) {
                            try {
                                if (arrayList.size() >= 1000) {
                                    kjc.m15280l(xccVar);
                                    xccVar.f68080f.m17924b(Integer.valueOf(DescriptorProtos.Edition.EDITION_2023_VALUE), "Read more than the max allowed user properties, ignoring excess");
                                    break;
                                }
                                String string2 = cursorQuery.getString(0);
                                long j = cursorQuery.getLong(1);
                                Object objM17531Q = m17531Q(cursorQuery, 2);
                                String string3 = cursorQuery.getString(3);
                                if (objM17531Q == null) {
                                    try {
                                        kjc.m15280l(xccVar);
                                        xccVar.f68080f.m17926d("(2)Read invalid user property value, ignoring it", xcc.m24449L(str6), string3, str3);
                                        str5 = string3;
                                    } catch (SQLiteException e) {
                                        e = e;
                                        str5 = string3;
                                        cursor = cursorQuery;
                                        str4 = str5;
                                        try {
                                            xcc xccVar2 = kjcVar.f47438f;
                                            kjc.m15280l(xccVar2);
                                            xccVar2.f68080f.m17926d("(2)Error querying user properties", xcc.m24449L(str), str4, e);
                                            arrayList = Collections.EMPTY_LIST;
                                            cursorQuery = cursor;
                                            if (cursorQuery != null) {
                                                cursorQuery.close();
                                            }
                                            return arrayList;
                                        } catch (Throwable th) {
                                            th = th;
                                            if (cursor != null) {
                                                cursor.close();
                                            }
                                            throw th;
                                        }
                                    }
                                } else {
                                    str5 = string3;
                                    arrayList.add(new lad(str, str5, string2, j, objM17531Q));
                                }
                                try {
                                    if (!cursorQuery.moveToNext()) {
                                        break;
                                    }
                                    str6 = str;
                                    str4 = str5;
                                } catch (SQLiteException e2) {
                                    e = e2;
                                    cursor = cursorQuery;
                                    str4 = str5;
                                    xcc xccVar3 = kjcVar.f47438f;
                                    kjc.m15280l(xccVar3);
                                    xccVar3.f68080f.m17926d("(2)Error querying user properties", xcc.m24449L(str), str4, e);
                                    arrayList = Collections.EMPTY_LIST;
                                    cursorQuery = cursor;
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                cursor = cursorQuery;
                                xcc xccVar4 = kjcVar.f47438f;
                                kjc.m15280l(xccVar4);
                                xccVar4.f68080f.m17926d("(2)Error querying user properties", xcc.m24449L(str), str4, e);
                                arrayList = Collections.EMPTY_LIST;
                                cursorQuery = cursor;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                return arrayList;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        cursor.close();
                    }
                    throw th;
                }
            } catch (SQLiteException e4) {
                e = e4;
                str4 = str2;
            }
        } catch (SQLiteException e5) {
            e = e5;
            str4 = str2;
            cursor = null;
        } catch (Throwable th3) {
            th = th3;
            cursor = null;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: C0 */
    public final boolean m17511C0(zzah zzahVar) {
        kjc kjcVar = (kjc) this.f60774a;
        mo12359D();
        m13144E();
        String str = zzahVar.f12376a;
        lda.m16130p(str);
        if (m17564z0(str, zzahVar.f12378c.f12407b) == null) {
            long jM17540Z = m17540Z("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            kjcVar.getClass();
            if (jM17540Z >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzahVar.f12377b);
        contentValues.put("name", zzahVar.f12378c.f12407b);
        Object objZza = zzahVar.f12378c.zza();
        lda.m16130p(objZza);
        m17508q0(contentValues, objZza);
        contentValues.put("active", Boolean.valueOf(zzahVar.f12380e));
        contentValues.put("trigger_event_name", zzahVar.f12381f);
        contentValues.put("trigger_timeout", Long.valueOf(zzahVar.f12383h));
        zzbh zzbhVar = zzahVar.f12382g;
        rad radVar = kjcVar.f47441i;
        xcc xccVar = kjcVar.f47438f;
        kjc.m15278j(radVar);
        contentValues.put("timed_out_event", rad.m20511l0(zzbhVar));
        contentValues.put("creation_timestamp", Long.valueOf(zzahVar.f12379d));
        kjc.m15278j(radVar);
        contentValues.put("triggered_event", rad.m20511l0(zzahVar.f12384i));
        contentValues.put("triggered_timestamp", Long.valueOf(zzahVar.f12378c.f12408c));
        contentValues.put("time_to_live", Long.valueOf(zzahVar.f12385j));
        contentValues.put("expired_event", rad.m20511l0(zzahVar.f12386k));
        try {
            if (m17559u0().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17924b(xcc.m24449L(str), "Failed to insert/update conditional user property (got -1)");
            return true;
        } catch (SQLiteException e) {
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17925c("Error storing conditional user property", xcc.m24449L(str), e);
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0110  */
    /* JADX WARN: Code duplicated, block: B:39:0x0116  */
    /* JADX WARN: Not initialized variable reg: 8, insn: 0x00f0: MOVE (r7 I:??[OBJECT, ARRAY]) = (r8 I:??[OBJECT, ARRAY]), block:B:29:0x00f0 */
    /* JADX INFO: renamed from: D0 */
    public final zzah m17512D0(String str, String str2) throws Throwable {
        String str3;
        Cursor cursorQuery;
        Cursor cursor;
        kjc kjcVar = (kjc) this.f60774a;
        lda.m16127m(str);
        lda.m16127m(str2);
        mo12359D();
        m13144E();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = m17559u0().query("conditional_properties", new String[]{"origin", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str4 = string;
                    Object objM17531Q = m17531Q(cursorQuery, 1);
                    boolean z = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j = cursorQuery.getLong(4);
                    dad dadVar = this.f55716b.f12367g;
                    C1045d.m5885T(dadVar);
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<zzbh> creator = zzbh.CREATOR;
                    zzbh zzbhVar = (zzbh) dadVar.m10252g0(blob, creator);
                    long j2 = cursorQuery.getLong(6);
                    C1045d.m5885T(dadVar);
                    zzbh zzbhVar2 = (zzbh) dadVar.m10252g0(cursorQuery.getBlob(7), creator);
                    long j3 = cursorQuery.getLong(8);
                    long j4 = cursorQuery.getLong(9);
                    C1045d.m5885T(dadVar);
                    str3 = str2;
                    try {
                        zzah zzahVar = new zzah(str, str4, new zzpl(j3, objM17531Q, str3, str4), j2, z, string2, zzbhVar, j, zzbhVar2, j4, (zzbh) dadVar.m10252g0(cursorQuery.getBlob(10), creator));
                        if (cursorQuery.moveToNext()) {
                            xcc xccVar = kjcVar.f47438f;
                            kjc.m15280l(xccVar);
                            xccVar.f68080f.m17925c("Got multiple records for conditional property, expected one", xcc.m24449L(str), kjcVar.f47442j.m20574c(str3));
                        }
                        cursorQuery.close();
                        return zzahVar;
                    } catch (SQLiteException e) {
                        e = e;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str3 = str2;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            str3 = str2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
        xcc xccVar2 = kjcVar.f47438f;
        kjc.m15280l(xccVar2);
        xccVar2.f68080f.m17926d("Error querying conditional property", xcc.m24449L(str), kjcVar.f47442j.m20574c(str3), e);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX INFO: renamed from: E0 */
    public final void m17513E0(String str, String str2) {
        lda.m16127m(str);
        lda.m16127m(str2);
        mo12359D();
        m13144E();
        try {
            m17559u0().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            kjc kjcVar = (kjc) this.f60774a;
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17926d("Error deleting conditional property", xcc.m24449L(str), kjcVar.f47442j.m20574c(str2), e);
        }
    }

    /* JADX INFO: renamed from: F0 */
    public final List m17514F0(String str, String str2, String str3) {
        lda.m16127m(str);
        mo12359D();
        m13144E();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb.append(" and name glob ?");
        }
        return m17515G0(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    @Override // p000.h8d
    /* JADX INFO: renamed from: G */
    public final void mo4333G() {
        kjc kjcVar = (kjc) this.f60774a;
        if (kjcVar.f47436d.m4869O(null, z8c.f71167e1)) {
            tic ticVar = kjcVar.f47439g;
            kjc.m15280l(ticVar);
            ticVar.m22076M(new RunnableC3468pp(this, 25));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX INFO: renamed from: G0 */
    public final List m17515G0(String str, String[] strArr) {
        kjc kjcVar = (kjc) this.f60774a;
        mo12359D();
        m13144E();
        ?? arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                kjcVar.getClass();
                cursorQuery = m17559u0().query("conditional_properties", new String[]{"app_id", "origin", "name", "value", "active", "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
                if (cursorQuery.moveToFirst()) {
                    do {
                        if (arrayList.size() >= 1000) {
                            xcc xccVar = kjcVar.f47438f;
                            kjc.m15280l(xccVar);
                            xccVar.f68080f.m17924b(Integer.valueOf(DescriptorProtos.Edition.EDITION_2023_VALUE), "Read more than the max allowed conditional properties, ignoring extra");
                            break;
                        }
                        String string = cursorQuery.getString(0);
                        String string2 = cursorQuery.getString(1);
                        String string3 = cursorQuery.getString(2);
                        Object objM17531Q = m17531Q(cursorQuery, 3);
                        boolean z = cursorQuery.getInt(4) != 0;
                        String string4 = cursorQuery.getString(5);
                        long j = cursorQuery.getLong(6);
                        dad dadVar = this.f55716b.f12367g;
                        C1045d.m5885T(dadVar);
                        byte[] blob = cursorQuery.getBlob(7);
                        Parcelable.Creator<zzbh> creator = zzbh.CREATOR;
                        zzbh zzbhVar = (zzbh) dadVar.m10252g0(blob, creator);
                        long j2 = cursorQuery.getLong(8);
                        C1045d.m5885T(dadVar);
                        zzbh zzbhVar2 = (zzbh) dadVar.m10252g0(cursorQuery.getBlob(9), creator);
                        long j3 = cursorQuery.getLong(10);
                        long j4 = cursorQuery.getLong(11);
                        C1045d.m5885T(dadVar);
                        arrayList.add(new zzah(string, string2, new zzpl(j3, objM17531Q, string3, string2), j2, z, string4, zzbhVar, j, zzbhVar2, j4, (zzbh) dadVar.m10252g0(cursorQuery.getBlob(12), creator)));
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e) {
                xcc xccVar2 = kjcVar.f47438f;
                kjc.m15280l(xccVar2);
                xccVar2.f68080f.m17924b(e, "Error querying conditional user property value");
                arrayList = Collections.EMPTY_LIST;
            }
            return arrayList;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final long m17516H(String str, fjc fjcVar, String str2, Map map, zzls zzlsVar, Long l) {
        int iDelete;
        kjc kjcVar = (kjc) this.f60774a;
        mo12359D();
        m13144E();
        lda.m16130p(fjcVar);
        lda.m16127m(str);
        mo12359D();
        m13144E();
        if (m17554o0()) {
            C1045d c1045d = this.f55716b;
            long jM19952g = c1045d.f12369i.f9598f.m19952g();
            gr7 gr7Var = kjcVar.f47443k;
            xcc xccVar = kjcVar.f47438f;
            gr7Var.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jM19952g) > ((Long) z8c.f71125M.m21901a(null)).longValue()) {
                c1045d.f12369i.f9598f.m19953h(jElapsedRealtime);
                mo12359D();
                m13144E();
                if (m17554o0() && (iDelete = m17559u0().delete("upload_queue", m17548h0(), new String[0])) > 0) {
                    kjc.m15280l(xccVar);
                    xccVar.f68076I.m17924b(Integer.valueOf(iDelete), "Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted");
                }
                lda.m16127m(str);
                mo12359D();
                m13144E();
                try {
                    int iM4867M = kjcVar.f47436d.m4867M(str, z8c.f71101A);
                    if (iM4867M > 0) {
                        m17559u0().delete("upload_queue", "rowid in (SELECT rowid FROM upload_queue WHERE app_id=? ORDER BY rowid DESC LIMIT -1 OFFSET ?)", new String[]{str, String.valueOf(iM4867M)});
                    }
                } catch (SQLiteException e) {
                    kjc.m15280l(xccVar);
                    xccVar.f68080f.m17925c("Error deleting over the limit queued batches. appId", xcc.m24449L(str), e);
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            String str3 = (String) entry.getKey();
            String str4 = (String) entry.getValue();
            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 1 + String.valueOf(str4).length());
            sb.append(str3);
            sb.append("=");
            sb.append(str4);
            arrayList.add(sb.toString());
        }
        byte[] bArrM3725a = fjcVar.m3725a();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("measurement_batch", bArrM3725a);
        contentValues.put("upload_uri", str2);
        contentValues.put("upload_headers", TextUtils.join("\r\n", arrayList));
        contentValues.put("upload_type", Integer.valueOf(zzlsVar.zza()));
        gr7 gr7Var2 = kjcVar.f47443k;
        xcc xccVar2 = kjcVar.f47438f;
        gr7Var2.getClass();
        contentValues.put("creation_timestamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        if (l != null) {
            contentValues.put("associated_row_id", l);
        }
        try {
            long jInsert = m17559u0().insert("upload_queue", null, contentValues);
            if (jInsert != -1) {
                return jInsert;
            }
            kjc.m15280l(xccVar2);
            xccVar2.f68080f.m17924b(str, "Failed to insert MeasurementBatch (got -1) to upload_queue. appId");
            return -1L;
        } catch (SQLiteException e2) {
            kjc.m15280l(xccVar2);
            xccVar2.f68080f.m17925c("Error storing MeasurementBatch to upload_queue. appId", str, e2);
            return -1L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:131:0x0407  */
    /* JADX INFO: renamed from: H0 */
    public final gec m17517H0(String str) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        String string;
        kjc kjcVar = (kjc) this.f60774a;
        lda.m16127m(str);
        mo12359D();
        m13144E();
        Cursor cursor = null;
        try {
            cursorQuery = m17559u0().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info", "client_upload_eligibility", "last_diagnostics_signal_upload_timestamp"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        C1045d c1045d = this.f55716b;
                        gec gecVar = new gec(c1045d.f12372l, str);
                        kjc kjcVar2 = gecVar.f40662a;
                        npc npcVarM5917f = c1045d.m5917f(str);
                        zzjk zzjkVar = zzjk.ANALYTICS_STORAGE;
                        if (npcVarM5917f.m17590i(zzjkVar)) {
                            gecVar.m12524G(cursorQuery.getString(0));
                        }
                        boolean z = true;
                        gecVar.m12526I(cursorQuery.getString(1));
                        if (c1045d.m5917f(str).m17590i(zzjk.AD_STORAGE)) {
                            gecVar.m12527J(cursorQuery.getString(2));
                        }
                        gecVar.m12542e(cursorQuery.getLong(3));
                        gecVar.m12530M(cursorQuery.getLong(4));
                        gecVar.m12531N(cursorQuery.getLong(5));
                        gecVar.m12533P(cursorQuery.getString(6));
                        gecVar.m12536S(cursorQuery.getString(7));
                        gecVar.m12537T(cursorQuery.getLong(8));
                        gecVar.m12538a(cursorQuery.getLong(9));
                        gecVar.m12541d(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                        gecVar.m12546i(cursorQuery.getLong(11));
                        gecVar.m12547j(cursorQuery.getLong(12));
                        gecVar.m12548k(cursorQuery.getLong(13));
                        gecVar.m12549l(cursorQuery.getLong(14));
                        gecVar.m12543f(cursorQuery.getLong(15));
                        gecVar.m12544g(cursorQuery.getLong(16));
                        gecVar.m12535R(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                        gecVar.m12529L(cursorQuery.getString(18));
                        gecVar.m12551n(cursorQuery.getLong(19));
                        gecVar.m12550m(cursorQuery.getLong(20));
                        gecVar.m12560w(cursorQuery.getString(21));
                        boolean z2 = cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0;
                        tic ticVar = kjcVar2.f47439g;
                        kjc.m15280l(ticVar);
                        ticVar.mo12359D();
                        gecVar.f40659R |= gecVar.f40677p != z2;
                        gecVar.f40677p = z2;
                        gecVar.m12540c(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                        if (!cursorQuery.isNull(26)) {
                            gecVar.m12562y(Arrays.asList(cursorQuery.getString(26).split(",", -1)));
                        }
                        if (c1045d.m5917f(str).m17590i(zzjkVar)) {
                            String string2 = cursorQuery.getString(28);
                            tic ticVar2 = kjcVar2.f47439g;
                            kjc.m15280l(ticVar2);
                            ticVar2.mo12359D();
                            gecVar.f40659R |= !Objects.equals(gecVar.f40681t, string2);
                            gecVar.f40681t = string2;
                        }
                        boolean z3 = (cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true;
                        tic ticVar3 = kjcVar2.f47439g;
                        kjc.m15280l(ticVar3);
                        ticVar3.mo12359D();
                        gecVar.f40659R |= gecVar.f40682u != z3;
                        gecVar.f40682u = z3;
                        gecVar.m12555r(cursorQuery.getLong(39));
                        String string3 = cursorQuery.getString(36);
                        tic ticVar4 = kjcVar2.f47439g;
                        kjc.m15280l(ticVar4);
                        ticVar4.mo12359D();
                        gecVar.f40659R |= gecVar.f40644C != string3;
                        gecVar.f40644C = string3;
                        gecVar.m12518A(cursorQuery.getLong(30));
                        gecVar.m12519B(cursorQuery.getLong(31));
                        blb.m3870a();
                        if (kjcVar.f47436d.m4869O(str, z8c.f71130O0)) {
                            int i = cursorQuery.getInt(32);
                            tic ticVar5 = kjcVar2.f47439g;
                            kjc.m15280l(ticVar5);
                            ticVar5.mo12359D();
                            gecVar.f40659R |= gecVar.f40685x != i;
                            gecVar.f40685x = i;
                            gecVar.m12520C(cursorQuery.getLong(35));
                        }
                        boolean z4 = (cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true;
                        tic ticVar6 = kjcVar2.f47439g;
                        kjc.m15280l(ticVar6);
                        ticVar6.mo12359D();
                        gecVar.f40659R |= gecVar.f40686y != z4;
                        gecVar.f40686y = z4;
                        if (cursorQuery.isNull(34)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                        }
                        tic ticVar7 = kjcVar2.f47439g;
                        kjc.m15280l(ticVar7);
                        ticVar7.mo12359D();
                        gecVar.f40659R |= !Objects.equals(gecVar.f40678q, boolValueOf);
                        gecVar.f40678q = boolValueOf;
                        gecVar.m12553p(cursorQuery.getInt(37));
                        gecVar.m12554q(cursorQuery.getInt(38));
                        if (cursorQuery.isNull(40)) {
                            string = "";
                        } else {
                            string = cursorQuery.getString(40);
                            lda.m16130p(string);
                        }
                        tic ticVar8 = kjcVar2.f47439g;
                        kjc.m15280l(ticVar8);
                        ticVar8.mo12359D();
                        gecVar.f40659R |= gecVar.f40648G != string;
                        gecVar.f40648G = string;
                        if (!cursorQuery.isNull(41)) {
                            Long lValueOf = Long.valueOf(cursorQuery.getLong(41));
                            tic ticVar9 = kjcVar2.f47439g;
                            kjc.m15280l(ticVar9);
                            ticVar9.mo12359D();
                            gecVar.f40659R |= !Objects.equals(gecVar.f40687z, lValueOf);
                            gecVar.f40687z = lValueOf;
                        }
                        if (!cursorQuery.isNull(42)) {
                            Long lValueOf2 = Long.valueOf(cursorQuery.getLong(42));
                            tic ticVar10 = kjcVar2.f47439g;
                            kjc.m15280l(ticVar10);
                            ticVar10.mo12359D();
                            gecVar.f40659R |= !Objects.equals(gecVar.f40642A, lValueOf2);
                            gecVar.f40642A = lValueOf2;
                        }
                        byte[] blob = cursorQuery.getBlob(43);
                        tic ticVar11 = kjcVar2.f47439g;
                        kjc.m15280l(ticVar11);
                        ticVar11.mo12359D();
                        gecVar.f40659R |= gecVar.f40649H != blob;
                        gecVar.f40649H = blob;
                        if (!cursorQuery.isNull(44)) {
                            int i2 = cursorQuery.getInt(44);
                            tic ticVar12 = kjcVar2.f47439g;
                            kjc.m15280l(ticVar12);
                            ticVar12.mo12359D();
                            boolean z5 = gecVar.f40659R;
                            if (gecVar.f40650I == i2) {
                                z = false;
                            }
                            gecVar.f40659R = z | z5;
                            gecVar.f40650I = i2;
                        }
                        if (kjcVar.f47436d.m4869O(str, z8c.f71182j1) && !cursorQuery.isNull(45)) {
                            gecVar.m12558u(cursorQuery.getLong(45));
                        }
                        tic ticVar13 = kjcVar2.f47439g;
                        kjc.m15280l(ticVar13);
                        ticVar13.mo12359D();
                        gecVar.f40659R = false;
                        if (cursorQuery.moveToNext()) {
                            xcc xccVar = kjcVar.f47438f;
                            kjc.m15280l(xccVar);
                            xccVar.f68080f.m17924b(xcc.m24449L(str), "Got multiple records for app, expected one. appId");
                        }
                        cursorQuery.close();
                        return gecVar;
                    }
                } catch (SQLiteException e) {
                    e = e;
                    xcc xccVar2 = kjcVar.f47438f;
                    kjc.m15280l(xccVar2);
                    xccVar2.f68080f.m17925c("Error querying app. appId", xcc.m24449L(str), e);
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList] */
    /* JADX INFO: renamed from: I */
    public final List m17518I(String str, zzoo zzooVar, int i) {
        ?? arrayList;
        lda.m16127m(str);
        mo12359D();
        m13144E();
        Cursor cursorQuery = null;
        try {
            SQLiteDatabase sQLiteDatabaseM17559u0 = m17559u0();
            String[] strArr = {"rowId", "app_id", "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count", "creation_timestamp", "associated_row_id", "last_upload_timestamp"};
            String strM17507i0 = m17507i0(zzooVar.f12404a);
            String strM17548h0 = m17548h0();
            StringBuilder sb = new StringBuilder(strM17507i0.length() + 17 + strM17548h0.length());
            sb.append("app_id=?");
            sb.append(strM17507i0);
            sb.append(" AND NOT ");
            sb.append(strM17548h0);
            cursorQuery = sQLiteDatabaseM17559u0.query("upload_queue", strArr, sb.toString(), new String[]{str}, null, null, "creation_timestamp ASC", i > 0 ? String.valueOf(i) : null);
            arrayList = new ArrayList();
            while (cursorQuery.moveToNext()) {
                aad aadVarM17547g0 = m17547g0(str, cursorQuery.getLong(0), cursorQuery.getBlob(2), cursorQuery.getString(3), cursorQuery.getString(4), cursorQuery.getInt(5), cursorQuery.getInt(6), cursorQuery.getLong(7), cursorQuery.getLong(8), cursorQuery.getLong(9));
                if (aadVarM17547g0 != null) {
                    arrayList.add(aadVarM17547g0);
                }
            }
        } catch (SQLiteException e) {
            xcc xccVar = ((kjc) this.f60774a).f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17925c("Error to querying MeasurementBatch from upload_queue. appId", str, e);
            arrayList = Collections.EMPTY_LIST;
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: I0 */
    public final void m17519I0(gec gecVar, boolean z) {
        kjc kjcVar = (kjc) this.f60774a;
        kjc kjcVar2 = gecVar.f40662a;
        mo12359D();
        m13144E();
        String strM12522E = gecVar.m12522E();
        lda.m16130p(strM12522E);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", strM12522E);
        C1045d c1045d = this.f55716b;
        if (z) {
            contentValues.put("app_instance_id", (String) null);
        } else if (c1045d.m5917f(strM12522E).m17590i(zzjk.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", gecVar.m12523F());
        }
        contentValues.put("gmp_app_id", gecVar.m12525H());
        if (c1045d.m5917f(strM12522E).m17590i(zzjk.AD_STORAGE)) {
            tic ticVar = kjcVar2.f47439g;
            kjc.m15280l(ticVar);
            ticVar.mo12359D();
            contentValues.put("resettable_device_id_hash", gecVar.f40666e);
        }
        tic ticVar2 = kjcVar2.f47439g;
        kjc.m15280l(ticVar2);
        ticVar2.mo12359D();
        contentValues.put("last_bundle_index", Long.valueOf(gecVar.f40668g));
        tic ticVar3 = kjcVar2.f47439g;
        kjc.m15280l(ticVar3);
        ticVar3.mo12359D();
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(gecVar.f40669h));
        tic ticVar4 = kjcVar2.f47439g;
        kjc.m15280l(ticVar4);
        ticVar4.mo12359D();
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(gecVar.f40670i));
        contentValues.put("app_version", gecVar.m12532O());
        tic ticVar5 = kjcVar2.f47439g;
        kjc.m15280l(ticVar5);
        ticVar5.mo12359D();
        contentValues.put("app_store", gecVar.f40673l);
        tic ticVar6 = kjcVar2.f47439g;
        kjc.m15280l(ticVar6);
        ticVar6.mo12359D();
        contentValues.put("gmp_version", Long.valueOf(gecVar.f40674m));
        tic ticVar7 = kjcVar2.f47439g;
        kjc.m15280l(ticVar7);
        ticVar7.mo12359D();
        contentValues.put("dev_cert_hash", Long.valueOf(gecVar.f40675n));
        tic ticVar8 = kjcVar2.f47439g;
        kjc.m15280l(ticVar8);
        ticVar8.mo12359D();
        contentValues.put("measurement_enabled", Boolean.valueOf(gecVar.f40676o));
        tic ticVar9 = kjcVar2.f47439g;
        tic ticVar10 = kjcVar2.f47439g;
        kjc.m15280l(ticVar9);
        ticVar9.mo12359D();
        contentValues.put("day", Long.valueOf(gecVar.f40652K));
        kjc.m15280l(ticVar10);
        ticVar10.mo12359D();
        contentValues.put("daily_public_events_count", Long.valueOf(gecVar.f40653L));
        kjc.m15280l(ticVar10);
        ticVar10.mo12359D();
        contentValues.put("daily_events_count", Long.valueOf(gecVar.f40654M));
        kjc.m15280l(ticVar10);
        ticVar10.mo12359D();
        contentValues.put("daily_conversions_count", Long.valueOf(gecVar.f40655N));
        tic ticVar11 = kjcVar2.f47439g;
        kjc.m15280l(ticVar11);
        ticVar11.mo12359D();
        contentValues.put("config_fetched_time", Long.valueOf(gecVar.f40660S));
        tic ticVar12 = kjcVar2.f47439g;
        kjc.m15280l(ticVar12);
        ticVar12.mo12359D();
        contentValues.put("failed_config_fetch_time", Long.valueOf(gecVar.f40661T));
        contentValues.put("app_version_int", Long.valueOf(gecVar.m12534Q()));
        contentValues.put("firebase_instance_id", gecVar.m12528K());
        kjc.m15280l(ticVar10);
        ticVar10.mo12359D();
        contentValues.put("daily_error_events_count", Long.valueOf(gecVar.f40656O));
        kjc.m15280l(ticVar10);
        ticVar10.mo12359D();
        contentValues.put("daily_realtime_events_count", Long.valueOf(gecVar.f40657P));
        kjc.m15280l(ticVar10);
        ticVar10.mo12359D();
        contentValues.put("health_monitor_sample", gecVar.f40658Q);
        contentValues.put("android_id", (Long) 0L);
        tic ticVar13 = kjcVar2.f47439g;
        kjc.m15280l(ticVar13);
        ticVar13.mo12359D();
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(gecVar.f40677p));
        contentValues.put("dynamite_version", Long.valueOf(gecVar.m12539b()));
        if (c1045d.m5917f(strM12522E).m17590i(zzjk.ANALYTICS_STORAGE)) {
            tic ticVar14 = kjcVar2.f47439g;
            kjc.m15280l(ticVar14);
            ticVar14.mo12359D();
            contentValues.put("session_stitching_token", gecVar.f40681t);
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(gecVar.m12563z()));
        tic ticVar15 = kjcVar2.f47439g;
        kjc.m15280l(ticVar15);
        ticVar15.mo12359D();
        contentValues.put("target_os_version", Long.valueOf(gecVar.f40683v));
        tic ticVar16 = kjcVar2.f47439g;
        kjc.m15280l(ticVar16);
        ticVar16.mo12359D();
        contentValues.put("session_stitching_token_hash", Long.valueOf(gecVar.f40684w));
        blb.m3870a();
        cmb cmbVar = kjcVar.f47436d;
        xcc xccVar = kjcVar.f47438f;
        if (cmbVar.m4869O(strM12522E, z8c.f71130O0)) {
            tic ticVar17 = kjcVar2.f47439g;
            kjc.m15280l(ticVar17);
            ticVar17.mo12359D();
            contentValues.put("ad_services_version", Integer.valueOf(gecVar.f40685x));
            tic ticVar18 = kjcVar2.f47439g;
            kjc.m15280l(ticVar18);
            ticVar18.mo12359D();
            contentValues.put("attribution_eligibility_status", Long.valueOf(gecVar.f40643B));
        }
        tic ticVar19 = kjcVar2.f47439g;
        kjc.m15280l(ticVar19);
        ticVar19.mo12359D();
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(gecVar.f40686y));
        contentValues.put("npa_metadata_value", gecVar.m12561x());
        tic ticVar20 = kjcVar2.f47439g;
        kjc.m15280l(ticVar20);
        ticVar20.mo12359D();
        contentValues.put("bundle_delivery_index", Long.valueOf(gecVar.f40647F));
        contentValues.put("sgtm_preview_key", gecVar.m12521D());
        kjc.m15280l(ticVar10);
        ticVar10.mo12359D();
        contentValues.put("dma_consent_state", Integer.valueOf(gecVar.f40645D));
        kjc.m15280l(ticVar10);
        ticVar10.mo12359D();
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(gecVar.f40646E));
        contentValues.put("serialized_npa_metadata", gecVar.m12556s());
        contentValues.put("client_upload_eligibility", Integer.valueOf(gecVar.m12557t()));
        tic ticVar21 = kjcVar2.f47439g;
        kjc.m15280l(ticVar21);
        ticVar21.mo12359D();
        ArrayList arrayList = gecVar.f40680s;
        if (arrayList != null) {
            if (arrayList.isEmpty()) {
                kjc.m15280l(xccVar);
                xccVar.f68083i.m17924b(strM12522E, "Safelisted events should not be an empty list. appId");
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", arrayList));
            }
        }
        ((lkb) kkb.f47461b.f47462a.get()).getClass();
        if (cmbVar.m4869O(null, z8c.f71122K0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        tic ticVar22 = kjcVar2.f47439g;
        kjc.m15280l(ticVar22);
        ticVar22.mo12359D();
        contentValues.put("unmatched_pfo", gecVar.f40687z);
        tic ticVar23 = kjcVar2.f47439g;
        kjc.m15280l(ticVar23);
        ticVar23.mo12359D();
        contentValues.put("unmatched_uwa", gecVar.f40642A);
        tic ticVar24 = kjcVar2.f47439g;
        kjc.m15280l(ticVar24);
        ticVar24.mo12359D();
        contentValues.put("ad_campaign_info", gecVar.f40649H);
        if (cmbVar.m4869O(strM12522E, z8c.f71182j1)) {
            tic ticVar25 = kjcVar2.f47439g;
            kjc.m15280l(ticVar25);
            ticVar25.mo12359D();
            contentValues.put("last_diagnostics_signal_upload_timestamp", Long.valueOf(gecVar.f40651J));
        }
        try {
            SQLiteDatabase sQLiteDatabaseM17559u0 = m17559u0();
            if (sQLiteDatabaseM17559u0.update("apps", contentValues, "app_id = ?", new String[]{strM12522E}) == 0 && sQLiteDatabaseM17559u0.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                kjc.m15280l(xccVar);
                xccVar.f68080f.m17924b(xcc.m24449L(strM12522E), "Failed to insert/update app (got -1). appId");
            }
        } catch (SQLiteException e) {
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17925c("Error storing app. appId", xcc.m24449L(strM12522E), e);
        }
    }

    /* JADX INFO: renamed from: J */
    public final boolean m17520J(String str) {
        zzls[] zzlsVarArr = {zzls.GOOGLE_SIGNAL};
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(Integer.valueOf(zzlsVarArr[0].zza()));
        String strM17507i0 = m17507i0(arrayList);
        String strM17548h0 = m17548h0();
        return m17540Z(wq1.m24125u(new StringBuilder((strM17507i0.length() + 61) + strM17548h0.length()), "SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=?", strM17507i0, " AND NOT ", strM17548h0), new String[]{str}) != 0;
    }

    /* JADX INFO: renamed from: J0 */
    public final wmb m17521J0(long j, String str, boolean z, boolean z2, boolean z3, boolean z4) {
        return m17523K0(j, str, 1L, false, false, z, false, z2, z3, z4);
    }

    /* JADX INFO: renamed from: K */
    public final void m17522K(Long l) {
        kjc kjcVar = (kjc) this.f60774a;
        mo12359D();
        m13144E();
        try {
            if (m17559u0().delete("upload_queue", "rowid=?", new String[]{l.toString()}) != 1) {
                xcc xccVar = kjcVar.f47438f;
                kjc.m15280l(xccVar);
                xccVar.f68083i.m17923a("Deleted fewer rows from upload_queue than expected");
            }
        } catch (SQLiteException e) {
            xcc xccVar2 = kjcVar.f47438f;
            kjc.m15280l(xccVar2);
            xccVar2.f68080f.m17924b(e, "Failed to delete a MeasurementBatch in a upload_queue table");
            throw e;
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final wmb m17523K0(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        kjc kjcVar = (kjc) this.f60774a;
        lda.m16127m(str);
        mo12359D();
        m13144E();
        String[] strArr = {str};
        wmb wmbVar = new wmb();
        Cursor cursorQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM17559u0 = m17559u0();
                cursorQuery = sQLiteDatabaseM17559u0.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    if (cursorQuery.getLong(0) == j) {
                        wmbVar.f67069b = cursorQuery.getLong(1);
                        wmbVar.f67068a = cursorQuery.getLong(2);
                        wmbVar.f67070c = cursorQuery.getLong(3);
                        wmbVar.f67071d = cursorQuery.getLong(4);
                        wmbVar.f67072e = cursorQuery.getLong(5);
                        wmbVar.f67073f = cursorQuery.getLong(6);
                        wmbVar.f67074g = cursorQuery.getLong(7);
                    }
                    if (z) {
                        wmbVar.f67069b += j2;
                    }
                    if (z2) {
                        wmbVar.f67068a += j2;
                    }
                    if (z3) {
                        wmbVar.f67070c += j2;
                    }
                    if (z4) {
                        wmbVar.f67071d += j2;
                    }
                    if (z5) {
                        wmbVar.f67072e += j2;
                    }
                    if (z6) {
                        wmbVar.f67073f += j2;
                    }
                    if (z7) {
                        wmbVar.f67074g += j2;
                    }
                    ContentValues contentValues = new ContentValues();
                    contentValues.put("day", Long.valueOf(j));
                    contentValues.put("daily_public_events_count", Long.valueOf(wmbVar.f67068a));
                    contentValues.put("daily_events_count", Long.valueOf(wmbVar.f67069b));
                    contentValues.put("daily_conversions_count", Long.valueOf(wmbVar.f67070c));
                    contentValues.put("daily_error_events_count", Long.valueOf(wmbVar.f67071d));
                    contentValues.put("daily_realtime_events_count", Long.valueOf(wmbVar.f67072e));
                    contentValues.put("daily_realtime_dcu_count", Long.valueOf(wmbVar.f67073f));
                    contentValues.put("daily_registered_triggers_count", Long.valueOf(wmbVar.f67074g));
                    sQLiteDatabaseM17559u0.update("apps", contentValues, "app_id=?", strArr);
                } else {
                    xcc xccVar = kjcVar.f47438f;
                    kjc.m15280l(xccVar);
                    xccVar.f68083i.m17924b(xcc.m24449L(str), "Not updating daily counts, app is not known. appId");
                }
            } catch (SQLiteException e) {
                xcc xccVar2 = kjcVar.f47438f;
                kjc.m15280l(xccVar2);
                xccVar2.f68080f.m17925c("Error updating daily counts. appId", xcc.m24449L(str), e);
            }
            return wmbVar;
        } finally {
            if (0 != 0) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003d  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX INFO: renamed from: L */
    public final String m17524L() throws Throwable {
        SQLiteException e;
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseM17559u0 = m17559u0();
        ?? r1 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseM17559u0.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        String string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        return string;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    xcc xccVar = ((kjc) this.f60774a).f47438f;
                    kjc.m15280l(xccVar);
                    xccVar.f68080f.m17924b(e, "Database error getting next bundle app id");
                }
            } catch (Throwable th) {
                th = th;
                r1 = sQLiteDatabaseM17559u0;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x008d  */
    /* JADX WARN: Code duplicated, block: B:35:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX INFO: renamed from: L0 */
    public final sq5 m17525L0(String str) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        kjc kjcVar = (kjc) this.f60774a;
        lda.m16127m(str);
        mo12359D();
        m13144E();
        ?? r2 = 0;
        try {
            try {
                cursorQuery = m17559u0().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        byte[] blob = cursorQuery.getBlob(0);
                        String string = cursorQuery.getString(1);
                        String string2 = cursorQuery.getString(2);
                        if (cursorQuery.moveToNext()) {
                            xcc xccVar = kjcVar.f47438f;
                            kjc.m15280l(xccVar);
                            xccVar.f68080f.m17924b(xcc.m24449L(str), "Got multiple records for app config, expected one. appId");
                        }
                        if (blob != null) {
                            sq5 sq5Var = new sq5(23, blob, string2, string);
                            cursorQuery.close();
                            return sq5Var;
                        }
                    }
                } catch (SQLiteException e) {
                    e = e;
                    xcc xccVar2 = kjcVar.f47438f;
                    kjc.m15280l(xccVar2);
                    xccVar2.f68080f.m17925c("Error querying remote config. appId", xcc.m24449L(str), e);
                }
            } catch (Throwable th2) {
                th = th2;
                r2 = this;
                if (r2 != 0) {
                    throw th;
                }
                r2.close();
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (r2 != 0) {
                throw th;
            }
            r2.close();
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX INFO: renamed from: M */
    public final void m17526M(long j) {
        mo12359D();
        m13144E();
        try {
            if (m17559u0().delete("queue", "rowid=?", new String[]{String.valueOf(j)}) == 1) {
            } else {
                throw new SQLiteException("Deleted fewer rows from queue than expected");
            }
        } catch (SQLiteException e) {
            xcc xccVar = ((kjc) this.f60774a).f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17924b(e, "Failed to delete a bundle in a queue table");
            throw e;
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m17527M0(pjc pjcVar, boolean z) {
        mo12359D();
        m13144E();
        lda.m16127m(pjcVar.m19334s());
        lda.m16133s(pjcVar.m19297f2());
        m17528N();
        kjc kjcVar = (kjc) this.f60774a;
        gr7 gr7Var = kjcVar.f47443k;
        xcc xccVar = kjcVar.f47438f;
        gr7Var.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        long jM19300g2 = pjcVar.m19300g2();
        t8c t8cVar = z8c.f71135R;
        if (jM19300g2 < jCurrentTimeMillis - ((Long) t8cVar.m21901a(null)).longValue() || pjcVar.m19300g2() > ((Long) t8cVar.m21901a(null)).longValue() + jCurrentTimeMillis) {
            kjc.m15280l(xccVar);
            xccVar.f68083i.m17926d("Storing bundle outside of the max uploading time span. appId, now, timestamp", xcc.m24449L(pjcVar.m19334s()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(pjcVar.m19300g2()));
        }
        byte[] bArrM3725a = pjcVar.m3725a();
        try {
            dad dadVar = this.f55716b.f12367g;
            C1045d.m5885T(dadVar);
            byte[] bArrM10256n0 = dadVar.m10256n0(bArrM3725a);
            kjc.m15280l(xccVar);
            xccVar.f68076I.m17924b(Integer.valueOf(bArrM10256n0.length), "Saving bundle, size");
            ContentValues contentValues = new ContentValues();
            contentValues.put("app_id", pjcVar.m19334s());
            contentValues.put("bundle_end_timestamp", Long.valueOf(pjcVar.m19300g2()));
            contentValues.put("data", bArrM10256n0);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (pjcVar.m19335s0()) {
                contentValues.put("retry_count", Integer.valueOf(pjcVar.m19338t0()));
            }
            try {
                if (m17559u0().insert("queue", null, contentValues) == -1) {
                    kjc.m15280l(xccVar);
                    xccVar.f68080f.m17924b(xcc.m24449L(pjcVar.m19334s()), "Failed to insert bundle (got -1). appId");
                }
            } catch (SQLiteException e) {
                kjc.m15280l(xccVar);
                xccVar.f68080f.m17925c("Error storing bundle. appId", xcc.m24449L(pjcVar.m19334s()), e);
            }
        } catch (IOException e2) {
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17925c("Data loss. Failed to serialize bundle. appId", xcc.m24449L(pjcVar.m19334s()), e2);
        }
    }

    /* JADX INFO: renamed from: N */
    public final void m17528N() {
        mo12359D();
        m13144E();
        if (m17554o0()) {
            C1045d c1045d = this.f55716b;
            long jM19952g = c1045d.f12369i.f9597e.m19952g();
            kjc kjcVar = (kjc) this.f60774a;
            kjcVar.f47443k.getClass();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jM19952g) > ((Long) z8c.f71125M.m21901a(null)).longValue()) {
                c1045d.f12369i.f9597e.m19953h(jElapsedRealtime);
                mo12359D();
                m13144E();
                if (m17554o0()) {
                    SQLiteDatabase sQLiteDatabaseM17559u0 = m17559u0();
                    kjcVar.f47443k.getClass();
                    int iDelete = sQLiteDatabaseM17559u0.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(System.currentTimeMillis()), String.valueOf(((Long) z8c.f71135R.m21901a(null)).longValue())});
                    if (iDelete > 0) {
                        xcc xccVar = kjcVar.f47438f;
                        kjc.m15280l(xccVar);
                        xccVar.f68076I.m17924b(Integer.valueOf(iDelete), "Deleted stale rows. rowsDeleted");
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m17529O(ArrayList arrayList) {
        kjc kjcVar = (kjc) this.f60774a;
        mo12359D();
        m13144E();
        lda.m16130p(arrayList);
        if (arrayList.size() == 0) {
            C3386nv.m17626m("Given Integer is zero");
            return;
        }
        if (m17554o0()) {
            String strJoin = TextUtils.join(",", arrayList);
            String strM17739n = AbstractC3393o1.m17739n(new StringBuilder(String.valueOf(strJoin).length() + 2), "(", strJoin, ")");
            if (m17540Z(AbstractC3393o1.m17739n(new StringBuilder(strM17739n.length() + 80), "SELECT COUNT(1) FROM queue WHERE rowid IN ", strM17739n, " AND retry_count =  2147483647 LIMIT 1"), null) > 0) {
                xcc xccVar = kjcVar.f47438f;
                kjc.m15280l(xccVar);
                xccVar.f68083i.m17923a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseM17559u0 = m17559u0();
                StringBuilder sb = new StringBuilder(strM17739n.length() + 127);
                sb.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb.append(strM17739n);
                sb.append(" AND (retry_count IS NULL OR retry_count < 2147483647)");
                sQLiteDatabaseM17559u0.execSQL(sb.toString());
            } catch (SQLiteException e) {
                xcc xccVar2 = kjcVar.f47438f;
                kjc.m15280l(xccVar2);
                xccVar2.f68080f.m17924b(e, "Error incrementing retry count. error");
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public final void m17530P(Long l) {
        kjc kjcVar = (kjc) this.f60774a;
        mo12359D();
        m13144E();
        if (m17554o0()) {
            StringBuilder sb = new StringBuilder(l.toString().length() + 86);
            sb.append("SELECT COUNT(1) FROM upload_queue WHERE rowid = ");
            sb.append(l);
            sb.append(" AND retry_count =  2147483647 LIMIT 1");
            if (m17540Z(sb.toString(), null) > 0) {
                xcc xccVar = kjcVar.f47438f;
                kjc.m15280l(xccVar);
                xccVar.f68083i.m17923a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase sQLiteDatabaseM17559u0 = m17559u0();
                kjcVar.f47443k.getClass();
                long jCurrentTimeMillis = System.currentTimeMillis();
                StringBuilder sb2 = new StringBuilder(String.valueOf(jCurrentTimeMillis).length() + 60);
                sb2.append(" SET retry_count = retry_count + 1, last_upload_timestamp = ");
                sb2.append(jCurrentTimeMillis);
                String string = sb2.toString();
                StringBuilder sb3 = new StringBuilder(string.length() + 34 + l.toString().length() + 29);
                sb3.append("UPDATE upload_queue");
                sb3.append(string);
                sb3.append(" WHERE rowid = ");
                sb3.append(l);
                sb3.append(" AND retry_count < 2147483647");
                sQLiteDatabaseM17559u0.execSQL(sb3.toString());
            } catch (SQLiteException e) {
                xcc xccVar2 = kjcVar.f47438f;
                kjc.m15280l(xccVar2);
                xccVar2.f68080f.m17924b(e, "Error incrementing retry count. error");
            }
        }
    }

    /* JADX INFO: renamed from: Q */
    public final Object m17531Q(Cursor cursor, int i) {
        kjc kjcVar = (kjc) this.f60774a;
        int type = cursor.getType(i);
        if (type == 0) {
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17923a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type != 4) {
            xcc xccVar2 = kjcVar.f47438f;
            kjc.m15280l(xccVar2);
            xccVar2.f68080f.m17924b(Integer.valueOf(type), "Loaded invalid unknown value type, ignoring it");
            return null;
        }
        xcc xccVar3 = kjcVar.f47438f;
        kjc.m15280l(xccVar3);
        xccVar3.f68080f.m17923a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0093 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x00a6 A[Catch: all -> 0x006d, SQLiteException -> 0x00a4, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00a4, blocks: (B:15:0x0072, B:17:0x0093, B:20:0x00a6), top: B:30:0x0072 }] */
    /* JADX INFO: renamed from: R */
    public final long m17532R(String str) {
        long j;
        ContentValues contentValues;
        kjc kjcVar = (kjc) this.f60774a;
        lda.m16127m(str);
        lda.m16127m("first_open_count");
        mo12359D();
        m13144E();
        SQLiteDatabase sQLiteDatabaseM17559u0 = m17559u0();
        sQLiteDatabaseM17559u0.beginTransaction();
        long j2 = 0;
        try {
            try {
                StringBuilder sb = new StringBuilder(48);
                sb.append("select first_open_count from app2 where app_id=?");
                j = -1;
                long jM17541a0 = m17541a0(sb.toString(), new String[]{str}, -1L);
                if (jM17541a0 == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseM17559u0.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        xcc xccVar = kjcVar.f47438f;
                        kjc.m15280l(xccVar);
                        xccVar.f68080f.m17925c("Failed to insert column (got -1). appId", xcc.m24449L(str), "first_open_count");
                    } else {
                        jM17541a0 = 0;
                        try {
                            contentValues = new ContentValues();
                            contentValues.put("app_id", str);
                            contentValues.put("first_open_count", Long.valueOf(1 + jM17541a0));
                            if (sQLiteDatabaseM17559u0.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                                xcc xccVar2 = kjcVar.f47438f;
                                kjc.m15280l(xccVar2);
                                xccVar2.f68080f.m17925c("Failed to update column (got 0). appId", xcc.m24449L(str), "first_open_count");
                            } else {
                                sQLiteDatabaseM17559u0.setTransactionSuccessful();
                                j = jM17541a0;
                            }
                        } catch (SQLiteException e) {
                            e = e;
                            j2 = jM17541a0;
                            xcc xccVar3 = kjcVar.f47438f;
                            kjc.m15280l(xccVar3);
                            xccVar3.f68080f.m17926d("Error inserting column. appId", xcc.m24449L(str), "first_open_count", e);
                            j = j2;
                        }
                    }
                } else {
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", Long.valueOf(1 + jM17541a0));
                    if (sQLiteDatabaseM17559u0.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
                        xcc xccVar4 = kjcVar.f47438f;
                        kjc.m15280l(xccVar4);
                        xccVar4.f68080f.m17925c("Failed to update column (got 0). appId", xcc.m24449L(str), "first_open_count");
                    } else {
                        sQLiteDatabaseM17559u0.setTransactionSuccessful();
                        j = jM17541a0;
                    }
                }
            } catch (SQLiteException e2) {
                e = e2;
            }
            return j;
        } finally {
            sQLiteDatabaseM17559u0.endTransaction();
        }
    }

    /* JADX INFO: renamed from: S */
    public final boolean m17533S(String str, String str2) {
        return m17540Z("select count(1) from raw_events where app_id = ? and name = ?", new String[]{str, str2}) > 0;
    }

    /* JADX INFO: renamed from: T */
    public final void m17534T(List list) {
        lda.m16130p(list);
        mo12359D();
        m13144E();
        StringBuilder sb = new StringBuilder("rowid in (");
        for (int i = 0; i < list.size(); i++) {
            if (i != 0) {
                sb.append(",");
            }
            sb.append(((Long) list.get(i)).longValue());
        }
        sb.append(")");
        int iDelete = m17559u0().delete("raw_events", sb.toString(), null);
        if (iDelete != list.size()) {
            xcc xccVar = ((kjc) this.f60774a).f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17925c("Deleted fewer rows from raw events table than expected", Integer.valueOf(iDelete), Integer.valueOf(list.size()));
        }
    }

    /* JADX INFO: renamed from: U */
    public final long m17535U(String str) {
        lda.m16127m(str);
        return m17541a0("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX INFO: renamed from: V */
    public final void m17536V(String str, Long l, long j, ohc ohcVar) {
        mo12359D();
        m13144E();
        lda.m16130p(ohcVar);
        lda.m16127m(str);
        kjc kjcVar = (kjc) this.f60774a;
        byte[] bArrM3725a = ohcVar.m3725a();
        xcc xccVar = kjcVar.f47438f;
        xcc xccVar2 = kjcVar.f47438f;
        kjc.m15280l(xccVar);
        xccVar.f68076I.m17925c("Saving complex main event, appId, data size", kjcVar.f47442j.m20572a(str), Integer.valueOf(bArrM3725a.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", bArrM3725a);
        try {
            if (m17559u0().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                kjc.m15280l(xccVar2);
                xccVar2.f68080f.m17924b(xcc.m24449L(str), "Failed to insert complex main event (got -1). appId");
            }
        } catch (SQLiteException e) {
            kjc.m15280l(xccVar2);
            xccVar2.f68080f.m17925c("Error storing complex main event. appId", xcc.m24449L(str), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:121:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x0118 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x0034 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:? A[LOOP:2: B:51:0x00fe->B:126:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:53:0x0104  */
    /* JADX INFO: renamed from: W */
    public final void m17537W(String str, Long l, String str2, Bundle bundle) throws Throwable {
        xcc xccVar;
        Bundle bundle2;
        long j;
        String str3;
        ContentValues contentValues;
        xcc xccVar2;
        pjc pjcVar;
        Iterator it;
        nnb nnbVar = this;
        String str4 = str;
        Object obj = nnbVar.f60774a;
        kjc kjcVar = (kjc) obj;
        lda.m16130p(bundle);
        nnbVar.mo12359D();
        nnbVar.m13144E();
        cn5 cn5Var = l != null ? new cn5(nnbVar, str4, l.longValue()) : new cn5(nnbVar, str4);
        List<bnb> listM4897d = cn5Var.m4897d();
        while (!listM4897d.isEmpty()) {
            for (bnb bnbVar : listM4897d) {
                try {
                    if (!TextUtils.isEmpty(str2)) {
                        Cursor cursor = null;
                        pjc pjcVar2 = null;
                        Cursor cursor2 = null;
                        try {
                            try {
                                Cursor cursorQuery = nnbVar.m17559u0().query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str4, Long.toString(bnbVar.f8752b)}, null, null, "rowid", "2");
                                try {
                                    try {
                                        if (cursorQuery.moveToFirst()) {
                                            try {
                                                pjcVar = (pjc) ((ljc) dad.m10238o0(pjc.m19202X(), cursorQuery.getBlob(0))).m22741d();
                                                try {
                                                    if (cursorQuery.moveToNext()) {
                                                        xcc xccVar3 = kjcVar.f47438f;
                                                        kjc.m15280l(xccVar3);
                                                        xccVar3.f68083i.m17924b(xcc.m24449L(str4), "Get multiple raw event metadata records, expected one. appId");
                                                    }
                                                    cursorQuery.close();
                                                    cursorQuery.close();
                                                } catch (SQLiteException e) {
                                                    e = e;
                                                    cursor = cursorQuery;
                                                    xcc xccVar4 = kjcVar.f47438f;
                                                    kjc.m15280l(xccVar4);
                                                    xccVar4.f68080f.m17925c("Data loss. Error selecting raw event. appId", xcc.m24449L(str4), e);
                                                    if (cursor != null) {
                                                        cursor.close();
                                                    }
                                                }
                                                pjcVar2 = pjcVar;
                                            } catch (IOException e2) {
                                                xcc xccVar5 = kjcVar.f47438f;
                                                kjc.m15280l(xccVar5);
                                                xccVar5.f68080f.m17925c("Data loss. Failed to merge raw event metadata. appId", xcc.m24449L(str4), e2);
                                                cursorQuery.close();
                                            }
                                            if (pjcVar2 != null) {
                                                it = pjcVar2.m19276Y1().iterator();
                                                while (true) {
                                                    if (it.hasNext()) {
                                                        if (((jmc) it.next()).m14550u().equals(str2)) {
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            xcc xccVar6 = kjcVar.f47438f;
                                            kjc.m15280l(xccVar6);
                                            xccVar6.f68080f.m17924b(xcc.m24449L(str4), "Raw event metadata record is missing. appId");
                                        }
                                        cursorQuery.close();
                                    } catch (SQLiteException e3) {
                                        e = e3;
                                        pjcVar = null;
                                    }
                                } catch (Throwable th) {
                                    th = th;
                                    cursor2 = cursorQuery;
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } catch (SQLiteException e4) {
                            e = e4;
                            pjcVar = null;
                        }
                        if (pjcVar2 != null) {
                            it = pjcVar2.m19276Y1().iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (((jmc) it.next()).m14550u().equals(str2)) {
                                    }
                                }
                            }
                        }
                    }
                    long jUpdate = m17559u0().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j)});
                    if (jUpdate != 1) {
                        kjc.m15280l(xccVar);
                        xccVar2 = xccVar;
                        try {
                            xccVar2.f68080f.m17925c("Failed to update raw event. appId, updatedRows", xcc.m24449L(str3), Long.valueOf(jUpdate));
                        } catch (SQLiteException e5) {
                            e = e5;
                            kjc.m15280l(xccVar2);
                            xccVar2.f68080f.m17925c("Error updating raw event. appId", xcc.m24449L(str3), e);
                        }
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                    xccVar2 = xccVar;
                }
                C1045d c1045d = nnbVar.f55716b;
                dad dadVar = c1045d.f12367g;
                C1045d.m5885T(dadVar);
                ohc ohcVar = bnbVar.f8754d;
                Bundle bundle3 = new Bundle();
                for (fic ficVar : ohcVar.m18023u()) {
                    if (ficVar.m11862A()) {
                        bundle3.putDouble(ficVar.m11877t(), ficVar.m11863B());
                    } else if (ficVar.m11882y()) {
                        bundle3.putFloat(ficVar.m11877t(), ficVar.m11883z());
                    } else if (ficVar.m11880w()) {
                        bundle3.putLong(ficVar.m11877t(), ficVar.m11881x());
                    } else if (ficVar.m11878u()) {
                        bundle3.putString(ficVar.m11877t(), ficVar.m11879v());
                    } else if (ficVar.m11864C().isEmpty()) {
                        xcc xccVar7 = ((kjc) dadVar.f60774a).f47438f;
                        kjc.m15280l(xccVar7);
                        xccVar7.f68080f.m17924b(ficVar, "Unexpected parameter type for parameter");
                    } else {
                        bundle3.putParcelableArray(ficVar.m11877t(), dad.m10240q0(ficVar.m11864C()));
                    }
                }
                String string = bundle3.getString("_o");
                bundle3.remove("_o");
                String strM18026x = ohcVar.m18026x();
                if (string == null) {
                    string = "";
                }
                rad radVar = kjcVar.f47441i;
                xccVar = kjcVar.f47438f;
                kjc.m15278j(radVar);
                if (strM18026x.equals("_cmp")) {
                    bundle2 = new Bundle(bundle);
                    for (String str5 : bundle.keySet()) {
                        if (str5.startsWith("gad_")) {
                            bundle2.remove(str5);
                        }
                    }
                } else {
                    bundle2 = bundle;
                }
                radVar.m20535Q(bundle3, bundle2);
                vob vobVar = new vob((kjc) obj, string, str4, ohcVar.m18026x(), ohcVar.m18028z(), ohcVar.m18010H(), ohcVar.m18004B(), bundle3);
                j = bnbVar.f8751a;
                long j2 = bnbVar.f8752b;
                boolean z = bnbVar.f8753c;
                mo12359D();
                m13144E();
                str3 = vobVar.f65728a;
                lda.m16127m(str3);
                dad dadVar2 = c1045d.f12367g;
                C1045d.m5885T(dadVar2);
                byte[] bArrM3725a = dadVar2.m10249d0(vobVar).m3725a();
                contentValues = new ContentValues();
                contentValues.put("app_id", str3);
                contentValues.put("name", vobVar.f65729b);
                contentValues.put("timestamp", Long.valueOf(vobVar.f65731d));
                contentValues.put("metadata_fingerprint", Long.valueOf(j2));
                contentValues.put("data", bArrM3725a);
                contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
                contentValues.put("elapsed_time", Long.valueOf(vobVar.f65732e));
                nnbVar = this;
                str4 = str;
            }
            listM4897d = cn5Var.m4897d();
            nnbVar = this;
            str4 = str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0061 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0064  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r3v0, types: [h8d, nnb, sf] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v9, types: [android.database.Cursor] */
    /* JADX INFO: renamed from: X */
    public final npc m17538X(String str) {
        Throwable th;
        SQLiteException e;
        kjc kjcVar = (kjc) this.f60774a;
        lda.m16130p(str);
        mo12359D();
        m13144E();
        ?? r2 = 0;
        npcVarM17583c = null;
        npcVarM17583c = null;
        npc npcVarM17583c = null;
        try {
            try {
                this = m17559u0().rawQuery("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str});
                try {
                    if (this.moveToFirst()) {
                        npcVarM17583c = npc.m17583c(this.getInt(1), this.getString(0));
                    } else {
                        xcc xccVar = kjcVar.f47438f;
                        kjc.m15280l(xccVar);
                        xccVar.f68076I.m17923a("No data found");
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    xcc xccVar2 = kjcVar.f47438f;
                    kjc.m15280l(xccVar2);
                    xccVar2.f68080f.m17924b(e, "Error querying database.");
                    if (this != 0) {
                    }
                    if (npcVarM17583c == null) {
                        return npc.f53108c;
                    }
                    return npcVarM17583c;
                }
            } catch (Throwable th2) {
                th = th2;
                r2 = this;
                if (r2 != 0) {
                    r2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            this = 0;
        } catch (Throwable th3) {
            th = th3;
            if (r2 != 0) {
                r2.close();
            }
            throw th;
        }
        this.close();
        if (npcVarM17583c == null) {
            return npc.f53108c;
        }
        return npcVarM17583c;
    }

    /* JADX INFO: renamed from: Y */
    public final void m17539Y(String str, zzoh zzohVar) {
        mo12359D();
        m13144E();
        lda.m16127m(str);
        kjc kjcVar = (kjc) this.f60774a;
        gr7 gr7Var = kjcVar.f47443k;
        xcc xccVar = kjcVar.f47438f;
        gr7Var.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        t8c t8cVar = z8c.f71204u0;
        long jLongValue = jCurrentTimeMillis - ((Long) t8cVar.m21901a(null)).longValue();
        long j = zzohVar.f12395b;
        if (j < jLongValue || j > ((Long) t8cVar.m21901a(null)).longValue() + jCurrentTimeMillis) {
            kjc.m15280l(xccVar);
            xccVar.f68083i.m17926d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", xcc.m24449L(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(j));
        }
        kjc.m15280l(xccVar);
        xccVar.f68076I.m17923a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("trigger_uri", zzohVar.f12394a);
        contentValues.put("source", Integer.valueOf(zzohVar.f12396c));
        contentValues.put("timestamp_millis", Long.valueOf(j));
        try {
            if (m17559u0().insert("trigger_uris", null, contentValues) == -1) {
                kjc.m15280l(xccVar);
                xccVar.f68080f.m17924b(xcc.m24449L(str), "Failed to insert trigger URI (got -1). appId");
            }
        } catch (SQLiteException e) {
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17925c("Error storing trigger URI. appId", xcc.m24449L(str), e);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final long m17540Z(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = m17559u0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                xcc xccVar = ((kjc) this.f60774a).f47438f;
                kjc.m15280l(xccVar);
                xccVar.f68080f.m17925c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final long m17541a0(String str, String[] strArr, long j) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m17559u0().rawQuery(str, strArr);
                if (cursorRawQuery.moveToFirst()) {
                    j = cursorRawQuery.getLong(0);
                }
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                xcc xccVar = ((kjc) this.f60774a).f47438f;
                kjc.m15280l(xccVar);
                xccVar.f68080f.m17925c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0034  */
    /* JADX INFO: renamed from: b0 */
    public final String m17542b0(String str, String[] strArr) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m17559u0().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return "";
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e) {
                xcc xccVar = ((kjc) this.f60774a).f47438f;
                kjc.m15280l(xccVar);
                xccVar.f68080f.m17925c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th;
    }

    /* JADX INFO: renamed from: c0 */
    public final void m17543c0(ContentValues contentValues) {
        kjc kjcVar = (kjc) this.f60774a;
        try {
            SQLiteDatabase sQLiteDatabaseM17559u0 = m17559u0();
            String asString = contentValues.getAsString("app_id");
            if (asString == null) {
                xcc xccVar = kjcVar.f47438f;
                kjc.m15280l(xccVar);
                xccVar.f68082h.m17924b(xcc.m24449L("app_id"), "Value of the primary key is not set.");
                return;
            }
            StringBuilder sb = new StringBuilder(10);
            sb.append("app_id = ?");
            if (sQLiteDatabaseM17559u0.update("consent_settings", contentValues, sb.toString(), new String[]{asString}) == 0 && sQLiteDatabaseM17559u0.insertWithOnConflict("consent_settings", null, contentValues, 5) == -1) {
                xcc xccVar2 = kjcVar.f47438f;
                kjc.m15280l(xccVar2);
                xccVar2.f68080f.m17925c("Failed to insert/update table (got -1). key", xcc.m24449L("consent_settings"), xcc.m24449L("app_id"));
            }
        } catch (SQLiteException e) {
            xcc xccVar3 = kjcVar.f47438f;
            kjc.m15280l(xccVar3);
            xccVar3.f68080f.m17926d("Error storing into table. key", xcc.m24449L("consent_settings"), xcc.m24449L("app_id"), e);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x0129  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX INFO: renamed from: d0 */
    public final zob m17544d0(String str, String str2, String str3) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        kjc kjcVar = (kjc) this.f60774a;
        lda.m16127m(str2);
        lda.m16127m(str3);
        mo12359D();
        m13144E();
        ArrayList arrayList = new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count"));
        ?? r3 = 0;
        try {
            try {
                cursorQuery = m17559u0().query(str, (String[]) arrayList.toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j = cursorQuery.getLong(0);
                        long j2 = cursorQuery.getLong(1);
                        long j3 = cursorQuery.getLong(2);
                        long j4 = 0;
                        long j5 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                        Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                        Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                        Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                        if (cursorQuery.isNull(7)) {
                            boolValueOf = null;
                        } else {
                            boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                        }
                        if (!cursorQuery.isNull(8)) {
                            j4 = cursorQuery.getLong(8);
                        }
                        zob zobVar = new zob(str2, str3, j, j2, j4, j3, j5, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                        if (cursorQuery.moveToNext()) {
                            xcc xccVar = kjcVar.f47438f;
                            kjc.m15280l(xccVar);
                            xccVar.f68080f.m17924b(xcc.m24449L(str2), "Got multiple records for event aggregates, expected one. appId");
                        }
                        cursorQuery.close();
                        return zobVar;
                    }
                } catch (SQLiteException e) {
                    e = e;
                    xcc xccVar2 = kjcVar.f47438f;
                    kjc.m15280l(xccVar2);
                    xccVar2.f68080f.m17926d("Error querying events. appId", xcc.m24449L(str2), kjcVar.f47442j.m20572a(str3), e);
                }
            } catch (Throwable th) {
                th = th;
                r3 = arrayList;
                if (r3 != 0) {
                    r3.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r3 != 0) {
                r3.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    /* JADX INFO: renamed from: e0 */
    public final void m17545e0(String str, zob zobVar) {
        kjc kjcVar = (kjc) this.f60774a;
        lda.m16130p(zobVar);
        mo12359D();
        m13144E();
        ContentValues contentValues = new ContentValues();
        String str2 = zobVar.f71912a;
        contentValues.put("app_id", str2);
        contentValues.put("name", zobVar.f71913b);
        contentValues.put("lifetime_count", Long.valueOf(zobVar.f71914c));
        contentValues.put("current_bundle_count", Long.valueOf(zobVar.f71915d));
        contentValues.put("last_fire_timestamp", Long.valueOf(zobVar.f71917f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(zobVar.f71918g));
        contentValues.put("last_bundled_day", zobVar.f71919h);
        contentValues.put("last_sampled_complex_event_id", zobVar.f71920i);
        contentValues.put("last_sampling_rate", zobVar.f71921j);
        contentValues.put("current_session_count", Long.valueOf(zobVar.f71916e));
        Boolean bool = zobVar.f71922k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (m17559u0().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                xcc xccVar = kjcVar.f47438f;
                kjc.m15280l(xccVar);
                xccVar.f68080f.m17924b(xcc.m24449L(str2), "Failed to insert/update event aggregates (got -1). appId");
            }
        } catch (SQLiteException e) {
            xcc xccVar2 = kjcVar.f47438f;
            kjc.m15280l(xccVar2);
            xccVar2.f68080f.m17925c("Error storing event aggregates. appId", xcc.m24449L(str2), e);
        }
    }

    /* JADX INFO: renamed from: f0 */
    public final void m17546f0(String str, String str2) {
        lda.m16127m(str2);
        mo12359D();
        m13144E();
        try {
            m17559u0().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            xcc xccVar = ((kjc) this.f60774a).f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17925c("Error deleting snapshot. appId", xcc.m24449L(str2), e);
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final aad m17547g0(String str, long j, byte[] bArr, String str2, String str3, int i, int i2, long j2, long j3, long j4) {
        kjc kjcVar = (kjc) this.f60774a;
        if (TextUtils.isEmpty(str2)) {
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68075H.m17923a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
            return null;
        }
        try {
            uic uicVar = (uic) dad.m10238o0(fjc.m11902z(), bArr);
            zzls zzlsVarZzb = zzls.zzb(i);
            if (zzlsVarZzb != zzls.GOOGLE_SIGNAL && zzlsVarZzb != zzls.GOOGLE_SIGNAL_PENDING && i2 > 0) {
                ArrayList arrayList = new ArrayList();
                Iterator it = Collections.unmodifiableList(((fjc) uicVar.f63950b).m11910s()).iterator();
                while (it.hasNext()) {
                    ljc ljcVar = (ljc) ((pjc) it.next()).m23966j();
                    ljcVar.m22739b();
                    ((pjc) ljcVar.f63950b).m19271W0(i2);
                    arrayList.add((pjc) ljcVar.m22741d());
                }
                uicVar.m22739b();
                ((fjc) uicVar.f63950b).m11906E();
                uicVar.m22739b();
                ((fjc) uicVar.f63950b).m11905D(arrayList);
            }
            HashMap map = new HashMap();
            if (str3 != null) {
                for (String str4 : str3.split("\r\n")) {
                    if (str4.isEmpty()) {
                        break;
                    }
                    String[] strArrSplit = str4.split("=", 2);
                    if (strArrSplit.length != 2) {
                        xcc xccVar2 = kjcVar.f47438f;
                        kjc.m15280l(xccVar2);
                        xccVar2.f68080f.m17924b(str4, "Invalid upload header: ");
                        break;
                    }
                    map.put(strArrSplit[0], strArrSplit[1]);
                }
            }
            y9d y9dVar = new y9d();
            y9dVar.m24999b(j);
            y9dVar.m25000c((fjc) uicVar.m22741d());
            y9dVar.m25001d(str2);
            y9dVar.m25002e(map);
            y9dVar.m25003f(zzlsVarZzb);
            y9dVar.m25004g(j2);
            y9dVar.m25005h(j3);
            y9dVar.m25006i(j4);
            y9dVar.m25007j(i2);
            return y9dVar.m24998a();
        } catch (IOException e) {
            xcc xccVar3 = kjcVar.f47438f;
            kjc.m15280l(xccVar3);
            xccVar3.f68080f.m17925c("Failed to queued MeasurementBatch from upload_queue. appId", str, e);
            return null;
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final String m17548h0() {
        ((kjc) this.f60774a).f47443k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        Locale locale = Locale.US;
        zzls zzlsVar = zzls.GOOGLE_SIGNAL;
        int iZza = zzlsVar.zza();
        Long l = (Long) z8c.f71137S.m21901a(null);
        l.getClass();
        String str = "(upload_type = " + iZza + " AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + l + ")";
        String str2 = "(upload_type != " + zzlsVar.zza() + " AND ABS(creation_timestamp - " + jCurrentTimeMillis + ") > " + ((Long) z8c.f71135R.m21901a(null)).longValue() + ")";
        StringBuilder sb = new StringBuilder(str.length() + 5 + str2.length() + 1);
        AbstractC3393o1.m17725C(sb, "(", str, " OR ", str2);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m17549j0(String str, npc npcVar) {
        lda.m16130p(str);
        lda.m16130p(npcVar);
        mo12359D();
        m13144E();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("consent_state", npcVar.m17589g());
        contentValues.put("consent_source", Integer.valueOf(npcVar.f53110b));
        m17543c0(contentValues);
    }

    /* JADX INFO: renamed from: k0 */
    public final List m17550k0(String str) {
        List list;
        String string;
        kjc kjcVar = (kjc) this.f60774a;
        mo12359D();
        m13144E();
        ArrayList arrayList = new ArrayList();
        try {
            SQLiteDatabase sQLiteDatabaseM17559u0 = m17559u0();
            sQLiteDatabaseM17559u0.beginTransaction();
            Cursor cursorQuery = null;
            try {
                try {
                    cursorQuery = sQLiteDatabaseM17559u0.query("diagnostic_signals", new String[]{"signal_name", "metadata", "count"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                    if (cursorQuery.moveToFirst()) {
                        boolean zIsEmpty = str.isEmpty();
                        do {
                            String string2 = cursorQuery.getString(0);
                            if (cursorQuery.isNull(1)) {
                                string = "";
                            } else {
                                string = cursorQuery.getString(1);
                                lda.m16130p(string);
                            }
                            if (string2 == null) {
                                xcc xccVar = kjcVar.f47438f;
                                kjc.m15280l(xccVar);
                                xccVar.f68080f.m17924b(xcc.m24449L(str), "Read null value from diagnostic signals table, ignoring it. appId");
                            } else {
                                long j = cursorQuery.getLong(2);
                                h4c h4cVarM16622s = m4c.m16622s();
                                h4cVarM16622s.m13048g(string2);
                                h4cVarM16622s.m13051j(j);
                                h4cVarM16622s.m13050i(string);
                                if (zIsEmpty) {
                                    h4cVarM16622s.m13049h();
                                }
                                arrayList.add((m4c) h4cVarM16622s.m22741d());
                            }
                        } while (cursorQuery.moveToNext());
                        sQLiteDatabaseM17559u0.delete("diagnostic_signals", "app_id=?", new String[]{str});
                        sQLiteDatabaseM17559u0.setTransactionSuccessful();
                        list = arrayList;
                    } else {
                        sQLiteDatabaseM17559u0.setTransactionSuccessful();
                    }
                } catch (SQLiteException e) {
                    xcc xccVar2 = kjcVar.f47438f;
                    kjc.m15280l(xccVar2);
                    xccVar2.f68080f.m17925c("Error querying or deleting diagnostic signals. appId", xcc.m24449L(str), e);
                    list = Collections.EMPTY_LIST;
                }
                if (cursorQuery != null) {
                    list = arrayList;
                    cursorQuery.close();
                }
                list = arrayList;
                sQLiteDatabaseM17559u0.endTransaction();
                return list;
            } catch (Throwable th) {
                if (0 != 0) {
                    cursorQuery.close();
                }
                sQLiteDatabaseM17559u0.endTransaction();
                throw th;
            }
        } catch (SQLiteException e2) {
            xcc xccVar3 = kjcVar.f47438f;
            kjc.m15280l(xccVar3);
            xccVar3.f68080f.m17925c("Error opening database for diagnostic signals. appId", xcc.m24449L(str), e2);
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX INFO: renamed from: l0 */
    public final void m17551l0(String str, npc npcVar) {
        lda.m16130p(str);
        mo12359D();
        m13144E();
        m17549j0(str, m17538X(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("storage_consent_at_bundling", npcVar.m17589g());
        m17543c0(contentValues);
    }

    /* JADX INFO: renamed from: m0 */
    public final npc m17552m0(String str) {
        lda.m16130p(str);
        mo12359D();
        m13144E();
        return npc.m17583c(100, m17542b0("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}));
    }

    /* JADX INFO: renamed from: n0 */
    public final zob m17553n0(String str, ohc ohcVar, String str2) {
        zob zobVarM17544d0 = m17544d0("events", str, ohcVar.m18026x());
        if (zobVarM17544d0 != null) {
            long j = zobVarM17544d0.f71916e + 1;
            long j2 = zobVarM17544d0.f71915d + 1;
            return new zob(zobVarM17544d0.f71912a, zobVarM17544d0.f71913b, zobVarM17544d0.f71914c + 1, j2, j, zobVarM17544d0.f71917f, zobVarM17544d0.f71918g, zobVarM17544d0.f71919h, zobVarM17544d0.f71920i, zobVarM17544d0.f71921j, zobVarM17544d0.f71922k);
        }
        kjc kjcVar = (kjc) this.f60774a;
        xcc xccVar = kjcVar.f47438f;
        kjc.m15280l(xccVar);
        xccVar.f68083i.m17925c("Event aggregate wasn't created during raw event logging. appId, event", xcc.m24449L(str), kjcVar.f47442j.m20572a(str2));
        return new zob(str, ohcVar.m18026x(), 1L, 1L, 1L, ohcVar.m18028z(), 0L, null, null, null, null);
    }

    /* JADX INFO: renamed from: o0 */
    public final boolean m17554o0() {
        return ((kjc) this.f60774a).f47433a.getDatabasePath("google_app_measurement.db").exists();
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ef A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x0101 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TRY_LEAVE, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x011b A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0140  */
    /* JADX WARN: Code duplicated, block: B:52:0x0144  */
    /* JADX WARN: Code duplicated, block: B:53:0x0146 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x014f  */
    /* JADX WARN: Code duplicated, block: B:61:0x015e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:62:0x0160  */
    /* JADX WARN: Code duplicated, block: B:66:0x018c A[Catch: all -> 0x0079, SQLiteException -> 0x007c, LOOP:0: B:66:0x018c->B:101:?, LOOP_START, TRY_LEAVE, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x01e2 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x01e9 A[Catch: all -> 0x0079, SQLiteException -> 0x007c, TryCatch #4 {all -> 0x0079, blocks: (B:3:0x0017, B:8:0x002b, B:14:0x0049, B:15:0x0065, B:18:0x006d, B:19:0x0071, B:40:0x00c9, B:42:0x00ef, B:43:0x0101, B:44:0x0105, B:45:0x0115, B:47:0x011b, B:48:0x012b, B:60:0x0159, B:63:0x0161, B:64:0x016c, B:66:0x018c, B:67:0x019a, B:68:0x01a4, B:73:0x01e2, B:72:0x01d2, B:76:0x01e9, B:53:0x0146, B:78:0x01fb, B:82:0x020e, B:11:0x003d, B:29:0x0088, B:31:0x008e, B:35:0x009d, B:38:0x00c1, B:32:0x0093), top: B:89:0x0017 }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01d0 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX INFO: renamed from: p0 */
    public final void m17555p0(String str, long j, long j2, pz2 pz2Var) {
        ?? IsEmpty;
        ?? string;
        String str2;
        String[] strArr;
        String string2;
        ?? r3;
        long jM17541a0;
        long j3;
        String[] strArr2;
        String str3;
        long j4;
        khc khcVar;
        kjc kjcVar = (kjc) this.f60774a;
        mo12359D();
        m13144E();
        Cursor cursorRawQuery = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM17559u0 = m17559u0();
                IsEmpty = TextUtils.isEmpty(str);
                String str4 = "";
                if (IsEmpty != 0) {
                    String[] strArr3 = j2 != -1 ? new String[]{String.valueOf(j2), String.valueOf(j)} : new String[]{String.valueOf(j)};
                    str4 = j2 != -1 ? "rowid <= ? and " : "";
                    StringBuilder sb = new StringBuilder(str4.length() + 148);
                    sb.append("select app_id, metadata_fingerprint from raw_events where ");
                    sb.append(str4);
                    sb.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                    cursorRawQuery = sQLiteDatabaseM17559u0.rawQuery(sb.toString(), strArr3);
                    try {
                        if (cursorRawQuery.moveToFirst()) {
                            string = cursorRawQuery.getString(0);
                            try {
                                string2 = cursorRawQuery.getString(1);
                                cursorRawQuery.close();
                                r3 = string;
                                cursorRawQuery = sQLiteDatabaseM17559u0.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r3, string2}, null, null, "rowid", "2");
                                if (cursorRawQuery.moveToFirst()) {
                                    try {
                                        pjc pjcVar = (pjc) ((ljc) dad.m10238o0(pjc.m19202X(), cursorRawQuery.getBlob(0))).m22741d();
                                        if (cursorRawQuery.moveToNext()) {
                                            xcc xccVar = kjcVar.f47438f;
                                            kjc.m15280l(xccVar);
                                            xccVar.f68083i.m17924b(xcc.m24449L(r3), "Get multiple raw event metadata records, expected one. appId");
                                        }
                                        cursorRawQuery.close();
                                        pz2Var.f57023b = pjcVar;
                                        jM17541a0 = m17541a0("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r3, string2}, -1L);
                                        if (j2 == -1) {
                                            if (jM17541a0 != -1) {
                                                j3 = -1;
                                            } else {
                                                str3 = "app_id = ? and metadata_fingerprint = ?";
                                                strArr2 = new String[]{r3, string2};
                                            }
                                            cursorRawQuery = sQLiteDatabaseM17559u0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                            if (cursorRawQuery.moveToFirst()) {
                                                do {
                                                    j4 = cursorRawQuery.getLong(0);
                                                    byte[] blob = cursorRawQuery.getBlob(3);
                                                    long j5 = cursorRawQuery.getLong(4);
                                                    try {
                                                        khcVar = (khc) dad.m10238o0(ohc.m18002I(), blob);
                                                        khcVar.m15251o(cursorRawQuery.getString(1));
                                                        long j6 = cursorRawQuery.getLong(2);
                                                        khcVar.m22739b();
                                                        ((ohc) khcVar.f63950b).m18017P(j6);
                                                        khcVar.m22739b();
                                                        ((ohc) khcVar.f63950b).m18021s(j5);
                                                        if (!pz2Var.m19574e(j4, (ohc) khcVar.m22741d())) {
                                                            break;
                                                        }
                                                    } catch (IOException e) {
                                                        xcc xccVar2 = kjcVar.f47438f;
                                                        kjc.m15280l(xccVar2);
                                                        xccVar2.f68080f.m17925c("Data loss. Failed to merge raw event. appId", xcc.m24449L(r3), e);
                                                    }
                                                } while (cursorRawQuery.moveToNext());
                                            } else {
                                                xcc xccVar3 = kjcVar.f47438f;
                                                kjc.m15280l(xccVar3);
                                                xccVar3.f68083i.m17924b(xcc.m24449L(r3), "Raw event data disappeared while in transaction. appId");
                                            }
                                        } else {
                                            j3 = j2;
                                        }
                                        if (j3 == -1 && jM17541a0 != -1) {
                                            jM17541a0 = Math.min(j3, jM17541a0);
                                        } else if (j3 != -1) {
                                            jM17541a0 = j3;
                                        }
                                        str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr2 = new String[]{r3, string2, String.valueOf(jM17541a0)};
                                        cursorRawQuery = sQLiteDatabaseM17559u0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                        if (cursorRawQuery.moveToFirst()) {
                                            do {
                                                j4 = cursorRawQuery.getLong(0);
                                                byte[] blob2 = cursorRawQuery.getBlob(3);
                                                long j7 = cursorRawQuery.getLong(4);
                                                khcVar = (khc) dad.m10238o0(ohc.m18002I(), blob2);
                                                khcVar.m15251o(cursorRawQuery.getString(1));
                                                long j8 = cursorRawQuery.getLong(2);
                                                khcVar.m22739b();
                                                ((ohc) khcVar.f63950b).m18017P(j8);
                                                khcVar.m22739b();
                                                ((ohc) khcVar.f63950b).m18021s(j7);
                                                if (!pz2Var.m19574e(j4, (ohc) khcVar.m22741d())) {
                                                    break;
                                                    break;
                                                }
                                            } while (cursorRawQuery.moveToNext());
                                        } else {
                                            xcc xccVar4 = kjcVar.f47438f;
                                            kjc.m15280l(xccVar4);
                                            xccVar4.f68083i.m17924b(xcc.m24449L(r3), "Raw event data disappeared while in transaction. appId");
                                        }
                                    } catch (IOException e2) {
                                        xcc xccVar5 = kjcVar.f47438f;
                                        kjc.m15280l(xccVar5);
                                        xccVar5.f68080f.m17925c("Data loss. Failed to merge raw event metadata. appId", xcc.m24449L(r3), e2);
                                    }
                                } else {
                                    xcc xccVar6 = kjcVar.f47438f;
                                    kjc.m15280l(xccVar6);
                                    xccVar6.f68080f.m17924b(xcc.m24449L(r3), "Raw event metadata record is missing. appId");
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                xcc xccVar7 = kjcVar.f47438f;
                                kjc.m15280l(xccVar7);
                                xccVar7.f68080f.m17925c("Data loss. Error selecting raw event. appId", xcc.m24449L(string), e);
                            }
                        }
                    } catch (SQLiteException e4) {
                        e = e4;
                        string = str;
                    }
                } else {
                    try {
                        if (j2 != -1) {
                            String str5 = str;
                            strArr = new String[]{str5, String.valueOf(j2)};
                            IsEmpty = str5;
                        } else {
                            str2 = str;
                            strArr = new String[]{str2};
                        }
                        if (j2 != -1) {
                            IsEmpty = str2;
                            str4 = " and rowid <= ?";
                        }
                        IsEmpty = str2;
                        StringBuilder sb2 = new StringBuilder(str4.length() + 84);
                        sb2.append("select metadata_fingerprint from raw_events where app_id = ?");
                        sb2.append(str4);
                        sb2.append(" order by rowid limit 1;");
                        cursorRawQuery = sQLiteDatabaseM17559u0.rawQuery(sb2.toString(), strArr);
                        if (cursorRawQuery.moveToFirst()) {
                            string2 = cursorRawQuery.getString(0);
                            cursorRawQuery.close();
                            r3 = IsEmpty;
                            cursorRawQuery = sQLiteDatabaseM17559u0.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{r3, string2}, null, null, "rowid", "2");
                            if (cursorRawQuery.moveToFirst()) {
                                xcc xccVar8 = kjcVar.f47438f;
                                kjc.m15280l(xccVar8);
                                xccVar8.f68080f.m17924b(xcc.m24449L(r3), "Raw event metadata record is missing. appId");
                            } else {
                                pjc pjcVar2 = (pjc) ((ljc) dad.m10238o0(pjc.m19202X(), cursorRawQuery.getBlob(0))).m22741d();
                                if (cursorRawQuery.moveToNext()) {
                                    xcc xccVar9 = kjcVar.f47438f;
                                    kjc.m15280l(xccVar9);
                                    xccVar9.f68083i.m17924b(xcc.m24449L(r3), "Get multiple raw event metadata records, expected one. appId");
                                }
                                cursorRawQuery.close();
                                pz2Var.f57023b = pjcVar2;
                                jM17541a0 = m17541a0("select (rowid - 1) as max_rowid from raw_events where app_id = ? and metadata_fingerprint != ? order by rowid limit 1;", new String[]{r3, string2}, -1L);
                                if (j2 == -1) {
                                    if (jM17541a0 != -1) {
                                        j3 = -1;
                                    } else {
                                        str3 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr2 = new String[]{r3, string2};
                                    }
                                    cursorRawQuery = sQLiteDatabaseM17559u0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                    if (cursorRawQuery.moveToFirst()) {
                                        do {
                                            j4 = cursorRawQuery.getLong(0);
                                            byte[] blob3 = cursorRawQuery.getBlob(3);
                                            long j9 = cursorRawQuery.getLong(4);
                                            khcVar = (khc) dad.m10238o0(ohc.m18002I(), blob3);
                                            khcVar.m15251o(cursorRawQuery.getString(1));
                                            long j10 = cursorRawQuery.getLong(2);
                                            khcVar.m22739b();
                                            ((ohc) khcVar.f63950b).m18017P(j10);
                                            khcVar.m22739b();
                                            ((ohc) khcVar.f63950b).m18021s(j9);
                                            if (!pz2Var.m19574e(j4, (ohc) khcVar.m22741d())) {
                                                break;
                                                break;
                                            }
                                        } while (cursorRawQuery.moveToNext());
                                    } else {
                                        xcc xccVar10 = kjcVar.f47438f;
                                        kjc.m15280l(xccVar10);
                                        xccVar10.f68083i.m17924b(xcc.m24449L(r3), "Raw event data disappeared while in transaction. appId");
                                    }
                                } else {
                                    j3 = j2;
                                }
                                if (j3 == -1) {
                                    if (j3 != -1) {
                                        jM17541a0 = j3;
                                    }
                                } else if (j3 != -1) {
                                    jM17541a0 = j3;
                                }
                                str3 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                strArr2 = new String[]{r3, string2, String.valueOf(jM17541a0)};
                                cursorRawQuery = sQLiteDatabaseM17559u0.query("raw_events", new String[]{"rowid", "name", "timestamp", "data", "elapsed_time"}, str3, strArr2, null, null, "rowid", null);
                                if (cursorRawQuery.moveToFirst()) {
                                    do {
                                        j4 = cursorRawQuery.getLong(0);
                                        byte[] blob4 = cursorRawQuery.getBlob(3);
                                        long j11 = cursorRawQuery.getLong(4);
                                        khcVar = (khc) dad.m10238o0(ohc.m18002I(), blob4);
                                        khcVar.m15251o(cursorRawQuery.getString(1));
                                        long j12 = cursorRawQuery.getLong(2);
                                        khcVar.m22739b();
                                        ((ohc) khcVar.f63950b).m18017P(j12);
                                        khcVar.m22739b();
                                        ((ohc) khcVar.f63950b).m18021s(j11);
                                        if (!pz2Var.m19574e(j4, (ohc) khcVar.m22741d())) {
                                            break;
                                            break;
                                        }
                                    } while (cursorRawQuery.moveToNext());
                                } else {
                                    xcc xccVar11 = kjcVar.f47438f;
                                    kjc.m15280l(xccVar11);
                                    xccVar11.f68083i.m17924b(xcc.m24449L(r3), "Raw event data disappeared while in transaction. appId");
                                }
                            }
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        string = IsEmpty;
                        xcc xccVar12 = kjcVar.f47438f;
                        kjc.m15280l(xccVar12);
                        xccVar12.f68080f.m17925c("Data loss. Error selecting raw event. appId", xcc.m24449L(string), e);
                    }
                }
            } catch (SQLiteException e6) {
                e = e6;
                IsEmpty = str;
            }
        } finally {
            if (0 != 0) {
                cursorRawQuery.close();
            }
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m17556r0() {
        m13144E();
        m17559u0().beginTransaction();
    }

    /* JADX INFO: renamed from: s0 */
    public final void m17557s0() {
        m13144E();
        m17559u0().setTransactionSuccessful();
    }

    /* JADX INFO: renamed from: t0 */
    public final void m17558t0() {
        m13144E();
        m17559u0().endTransaction();
    }

    /* JADX INFO: renamed from: u0 */
    public final SQLiteDatabase m17559u0() {
        mo12359D();
        try {
            return this.f53018d.getWritableDatabase();
        } catch (SQLiteException e) {
            xcc xccVar = ((kjc) this.f60774a).f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68083i.m17924b(e, "Error opening database");
            throw e;
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m17560v0(String str) {
        zob zobVarM17544d0;
        m17546f0("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m17559u0().query("events", (String[]) Collections.singletonList("name").toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (cursorQuery.moveToFirst()) {
                    do {
                        String string = cursorQuery.getString(0);
                        if (string != null && (zobVarM17544d0 = m17544d0("events", str, string)) != null) {
                            m17545e0("events_snapshot", zobVarM17544d0);
                        }
                    } while (cursorQuery.moveToNext());
                }
            } catch (SQLiteException e) {
                xcc xccVar = ((kjc) this.f60774a).f47438f;
                kjc.m15280l(xccVar);
                xccVar.f68080f.m17925c("Error creating snapshot. appId", xcc.m24449L(str), e);
            }
        } finally {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:50:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:55:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x00d9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:7:0x0054  */
    /* JADX WARN: Code duplicated, block: B:9:0x005b  */
    /* JADX INFO: renamed from: w0 */
    public final void m17561w0(String str) throws Throwable {
        boolean z;
        zob zobVarM17544d0;
        ArrayList arrayList = new ArrayList(Arrays.asList("name", "lifetime_count"));
        zob zobVarM17544d1 = m17544d0("events", str, "_f");
        zob zobVarM17544d2 = m17544d0("events", str, "_v");
        m17546f0("events", str);
        Cursor cursorQuery = null;
        boolean z2 = false;
        try {
            cursorQuery = m17559u0().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            if (cursorQuery.moveToFirst()) {
                boolean z3 = false;
                z = false;
                do {
                    try {
                        String string = cursorQuery.getString(0);
                        if (cursorQuery.getLong(1) >= 1) {
                            if ("_f".equals(string)) {
                                z3 = true;
                            } else if ("_v".equals(string)) {
                                z = true;
                            }
                        }
                        if (string != null && (zobVarM17544d0 = m17544d0("events_snapshot", str, string)) != null) {
                            m17545e0("events", zobVarM17544d0);
                        }
                    } catch (SQLiteException e) {
                        e = e;
                        z2 = z3;
                        try {
                            xcc xccVar = ((kjc) this.f60774a).f47438f;
                            kjc.m15280l(xccVar);
                            xccVar.f68080f.m17925c("Error querying snapshot. appId", xcc.m24449L(str), e);
                            z3 = z2;
                        } catch (Throwable th) {
                            th = th;
                            if (cursorQuery != null) {
                                cursorQuery.close();
                            }
                            if (z2 && zobVarM17544d1 != null) {
                                m17545e0("events", zobVarM17544d1);
                            } else if (!z && zobVarM17544d2 != null) {
                                m17545e0("events", zobVarM17544d2);
                            }
                            m17546f0("events_snapshot", str);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        z2 = z3;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (z2) {
                            if (!z) {
                                m17545e0("events", zobVarM17544d2);
                            }
                        } else if (!z) {
                            m17545e0("events", zobVarM17544d2);
                        }
                        m17546f0("events_snapshot", str);
                        throw th;
                    }
                } while (cursorQuery.moveToNext());
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                if (!z3 && zobVarM17544d1 != null) {
                    m17545e0("events", zobVarM17544d1);
                } else if (!z && zobVarM17544d2 != null) {
                    m17545e0("events", zobVarM17544d2);
                }
            } else {
                cursorQuery.close();
                if (zobVarM17544d1 != null) {
                    m17545e0("events", zobVarM17544d1);
                } else if (zobVarM17544d2 != null) {
                    m17545e0("events", zobVarM17544d2);
                }
            }
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
        m17546f0("events_snapshot", str);
    }

    /* JADX INFO: renamed from: x0 */
    public final void m17562x0(String str, String str2) {
        lda.m16127m(str);
        lda.m16127m(str2);
        mo12359D();
        m13144E();
        try {
            m17559u0().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            kjc kjcVar = (kjc) this.f60774a;
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17926d("Error deleting user property. appId", xcc.m24449L(str), kjcVar.f47442j.m20574c(str2), e);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final boolean m17563y0(lad ladVar) {
        kjc kjcVar = (kjc) this.f60774a;
        String str = ladVar.f49379b;
        mo12359D();
        m13144E();
        String str2 = ladVar.f49378a;
        String str3 = ladVar.f49380c;
        if (m17564z0(str2, str3) == null) {
            if (rad.m20499C0(str3)) {
                if (m17540Z("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{str2}) >= Math.max(Math.min(kjcVar.f47436d.m4867M(str2, z8c.f71143V), 100), 25)) {
                    return false;
                }
            } else if (!"_npa".equals(str3)) {
                long jM17540Z = m17540Z("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{str2, str});
                kjcVar.getClass();
                if (jM17540Z >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str2);
        contentValues.put("origin", str);
        contentValues.put("name", str3);
        contentValues.put("set_timestamp", Long.valueOf(ladVar.f49381d));
        m17508q0(contentValues, ladVar.f49382e);
        try {
            if (m17559u0().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            xcc xccVar = kjcVar.f47438f;
            kjc.m15280l(xccVar);
            xccVar.f68080f.m17924b(xcc.m24449L(str2), "Failed to insert/update user property (got -1). appId");
            return true;
        } catch (SQLiteException e) {
            xcc xccVar2 = kjcVar.f47438f;
            kjc.m15280l(xccVar2);
            xccVar2.f68080f.m17925c("Error storing user property. appId", xcc.m24449L(str2), e);
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009d  */
    /* JADX WARN: Code duplicated, block: B:43:? A[SYNTHETIC] */
    /* JADX INFO: renamed from: z0 */
    public final lad m17564z0(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursorQuery;
        kjc kjcVar = (kjc) this.f60774a;
        lda.m16127m(str);
        lda.m16127m(str2);
        mo12359D();
        m13144E();
        Cursor cursor = null;
        try {
            cursorQuery = m17559u0().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (cursorQuery.moveToFirst()) {
                        long j = cursorQuery.getLong(0);
                        Object objM17531Q = m17531Q(cursorQuery, 1);
                        if (objM17531Q != null) {
                            str3 = str;
                            str4 = str2;
                            try {
                                lad ladVar = new lad(str3, cursorQuery.getString(2), str4, j, objM17531Q);
                                if (cursorQuery.moveToNext()) {
                                    xcc xccVar = kjcVar.f47438f;
                                    kjc.m15280l(xccVar);
                                    xccVar.f68080f.m17924b(xcc.m24449L(str3), "Got multiple records for user property, expected one. appId");
                                }
                                cursorQuery.close();
                                return ladVar;
                            } catch (SQLiteException e) {
                                e = e;
                            }
                        }
                        sQLiteException = e;
                        xcc xccVar2 = kjcVar.f47438f;
                        kjc.m15280l(xccVar2);
                        xccVar2.f68080f.m17926d("Error querying user property. appId", xcc.m24449L(str3), kjcVar.f47442j.m20574c(str4), sQLiteException);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursor = cursorQuery;
                    if (cursor != null) {
                        throw th;
                    }
                    cursor.close();
                    throw th;
                }
            } catch (SQLiteException e2) {
                e = e2;
                str3 = str;
                str4 = str2;
            }
        } catch (SQLiteException e3) {
            str3 = str;
            str4 = str2;
            sQLiteException = e3;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor != null) {
                throw th;
            }
            cursor.close();
            throw th;
        }
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }
}
