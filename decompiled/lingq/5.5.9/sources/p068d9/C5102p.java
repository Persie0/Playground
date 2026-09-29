package p068d9;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.android.installreferrer.api.InstallReferrerClient;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p010a9.C0051a;
import p150h9.C5931p;
import p174i9.InterfaceC6208b;
import p395t8.C9220b;
import p452w8.AbstractC9838s;
import p452w8.C9827h;
import p452w8.C9832m;
import p479xa.C10144m;
import p528z8.C10456a;
import p528z8.C10457b;
import p528z8.C10458c;
import p528z8.C10459d;
import p528z8.C10460e;

/* JADX INFO: renamed from: d9.p */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C5102p implements C5104r.a, C10144m.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f33050a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f33051b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f33052c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Object f33053d;

    public /* synthetic */ C5102p(int i10, Object obj, Object obj2, Object obj3) {
        this.f33050a = i10;
        this.f33051b = obj;
        this.f33052c = obj2;
        this.f33053d = obj3;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0115 A[PHI: r10
      0x0115: PHI (r10v9 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason) = 
      (r10v2 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
      (r10v3 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
      (r10v4 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
      (r10v5 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
      (r10v6 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
      (r10v7 com.google.android.datatransport.runtime.firebase.transport.LogEventDropped$Reason)
     binds: [B:37:0x0113, B:40:0x011d, B:43:0x0126, B:46:0x012f, B:49:0x0138, B:52:0x0141] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p068d9.C5104r.a
    public final Object apply(Object obj) {
        int i10 = 2;
        int i11 = this.f33050a;
        Object obj2 = this.f33053d;
        Object obj3 = this.f33052c;
        Object obj4 = this.f33051b;
        switch (i11) {
            case InstallReferrerClient.InstallReferrerResponse.f10530OK /* 0 */:
                C5104r c5104r = (C5104r) obj4;
                List list = (List) obj3;
                AbstractC9838s abstractC9838s = (AbstractC9838s) obj2;
                Cursor cursor = (Cursor) obj;
                c5104r.getClass();
                while (cursor.moveToNext()) {
                    long j10 = cursor.getLong(0);
                    boolean z10 = cursor.getInt(7) != 0;
                    C9827h.a aVar = new C9827h.a();
                    aVar.f50019f = new HashMap();
                    aVar.m18313d(cursor.getString(1));
                    aVar.f50017d = Long.valueOf(cursor.getLong(i10));
                    aVar.f50018e = Long.valueOf(cursor.getLong(3));
                    if (z10) {
                        String string = cursor.getString(4);
                        aVar.m18312c(new C9832m(string == null ? C5104r.f33055f : new C9220b(string), cursor.getBlob(5)));
                    } else {
                        String string2 = cursor.getString(4);
                        aVar.m18312c(new C9832m(string2 == null ? C5104r.f33055f : new C9220b(string2), (byte[]) C5104r.m10867Q(c5104r.m10871r().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new C5931p(8))));
                    }
                    if (!cursor.isNull(6)) {
                        aVar.f50015b = Integer.valueOf(cursor.getInt(6));
                    }
                    list.add(new C5088b(j10, abstractC9838s, aVar.m18311b()));
                    i10 = 2;
                }
                return null;
            default:
                C5104r c5104r2 = (C5104r) obj4;
                Map map = (Map) obj3;
                C10456a.a aVar2 = (C10456a.a) obj2;
                Cursor cursor2 = (Cursor) obj;
                c5104r2.getClass();
                while (cursor2.moveToNext()) {
                    String string3 = cursor2.getString(0);
                    int i12 = cursor2.getInt(1);
                    LogEventDropped.Reason reason = LogEventDropped.Reason.REASON_UNKNOWN;
                    if (i12 != reason.getNumber()) {
                        LogEventDropped.Reason reason2 = LogEventDropped.Reason.MESSAGE_TOO_OLD;
                        if (i12 == reason2.getNumber()) {
                            reason = reason2;
                        } else {
                            reason2 = LogEventDropped.Reason.CACHE_FULL;
                            if (i12 == reason2.getNumber()) {
                                reason = reason2;
                            } else {
                                reason2 = LogEventDropped.Reason.PAYLOAD_TOO_BIG;
                                if (i12 == reason2.getNumber()) {
                                    reason = reason2;
                                } else {
                                    reason2 = LogEventDropped.Reason.MAX_RETRIES_REACHED;
                                    if (i12 == reason2.getNumber()) {
                                        reason = reason2;
                                    } else {
                                        reason2 = LogEventDropped.Reason.INVALID_PAYLOD;
                                        if (i12 == reason2.getNumber()) {
                                            reason = reason2;
                                        } else {
                                            reason2 = LogEventDropped.Reason.SERVER_ERROR;
                                            if (i12 == reason2.getNumber()) {
                                                reason = reason2;
                                            } else {
                                                C0051a.m208a(Integer.valueOf(i12), "SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    long j11 = cursor2.getLong(2);
                    if (!map.containsKey(string3)) {
                        map.put(string3, new ArrayList());
                    }
                    ((List) map.get(string3)).add(new LogEventDropped(j11, reason));
                }
                for (Map.Entry entry : map.entrySet()) {
                    int i13 = C10458c.f52322c;
                    new ArrayList();
                    aVar2.f52318b.add(new C10458c(Collections.unmodifiableList((List) entry.getValue()), (String) entry.getKey()));
                }
                final long jMo11713a = c5104r2.f33057b.mo11713a();
                SQLiteDatabase sQLiteDatabaseM10871r = c5104r2.m10871r();
                sQLiteDatabaseM10871r.beginTransaction();
                try {
                    C10460e c10460e = (C10460e) C5104r.m10867Q(sQLiteDatabaseM10871r.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new C5104r.a() { // from class: d9.q
                        @Override // p068d9.C5104r.a
                        public final Object apply(Object obj5) {
                            Cursor cursor3 = (Cursor) obj5;
                            cursor3.moveToNext();
                            return new C10460e(cursor3.getLong(0), jMo11713a);
                        }
                    });
                    sQLiteDatabaseM10871r.setTransactionSuccessful();
                    sQLiteDatabaseM10871r.endTransaction();
                    aVar2.f52317a = c10460e;
                    aVar2.f52319c = new C10457b(new C10459d(c5104r2.m10871r().compileStatement("PRAGMA page_size").simpleQueryForLong() * c5104r2.m10872w(), AbstractC5091e.f33031a.f33023b));
                    aVar2.f52320d = c5104r2.f33060e.get();
                    return new C10456a(aVar2.f52317a, Collections.unmodifiableList(aVar2.f52318b), aVar2.f52319c, aVar2.f52320d);
                } catch (Throwable th2) {
                    sQLiteDatabaseM10871r.endTransaction();
                    throw th2;
                }
        }
    }

    @Override // p479xa.C10144m.a
    /* JADX INFO: renamed from: n */
    public final void mo780n(Object obj) {
        ((InterfaceC6208b) obj).mo12791e();
    }
}
