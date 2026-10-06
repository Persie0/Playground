package p000;

import android.app.Notification;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class aaz {
    /* JADX INFO: renamed from: a */
    public static Notification.BigTextStyle m72a(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
        return bigTextStyle.bigText(charSequence);
    }

    /* JADX INFO: renamed from: b */
    public static Notification.BigTextStyle m73b(Notification.Builder builder) {
        return new Notification.BigTextStyle(builder);
    }

    /* JADX INFO: renamed from: c */
    public static Notification.BigTextStyle m74c(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
        return bigTextStyle.setBigContentTitle(charSequence);
    }

    /* JADX INFO: renamed from: d */
    static Notification.BigTextStyle m75d(Notification.BigTextStyle bigTextStyle, CharSequence charSequence) {
        return bigTextStyle.setSummaryText(charSequence);
    }

    /* JADX INFO: renamed from: e */
    public static Object m76e(ExecutorService executorService, Callable callable, int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw e;
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (TimeoutException e3) {
            throw new InterruptedException("timeout");
        }
    }
}
