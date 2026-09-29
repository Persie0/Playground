package cc;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.SystemClock;
import p260m8.C7499b;

/* JADX INFO: renamed from: cc.i */
/* JADX INFO: loaded from: classes.dex */
public final class C1838i extends SQLiteOpenHelper {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C1847j f9856a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1838i(C1847j c1847j, Context context) {
        super(context, "google_app_measurement.db", (SQLiteDatabase.CursorFactory) null, 1);
        this.f9856a = c1847j;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:28:0x0039 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final SQLiteDatabase getWritableDatabase() {
        boolean z10;
        C1847j c1847j = this.f9856a;
        C1980x6 c1980x6 = c1847j.f9912e;
        InterfaceC1781b5 interfaceC1781b5 = c1847j.f10430a;
        ((C1897o4) interfaceC1781b5).getClass();
        if (c1980x6.f10307b != 0) {
            ((C7499b) c1980x6.f10306a).getClass();
            if (SystemClock.elapsedRealtime() - c1980x6.f10307b < 3600000) {
                z10 = false;
            }
            if (!z10) {
                throw new SQLiteException("Database open failed");
            }
            try {
                return super.getWritableDatabase();
            } catch (SQLiteException unused) {
                C1980x6 c1980x7 = c1847j.f9912e;
                ((C7499b) c1980x7.f10306a).getClass();
                c1980x7.f10307b = SystemClock.elapsedRealtime();
                C1860k3 c1860k3 = ((C1897o4) interfaceC1781b5).f10086i;
                C1897o4.m5776k(c1860k3);
                c1860k3.f9942f.m5623a("Opening the database failed, dropping and recreating it");
                ((C1897o4) interfaceC1781b5).getClass();
                if (!((C1897o4) interfaceC1781b5).f10076a.getDatabasePath("google_app_measurement.db").delete()) {
                    C1860k3 c1860k4 = ((C1897o4) interfaceC1781b5).f10086i;
                    C1897o4.m5776k(c1860k4);
                    c1860k4.f9942f.m5624b("google_app_measurement.db", "Failed to delete corrupted db file");
                }
                try {
                    SQLiteDatabase writableDatabase = super.getWritableDatabase();
                    c1980x7.f10307b = 0L;
                    return writableDatabase;
                } catch (SQLiteException e10) {
                    C1860k3 c1860k5 = ((C1897o4) interfaceC1781b5).f10086i;
                    C1897o4.m5776k(c1860k5);
                    c1860k5.f9942f.m5624b(e10, "Failed to open freshly created database");
                    throw e10;
                }
            }
        }
        z10 = true;
        if (!z10) {
            return super.getWritableDatabase();
        }
        throw new SQLiteException("Database open failed");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        C1860k3 c1860k3 = ((C1897o4) this.f9856a.f10430a).f10086i;
        C1897o4.m5776k(c1860k3);
        C1856k.m5699b(c1860k3, sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) throws Throwable {
        C1847j c1847j = this.f9856a;
        C1860k3 c1860k3 = ((C1897o4) c1847j.f10430a).f10086i;
        C1897o4.m5776k(c1860k3);
        C1856k.m5698a(c1860k3, sQLiteDatabase, "events", "CREATE TABLE IF NOT EXISTS events ( app_id TEXT NOT NULL, name TEXT NOT NULL, lifetime_count INTEGER NOT NULL, current_bundle_count INTEGER NOT NULL, last_fire_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,lifetime_count,current_bundle_count,last_fire_timestamp", C1847j.f9904f);
        C1860k3 c1860k4 = ((C1897o4) c1847j.f10430a).f10086i;
        C1897o4.m5776k(c1860k4);
        C1856k.m5698a(c1860k4, sQLiteDatabase, "conditional_properties", "CREATE TABLE IF NOT EXISTS conditional_properties ( app_id TEXT NOT NULL, origin TEXT NOT NULL, name TEXT NOT NULL, value BLOB NOT NULL, creation_timestamp INTEGER NOT NULL, active INTEGER NOT NULL, trigger_event_name TEXT, trigger_timeout INTEGER NOT NULL, timed_out_event BLOB,triggered_event BLOB, triggered_timestamp INTEGER NOT NULL, time_to_live INTEGER NOT NULL, expired_event BLOB, PRIMARY KEY (app_id, name)) ;", "app_id,origin,name,value,active,trigger_event_name,trigger_timeout,creation_timestamp,timed_out_event,triggered_event,triggered_timestamp,time_to_live,expired_event", null);
        C1860k3 c1860k5 = ((C1897o4) c1847j.f10430a).f10086i;
        C1897o4.m5776k(c1860k5);
        C1856k.m5698a(c1860k5, sQLiteDatabase, "user_attributes", "CREATE TABLE IF NOT EXISTS user_attributes ( app_id TEXT NOT NULL, name TEXT NOT NULL, set_timestamp INTEGER NOT NULL, value BLOB NOT NULL, PRIMARY KEY (app_id, name)) ;", "app_id,name,set_timestamp,value", C1847j.f9905g);
        C1860k3 c1860k6 = ((C1897o4) c1847j.f10430a).f10086i;
        C1897o4.m5776k(c1860k6);
        C1856k.m5698a(c1860k6, sQLiteDatabase, "apps", "CREATE TABLE IF NOT EXISTS apps ( app_id TEXT NOT NULL, app_instance_id TEXT, gmp_app_id TEXT, resettable_device_id_hash TEXT, last_bundle_index INTEGER NOT NULL, last_bundle_end_timestamp INTEGER NOT NULL, PRIMARY KEY (app_id)) ;", "app_id,app_instance_id,gmp_app_id,resettable_device_id_hash,last_bundle_index,last_bundle_end_timestamp", C1847j.f9906h);
        C1860k3 c1860k7 = ((C1897o4) c1847j.f10430a).f10086i;
        C1897o4.m5776k(c1860k7);
        C1856k.m5698a(c1860k7, sQLiteDatabase, "queue", "CREATE TABLE IF NOT EXISTS queue ( app_id TEXT NOT NULL, bundle_end_timestamp INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,bundle_end_timestamp,data", C1847j.f9908j);
        C1860k3 c1860k8 = ((C1897o4) c1847j.f10430a).f10086i;
        C1897o4.m5776k(c1860k8);
        C1856k.m5698a(c1860k8, sQLiteDatabase, "raw_events_metadata", "CREATE TABLE IF NOT EXISTS raw_events_metadata ( app_id TEXT NOT NULL, metadata_fingerprint INTEGER NOT NULL, metadata BLOB NOT NULL, PRIMARY KEY (app_id, metadata_fingerprint));", "app_id,metadata_fingerprint,metadata", null);
        C1860k3 c1860k9 = ((C1897o4) c1847j.f10430a).f10086i;
        C1897o4.m5776k(c1860k9);
        C1856k.m5698a(c1860k9, sQLiteDatabase, "raw_events", "CREATE TABLE IF NOT EXISTS raw_events ( app_id TEXT NOT NULL, name TEXT NOT NULL, timestamp INTEGER NOT NULL, metadata_fingerprint INTEGER NOT NULL, data BLOB NOT NULL);", "app_id,name,timestamp,metadata_fingerprint,data", C1847j.f9907i);
        C1860k3 c1860k10 = ((C1897o4) c1847j.f10430a).f10086i;
        C1897o4.m5776k(c1860k10);
        C1856k.m5698a(c1860k10, sQLiteDatabase, "event_filters", "CREATE TABLE IF NOT EXISTS event_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, event_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, event_name, audience_id, filter_id));", "app_id,audience_id,filter_id,event_name,data", C1847j.f9909k);
        C1860k3 c1860k11 = ((C1897o4) c1847j.f10430a).f10086i;
        C1897o4.m5776k(c1860k11);
        C1856k.m5698a(c1860k11, sQLiteDatabase, "property_filters", "CREATE TABLE IF NOT EXISTS property_filters ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, filter_id INTEGER NOT NULL, property_name TEXT NOT NULL, data BLOB NOT NULL, PRIMARY KEY (app_id, property_name, audience_id, filter_id));", "app_id,audience_id,filter_id,property_name,data", C1847j.f9910l);
        C1860k3 c1860k12 = ((C1897o4) c1847j.f10430a).f10086i;
        C1897o4.m5776k(c1860k12);
        C1856k.m5698a(c1860k12, sQLiteDatabase, "audience_filter_values", "CREATE TABLE IF NOT EXISTS audience_filter_values ( app_id TEXT NOT NULL, audience_id INTEGER NOT NULL, current_results BLOB, PRIMARY KEY (app_id, audience_id));", "app_id,audience_id,current_results", null);
        C1860k3 c1860k13 = ((C1897o4) c1847j.f10430a).f10086i;
        C1897o4.m5776k(c1860k13);
        C1856k.m5698a(c1860k13, sQLiteDatabase, "app2", "CREATE TABLE IF NOT EXISTS app2 ( app_id TEXT NOT NULL, first_open_count INTEGER NOT NULL, PRIMARY KEY (app_id));", "app_id,first_open_count", C1847j.f9903H);
        C1860k3 c1860k14 = ((C1897o4) c1847j.f10430a).f10086i;
        C1897o4.m5776k(c1860k14);
        C1856k.m5698a(c1860k14, sQLiteDatabase, "main_event_params", "CREATE TABLE IF NOT EXISTS main_event_params ( app_id TEXT NOT NULL, event_id TEXT NOT NULL, children_to_process INTEGER NOT NULL, main_event BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,event_id,children_to_process,main_event", null);
        C1860k3 c1860k15 = ((C1897o4) c1847j.f10430a).f10086i;
        C1897o4.m5776k(c1860k15);
        C1856k.m5698a(c1860k15, sQLiteDatabase, "default_event_params", "CREATE TABLE IF NOT EXISTS default_event_params ( app_id TEXT NOT NULL, parameters BLOB NOT NULL, PRIMARY KEY (app_id));", "app_id,parameters", null);
        C1860k3 c1860k16 = ((C1897o4) c1847j.f10430a).f10086i;
        C1897o4.m5776k(c1860k16);
        C1856k.m5698a(c1860k16, sQLiteDatabase, "consent_settings", "CREATE TABLE IF NOT EXISTS consent_settings ( app_id TEXT NOT NULL, consent_state TEXT NOT NULL, PRIMARY KEY (app_id));", "app_id,consent_state", null);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i10, int i11) {
    }
}
