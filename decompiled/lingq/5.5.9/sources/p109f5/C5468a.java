package p109f5;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import androidx.work.NetworkType;
import androidx.work.impl.background.systemjob.SystemJobService;
import p026b5.AbstractC1314g;

/* JADX INFO: renamed from: f5.a */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ClassVerificationFailure"})
public final class C5468a {

    /* JADX INFO: renamed from: b */
    public static final String f34049b = AbstractC1314g.m4868f("SystemJobInfoConverter");

    /* JADX INFO: renamed from: a */
    public final ComponentName f34050a;

    /* JADX INFO: renamed from: f5.a$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f34051a;

        static {
            int[] iArr = new int[NetworkType.values().length];
            f34051a = iArr;
            try {
                iArr[NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f34051a[NetworkType.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f34051a[NetworkType.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f34051a[NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f34051a[NetworkType.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C5468a(Context context) {
        this.f34050a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }
}
