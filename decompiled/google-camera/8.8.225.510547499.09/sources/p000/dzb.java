package p000;

import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class dzb implements dzd {

    /* JADX INFO: renamed from: a */
    private final UriMatcher f12954a;

    /* JADX INFO: renamed from: b */
    private final dzr f12955b;

    /* JADX INFO: renamed from: c */
    private final dyy f12956c;

    public dzb(dyy dyyVar, UriMatcher uriMatcher, dzr dzrVar) {
        this.f12956c = dyyVar;
        this.f12954a = uriMatcher;
        this.f12955b = dzrVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:31:0x009c  */
    /* JADX WARN: Code duplicated, block: B:35:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:40:0x00df  */
    /* JADX WARN: Code duplicated, block: B:43:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        if (r7.equals("progress_percentage") == true) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008e, code lost:
    
        if (r7.equals("special_type_id") == true) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0098, code lost:
    
        if (r7.equals("progress_status") == true) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00af, code lost:
    
        throw new java.lang.IllegalArgumentException("invalid projection: ".concat(java.lang.String.valueOf(r7)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b0, code lost:
    
        r8 = r11.f12955b.mo6972a(r1.f12937a.f26865a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00be, code lost:
    
        if (r8.mo16813g() != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c0, code lost:
    
        r2[r5] = ((p000.dzk) r8.mo16809c()).m6969d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00cd, code lost:
    
        r2[r5] = r1.m6946c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00d4, code lost:
    
        r2[r5] = java.lang.Integer.valueOf(r1.m6950g());
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00df, code lost:
    
        r2[r5] = java.lang.Long.valueOf(r1.f12937a.f26865a);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e9, code lost:
    
        r3.append(r7);
        r3.append(": ");
        r3.append(r2[r5]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f8, code lost:
    
        if (r5 < (r6 - 1)) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00fa, code lost:
    
        r3.append(com.google.android.apps.camera.zoomui.view.WdNM.xPAWq.zvkeigyex);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0100, code lost:
    
        r5 = r5 + 1;
     */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r8v19 mrm, still in use, count: 2, list:
      (r8v19 mrm) from 0x00ba: INVOKE (r8v19 mrm) VIRTUAL call: mrm.g():boolean A[MD:():boolean (m), WRAPPED] (LINE:15)
      (r8v19 mrm) from 0x00c0: INVOKE (r8v19 mrm) VIRTUAL call: mrm.c():java.lang.Object A[MD:():java.lang.Object (m), WRAPPED] (LINE:16)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.perform(InsnRemover.java:75)
    	at jadx.core.utils.InsnRemover.removeAllMarked(InsnRemover.java:276)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:354)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    @Override // p000.dzd
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Cursor mo6958a(Uri uri, String[] strArr) {
        List<dyw> listM6954c;
        byte b;
        strArr.getClass();
        switch (this.f12954a.match(uri)) {
            case 7:
                listM6954c = this.f12956c.m6954c();
                break;
            case 8:
                long jM6938a = dyv.m6938a(uri);
                listM6954c = new ArrayList();
                mrm mrmVarM6952a = this.f12956c.m6952a(jM6938a);
                if (mrmVarM6952a.mo16813g()) {
                    listM6954c.add((dyw) mrmVarM6952a.mo16809c());
                }
                break;
            default:
                throw new IllegalArgumentException("Unrecognized uri: ".concat(String.valueOf(String.valueOf(uri))));
        }
        MatrixCursor matrixCursor = new MatrixCursor(strArr);
        for (dyw dywVar : listM6954c) {
            Object[] objArr = new Object[strArr.length];
            StringBuilder sb = new StringBuilder("{");
            int i = 0;
            while (true) {
                int length = strArr.length;
                if (i < length) {
                    String str = strArr[i];
                    switch (str) {
                        case "progress_status":
                            b = 1;
                        case "special_type_id":
                            b = 3;
                        case "progress_percentage":
                            b = 2;
                        case "media_store_id":
                            b = 0;
                        default:
                            b = -1;
                    }
                }
            }
            sb.append("}");
            matrixCursor.addRow(objArr);
        }
        return matrixCursor;
    }
}
