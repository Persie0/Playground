package p030b9;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import p068d9.AbstractC5091e;
import p068d9.C5104r;
import p090e9.InterfaceC5385a;
import p135g9.C5717a;
import p174i9.InterfaceC6208b;
import p395t8.C9220b;
import p452w8.AbstractC9833n;
import p452w8.AbstractC9838s;
import p479xa.C10144m;

/* JADX INFO: renamed from: b9.b */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C1343b implements InterfaceC5385a.a, C5104r.a, C10144m.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f8165a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object f8166b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Object f8167c;

    public /* synthetic */ C1343b(C5104r c5104r, AbstractC9833n abstractC9833n, AbstractC9838s abstractC9838s) {
        this.f8167c = c5104r;
        this.f8165a = abstractC9833n;
        this.f8166b = abstractC9838s;
    }

    public /* synthetic */ C1343b(Object obj, Object obj2, Object obj3) {
        this.f8167c = obj;
        this.f8166b = obj2;
        this.f8165a = obj3;
    }

    @Override // p068d9.C5104r.a
    public final Object apply(Object obj) {
        long jInsert;
        C5104r c5104r = (C5104r) this.f8167c;
        AbstractC9833n abstractC9833n = (AbstractC9833n) this.f8165a;
        AbstractC9838s abstractC9838s = (AbstractC9838s) this.f8166b;
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        C9220b c9220b = C5104r.f33055f;
        long jSimpleQueryForLong = c5104r.m10871r().compileStatement("PRAGMA page_size").simpleQueryForLong() * c5104r.m10872w();
        AbstractC5091e abstractC5091e = c5104r.f33059d;
        if (jSimpleQueryForLong >= abstractC5091e.mo10848e()) {
            c5104r.mo10854l(1L, LogEventDropped.Reason.CACHE_FULL, abstractC9833n.mo18309g());
            return -1L;
        }
        Long lM10865C = C5104r.m10865C(sQLiteDatabase, abstractC9838s);
        if (lM10865C != null) {
            jInsert = lM10865C.longValue();
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("backend_name", abstractC9838s.mo18319b());
            contentValues.put("priority", Integer.valueOf(C5717a.m12075a(abstractC9838s.mo18321d())));
            contentValues.put("next_request_ms", (Integer) 0);
            if (abstractC9838s.mo18320c() != null) {
                contentValues.put("extras", Base64.encodeToString(abstractC9838s.mo18320c(), 0));
            }
            jInsert = sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        int iMo10847d = abstractC5091e.mo10847d();
        byte[] bArr = abstractC9833n.mo18307d().f50039b;
        boolean z10 = bArr.length <= iMo10847d;
        ContentValues contentValues2 = new ContentValues();
        contentValues2.put("context_id", Long.valueOf(jInsert));
        contentValues2.put("transport_name", abstractC9833n.mo18309g());
        contentValues2.put("timestamp_ms", Long.valueOf(abstractC9833n.mo18308e()));
        contentValues2.put("uptime_ms", Long.valueOf(abstractC9833n.mo18310h()));
        contentValues2.put("payload_encoding", abstractC9833n.mo18307d().f50038a.f47836a);
        contentValues2.put("code", abstractC9833n.mo18306c());
        contentValues2.put("num_attempts", (Integer) 0);
        contentValues2.put("inline", Boolean.valueOf(z10));
        contentValues2.put("payload", z10 ? bArr : new byte[0]);
        long jInsert2 = sQLiteDatabase.insert("events", null, contentValues2);
        if (!z10) {
            int iCeil = (int) Math.ceil(((double) bArr.length) / ((double) iMo10847d));
            for (int i10 = 1; i10 <= iCeil; i10++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, (i10 - 1) * iMo10847d, Math.min(i10 * iMo10847d, bArr.length));
                ContentValues contentValues3 = new ContentValues();
                contentValues3.put("event_id", Long.valueOf(jInsert2));
                contentValues3.put("sequence_num", Integer.valueOf(i10));
                contentValues3.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues3);
            }
        }
        for (Map.Entry entry : Collections.unmodifiableMap(abstractC9833n.mo18305b()).entrySet()) {
            ContentValues contentValues4 = new ContentValues();
            contentValues4.put("event_id", Long.valueOf(jInsert2));
            contentValues4.put("name", (String) entry.getKey());
            contentValues4.put("value", (String) entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues4);
        }
        return Long.valueOf(jInsert2);
    }

    @Override // p090e9.InterfaceC5385a.a
    /* JADX INFO: renamed from: g */
    public final Object mo4925g() {
        C1344c c1344c = (C1344c) this.f8167c;
        AbstractC9838s abstractC9838s = (AbstractC9838s) this.f8166b;
        c1344c.f8172d.mo10857O(abstractC9838s, (AbstractC9833n) this.f8165a);
        c1344c.f8169a.mo5483a(abstractC9838s, 1);
        return null;
    }

    @Override // p479xa.C10144m.a
    /* JADX INFO: renamed from: n */
    public final void mo780n(Object obj) {
        ((InterfaceC6208b) obj).mo12794h();
    }
}
