package p000;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.camera.stats.Instrumentation;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import com.google.android.apps.camera.zoomui.view.WdNM.xPAWq;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class hoe implements hod {

    /* JADX INFO: renamed from: b */
    private final File f28568b = new File("/sdcard/camera_test_score/");

    /* JADX INFO: renamed from: c */
    private final Instrumentation f28569c;

    public hoe(Instrumentation instrumentation) {
        this.f28569c = instrumentation;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.hod
    /* JADX INFO: renamed from: a */
    public final void mo10530a(Intent intent) {
        mws mwsVarM17081f;
        mrm mrmVarM16829i;
        mrm mrmVarM16829i2;
        JSONObject jSONObject;
        JSONArray jSONArray;
        int iM10531b;
        Bundle extras = intent.getExtras();
        if (extras == null) {
            ((nbe) ((nbe) f28567a.m17252c()).mo17276G((char) 3783)).mo17290o("Intent needs some extra parameters");
        }
        String string = extras.getString("com.google.android.apps.camera.testing.prod.scoreprint.SCORE_TYPE");
        if (string == null) {
            ((nbe) ((nbe) hod.f28567a.m17252c()).mo17276G((char) 3778)).mo17290o("No score type given");
            int i = mws.f41739d;
            mwsVarM17081f = mzr.f41857a;
        } else {
            try {
                mwn mwnVarM17090e = mws.m17090e();
                Iterator it = msa.m16847c(",").m16849d(string).iterator();
                while (it.hasNext()) {
                    mwnVarM17090e.m17082g((hoc) Enum.valueOf(hoc.class, (String) it.next()));
                }
                mwsVarM17081f = mwnVarM17090e.m17081f();
            } catch (IllegalArgumentException e) {
                ((nbe) ((nbe) ((nbe) hod.f28567a.m17252c()).mo17283h(e)).mo17276G((char) 3777)).mo17293r("Unknown type:%s", string);
                int i2 = mws.f41739d;
                mwsVarM17081f = mzr.f41857a;
            }
        }
        if (mwsVarM17081f.isEmpty()) {
            return;
        }
        String string2 = extras.getString("com.google.android.apps.camera.testing.prod.scoreprint.OUT_FILE_NAME");
        if (string2 == null) {
            ((nbe) ((nbe) hod.f28567a.m17252c()).mo17276G((char) 3776)).mo17290o("No file name given");
            mrmVarM16829i = mqu.f41450a;
        } else {
            mrmVarM16829i = mrm.m16829i(string2);
        }
        if (!mrmVarM16829i.mo16813g() || ((String) mrmVarM16829i.mo16809c()).contains(File.separator)) {
            ((nbe) ((nbe) f28567a.m17251b()).mo17276G((char) 3782)).mo17293r("Wrong file name: %s", mrmVarM16829i);
            return;
        }
        File file = new File(this.f28568b, (String) mrmVarM16829i.mo16809c());
        if (file.exists()) {
            try {
                mrmVarM16829i2 = mrm.m16829i(new String(nea.m17394h(file)));
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        } else {
            mrmVarM16829i2 = mqu.f41450a;
        }
        if (mrmVarM16829i2.mo16813g()) {
            try {
                jSONObject = new JSONObject((String) mrmVarM16829i2.mo16809c());
            } catch (JSONException e3) {
                ((nbe) ((nbe) ((nbe) f28567a.m17252c()).mo17283h(e3)).mo17276G((char) 3781)).mo17293r("Invalid JSON data: %s", mrmVarM16829i2.mo16809c());
                jSONObject = new JSONObject();
            }
        } else {
            jSONObject = new JSONObject();
        }
        try {
            nba it2 = mwsVarM17081f.iterator();
            while (it2.hasNext()) {
                hoc hocVar = (hoc) it2.next();
                String strName = hocVar.name();
                try {
                    jSONArray = jSONObject.getJSONArray(strName);
                } catch (JSONException e4) {
                    ((nbe) ((nbe) ((nbe) f28567a.m17251b()).mo17283h(e4)).mo17276G((char) 3780)).mo17293r("The value is not an array: %s", jSONObject);
                    jSONArray = new JSONArray();
                }
                switch (hocVar) {
                    case FIRST_PREVIEW_FRAME:
                        iM10531b = m10531b(hkp.ACTIVITY_FIRST_PREVIEW_FRAME_RENDERED);
                        continue;
                        jSONArray.put(iM10531b);
                        jSONObject.put(strName, jSONArray);
                        break;
                    case SHUTTER_BUTTON_ENABLED:
                        iM10531b = m10531b(hkp.ACTIVITY_SHUTTER_BUTTON_ENABLED);
                        continue;
                        jSONArray.put(iM10531b);
                        jSONObject.put(strName, jSONArray);
                        break;
                    default:
                        throw new AssertionError(xPAWq.qUxCoLjI.concat(String.valueOf(String.valueOf(hocVar))));
                }
                throw new RuntimeException(e);
            }
            String string3 = jSONObject.toString();
            File parentFile = file.getParentFile();
            lku.m15662p(parentFile);
            parentFile.mkdirs();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
                try {
                    bufferedWriter.write(string3);
                    bufferedWriter.newLine();
                    bufferedWriter.close();
                } catch (Throwable th) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th2) {
                        try {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        } catch (Exception e5) {
                        }
                    }
                    throw th;
                }
            } catch (IOException e6) {
                throw new RuntimeException(e6);
            }
        } catch (JSONException e7) {
            throw new RuntimeException(e7);
        }
    }

    /* JADX INFO: renamed from: b */
    final int m10531b(hkp hkpVar) {
        if (!this.f28569c.m4299e(CameraActivityTiming.class)) {
            ((nbe) ((nbe) f28567a.m17252c()).mo17276G((char) 3779)).mo17290o("No CameraActivitySession has recorded.");
            return 0;
        }
        CameraActivityTiming cameraActivityTiming = (CameraActivityTiming) this.f28569c.m4296a(CameraActivityTiming.class);
        return (int) TimeUnit.NANOSECONDS.toMillis(cameraActivityTiming.m10436g(hkpVar) - cameraActivityTiming.f28241m);
    }
}
