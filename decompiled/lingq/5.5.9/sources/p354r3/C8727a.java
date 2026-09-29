package p354r3;

import android.content.Context;
import androidx.work.AbstractC1246d;
import androidx.work.WorkerParameters;
import java.util.Map;
import p026b5.AbstractC1320m;
import p371rl.InterfaceC8825a;

/* JADX INFO: renamed from: r3.a */
/* JADX INFO: loaded from: classes.dex */
public final class C8727a extends AbstractC1320m {

    /* JADX INFO: renamed from: b */
    public final Map<String, InterfaceC8825a<InterfaceC8728b<? extends AbstractC1246d>>> f46318b;

    public C8727a(Map<String, InterfaceC8825a<InterfaceC8728b<? extends AbstractC1246d>>> map) {
        this.f46318b = map;
    }

    @Override // p026b5.AbstractC1320m
    /* JADX INFO: renamed from: a */
    public final AbstractC1246d mo4881a(Context context, String str, WorkerParameters workerParameters) {
        InterfaceC8825a<InterfaceC8728b<? extends AbstractC1246d>> interfaceC8825a = this.f46318b.get(str);
        if (interfaceC8825a == null) {
            return null;
        }
        return interfaceC8825a.get().mo15081a(context, workerParameters);
    }
}
