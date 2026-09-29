package p000;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;

/* JADX INFO: loaded from: classes.dex */
public final class inb extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44332a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC3572sf f44333b;

    public inb(Context context, String str) {
        super(context, true == str.equals("") ? null : str, (SQLiteDatabase.CursorFactory) null, 1);
    }

    /* JADX INFO: renamed from: a */
    private final void m14040a(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX INFO: renamed from: b */
    private final void m14041b(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX INFO: renamed from: c */
    private final void m14042c(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    /* JADX INFO: renamed from: e */
    private final void m14043e(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        int i = this.f44332a;
        AbstractC3572sf abstractC3572sf = this.f44333b;
        switch (i) {
            case 0:
                nnb nnbVar = (nnb) abstractC3572sf;
                kjc kjcVar = (kjc) nnbVar.f60774a;
                kjc kjcVar2 = (kjc) nnbVar.f60774a;
                kjcVar.getClass();
                s01 s01Var = nnbVar.f53019e;
                if (s01Var.f60110b != 0) {
                    ((gr7) s01Var.f60111c).getClass();
                    if (SystemClock.elapsedRealtime() - s01Var.f60110b < 3600000) {
                        throw new SQLiteException("Database open failed");
                    }
                }
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteException unused) {
                    ((gr7) s01Var.f60111c).getClass();
                    s01Var.f60110b = SystemClock.elapsedRealtime();
                    xcc xccVar = kjcVar2.f47438f;
                    kjc.m15280l(xccVar);
                    xccVar.f68080f.m17923a("Opening the database failed, dropping and recreating it");
                    if (!kjcVar2.f47433a.getDatabasePath("google_app_measurement.db").delete()) {
                        xcc xccVar2 = kjcVar2.f47438f;
                        kjc.m15280l(xccVar2);
                        xccVar2.f68080f.m17924b("google_app_measurement.db", "Failed to delete corrupted db file");
                    }
                    try {
                        SQLiteDatabase writableDatabase = super.getWritableDatabase();
                        s01Var.f60110b = 0L;
                        return writableDatabase;
                    } catch (SQLiteException e) {
                        xcc xccVar3 = kjcVar2.f47438f;
                        kjc.m15280l(xccVar3);
                        xccVar3.f68080f.m17924b(e, "Failed to open freshly created database");
                        throw e;
                    }
                }
            default:
                jbc jbcVar = (jbc) abstractC3572sf;
                try {
                    return super.getWritableDatabase();
                } catch (SQLiteDatabaseLockedException e2) {
                    throw e2;
                } catch (SQLiteException unused2) {
                    kjc kjcVar3 = (kjc) jbcVar.f60774a;
                    xcc xccVar4 = kjcVar3.f47438f;
                    kjc.m15280l(xccVar4);
                    xccVar4.f68080f.m17923a("Opening the local database failed, dropping and recreating it");
                    if (!kjcVar3.f47433a.getDatabasePath("google_app_measurement_local.db").delete()) {
                        xcc xccVar5 = kjcVar3.f47438f;
                        kjc.m15280l(xccVar5);
                        xccVar5.f68080f.m17924b("google_app_measurement_local.db", "Failed to delete corrupted local db file");
                    }
                    try {
                        return super.getWritableDatabase();
                    } catch (SQLiteException e3) {
                        xcc xccVar6 = ((kjc) jbcVar.f60774a).f47438f;
                        kjc.m15280l(xccVar6);
                        xccVar6.f68080f.m17924b(e3, "Failed to open local database. Events will bypass local storage");
                        return null;
                    }
                }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = this.f44332a;
        AbstractC3572sf abstractC3572sf = this.f44333b;
        switch (i) {
            case 0:
                xcc xccVar = ((kjc) ((nnb) abstractC3572sf).f60774a).f47438f;
                kjc.m15280l(xccVar);
                hka.m13320c(xccVar, sQLiteDatabase);
                break;
            default:
                xcc xccVar2 = ((kjc) ((jbc) abstractC3572sf).f60774a).f47438f;
                kjc.m15280l(xccVar2);
                hka.m13320c(xccVar2, sQLiteDatabase);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.f44332a;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        int i = this.f44332a;
        AbstractC3572sf abstractC3572sf = this.f44333b;
        switch (i) {
            case 0:
                kjc kjcVar = (kjc) ((nnb) abstractC3572sf).f60774a;
                xcc xccVar = kjcVar.f47438f;
                kjc.m15280l(xccVar);
                hka.m13319b(xccVar, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", nnb.f53011f);
                xcc xccVar2 = kjcVar.f47438f;
                kjc.m15280l(xccVar2);
                hka.m13319b(xccVar2, sQLiteDatabase, "events_snapshot", "CREATE TABLE IF NOT EXISTS events_snapshot ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, last_bundled_timestamp INTEGER, last_bundled_day INTEGER, last_sampled_complex_event_id INTEGER, last_sampling_rate INTEGER, last_exempt_from_sampling INTEGER, current_session_count INTEGER, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp,last_bundled_timestamp,last_bundled_day,last_sampled_complex_event_id,last_sampling_rate,last_exempt_from_sampling,current_session_count", null);
                kjc.m15280l(xccVar2);
                hka.m13319b(xccVar2, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
                kjc.m15280l(xccVar2);
                hka.m13319b(xccVar2, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", nnb.f53013h);
                kjc.m15280l(xccVar2);
                hka.m13319b(xccVar2, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", nnb.f53014i);
                kjc.m15280l(xccVar2);
                hka.m13319b(xccVar2, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", nnb.f53016k);
                kjc.m15280l(xccVar2);
                hka.m13319b(xccVar2, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
                kjc.m15280l(xccVar2);
                hka.m13319b(xccVar2, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", nnb.f53015j);
                kjc.m15280l(xccVar2);
                hka.m13319b(xccVar2, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", nnb.f53017l);
                kjc.m15280l(xccVar2);
                hka.m13319b(xccVar2, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", nnb.f53007H);
                kjc.m15280l(xccVar2);
                hka.m13319b(xccVar2, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
                kjc.m15280l(xccVar2);
                hka.m13319b(xccVar2, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", nnb.f53008I);
                kjc.m15280l(xccVar2);
                hka.m13319b(xccVar2, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
                kjc.m15280l(xccVar2);
                hka.m13319b(xccVar2, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
                kjc.m15280l(xccVar2);
                hka.m13319b(xccVar2, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", nnb.f53009J);
                blb.m3870a();
                kjc.m15280l(xccVar2);
                hka.m13319b(xccVar2, sQLiteDatabase, "trigger_uris", "CREATE TABLE IF NOT EXISTS trigger_uris ( app_id TEXT NOT NULL, trigger_uri TEXT NOT NULL, timestamp_millis INTEGER NOT NULL, source INTEGER NOT NULL);", "app_id,trigger_uri,source,timestamp_millis", nnb.f53010K);
                kjc.m15280l(xccVar2);
                hka.m13319b(xccVar2, sQLiteDatabase, "upload_queue", "CREATE TABLE IF NOT EXISTS upload_queue ( app_id TEXT NOT NULL, upload_uri TEXT NOT NULL, upload_headers TEXT NOT NULL, upload_type INTEGER NOT NULL, measurement_batch BLOB NOT NULL, retry_count INTEGER NOT NULL, creation_timestamp INTEGER NOT NULL );", "app_id,upload_uri,upload_headers,upload_type,measurement_batch,retry_count,creation_timestamp", nnb.f53012g);
                kjc.m15280l(xccVar2);
                hka.m13319b(xccVar2, sQLiteDatabase, "diagnostic_signals", "CREATE TABLE IF NOT EXISTS diagnostic_signals ( app_id TEXT NOT NULL, signal_name TEXT NOT NULL, metadata TEXT NOT NULL, count INTEGER NOT NULL, last_increment_timestamp INTEGER NOT NULL);", "app_id,signal_name,metadata,count,last_increment_timestamp", null);
                ((jkb) ikb.f44247b.f44248a.get()).getClass();
                kjc.m15280l(xccVar2);
                hka.m13319b(xccVar2, sQLiteDatabase, "no_data_mode_events", "CREATE TABLE IF NOT EXISTS no_data_mode_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, data BLOB NOT NULL, timestamp_millis INTEGER NOT NULL);", "app_id,name,data,timestamp_millis", null);
                break;
            default:
                xcc xccVar3 = ((kjc) ((jbc) abstractC3572sf).f60774a).f47438f;
                kjc.m15280l(xccVar3);
                hka.m13319b(xccVar3, sQLiteDatabase, "messages", "create table if not exists messages ( type INTEGER NOT NULL, entry BLOB NOT NULL)", "type,entry", jbc.f45387e);
                break;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = this.f44332a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public inb(jbc jbcVar, Context context) {
        this(context, "google_app_measurement_local.db");
        this.f44332a = 1;
        this.f44333b = jbcVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public inb(nnb nnbVar, Context context) {
        this(context, "google_app_measurement.db");
        this.f44332a = 0;
        this.f44333b = nnbVar;
    }
}
