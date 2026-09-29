package p000;

import android.content.Context;
import com.lingq.feature.onboarding.p014v2.domain.MiniLessonTemplate;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes.dex */
public final class qm3 {
    private static final pm3 Companion = new pm3();

    /* JADX INFO: renamed from: a */
    public final Context f57943a;

    /* JADX INFO: renamed from: b */
    public final df4 f57944b;

    public qm3(Context context, df4 df4Var) {
        df4Var.getClass();
        this.f57943a = context;
        this.f57944b = df4Var;
    }

    /* JADX INFO: renamed from: a */
    public final MiniLessonTemplate m20026a(String str) {
        if (str.length() == 0) {
            return null;
        }
        try {
            InputStream inputStreamOpen = this.f57943a.getAssets().open(wq1.m24118n("mini_lesson_templates/", str, ".json"));
            try {
                inputStreamOpen.getClass();
                String strM4066s0 = bq1.m4066s0(new BufferedReader(new InputStreamReader(inputStreamOpen, yu0.f70463a), 8192));
                df4 df4Var = this.f57944b;
                df4Var.getClass();
                MiniLessonTemplate miniLessonTemplate = (MiniLessonTemplate) df4Var.m10321a(strM4066s0, MiniLessonTemplate.Companion.serializer());
                inputStreamOpen.close();
                return miniLessonTemplate;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    AbstractC3584sr.m21646y(inputStreamOpen, th);
                    throw th2;
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }
}
