package p000;

import android.os.Bundle;
import androidx.datastore.preferences.protobuf.DescriptorProtos;
import com.lingq.core.analytics.C1240a;
import com.lingq.core.analytics.data.LqAnalyticsValues$LessonExitPath;
import com.lingq.core.analytics.data.modules.LessonEngagedDataType;
import com.lingq.core.analytics.data.modules.ReaderMode;
import java.util.Arrays;
import java.util.List;
import org.joda.time.DateTime;

/* JADX INFO: loaded from: classes.dex */
public final class a25 implements y15 {

    /* JADX INFO: renamed from: a */
    public final hm5 f92a;

    /* JADX INFO: renamed from: b */
    public x65 f93b;

    /* JADX INFO: renamed from: c */
    public int f94c;

    /* JADX INFO: renamed from: d */
    public int f95d;

    /* JADX INFO: renamed from: e */
    public int f96e;

    /* JADX INFO: renamed from: f */
    public int f97f;

    /* JADX INFO: renamed from: g */
    public int f98g;

    /* JADX INFO: renamed from: h */
    public int f99h;

    /* JADX INFO: renamed from: i */
    public int[] f100i;

    /* JADX INFO: renamed from: j */
    public int f101j;

    /* JADX INFO: renamed from: k */
    public int f102k;

    /* JADX INFO: renamed from: l */
    public double f103l;

    /* JADX INFO: renamed from: m */
    public double f104m;

    /* JADX INFO: renamed from: n */
    public int f105n;

    /* JADX INFO: renamed from: o */
    public int f106o;

    /* JADX INFO: renamed from: p */
    public int f107p;

    /* JADX INFO: renamed from: q */
    public int f108q;

    /* JADX INFO: renamed from: r */
    public int f109r;

    /* JADX INFO: renamed from: s */
    public ReaderMode f110s;

    /* JADX INFO: renamed from: t */
    public DateTime f111t;

    public a25(hm5 hm5Var, un1 un1Var, nn1 nn1Var) {
        hm5Var.getClass();
        un1Var.getClass();
        this.f92a = hm5Var;
    }

    @Override // p000.y15
    /* JADX INFO: renamed from: F0 */
    public final void mo46F0(ReaderMode readerMode) {
        readerMode.getClass();
        this.f110s = readerMode;
    }

    @Override // p000.y15
    /* JADX INFO: renamed from: b */
    public final void mo47b(DateTime dateTime) {
        this.f111t = dateTime;
    }

    @Override // p000.y15
    /* JADX INFO: renamed from: n1 */
    public final void mo48n1(String str, x65 x65Var) {
        str.getClass();
        this.f93b = x65Var;
    }

    @Override // p000.y15
    /* JADX INFO: renamed from: u1 */
    public final void mo49u1(LessonEngagedDataType lessonEngagedDataType, Number number) {
        lessonEngagedDataType.getClass();
        switch (z15.f70748b[lessonEngagedDataType.ordinal()]) {
            case 1:
                this.f94c = ((Integer) number).intValue();
                break;
            case 2:
                this.f95d = ((Integer) number).intValue() + this.f95d;
                break;
            case 3:
                this.f96e = ((Integer) number).intValue();
                break;
            case 4:
                this.f97f = ((Integer) number).intValue() + this.f97f;
                break;
            case 5:
                this.f98g = ((Integer) number).intValue() + this.f98g;
                break;
            case 6:
                this.f99h = ((Integer) number).intValue() + this.f99h;
                break;
            case 7:
                int[] iArr = this.f100i;
                if (iArr != null) {
                    int iIntValue = ((Integer) number).intValue();
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = iIntValue;
                    this.f100i = iArrCopyOf;
                } else {
                    this.f100i = new int[]{((Integer) number).intValue()};
                }
                break;
            case 8:
                this.f101j = ((Integer) number).intValue() + this.f101j;
                break;
            case 9:
                this.f102k = ((Integer) number).intValue() + this.f102k;
                break;
            case 10:
                this.f103l = ((Double) number).doubleValue() + this.f103l;
                break;
            case 11:
                this.f104m = ((Double) number).doubleValue() + this.f104m;
                break;
            case 12:
                this.f105n = ((Integer) number).intValue();
                break;
            case 13:
                this.f106o = ((Integer) number).intValue() + this.f106o;
                break;
            case 14:
                this.f107p = ((Integer) number).intValue() + this.f107p;
                break;
            case 15:
                this.f108q = ((Integer) number).intValue() + this.f108q;
                break;
            case 16:
                this.f109r = ((Integer) number).intValue() + this.f109r;
                break;
            default:
                gm5.m12750e();
                break;
        }
    }

    @Override // p000.y15
    /* JADX INFO: renamed from: y */
    public final void mo50y(LqAnalyticsValues$LessonExitPath lqAnalyticsValues$LessonExitPath) {
        lqAnalyticsValues$LessonExitPath.getClass();
        x65 x65Var = this.f93b;
        if (x65Var == null || this.f111t == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("Lesson ID", x65Var.m24295c());
        bundle.putString("Lesson language", x65Var.m24299g());
        bundle.putString("Lesson name", x65Var.m24303k());
        bundle.putString("Lesson level", x65Var.m24300h());
        List listM24302j = x65Var.m24302j();
        bundle.putString("Tags", listM24302j != null ? u91.m22596N0(listM24302j, null, null, null, null, 63) : null);
        bundle.putString("Shared By", x65Var.m24301i());
        bundle.putString("Course name", x65Var.m24294b());
        bundle.putInt("Course ID", x65Var.m24293a());
        String strM24297e = x65Var.m24297e();
        if (strM24297e != null) {
            bundle.putString("original lesson name", strM24297e);
        }
        String strM24298f = x65Var.m24298f();
        if (strM24298f != null) {
            bundle.putString("Import Method", strM24298f);
        }
        DateTime dateTime = this.f111t;
        int iMo18366b = dateTime != null ? ((int) (new DateTime().mo18366b() - dateTime.mo18366b())) / DescriptorProtos.Edition.EDITION_2023_VALUE : 0;
        bundle.putBoolean("imported by user", x65Var.m24296d());
        bundle.putInt("audio duration", this.f94c);
        bundle.putInt("blue words clicked", this.f95d);
        bundle.putInt("coins earned", this.f96e);
        bundle.putInt("known words added", this.f97f);
        bundle.putInt("known words clicked", this.f98g);
        bundle.putString("lesson exit path", lqAnalyticsValues$LessonExitPath.getValue());
        bundle.putInt("lingqs clicked", this.f99h);
        bundle.putIntArray("nth lingqs created", this.f100i);
        bundle.putInt("lingqs created", this.f101j);
        bundle.putInt("time in lesson", iMo18366b);
        bundle.putInt("time spent listening", this.f102k);
        bundle.putDouble("times listened", nob.m17572a(2, this.f103l));
        bundle.putDouble("times read", nob.m17572a(2, this.f104m));
        bundle.putInt("word count", this.f105n);
        bundle.putInt("words ignored", this.f106o);
        bundle.putInt("words read", this.f107p);
        bundle.putInt("contextual hints used", this.f108q);
        bundle.putInt("popular meaning hints used", this.f109r);
        ReaderMode readerMode = this.f110s;
        int i = readerMode == null ? -1 : z15.f70747a[readerMode.ordinal()];
        if (i != -1) {
            if (i == 1) {
                bundle.putInt("time in page view", iMo18366b);
                bundle.putInt("time in sentence view", 0);
                bundle.putInt("time in karaoke mode", 0);
                bundle.putInt("time in video mode", 0);
            } else if (i == 2) {
                bundle.putInt("time in page view", 0);
                bundle.putInt("time in sentence view", iMo18366b);
                bundle.putInt("time in karaoke mode", 0);
                bundle.putInt("time in video mode", 0);
            } else if (i == 3) {
                bundle.putInt("time in page view", 0);
                bundle.putInt("time in sentence view", 0);
                bundle.putInt("time in karaoke mode", iMo18366b);
                bundle.putInt("time in video mode", 0);
            } else {
                if (i != 4) {
                    gm5.m12750e();
                    return;
                }
                bundle.putInt("time in page view", 0);
                bundle.putInt("time in sentence view", 0);
                bundle.putInt("time in karaoke mode", 0);
                bundle.putInt("time in video mode", iMo18366b);
            }
        }
        ((C1240a) this.f92a).m7025f("Lesson engaged", bundle);
        if (lqAnalyticsValues$LessonExitPath == LqAnalyticsValues$LessonExitPath.QuitLesson || lqAnalyticsValues$LessonExitPath == LqAnalyticsValues$LessonExitPath.ExitedLingq) {
            this.f93b = null;
            this.f110s = null;
        }
        this.f94c = 0;
        this.f95d = 0;
        this.f96e = 0;
        this.f97f = 0;
        this.f98g = 0;
        this.f99h = 0;
        this.f100i = null;
        this.f101j = 0;
        this.f102k = 0;
        this.f103l = 0.0d;
        this.f104m = 0.0d;
        this.f105n = 0;
        this.f106o = 0;
        this.f107p = 0;
        this.f111t = null;
        this.f108q = 0;
        this.f109r = 0;
    }
}
