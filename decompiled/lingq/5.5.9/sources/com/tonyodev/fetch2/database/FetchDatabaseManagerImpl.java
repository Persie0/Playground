package com.tonyodev.fetch2.database;

import al.C0122i;
import al.C0125l;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import androidx.room.RoomDatabase;
import cm.InterfaceC2052l;
import com.tonyodev.fetch2.PrioritySort;
import com.tonyodev.fetch2.Status;
import com.tonyodev.fetch2.exception.FetchException;
import dm.C5206f;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import p003a2.C0009a;
import p099el.C5427b;
import p122fl.C5578a;
import p122fl.InterfaceC5587j;
import p213k4.C6595o;
import p234l4.AbstractC7252b;
import p288o4.InterfaceC7916b;
import p338qd.C8573r0;
import p385sf.C9000b;
import p489xk.C10218f;
import p489xk.C10220h;
import p489xk.InterfaceC10213a;
import p489xk.InterfaceC10219g;
import p514yk.AbstractC10409a;
import sl.C9072e;

/* JADX INFO: loaded from: classes2.dex */
public final class FetchDatabaseManagerImpl implements InterfaceC10219g<DownloadInfo> {

    /* JADX INFO: renamed from: a */
    public volatile boolean f32343a;

    /* JADX INFO: renamed from: b */
    public InterfaceC10219g.a<DownloadInfo> f32344b;

    /* JADX INFO: renamed from: c */
    public final DownloadDatabase f32345c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC7916b f32346d;

    /* JADX INFO: renamed from: e */
    public final String f32347e;

    /* JADX INFO: renamed from: f */
    public final String f32348f;

    /* JADX INFO: renamed from: g */
    public final ArrayList f32349g;

    /* JADX INFO: renamed from: h */
    public final String f32350h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC5587j f32351i;

    /* JADX INFO: renamed from: j */
    public final C0125l f32352j;

    /* JADX INFO: renamed from: k */
    public final boolean f32353k;

    /* JADX INFO: renamed from: l */
    public final C5578a f32354l;

    public FetchDatabaseManagerImpl(Context context, String str, InterfaceC5587j interfaceC5587j, AbstractC10409a[] abstractC10409aArr, C0125l c0125l, boolean z10, C5578a c5578a) {
        C5207g.m11112g(context, "context");
        C5207g.m11112g(str, "namespace");
        C5207g.m11112g(interfaceC5587j, "logger");
        this.f32350h = str;
        this.f32351i = interfaceC5587j;
        this.f32352j = c0125l;
        this.f32353k = z10;
        this.f32354l = c5578a;
        RoomDatabase.C1180a c1180aM10983D0 = C5206f.m10983D0(context, DownloadDatabase.class, str.concat(".db"));
        c1180aM10983D0.m4569a((AbstractC7252b[]) Arrays.copyOf(abstractC10409aArr, abstractC10409aArr.length));
        DownloadDatabase downloadDatabase = (DownloadDatabase) c1180aM10983D0.m4570b();
        this.f32345c = downloadDatabase;
        InterfaceC7916b interfaceC7916bMo4578n0 = downloadDatabase.m4559j().mo4578n0();
        C5207g.m11107b(interfaceC7916bMo4578n0, "requestDatabase.openHelper.writableDatabase");
        this.f32346d = interfaceC7916bMo4578n0;
        StringBuilder sb2 = new StringBuilder("SELECT _id FROM requests WHERE _status = '");
        Status status = Status.QUEUED;
        sb2.append(status.getValue());
        sb2.append("' OR _status = '");
        Status status2 = Status.DOWNLOADING;
        sb2.append(status2.getValue());
        sb2.append('\'');
        this.f32347e = sb2.toString();
        this.f32348f = "SELECT _id FROM requests WHERE _status = '" + status.getValue() + "' OR _status = '" + status2.getValue() + "' OR _status = '" + Status.ADDED.getValue() + '\'';
        this.f32349g = new ArrayList();
    }

    @Override // p489xk.InterfaceC10219g
    /* JADX INFO: renamed from: K0 */
    public final List<DownloadInfo> mo10613K0(int i10) throws Throwable {
        C6595o c6595o;
        m10618b();
        C10218f c10218f = (C10218f) this.f32345c.mo10598u();
        c10218f.getClass();
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM requests WHERE _group = ?", 1);
        c6595oM13191l.mo13194W(1, i10);
        RoomDatabase roomDatabase = c10218f.f51632a;
        roomDatabase.m4551b();
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595oM13191l);
        try {
            int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "_id");
            int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "_namespace");
            int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "_url");
            int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "_file");
            int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "_group");
            int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "_priority");
            int iM16742n6 = C8573r0.m16742n0(cursorM16698S0, "_headers");
            int iM16742n7 = C8573r0.m16742n0(cursorM16698S0, "_written_bytes");
            int iM16742n8 = C8573r0.m16742n0(cursorM16698S0, "_total_bytes");
            int iM16742n9 = C8573r0.m16742n0(cursorM16698S0, "_status");
            int iM16742n10 = C8573r0.m16742n0(cursorM16698S0, "_error");
            int iM16742n11 = C8573r0.m16742n0(cursorM16698S0, "_network_type");
            try {
                int iM16742n12 = C8573r0.m16742n0(cursorM16698S0, "_created");
                c6595o = c6595oM13191l;
                try {
                    int iM16742n13 = C8573r0.m16742n0(cursorM16698S0, "_tag");
                    int iM16742n14 = C8573r0.m16742n0(cursorM16698S0, "_enqueue_action");
                    int iM16742n15 = C8573r0.m16742n0(cursorM16698S0, "_identifier");
                    int iM16742n16 = C8573r0.m16742n0(cursorM16698S0, "_download_on_enqueue");
                    int iM16742n17 = C8573r0.m16742n0(cursorM16698S0, "_extras");
                    int iM16742n18 = C8573r0.m16742n0(cursorM16698S0, "_auto_retry_max_attempts");
                    int iM16742n19 = C8573r0.m16742n0(cursorM16698S0, "_auto_retry_attempts");
                    int i11 = iM16742n12;
                    ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                    while (true) {
                        ArrayList arrayList2 = arrayList;
                        if (!cursorM16698S0.moveToNext()) {
                            cursorM16698S0.close();
                            c6595o.m13198q();
                            m10617a(arrayList2, false);
                            return arrayList2;
                        }
                        DownloadInfo downloadInfo = new DownloadInfo();
                        downloadInfo.f32331a = cursorM16698S0.getInt(iM16742n0);
                        downloadInfo.m10607l(cursorM16698S0.getString(iM16742n1));
                        downloadInfo.m10612x(cursorM16698S0.getString(iM16742n2));
                        downloadInfo.m10606k(cursorM16698S0.getString(iM16742n3));
                        downloadInfo.f32335e = cursorM16698S0.getInt(iM16742n4);
                        int i12 = cursorM16698S0.getInt(iM16742n5);
                        int i13 = iM16742n0;
                        c10218f.f51634c.getClass();
                        downloadInfo.m10609q(C5206f.m10993N0(i12));
                        downloadInfo.f32337g = C5206f.m10991L0(cursorM16698S0.getString(iM16742n6));
                        int i14 = iM16742n1;
                        downloadInfo.f32338h = cursorM16698S0.getLong(iM16742n7);
                        downloadInfo.f32339i = cursorM16698S0.getLong(iM16742n8);
                        downloadInfo.m10610r(C5206f.m10994O0(cursorM16698S0.getInt(iM16742n9)));
                        downloadInfo.m10604h(C5206f.m10988I0(cursorM16698S0.getInt(iM16742n10)));
                        downloadInfo.m10608n(C5206f.m10992M0(cursorM16698S0.getInt(iM16742n11)));
                        int i15 = iM16742n11;
                        int i16 = i11;
                        downloadInfo.f32321H = cursorM16698S0.getLong(i16);
                        int i17 = iM16742n13;
                        downloadInfo.f32322I = cursorM16698S0.getString(i17);
                        int i18 = iM16742n14;
                        C10218f c10218f2 = c10218f;
                        downloadInfo.m10603e(C5206f.m10987H0(cursorM16698S0.getInt(i18)));
                        iM16742n13 = i17;
                        iM16742n14 = i18;
                        int i19 = iM16742n15;
                        downloadInfo.f32324K = cursorM16698S0.getLong(i19);
                        int i20 = iM16742n16;
                        downloadInfo.f32325L = cursorM16698S0.getInt(i20) != 0;
                        int i21 = iM16742n17;
                        downloadInfo.f32326M = C5206f.m10989J0(cursorM16698S0.getString(i21));
                        int i22 = iM16742n18;
                        downloadInfo.f32327N = cursorM16698S0.getInt(i22);
                        iM16742n18 = i22;
                        int i23 = iM16742n19;
                        downloadInfo.f32328O = cursorM16698S0.getInt(i23);
                        arrayList2.add(downloadInfo);
                        iM16742n19 = i23;
                        iM16742n17 = i21;
                        iM16742n11 = i15;
                        iM16742n1 = i14;
                        arrayList = arrayList2;
                        i11 = i16;
                        iM16742n0 = i13;
                        c10218f = c10218f2;
                        iM16742n16 = i20;
                        iM16742n15 = i19;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    cursorM16698S0.close();
                    c6595o.m13198q();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                c6595o = c6595oM13191l;
                cursorM16698S0.close();
                c6595o.m13198q();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // p489xk.InterfaceC10219g
    /* JADX INFO: renamed from: P */
    public final InterfaceC5587j mo10614P() {
        return this.f32351i;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p489xk.InterfaceC10219g
    /* JADX INFO: renamed from: T */
    public final void mo10615T(DownloadInfo downloadInfo) {
        C5207g.m11112g(downloadInfo, "downloadInfo");
        m10618b();
        C10218f c10218f = (C10218f) this.f32345c.mo10598u();
        RoomDatabase roomDatabase = c10218f.f51632a;
        roomDatabase.m4551b();
        roomDatabase.m4552c();
        try {
            c10218f.f51636e.m13169e(downloadInfo);
            roomDatabase.m4568s();
            roomDatabase.m4563n();
        } catch (Throwable th2) {
            roomDatabase.m4563n();
            throw th2;
        }
    }

    @Override // p489xk.InterfaceC10219g
    /* JADX INFO: renamed from: Y */
    public final void mo10616Y(DownloadInfo downloadInfo) {
        InterfaceC5587j interfaceC5587j = this.f32351i;
        InterfaceC7916b interfaceC7916b = this.f32346d;
        C5207g.m11112g(downloadInfo, "downloadInfo");
        m10618b();
        try {
            interfaceC7916b.mo4597k();
            interfaceC7916b.mo4592a0("UPDATE requests SET _written_bytes = ?, _total_bytes = ?, _status = ? WHERE _id = ?", new Object[]{Long.valueOf(downloadInfo.f32338h), Long.valueOf(downloadInfo.f32339i), Integer.valueOf(downloadInfo.f32340j.getValue()), Integer.valueOf(downloadInfo.f32331a)});
            interfaceC7916b.mo4590Z();
        } catch (SQLiteException e10) {
            interfaceC5587j.mo11831d("DatabaseManager exception", e10);
        }
        try {
            interfaceC7916b.mo4601w0();
        } catch (SQLiteException e11) {
            interfaceC5587j.mo11831d("DatabaseManager exception", e11);
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x006f  */
    /* JADX INFO: renamed from: a */
    public final boolean m10617a(List<? extends DownloadInfo> list, boolean z10) {
        Status status;
        ArrayList arrayList = this.f32349g;
        arrayList.clear();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            DownloadInfo downloadInfo = list.get(i10);
            int i11 = C10220h.f51637a[downloadInfo.f32340j.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    if ((i11 == 3 || i11 == 4) && downloadInfo.f32338h > 0 && this.f32353k) {
                        if (!this.f32354l.mo11804b(downloadInfo.f32334d)) {
                            downloadInfo.f32338h = 0L;
                            downloadInfo.f32339i = -1L;
                            downloadInfo.m10604h(C5427b.f33967d);
                            arrayList.add(downloadInfo);
                            InterfaceC10219g.a<DownloadInfo> aVar = this.f32344b;
                            if (aVar != null) {
                                aVar.mo522a(downloadInfo);
                            }
                        }
                    }
                } else if (z10) {
                    long j10 = downloadInfo.f32338h;
                    if (j10 > 0) {
                        long j11 = downloadInfo.f32339i;
                        if (j11 <= 0 || j10 < j11) {
                            status = Status.QUEUED;
                        } else {
                            status = Status.COMPLETED;
                        }
                    } else {
                        status = Status.QUEUED;
                    }
                    downloadInfo.m10610r(status);
                    downloadInfo.m10604h(C5427b.f33967d);
                    arrayList.add(downloadInfo);
                }
            } else if (downloadInfo.f32339i < 1) {
                long j12 = downloadInfo.f32338h;
                if (j12 > 0) {
                    downloadInfo.f32339i = j12;
                    downloadInfo.m10604h(C5427b.f33967d);
                    arrayList.add(downloadInfo);
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            try {
                mo10621e0(arrayList);
            } catch (Exception e10) {
                this.f32351i.mo11831d("Failed to update", e10);
            }
        }
        arrayList.clear();
        return size2 > 0;
    }

    /* JADX INFO: renamed from: b */
    public final void m10618b() {
        if (this.f32343a) {
            throw new FetchException(C0009a.m23l(new StringBuilder(), this.f32350h, " database is closed"));
        }
    }

    @Override // p489xk.InterfaceC10219g
    /* JADX INFO: renamed from: b0 */
    public final void mo10619b0(C0122i.b.a aVar) {
        this.f32344b = aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f32343a) {
            return;
        }
        this.f32343a = true;
        try {
            this.f32346d.close();
        } catch (Exception unused) {
        }
        try {
            this.f32345c.m4554e();
        } catch (Exception unused2) {
        }
        this.f32351i.mo11829b("Database closed");
    }

    @Override // p489xk.InterfaceC10219g
    /* JADX INFO: renamed from: e */
    public final DownloadInfo mo10620e() {
        return new DownloadInfo();
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p489xk.InterfaceC10219g
    /* JADX INFO: renamed from: e0 */
    public final void mo10621e0(ArrayList arrayList) {
        C5207g.m11112g(arrayList, "downloadInfoList");
        m10618b();
        C10218f c10218f = (C10218f) this.f32345c.mo10598u();
        RoomDatabase roomDatabase = c10218f.f51632a;
        roomDatabase.m4551b();
        roomDatabase.m4552c();
        try {
            c10218f.f51636e.m13170f(arrayList);
            roomDatabase.m4568s();
            roomDatabase.m4563n();
        } catch (Throwable th2) {
            roomDatabase.m4563n();
            throw th2;
        }
    }

    @Override // p489xk.InterfaceC10219g
    /* JADX INFO: renamed from: f0 */
    public final List<DownloadInfo> mo10622f0(PrioritySort prioritySort) throws Throwable {
        C6595o c6595o;
        ArrayList arrayList;
        C6595o c6595o2;
        m10618b();
        PrioritySort prioritySort2 = PrioritySort.ASC;
        DownloadDatabase downloadDatabase = this.f32345c;
        if (prioritySort == prioritySort2) {
            InterfaceC10213a interfaceC10213aMo10598u = downloadDatabase.mo10598u();
            Status status = Status.QUEUED;
            C10218f c10218f = (C10218f) interfaceC10213aMo10598u;
            c10218f.getClass();
            C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM requests WHERE _status = ? ORDER BY _priority DESC, _created ASC", 1);
            c10218f.f51634c.getClass();
            C5207g.m11112g(status, "status");
            c6595oM13191l.mo13194W(1, status.getValue());
            RoomDatabase roomDatabase = c10218f.f51632a;
            roomDatabase.m4551b();
            Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595oM13191l);
            try {
                int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "_id");
                int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "_namespace");
                int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "_url");
                int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "_file");
                int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "_group");
                int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "_priority");
                int iM16742n6 = C8573r0.m16742n0(cursorM16698S0, "_headers");
                int iM16742n7 = C8573r0.m16742n0(cursorM16698S0, "_written_bytes");
                int iM16742n8 = C8573r0.m16742n0(cursorM16698S0, "_total_bytes");
                int iM16742n9 = C8573r0.m16742n0(cursorM16698S0, "_status");
                int iM16742n10 = C8573r0.m16742n0(cursorM16698S0, "_error");
                int iM16742n11 = C8573r0.m16742n0(cursorM16698S0, "_network_type");
                int iM16742n12 = C8573r0.m16742n0(cursorM16698S0, "_created");
                int iM16742n13 = C8573r0.m16742n0(cursorM16698S0, "_tag");
                c6595o2 = c6595oM13191l;
                try {
                    int iM16742n14 = C8573r0.m16742n0(cursorM16698S0, "_enqueue_action");
                    int iM16742n15 = C8573r0.m16742n0(cursorM16698S0, "_identifier");
                    int iM16742n16 = C8573r0.m16742n0(cursorM16698S0, "_download_on_enqueue");
                    int iM16742n17 = C8573r0.m16742n0(cursorM16698S0, "_extras");
                    int iM16742n18 = C8573r0.m16742n0(cursorM16698S0, "_auto_retry_max_attempts");
                    int iM16742n19 = C8573r0.m16742n0(cursorM16698S0, "_auto_retry_attempts");
                    int i10 = iM16742n13;
                    arrayList = new ArrayList(cursorM16698S0.getCount());
                    while (cursorM16698S0.moveToNext()) {
                        DownloadInfo downloadInfo = new DownloadInfo();
                        ArrayList arrayList2 = arrayList;
                        downloadInfo.f32331a = cursorM16698S0.getInt(iM16742n0);
                        downloadInfo.m10607l(cursorM16698S0.getString(iM16742n1));
                        downloadInfo.m10612x(cursorM16698S0.getString(iM16742n2));
                        downloadInfo.m10606k(cursorM16698S0.getString(iM16742n3));
                        downloadInfo.f32335e = cursorM16698S0.getInt(iM16742n4);
                        downloadInfo.m10609q(C5206f.m10993N0(cursorM16698S0.getInt(iM16742n5)));
                        downloadInfo.f32337g = C5206f.m10991L0(cursorM16698S0.getString(iM16742n6));
                        int i11 = iM16742n5;
                        int i12 = iM16742n4;
                        downloadInfo.f32338h = cursorM16698S0.getLong(iM16742n7);
                        downloadInfo.f32339i = cursorM16698S0.getLong(iM16742n8);
                        downloadInfo.m10610r(C5206f.m10994O0(cursorM16698S0.getInt(iM16742n9)));
                        downloadInfo.m10604h(C5206f.m10988I0(cursorM16698S0.getInt(iM16742n10)));
                        downloadInfo.m10608n(C5206f.m10992M0(cursorM16698S0.getInt(iM16742n11)));
                        downloadInfo.f32321H = cursorM16698S0.getLong(iM16742n12);
                        int i13 = i10;
                        downloadInfo.f32322I = cursorM16698S0.getString(i13);
                        int i14 = iM16742n14;
                        downloadInfo.m10603e(C5206f.m10987H0(cursorM16698S0.getInt(i14)));
                        i10 = i13;
                        iM16742n14 = i14;
                        int i15 = iM16742n15;
                        downloadInfo.f32324K = cursorM16698S0.getLong(i15);
                        int i16 = iM16742n16;
                        downloadInfo.f32325L = cursorM16698S0.getInt(i16) != 0;
                        int i17 = iM16742n17;
                        int i18 = iM16742n0;
                        downloadInfo.f32326M = C5206f.m10989J0(cursorM16698S0.getString(i17));
                        int i19 = iM16742n18;
                        downloadInfo.f32327N = cursorM16698S0.getInt(i19);
                        int i20 = iM16742n19;
                        downloadInfo.f32328O = cursorM16698S0.getInt(i20);
                        arrayList2.add(downloadInfo);
                        iM16742n17 = i17;
                        iM16742n15 = i15;
                        iM16742n4 = i12;
                        arrayList = arrayList2;
                        iM16742n0 = i18;
                        iM16742n16 = i16;
                        iM16742n18 = i19;
                        iM16742n19 = i20;
                        iM16742n5 = i11;
                    }
                    cursorM16698S0.close();
                    c6595o2.m13198q();
                } catch (Throwable th2) {
                    th = th2;
                    cursorM16698S0.close();
                    c6595o2.m13198q();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                c6595o2 = c6595oM13191l;
            }
        } else {
            InterfaceC10213a interfaceC10213aMo10598u2 = downloadDatabase.mo10598u();
            Status status2 = Status.QUEUED;
            C10218f c10218f2 = (C10218f) interfaceC10213aMo10598u2;
            c10218f2.getClass();
            C6595o c6595oM13191l2 = C6595o.m13191l("SELECT * FROM requests WHERE _status = ? ORDER BY _priority DESC, _created DESC", 1);
            c10218f2.f51634c.getClass();
            C5207g.m11112g(status2, "status");
            c6595oM13191l2.mo13194W(1, status2.getValue());
            RoomDatabase roomDatabase2 = c10218f2.f51632a;
            roomDatabase2.m4551b();
            Cursor cursorM16698S1 = C8573r0.m16698S0(roomDatabase2, c6595oM13191l2);
            try {
                int iM16742n20 = C8573r0.m16742n0(cursorM16698S1, "_id");
                int iM16742n21 = C8573r0.m16742n0(cursorM16698S1, "_namespace");
                int iM16742n22 = C8573r0.m16742n0(cursorM16698S1, "_url");
                int iM16742n23 = C8573r0.m16742n0(cursorM16698S1, "_file");
                int iM16742n24 = C8573r0.m16742n0(cursorM16698S1, "_group");
                int iM16742n25 = C8573r0.m16742n0(cursorM16698S1, "_priority");
                int iM16742n26 = C8573r0.m16742n0(cursorM16698S1, "_headers");
                int iM16742n27 = C8573r0.m16742n0(cursorM16698S1, "_written_bytes");
                int iM16742n28 = C8573r0.m16742n0(cursorM16698S1, "_total_bytes");
                int iM16742n29 = C8573r0.m16742n0(cursorM16698S1, "_status");
                int iM16742n30 = C8573r0.m16742n0(cursorM16698S1, "_error");
                int iM16742n31 = C8573r0.m16742n0(cursorM16698S1, "_network_type");
                int iM16742n32 = C8573r0.m16742n0(cursorM16698S1, "_created");
                int iM16742n33 = C8573r0.m16742n0(cursorM16698S1, "_tag");
                c6595o = c6595oM13191l2;
                try {
                    int iM16742n34 = C8573r0.m16742n0(cursorM16698S1, "_enqueue_action");
                    int iM16742n35 = C8573r0.m16742n0(cursorM16698S1, "_identifier");
                    int iM16742n36 = C8573r0.m16742n0(cursorM16698S1, "_download_on_enqueue");
                    int iM16742n37 = C8573r0.m16742n0(cursorM16698S1, "_extras");
                    int iM16742n38 = C8573r0.m16742n0(cursorM16698S1, "_auto_retry_max_attempts");
                    int iM16742n39 = C8573r0.m16742n0(cursorM16698S1, "_auto_retry_attempts");
                    int i21 = iM16742n33;
                    ArrayList arrayList3 = new ArrayList(cursorM16698S1.getCount());
                    while (cursorM16698S1.moveToNext()) {
                        DownloadInfo downloadInfo2 = new DownloadInfo();
                        ArrayList arrayList4 = arrayList3;
                        downloadInfo2.f32331a = cursorM16698S1.getInt(iM16742n20);
                        downloadInfo2.m10607l(cursorM16698S1.getString(iM16742n21));
                        downloadInfo2.m10612x(cursorM16698S1.getString(iM16742n22));
                        downloadInfo2.m10606k(cursorM16698S1.getString(iM16742n23));
                        downloadInfo2.f32335e = cursorM16698S1.getInt(iM16742n24);
                        downloadInfo2.m10609q(C5206f.m10993N0(cursorM16698S1.getInt(iM16742n25)));
                        downloadInfo2.f32337g = C5206f.m10991L0(cursorM16698S1.getString(iM16742n26));
                        int i22 = iM16742n25;
                        int i23 = iM16742n24;
                        downloadInfo2.f32338h = cursorM16698S1.getLong(iM16742n27);
                        downloadInfo2.f32339i = cursorM16698S1.getLong(iM16742n28);
                        downloadInfo2.m10610r(C5206f.m10994O0(cursorM16698S1.getInt(iM16742n29)));
                        downloadInfo2.m10604h(C5206f.m10988I0(cursorM16698S1.getInt(iM16742n30)));
                        downloadInfo2.m10608n(C5206f.m10992M0(cursorM16698S1.getInt(iM16742n31)));
                        downloadInfo2.f32321H = cursorM16698S1.getLong(iM16742n32);
                        int i24 = i21;
                        downloadInfo2.f32322I = cursorM16698S1.getString(i24);
                        int i25 = iM16742n34;
                        int i26 = iM16742n20;
                        downloadInfo2.m10603e(C5206f.m10987H0(cursorM16698S1.getInt(i25)));
                        iM16742n34 = i25;
                        int i27 = iM16742n35;
                        downloadInfo2.f32324K = cursorM16698S1.getLong(i27);
                        int i28 = iM16742n36;
                        downloadInfo2.f32325L = cursorM16698S1.getInt(i28) != 0;
                        int i29 = iM16742n37;
                        downloadInfo2.f32326M = C5206f.m10989J0(cursorM16698S1.getString(i29));
                        int i30 = iM16742n38;
                        downloadInfo2.f32327N = cursorM16698S1.getInt(i30);
                        int i31 = iM16742n39;
                        downloadInfo2.f32328O = cursorM16698S1.getInt(i31);
                        arrayList4.add(downloadInfo2);
                        iM16742n37 = i29;
                        iM16742n24 = i23;
                        arrayList3 = arrayList4;
                        iM16742n20 = i26;
                        i21 = i24;
                        iM16742n35 = i27;
                        iM16742n36 = i28;
                        iM16742n38 = i30;
                        iM16742n39 = i31;
                        iM16742n25 = i22;
                    }
                    cursorM16698S1.close();
                    c6595o.m13198q();
                    arrayList = arrayList3;
                } catch (Throwable th4) {
                    th = th4;
                    cursorM16698S1.close();
                    c6595o.m13198q();
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                c6595o = c6595oM13191l2;
            }
        }
        if (!m10617a(arrayList, false)) {
            return arrayList;
        }
        ArrayList arrayList5 = new ArrayList();
        for (Object obj : arrayList) {
            if (((DownloadInfo) obj).f32340j == Status.QUEUED) {
                arrayList5.add(obj);
            }
        }
        return arrayList5;
    }

    @Override // p489xk.InterfaceC10219g
    public final DownloadInfo get(int i10) throws Throwable {
        C6595o c6595o;
        DownloadInfo downloadInfo;
        m10618b();
        C10218f c10218f = (C10218f) this.f32345c.mo10598u();
        c10218f.getClass();
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM requests WHERE _id = ?", 1);
        c6595oM13191l.mo13194W(1, i10);
        RoomDatabase roomDatabase = c10218f.f51632a;
        roomDatabase.m4551b();
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595oM13191l);
        try {
            int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "_id");
            int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "_namespace");
            int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "_url");
            int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "_file");
            int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "_group");
            int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "_priority");
            int iM16742n6 = C8573r0.m16742n0(cursorM16698S0, "_headers");
            int iM16742n7 = C8573r0.m16742n0(cursorM16698S0, "_written_bytes");
            int iM16742n8 = C8573r0.m16742n0(cursorM16698S0, "_total_bytes");
            int iM16742n9 = C8573r0.m16742n0(cursorM16698S0, "_status");
            int iM16742n10 = C8573r0.m16742n0(cursorM16698S0, "_error");
            int iM16742n11 = C8573r0.m16742n0(cursorM16698S0, "_network_type");
            try {
                int iM16742n12 = C8573r0.m16742n0(cursorM16698S0, "_created");
                c6595o = c6595oM13191l;
                try {
                    int iM16742n13 = C8573r0.m16742n0(cursorM16698S0, "_tag");
                    int iM16742n14 = C8573r0.m16742n0(cursorM16698S0, "_enqueue_action");
                    int iM16742n15 = C8573r0.m16742n0(cursorM16698S0, "_identifier");
                    int iM16742n16 = C8573r0.m16742n0(cursorM16698S0, "_download_on_enqueue");
                    int iM16742n17 = C8573r0.m16742n0(cursorM16698S0, "_extras");
                    int iM16742n18 = C8573r0.m16742n0(cursorM16698S0, "_auto_retry_max_attempts");
                    int iM16742n19 = C8573r0.m16742n0(cursorM16698S0, "_auto_retry_attempts");
                    if (cursorM16698S0.moveToFirst()) {
                        downloadInfo = new DownloadInfo();
                        downloadInfo.f32331a = cursorM16698S0.getInt(iM16742n0);
                        downloadInfo.m10607l(cursorM16698S0.getString(iM16742n1));
                        downloadInfo.m10612x(cursorM16698S0.getString(iM16742n2));
                        downloadInfo.m10606k(cursorM16698S0.getString(iM16742n3));
                        downloadInfo.f32335e = cursorM16698S0.getInt(iM16742n4);
                        int i11 = cursorM16698S0.getInt(iM16742n5);
                        c10218f.f51634c.getClass();
                        downloadInfo.m10609q(C5206f.m10993N0(i11));
                        downloadInfo.f32337g = C5206f.m10991L0(cursorM16698S0.getString(iM16742n6));
                        downloadInfo.f32338h = cursorM16698S0.getLong(iM16742n7);
                        downloadInfo.f32339i = cursorM16698S0.getLong(iM16742n8);
                        downloadInfo.m10610r(C5206f.m10994O0(cursorM16698S0.getInt(iM16742n9)));
                        downloadInfo.m10604h(C5206f.m10988I0(cursorM16698S0.getInt(iM16742n10)));
                        downloadInfo.m10608n(C5206f.m10992M0(cursorM16698S0.getInt(iM16742n11)));
                        downloadInfo.f32321H = cursorM16698S0.getLong(iM16742n12);
                        downloadInfo.f32322I = cursorM16698S0.getString(iM16742n13);
                        downloadInfo.m10603e(C5206f.m10987H0(cursorM16698S0.getInt(iM16742n14)));
                        downloadInfo.f32324K = cursorM16698S0.getLong(iM16742n15);
                        downloadInfo.f32325L = cursorM16698S0.getInt(iM16742n16) != 0;
                        downloadInfo.f32326M = C5206f.m10989J0(cursorM16698S0.getString(iM16742n17));
                        downloadInfo.f32327N = cursorM16698S0.getInt(iM16742n18);
                        downloadInfo.f32328O = cursorM16698S0.getInt(iM16742n19);
                    } else {
                        downloadInfo = null;
                    }
                    cursorM16698S0.close();
                    c6595o.m13198q();
                    if (downloadInfo != null) {
                        m10617a(C9000b.m17251q(downloadInfo), false);
                    }
                    return downloadInfo;
                } catch (Throwable th2) {
                    th = th2;
                    cursorM16698S0.close();
                    c6595o.m13198q();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                c6595o = c6595oM13191l;
                cursorM16698S0.close();
                c6595o.m13198q();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // p489xk.InterfaceC10219g
    public final List<DownloadInfo> get() throws Throwable {
        C6595o c6595o;
        m10618b();
        C10218f c10218f = (C10218f) this.f32345c.mo10598u();
        c10218f.getClass();
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM requests", 0);
        RoomDatabase roomDatabase = c10218f.f51632a;
        roomDatabase.m4551b();
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595oM13191l);
        try {
            int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "_id");
            int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "_namespace");
            int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "_url");
            int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "_file");
            int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "_group");
            int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "_priority");
            int iM16742n6 = C8573r0.m16742n0(cursorM16698S0, "_headers");
            int iM16742n7 = C8573r0.m16742n0(cursorM16698S0, "_written_bytes");
            int iM16742n8 = C8573r0.m16742n0(cursorM16698S0, "_total_bytes");
            int iM16742n9 = C8573r0.m16742n0(cursorM16698S0, "_status");
            int iM16742n10 = C8573r0.m16742n0(cursorM16698S0, "_error");
            int iM16742n11 = C8573r0.m16742n0(cursorM16698S0, "_network_type");
            try {
                int iM16742n12 = C8573r0.m16742n0(cursorM16698S0, "_created");
                c6595o = c6595oM13191l;
                try {
                    int iM16742n13 = C8573r0.m16742n0(cursorM16698S0, "_tag");
                    int iM16742n14 = C8573r0.m16742n0(cursorM16698S0, "_enqueue_action");
                    int iM16742n15 = C8573r0.m16742n0(cursorM16698S0, "_identifier");
                    int iM16742n16 = C8573r0.m16742n0(cursorM16698S0, "_download_on_enqueue");
                    int iM16742n17 = C8573r0.m16742n0(cursorM16698S0, "_extras");
                    int iM16742n18 = C8573r0.m16742n0(cursorM16698S0, "_auto_retry_max_attempts");
                    int iM16742n19 = C8573r0.m16742n0(cursorM16698S0, "_auto_retry_attempts");
                    int i10 = iM16742n12;
                    ArrayList arrayList = new ArrayList(cursorM16698S0.getCount());
                    while (cursorM16698S0.moveToNext()) {
                        DownloadInfo downloadInfo = new DownloadInfo();
                        ArrayList arrayList2 = arrayList;
                        downloadInfo.f32331a = cursorM16698S0.getInt(iM16742n0);
                        downloadInfo.m10607l(cursorM16698S0.getString(iM16742n1));
                        downloadInfo.m10612x(cursorM16698S0.getString(iM16742n2));
                        downloadInfo.m10606k(cursorM16698S0.getString(iM16742n3));
                        downloadInfo.f32335e = cursorM16698S0.getInt(iM16742n4);
                        int i11 = cursorM16698S0.getInt(iM16742n5);
                        int i12 = iM16742n0;
                        c10218f.f51634c.getClass();
                        downloadInfo.m10609q(C5206f.m10993N0(i11));
                        downloadInfo.f32337g = C5206f.m10991L0(cursorM16698S0.getString(iM16742n6));
                        int i13 = iM16742n1;
                        downloadInfo.f32338h = cursorM16698S0.getLong(iM16742n7);
                        downloadInfo.f32339i = cursorM16698S0.getLong(iM16742n8);
                        downloadInfo.m10610r(C5206f.m10994O0(cursorM16698S0.getInt(iM16742n9)));
                        downloadInfo.m10604h(C5206f.m10988I0(cursorM16698S0.getInt(iM16742n10)));
                        downloadInfo.m10608n(C5206f.m10992M0(cursorM16698S0.getInt(iM16742n11)));
                        int i14 = iM16742n11;
                        int i15 = i10;
                        downloadInfo.f32321H = cursorM16698S0.getLong(i15);
                        int i16 = iM16742n13;
                        downloadInfo.f32322I = cursorM16698S0.getString(i16);
                        int i17 = iM16742n14;
                        C10218f c10218f2 = c10218f;
                        downloadInfo.m10603e(C5206f.m10987H0(cursorM16698S0.getInt(i17)));
                        iM16742n13 = i16;
                        int i18 = iM16742n15;
                        downloadInfo.f32324K = cursorM16698S0.getLong(i18);
                        int i19 = iM16742n16;
                        downloadInfo.f32325L = cursorM16698S0.getInt(i19) != 0;
                        int i20 = iM16742n17;
                        downloadInfo.f32326M = C5206f.m10989J0(cursorM16698S0.getString(i20));
                        iM16742n16 = i19;
                        int i21 = iM16742n18;
                        downloadInfo.f32327N = cursorM16698S0.getInt(i21);
                        iM16742n18 = i21;
                        int i22 = iM16742n19;
                        downloadInfo.f32328O = cursorM16698S0.getInt(i22);
                        arrayList2.add(downloadInfo);
                        iM16742n19 = i22;
                        arrayList = arrayList2;
                        c10218f = c10218f2;
                        iM16742n14 = i17;
                        iM16742n15 = i18;
                        iM16742n17 = i20;
                        iM16742n11 = i14;
                        iM16742n1 = i13;
                        i10 = i15;
                        iM16742n0 = i12;
                    }
                    ArrayList arrayList3 = arrayList;
                    cursorM16698S0.close();
                    c6595o.m13198q();
                    m10617a(arrayList3, false);
                    return arrayList3;
                } catch (Throwable th2) {
                    th = th2;
                    cursorM16698S0.close();
                    c6595o.m13198q();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                c6595o = c6595oM13191l;
                cursorM16698S0.close();
                c6595o.m13198q();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // p489xk.InterfaceC10219g
    /* JADX INFO: renamed from: h1 */
    public final void mo10623h1(List<? extends DownloadInfo> list) {
        m10618b();
        C10218f c10218f = (C10218f) this.f32345c.mo10598u();
        RoomDatabase roomDatabase = c10218f.f51632a;
        roomDatabase.m4551b();
        roomDatabase.m4552c();
        try {
            c10218f.f51635d.m13170f(list);
            roomDatabase.m4568s();
            roomDatabase.m4563n();
        } catch (Throwable th2) {
            roomDatabase.m4563n();
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p489xk.InterfaceC10219g
    /* JADX INFO: renamed from: i0 */
    public final Pair<DownloadInfo, Boolean> mo10624i0(DownloadInfo downloadInfo) {
        m10618b();
        C10218f c10218f = (C10218f) this.f32345c.mo10598u();
        RoomDatabase roomDatabase = c10218f.f51632a;
        roomDatabase.m4551b();
        roomDatabase.m4552c();
        try {
            long jM13172h = c10218f.f51633b.m13172h(downloadInfo);
            roomDatabase.m4568s();
            roomDatabase.m4563n();
            return new Pair<>(downloadInfo, Boolean.valueOf(jM13172h != ((long) (-1))));
        } catch (Throwable th2) {
            roomDatabase.m4563n();
            throw th2;
        }
    }

    @Override // p489xk.InterfaceC10219g
    /* JADX INFO: renamed from: i1 */
    public final DownloadInfo mo10625i1(String str) throws Throwable {
        C6595o c6595o;
        DownloadInfo downloadInfo;
        C5207g.m11112g(str, "file");
        m10618b();
        C10218f c10218f = (C10218f) this.f32345c.mo10598u();
        c10218f.getClass();
        C6595o c6595oM13191l = C6595o.m13191l("SELECT * FROM requests WHERE _file = ?", 1);
        c6595oM13191l.mo13197h0(str, 1);
        RoomDatabase roomDatabase = c10218f.f51632a;
        roomDatabase.m4551b();
        Cursor cursorM16698S0 = C8573r0.m16698S0(roomDatabase, c6595oM13191l);
        try {
            int iM16742n0 = C8573r0.m16742n0(cursorM16698S0, "_id");
            int iM16742n1 = C8573r0.m16742n0(cursorM16698S0, "_namespace");
            int iM16742n2 = C8573r0.m16742n0(cursorM16698S0, "_url");
            int iM16742n3 = C8573r0.m16742n0(cursorM16698S0, "_file");
            int iM16742n4 = C8573r0.m16742n0(cursorM16698S0, "_group");
            int iM16742n5 = C8573r0.m16742n0(cursorM16698S0, "_priority");
            int iM16742n6 = C8573r0.m16742n0(cursorM16698S0, "_headers");
            int iM16742n7 = C8573r0.m16742n0(cursorM16698S0, "_written_bytes");
            int iM16742n8 = C8573r0.m16742n0(cursorM16698S0, "_total_bytes");
            int iM16742n9 = C8573r0.m16742n0(cursorM16698S0, "_status");
            int iM16742n10 = C8573r0.m16742n0(cursorM16698S0, "_error");
            int iM16742n11 = C8573r0.m16742n0(cursorM16698S0, "_network_type");
            try {
                int iM16742n12 = C8573r0.m16742n0(cursorM16698S0, "_created");
                c6595o = c6595oM13191l;
                try {
                    int iM16742n13 = C8573r0.m16742n0(cursorM16698S0, "_tag");
                    int iM16742n14 = C8573r0.m16742n0(cursorM16698S0, "_enqueue_action");
                    int iM16742n15 = C8573r0.m16742n0(cursorM16698S0, "_identifier");
                    int iM16742n16 = C8573r0.m16742n0(cursorM16698S0, "_download_on_enqueue");
                    int iM16742n17 = C8573r0.m16742n0(cursorM16698S0, "_extras");
                    int iM16742n18 = C8573r0.m16742n0(cursorM16698S0, "_auto_retry_max_attempts");
                    int iM16742n19 = C8573r0.m16742n0(cursorM16698S0, "_auto_retry_attempts");
                    if (cursorM16698S0.moveToFirst()) {
                        downloadInfo = new DownloadInfo();
                        downloadInfo.f32331a = cursorM16698S0.getInt(iM16742n0);
                        downloadInfo.m10607l(cursorM16698S0.getString(iM16742n1));
                        downloadInfo.m10612x(cursorM16698S0.getString(iM16742n2));
                        downloadInfo.m10606k(cursorM16698S0.getString(iM16742n3));
                        downloadInfo.f32335e = cursorM16698S0.getInt(iM16742n4);
                        int i10 = cursorM16698S0.getInt(iM16742n5);
                        c10218f.f51634c.getClass();
                        downloadInfo.m10609q(C5206f.m10993N0(i10));
                        downloadInfo.f32337g = C5206f.m10991L0(cursorM16698S0.getString(iM16742n6));
                        downloadInfo.f32338h = cursorM16698S0.getLong(iM16742n7);
                        downloadInfo.f32339i = cursorM16698S0.getLong(iM16742n8);
                        downloadInfo.m10610r(C5206f.m10994O0(cursorM16698S0.getInt(iM16742n9)));
                        downloadInfo.m10604h(C5206f.m10988I0(cursorM16698S0.getInt(iM16742n10)));
                        downloadInfo.m10608n(C5206f.m10992M0(cursorM16698S0.getInt(iM16742n11)));
                        downloadInfo.f32321H = cursorM16698S0.getLong(iM16742n12);
                        downloadInfo.f32322I = cursorM16698S0.getString(iM16742n13);
                        downloadInfo.m10603e(C5206f.m10987H0(cursorM16698S0.getInt(iM16742n14)));
                        downloadInfo.f32324K = cursorM16698S0.getLong(iM16742n15);
                        downloadInfo.f32325L = cursorM16698S0.getInt(iM16742n16) != 0;
                        downloadInfo.f32326M = C5206f.m10989J0(cursorM16698S0.getString(iM16742n17));
                        downloadInfo.f32327N = cursorM16698S0.getInt(iM16742n18);
                        downloadInfo.f32328O = cursorM16698S0.getInt(iM16742n19);
                    } else {
                        downloadInfo = null;
                    }
                    cursorM16698S0.close();
                    c6595o.m13198q();
                    if (downloadInfo != null) {
                        m10617a(C9000b.m17251q(downloadInfo), false);
                    }
                    return downloadInfo;
                } catch (Throwable th2) {
                    th = th2;
                    cursorM16698S0.close();
                    c6595o.m13198q();
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                c6595o = c6595oM13191l;
                cursorM16698S0.close();
                c6595o.m13198q();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    @Override // p489xk.InterfaceC10219g
    /* JADX INFO: renamed from: j */
    public final InterfaceC10219g.a<DownloadInfo> mo10626j() {
        return this.f32344b;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p489xk.InterfaceC10219g
    /* JADX INFO: renamed from: m */
    public final void mo10627m(DownloadInfo downloadInfo) {
        m10618b();
        C10218f c10218f = (C10218f) this.f32345c.mo10598u();
        RoomDatabase roomDatabase = c10218f.f51632a;
        roomDatabase.m4551b();
        roomDatabase.m4552c();
        try {
            c10218f.f51635d.m13169e(downloadInfo);
            roomDatabase.m4568s();
        } finally {
            roomDatabase.m4563n();
        }
    }

    @Override // p489xk.InterfaceC10219g
    /* JADX INFO: renamed from: n */
    public final void mo10628n() {
        m10618b();
        C0125l c0125l = this.f32352j;
        InterfaceC2052l<C0125l, C9072e> interfaceC2052l = new InterfaceC2052l<C0125l, C9072e>() { // from class: com.tonyodev.fetch2.database.FetchDatabaseManagerImpl$sanitizeOnFirstEntry$1
            {
                super(1);
            }

            @Override // cm.InterfaceC2052l
            /* JADX INFO: renamed from: n */
            public final C9072e mo528n(C0125l c0125l2) {
                C0125l c0125l3 = c0125l2;
                C5207g.m11112g(c0125l3, "it");
                if (!c0125l3.f326b) {
                    FetchDatabaseManagerImpl fetchDatabaseManagerImpl = this.f32355b;
                    fetchDatabaseManagerImpl.m10617a(fetchDatabaseManagerImpl.get(), true);
                    c0125l3.f326b = true;
                }
                return C9072e.f47360a;
            }
        };
        c0125l.getClass();
        synchronized (c0125l.f325a) {
            try {
                interfaceC2052l.mo528n(c0125l);
                C9072e c9072e = C9072e.f47360a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p489xk.InterfaceC10219g
    /* JADX INFO: renamed from: v1 */
    public final long mo10629v1(boolean z10) {
        try {
            Cursor cursorMo4599o0 = this.f32346d.mo4599o0(z10 ? this.f32348f : this.f32347e);
            long count = cursorMo4599o0 != null ? cursorMo4599o0.getCount() : -1L;
            if (cursorMo4599o0 != null) {
                cursorMo4599o0.close();
            }
            return count;
        } catch (Exception unused) {
            return -1L;
        }
    }
}
