package p000;

import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Handler;
import android.util.Log;
import java.util.Iterator;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class kup extends AsyncTask {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ kuq f37243a;

    /* JADX INFO: renamed from: b */
    private int f37244b;

    /* JADX INFO: renamed from: c */
    private int f37245c;

    public kup(kuq kuqVar) {
        this.f37243a = kuqVar;
    }

    /* JADX INFO: renamed from: b */
    private final int m14901b(String str) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        try {
            if (this.f37243a.f37250d.getApplicationInfo("com.google.android.googlequicksearchbox", 0).enabled) {
                try {
                    try {
                        cursorQuery = this.f37243a.f37249c.getContentResolver().query(Uri.parse(str), null, null, null, null);
                        if (cursorQuery != null) {
                            try {
                                if (cursorQuery.getCount() != 0) {
                                    if (!cursorQuery.moveToFirst()) {
                                        cursorQuery.close();
                                        return 16;
                                    }
                                    if (cursorQuery.getType(0) != 3) {
                                        cursorQuery.close();
                                        return 17;
                                    }
                                    try {
                                        int i = Integer.parseInt(cursorQuery.getString(0));
                                        if (i > 12 || i < -1) {
                                            Log.e("LensSdkParamsReader", "Failed to start Lens: Error " + i);
                                            i = 12;
                                        }
                                        int iM15691k = lle.m15691k(i);
                                        cursorQuery.close();
                                        return iM15691k;
                                    } catch (NumberFormatException e) {
                                        Log.e("LensSdkParamsReader", "Unable to parse Lens version code value.", e);
                                        cursorQuery.close();
                                        return 18;
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                throw th;
                            }
                        }
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return 6;
                    } catch (Exception e2) {
                        Log.e("LensSdkParamsReader", "Failed to start Lens due to unexpected exception.", e2);
                        return 6;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    cursorQuery = null;
                }
            }
        } catch (PackageManager.NameNotFoundException e3) {
            Log.e("LensSdkParamsReader", "Unable to find agsa package: com.google.android.googlequicksearchbox");
        }
        return 3;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ Object doInBackground(Object[] objArr) {
        this.f37244b = m14901b(kuq.f37246a);
        this.f37245c = m14901b(kuq.f37247b);
        return null;
    }

    @Override // android.os.AsyncTask
    protected final /* bridge */ /* synthetic */ void onPostExecute(Object obj) {
        m14902a(this.f37244b, this.f37245c);
    }

    @Override // android.os.AsyncTask
    protected final void onPreExecute() {
        new Handler(this.f37243a.f37249c.getMainLooper()).postDelayed(new jzq(this, 20), 4000L);
    }

    /* JADX INFO: renamed from: a */
    public final void m14902a(int i, int i2) {
        if (i == 0 || i2 == 0) {
            throw null;
        }
        kuq kuqVar = this.f37243a;
        kvb kvbVar = kuqVar.f37252f;
        nxl nxlVar = (nxl) kvbVar.m18143ad(5);
        nxlVar.m18108s(kvbVar);
        if (!nxlVar.f44974b.m18142ac()) {
            nxlVar.mo18106p();
        }
        kvb kvbVar2 = (kvb) nxlVar.f44974b;
        kvb kvbVar3 = kvb.f37309f;
        kvbVar2.f37314d = i - 2;
        kvbVar2.f37311a |= 4;
        if (!nxlVar.f44974b.m18142ac()) {
            nxlVar.mo18106p();
        }
        kvb kvbVar4 = (kvb) nxlVar.f44974b;
        kvbVar4.f37315e = i2 - 2;
        kvbVar4.f37311a |= 8;
        kuqVar.f37252f = (kvb) nxlVar.mo18103l();
        kuq kuqVar2 = this.f37243a;
        kuqVar2.f37253g = true;
        Iterator it = kuqVar2.f37251e.iterator();
        while (it.hasNext()) {
            ((kuo) it.next()).mo14900a(this.f37243a.f37252f);
        }
        this.f37243a.f37251e.clear();
    }
}
