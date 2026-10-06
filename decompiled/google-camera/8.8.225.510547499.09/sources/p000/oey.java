package p000;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.CursorIndexOutOfBoundsException;
import android.net.Uri;
import android.os.RemoteException;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.common.annotation.HJo.JrxsYuVZZqnFC;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class oey implements ofm {

    /* JADX INFO: renamed from: a */
    private static final String f45817a = oey.class.getSimpleName();

    /* JADX INFO: renamed from: b */
    private final ContentProviderClient f45818b;

    /* JADX INFO: renamed from: c */
    private final Uri f45819c;

    /* JADX INFO: renamed from: d */
    private final Uri f45820d;

    /* JADX INFO: renamed from: e */
    private final Uri f45821e;

    /* JADX INFO: renamed from: f */
    private final Uri f45822f;

    public oey(ContentProviderClient contentProviderClient, String str) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException(JrxsYuVZZqnFC.guMypkNZpFYo);
        }
        this.f45818b = contentProviderClient;
        this.f45819c = lkm.m15569J(str, "device_params");
        this.f45820d = lkm.m15569J(str, "user_prefs");
        this.f45821e = lkm.m15569J(str, "phone_params");
        this.f45822f = lkm.m15569J(str, "sdk_configuration_params");
        lkm.m15569J(str, "recent_headsets");
    }

    /* JADX INFO: renamed from: g */
    private final nyw m18448g(nyv nyvVar, Uri uri, String str) throws Throwable {
        byte[] bArrM18449h = m18449h(uri, str);
        if (bArrM18449h == null) {
            return null;
        }
        try {
            return nyvVar.mo17753d(bArrM18449h).mo18103l();
        } catch (nyb e) {
            Log.e(f45817a, "Error reading params from ContentProvider", e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x005a  */
    /* JADX WARN: Code duplicated, block: B:38:0x0062  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX INFO: renamed from: h */
    private final byte[] m18449h(Uri uri, String str) throws Throwable {
        Cursor cursorQuery;
        ?? r0 = 0;
        try {
            try {
                cursorQuery = this.f45818b.query(uri, null, str, null, null);
                if (cursorQuery != null) {
                    try {
                        if (cursorQuery.moveToFirst()) {
                            byte[] blob = cursorQuery.getBlob(0);
                            if (blob == null) {
                                cursorQuery.close();
                                return null;
                            }
                            cursorQuery.close();
                            return blob;
                        }
                    } catch (CursorIndexOutOfBoundsException e) {
                        e = e;
                        Log.e(f45817a, "Error reading params from ContentProvider", e);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    } catch (RemoteException e2) {
                        e = e2;
                        Log.e(f45817a, "Error reading params from ContentProvider", e);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    } catch (IllegalArgumentException e3) {
                        e = e3;
                        Log.e(f45817a, "Error reading params from ContentProvider", e);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return null;
                    }
                }
                Log.e(f45817a, "Invalid params result from ContentProvider query: " + String.valueOf(uri));
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return null;
            } catch (Throwable th) {
                th = th;
                r0 = str;
                if (r0 != 0) {
                    r0.close();
                }
                throw th;
            }
        } catch (CursorIndexOutOfBoundsException e4) {
            e = e4;
            cursorQuery = null;
            Log.e(f45817a, "Error reading params from ContentProvider", e);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (RemoteException e5) {
            e = e5;
            cursorQuery = null;
            Log.e(f45817a, "Error reading params from ContentProvider", e);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (IllegalArgumentException e6) {
            e = e6;
            cursorQuery = null;
            Log.e(f45817a, "Error reading params from ContentProvider", e);
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            return null;
        } catch (Throwable th2) {
            th = th2;
            if (r0 != 0) {
                r0.close();
            }
            throw th;
        }
    }

    @Override // p000.ofm
    /* JADX INFO: renamed from: a */
    public final ngy mo18450a(ofx ofxVar) {
        String strEncodeToString = Base64.encodeToString(ofxVar.mo17760J(), 0);
        ngy ngyVar = ofq.f45869c;
        nxl nxlVar = (nxl) ngyVar.m18143ad(5);
        nxlVar.m18108s(ngyVar);
        return (ngy) m18448g(nxlVar, this.f45822f, strEncodeToString);
    }

    @Override // p000.ofm
    /* JADX INFO: renamed from: b */
    public final ofu mo18451b() {
        return (ofu) m18448g(ofu.f45881a.m18137O(), this.f45819c, null);
    }

    @Override // p000.ofm
    /* JADX INFO: renamed from: c */
    public final ofv mo18452c() {
        return (ofv) m18448g(ofv.f45883e.m18137O(), this.f45821e, null);
    }

    @Override // p000.ofm
    /* JADX INFO: renamed from: d */
    public final ofw mo18453d() {
        return (ofw) m18448g(ofw.f45889a.m18137O(), this.f45820d, null);
    }

    @Override // p000.ofm
    /* JADX INFO: renamed from: e */
    public final void mo18454e() {
        this.f45818b.close();
    }

    @Override // p000.ofm
    /* JADX INFO: renamed from: f */
    public final boolean mo18455f(ofu ofuVar) {
        int iUpdate;
        Uri uri = this.f45819c;
        try {
            if (ofuVar == null) {
                iUpdate = this.f45818b.delete(uri, null, null);
            } else {
                ContentValues contentValues = new ContentValues();
                contentValues.put("value", ofuVar.mo17760J());
                iUpdate = this.f45818b.update(uri, contentValues, null, null);
            }
            return iUpdate > 0;
        } catch (RemoteException e) {
            Log.e(f45817a, "Failed to write params to ContentProvider", e);
            return false;
        } catch (SecurityException e2) {
            Log.e(f45817a, "Insufficient permissions to write params to ContentProvider", e2);
            return false;
        }
    }
}
