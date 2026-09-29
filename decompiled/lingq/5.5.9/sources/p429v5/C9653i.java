package p429v5;

import android.app.ActivityManager;
import android.content.Context;
import android.text.format.Formatter;
import android.util.DisplayMetrics;
import android.util.Log;

/* JADX INFO: renamed from: v5.i */
/* JADX INFO: loaded from: classes.dex */
public final class C9653i {

    /* JADX INFO: renamed from: a */
    public final int f49435a;

    /* JADX INFO: renamed from: b */
    public final int f49436b;

    /* JADX INFO: renamed from: c */
    public final int f49437c;

    /* JADX INFO: renamed from: v5.i$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public final Context f49438a;

        /* JADX INFO: renamed from: b */
        public final ActivityManager f49439b;

        /* JADX INFO: renamed from: c */
        public final b f49440c;

        /* JADX INFO: renamed from: d */
        public final float f49441d;

        public a(Context context) {
            this.f49441d = 1;
            this.f49438a = context;
            ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
            this.f49439b = activityManager;
            this.f49440c = new b(context.getResources().getDisplayMetrics());
            if (activityManager.isLowRamDevice()) {
                this.f49441d = 0.0f;
            }
        }
    }

    /* JADX INFO: renamed from: v5.i$b */
    public static final class b {

        /* JADX INFO: renamed from: a */
        public final DisplayMetrics f49442a;

        public b(DisplayMetrics displayMetrics) {
            this.f49442a = displayMetrics;
        }
    }

    public C9653i(a aVar) {
        Context context = aVar.f49438a;
        ActivityManager activityManager = aVar.f49439b;
        int i10 = activityManager.isLowRamDevice() ? 2097152 : 4194304;
        this.f49437c = i10;
        int iRound = Math.round(activityManager.getMemoryClass() * 1024 * 1024 * (activityManager.isLowRamDevice() ? 0.33f : 0.4f));
        DisplayMetrics displayMetrics = aVar.f49440c.f49442a;
        float f3 = displayMetrics.widthPixels * displayMetrics.heightPixels * 4;
        float f10 = aVar.f49441d;
        int iRound2 = Math.round(f3 * f10);
        int iRound3 = Math.round(f3 * 2.0f);
        int i11 = iRound - i10;
        int i12 = iRound3 + iRound2;
        if (i12 <= i11) {
            this.f49436b = iRound3;
            this.f49435a = iRound2;
        } else {
            float f11 = i11 / (f10 + 2.0f);
            this.f49436b = Math.round(2.0f * f11);
            this.f49435a = Math.round(f11 * f10);
        }
        if (Log.isLoggable("MemorySizeCalculator", 3)) {
            StringBuilder sb2 = new StringBuilder("Calculation complete, Calculated memory cache size: ");
            sb2.append(Formatter.formatFileSize(context, this.f49436b));
            sb2.append(", pool size: ");
            sb2.append(Formatter.formatFileSize(context, this.f49435a));
            sb2.append(", byte array size: ");
            sb2.append(Formatter.formatFileSize(context, i10));
            sb2.append(", memory class limited? ");
            sb2.append(i12 > iRound);
            sb2.append(", max size: ");
            sb2.append(Formatter.formatFileSize(context, iRound));
            sb2.append(", memoryClass: ");
            sb2.append(activityManager.getMemoryClass());
            sb2.append(", isLowMemoryDevice: ");
            sb2.append(activityManager.isLowRamDevice());
            Log.d("MemorySizeCalculator", sb2.toString());
        }
    }
}
