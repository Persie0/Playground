package com.google.android.apps.camera.legacy.app.settings;

import android.database.Cursor;
import android.database.MatrixCursor;
import android.preference.Preference;
import android.provider.SearchIndexablesContract;
import android.provider.SearchIndexablesProvider;
import android.view.accessibility.AccessibilityManager;
import com.google.android.apps.camera.bottombar.C0100R;
import java.util.Collection;
import p000.cwd;
import p000.etq;
import p000.ewq;
import p000.mtp;
import p000.mtq;
import p000.nbe;
import p000.nbh;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class CameraSearchIndexablesProvider extends SearchIndexablesProvider {

    /* JADX INFO: renamed from: a */
    private static final nbh f6793a = nbh.m17259h("com/google/android/apps/camera/legacy/app/settings/CameraSearchIndexablesProvider");

    /* JADX INFO: renamed from: b */
    private ewq f6794b;

    /* JADX INFO: renamed from: c */
    private boolean f6795c = false;

    /* JADX INFO: renamed from: a */
    private final synchronized ewq m4197a() {
        boolean z = this.f6795c;
        boolean zIsTouchExplorationEnabled = ((AccessibilityManager) getContext().getSystemService("accessibility")).isTouchExplorationEnabled();
        this.f6795c = zIsTouchExplorationEnabled;
        if (this.f6794b == null || z != zIsTouchExplorationEnabled) {
            ewq ewqVarMo7844a = ((etq) getContext().getApplicationContext()).mo4194f().mo7786j(new cwd(getContext(), (byte[]) null)).mo7844a();
            this.f6794b = ewqVarMo7844a;
            ewqVarMo7844a.m7953a(getContext());
        }
        return this.f6794b;
    }

    /* JADX INFO: renamed from: b */
    private final String m4198b() {
        return getContext().getApplicationInfo().packageName;
    }

    /* JADX INFO: renamed from: c */
    private final Object[] m4199c(String str, String str2, String str3) {
        Object[] objArr = new Object[SearchIndexablesContract.INDEXABLES_RAW_COLUMNS.length];
        objArr[12] = str3;
        objArr[1] = str;
        objArr[2] = str2;
        objArr[8] = Integer.valueOf(C0100R.drawable.ic_camera);
        objArr[9] = "com.android.settings.action.EXTRA_SETTINGS";
        objArr[10] = m4198b();
        objArr[11] = CameraSettingsActivity.class.getName();
        return objArr;
    }

    public final boolean onCreate() {
        ((nbe) ((nbe) f6793a.m17252c()).mo17276G((char) 2011)).mo17290o("Called onCreate");
        return true;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, java.util.List] */
    public final Cursor queryNonIndexableKeys(String[] strArr) {
        ((nbe) ((nbe) f6793a.m17252c()).mo17276G((char) 2006)).mo17290o("Called queryNonIndexableKeys");
        MatrixCursor matrixCursor = new MatrixCursor(SearchIndexablesContract.NON_INDEXABLES_KEYS_COLUMNS);
        for (String str : m4197a().f20676j) {
            Object[] objArr = new Object[SearchIndexablesContract.NON_INDEXABLES_KEYS_COLUMNS.length];
            objArr[0] = str;
            matrixCursor.addRow(objArr);
        }
        return matrixCursor;
    }

    public final Cursor queryRawData(String[] strArr) {
        ((nbe) ((nbe) f6793a.m17252c()).mo17276G((char) 2008)).mo17290o("Called queryRawData");
        String string = getContext().getString(C0100R.string.app_name);
        MatrixCursor matrixCursor = new MatrixCursor(SearchIndexablesContract.INDEXABLES_RAW_COLUMNS);
        matrixCursor.addRow(m4199c(string, getContext().getString(C0100R.string.mode_settings), "camera_settings"));
        mtq mtqVar = (mtq) m4197a().f20680n;
        Collection<Preference> mtpVar = mtqVar.f41604d;
        if (mtpVar == null) {
            mtpVar = new mtp(mtqVar);
            mtqVar.f41604d = mtpVar;
        }
        for (Preference preference : mtpVar) {
            preference.getTitle();
            preference.getSummary();
            preference.getKey();
            matrixCursor.addRow(m4199c(preference.getTitle().toString(), preference.getSummary().toString(), preference.getKey()));
        }
        return matrixCursor;
    }

    public final Cursor queryXmlResources(String[] strArr) {
        ((nbe) ((nbe) f6793a.m17252c()).mo17276G((char) 2010)).mo17290o("Called queryXmlResources");
        MatrixCursor matrixCursor = new MatrixCursor(SearchIndexablesContract.INDEXABLES_XML_RES_COLUMNS);
        Object[] objArr = new Object[SearchIndexablesContract.INDEXABLES_XML_RES_COLUMNS.length];
        objArr[0] = 1;
        objArr[1] = Integer.valueOf(C0100R.xml.camera_preferences);
        objArr[2] = null;
        objArr[3] = 0;
        objArr[4] = "android.intent.action.MAIN";
        objArr[5] = m4198b();
        objArr[6] = CameraSettingsActivity.class.getName();
        matrixCursor.addRow(objArr);
        return matrixCursor;
    }
}
