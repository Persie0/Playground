package p000;

import android.database.ContentObserver;
import android.os.Handler;
import androidx.wear.ambient.AmbientMode;
import com.google.android.clockwork.common.wearable.wearmaterial.time.WearTimeText;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class iyz extends ContentObserver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ AmbientMode.AmbientController f32695a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iyz(Handler handler, AmbientMode.AmbientController ambientController, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5) {
        super(handler);
        this.f32695a = ambientController;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        ((WearTimeText) this.f32695a.f1697a).m4631a();
    }
}
