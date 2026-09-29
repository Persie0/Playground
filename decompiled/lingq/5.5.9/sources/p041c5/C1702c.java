package p041c5;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import com.google.android.gms.internal.measurement.AbstractC2886w4;
import com.google.android.gms.internal.measurement.C2741l4;
import com.google.android.gms.internal.measurement.InterfaceC2588a5;
import com.tonyodev.fetch2.Download;
import com.tonyodev.fetch2.database.DownloadInfo;
import dm.C5207g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.TypeCastException;
import p007a6.C0028g;
import p110f6.InterfaceC5471b;
import p148h7.C5899b;
import p148h7.InterfaceC5898a;
import p356r5.C8735e;
import p389t2.C9187f;
import p392t5.InterfaceC9207m;
import p489xk.C10221i;

/* JADX INFO: renamed from: c5.c */
/* JADX INFO: loaded from: classes.dex */
public final class C1702c implements InterfaceC5471b, InterfaceC5898a, InterfaceC2588a5 {

    /* JADX INFO: renamed from: a */
    public final Object f9487a;

    public C1702c() {
        this.f9487a = C9187f.m17522a(Looper.getMainLooper());
    }

    public C1702c(int i10) {
        this.f9487a = new ArrayList(i10);
    }

    public C1702c(Resources resources) {
        this.f9487a = resources;
    }

    public /* synthetic */ C1702c(Object obj) {
        this.f9487a = obj;
    }

    public C1702c(C10221i c10221i) {
        this.f9487a = c10221i;
    }

    @Override // p148h7.InterfaceC5898a
    /* JADX INFO: renamed from: a */
    public final void mo5435a(C5899b c5899b) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(c5899b.f35236a));
            contentValues.put("url", c5899b.f35237b);
            contentValues.put("etag", c5899b.f35238c);
            contentValues.put("dir_path", c5899b.f35239d);
            contentValues.put("file_name", c5899b.f35240e);
            contentValues.put("total_bytes", Long.valueOf(c5899b.f35241f));
            contentValues.put("downloaded_bytes", Long.valueOf(c5899b.f35242g));
            contentValues.put("last_modified_at", Long.valueOf(c5899b.f35243h));
            ((SQLiteDatabase) this.f9487a).insert("prdownloader", null, contentValues);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // p110f6.InterfaceC5471b
    /* JADX INFO: renamed from: b */
    public final InterfaceC9207m mo65b(InterfaceC9207m interfaceC9207m, C8735e c8735e) {
        Resources resources = (Resources) this.f9487a;
        if (interfaceC9207m == null) {
            return null;
        }
        return new C0028g(resources, interfaceC9207m);
    }

    /* JADX INFO: renamed from: c */
    public final void m5436c(Object obj) {
        ((ArrayList) this.f9487a).add(obj);
    }

    @Override // p148h7.InterfaceC5898a
    /* JADX INFO: renamed from: d */
    public final void mo5437d(int i10, long j10, long j11) {
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("downloaded_bytes", Long.valueOf(j10));
            contentValues.put("last_modified_at", Long.valueOf(j11));
            ((SQLiteDatabase) this.f9487a).update("prdownloader", contentValues, "id = ? ", new String[]{String.valueOf(i10)});
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m5438e(Object obj) {
        if (obj == null) {
            return;
        }
        boolean z10 = obj instanceof Object[];
        Object obj2 = this.f9487a;
        if (z10) {
            Object[] objArr = (Object[]) obj;
            if (objArr.length > 0) {
                ((ArrayList) obj2).ensureCapacity(((ArrayList) obj2).size() + objArr.length);
                Collections.addAll((ArrayList) obj2, objArr);
            }
        } else {
            if (obj instanceof Collection) {
                ((ArrayList) obj2).addAll((Collection) obj);
                return;
            }
            if (obj instanceof Iterable) {
                Iterator it = ((Iterable) obj).iterator();
                while (it.hasNext()) {
                    ((ArrayList) obj2).add(it.next());
                }
            } else {
                if (!(obj instanceof Iterator)) {
                    throw new UnsupportedOperationException("Don't know how to spread " + obj.getClass());
                }
                Iterator it2 = (Iterator) obj;
                while (it2.hasNext()) {
                    ((ArrayList) obj2).add(it2.next());
                }
            }
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // p148h7.InterfaceC5898a
    /* JADX INFO: renamed from: f */
    public final List mo5439f(int i10) {
        ArrayList arrayList = new ArrayList();
        long j10 = ((long) (i10 * 24 * 60 * 60)) * 1000;
        Cursor cursorRawQuery = null;
        try {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis() - j10;
                cursorRawQuery = ((SQLiteDatabase) this.f9487a).rawQuery("SELECT * FROM prdownloader WHERE last_modified_at <= " + jCurrentTimeMillis, null);
                if (cursorRawQuery != null && cursorRawQuery.moveToFirst()) {
                    do {
                        C5899b c5899b = new C5899b();
                        c5899b.f35236a = cursorRawQuery.getInt(cursorRawQuery.getColumnIndex("id"));
                        c5899b.f35237b = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("url"));
                        c5899b.f35238c = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("etag"));
                        c5899b.f35239d = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("dir_path"));
                        c5899b.f35240e = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("file_name"));
                        c5899b.f35241f = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("total_bytes"));
                        c5899b.f35242g = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("downloaded_bytes"));
                        c5899b.f35243h = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("last_modified_at"));
                        arrayList.add(c5899b);
                    } while (cursorRawQuery.moveToNext());
                }
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
            } catch (Exception e10) {
                e10.printStackTrace();
                if (cursorRawQuery != null) {
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX INFO: renamed from: g */
    public final ArrayList m5440g(int i10, Download download) {
        C5207g.m11112g(download, "download");
        List<DownloadInfo> listMo10613K0 = ((C10221i) this.f9487a).mo10613K0(i10);
        if (listMo10613K0 == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.util.ArrayList<com.tonyodev.fetch2.Download>");
        }
        ArrayList arrayList = (ArrayList) listMo10613K0;
        Iterator it = arrayList.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (((Download) it.next()).getF32331a() == download.getF32331a()) {
                break;
            }
            i11++;
        }
        if (i11 != -1) {
            arrayList.set(i11, download);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public final int m5441h() {
        return ((ArrayList) this.f9487a).size();
    }

    /* JADX INFO: renamed from: i */
    public final Object[] m5442i(Object[] objArr) {
        return ((ArrayList) this.f9487a).toArray(objArr);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x009c  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p148h7.InterfaceC5898a
    /* JADX INFO: renamed from: k */
    public final C5899b mo5443k(int i10) throws Throwable {
        C5899b c5899b;
        Cursor cursorRawQuery;
        C5899b c5899b2 = null;
        c5899b2 = null;
        C5899b c5899b3 = null;
        Cursor cursor = null;
        try {
            try {
                cursorRawQuery = ((SQLiteDatabase) this.f9487a).rawQuery("SELECT * FROM prdownloader WHERE id = " + i10, null);
                if (cursorRawQuery != 0) {
                    try {
                        try {
                            if (cursorRawQuery.moveToFirst()) {
                                C5899b c5899b4 = new C5899b();
                                try {
                                    c5899b4.f35236a = i10;
                                    c5899b4.f35237b = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("url"));
                                    c5899b4.f35238c = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("etag"));
                                    c5899b4.f35239d = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("dir_path"));
                                    c5899b4.f35240e = cursorRawQuery.getString(cursorRawQuery.getColumnIndex("file_name"));
                                    c5899b4.f35241f = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("total_bytes"));
                                    c5899b4.f35242g = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("downloaded_bytes"));
                                    c5899b4.f35243h = cursorRawQuery.getLong(cursorRawQuery.getColumnIndex("last_modified_at"));
                                    c5899b2 = c5899b4;
                                } catch (Exception e10) {
                                    e = e10;
                                    c5899b3 = c5899b4;
                                    C5899b c5899b5 = c5899b3;
                                    cursor = cursorRawQuery;
                                    c5899b = c5899b5;
                                    e.printStackTrace();
                                    if (cursor != null) {
                                        cursor.close();
                                    }
                                    c5899b2 = c5899b;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            if (cursorRawQuery != 0) {
                                cursorRawQuery.close();
                            }
                            throw th;
                        }
                    } catch (Exception e11) {
                        e = e11;
                    }
                }
                if (cursorRawQuery != 0) {
                    cursorRawQuery.close();
                }
            } catch (Throwable th3) {
                th = th3;
                cursorRawQuery = c5899b2;
            }
        } catch (Exception e12) {
            e = e12;
            c5899b = null;
        }
        return c5899b2;
    }

    @Override // p148h7.InterfaceC5898a
    public final void remove(int i10) {
        try {
            ((SQLiteDatabase) this.f9487a).execSQL("DELETE FROM prdownloader WHERE id = " + i10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC2588a5
    public final Object zza() {
        Context context = (Context) this.f9487a;
        Object obj = AbstractC2886w4.f14484f;
        return C2741l4.m8048a(context);
    }
}
