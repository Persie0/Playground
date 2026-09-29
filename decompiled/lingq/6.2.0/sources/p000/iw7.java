package p000;

import android.content.DialogInterface;
import android.content.SharedPreferences;
import androidx.fragment.app.AbstractComponentCallbacksC0635c;
import androidx.lifecycle.Lifecycle$State;
import com.lingq.feature.reader.old.ReaderFragment;
import com.lingq.p020ui.HomeFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class iw7 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f44708a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractComponentCallbacksC0635c f44709b;

    public /* synthetic */ iw7(int i, AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c) {
        this.f44708a = i;
        this.f44709b = abstractComponentCallbacksC0635c;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        int i2 = this.f44708a;
        AbstractComponentCallbacksC0635c abstractComponentCallbacksC0635c = this.f44709b;
        switch (i2) {
            case 0:
                dialogInterface.dismiss();
                bh4[] bh4VarArr = ReaderFragment.f28218P0;
                ((ReaderFragment) abstractComponentCallbacksC0635c).m9286S0();
                break;
            case 1:
                dialogInterface.dismiss();
                bh4[] bh4VarArr2 = ReaderFragment.f28218P0;
                ((ReaderFragment) abstractComponentCallbacksC0635c).m9289V0().m23737z(fa6.f38722b);
                break;
            case 2:
                ReaderFragment readerFragment = (ReaderFragment) abstractComponentCallbacksC0635c;
                if (readerFragment.f5709m0.f66586d.isAtLeast(Lifecycle$State.RESUMED)) {
                    bh4[] bh4VarArr3 = ReaderFragment.f28218P0;
                    readerFragment.m9286S0();
                }
                break;
            case 3:
                dialogInterface.dismiss();
                ReaderFragment readerFragment2 = (ReaderFragment) abstractComponentCallbacksC0635c;
                if (readerFragment2.f5709m0.f66586d.isAtLeast(Lifecycle$State.RESUMED)) {
                    bh4[] bh4VarArr4 = ReaderFragment.f28218P0;
                    readerFragment2.m9291X0(true);
                    readerFragment2.m9290W0().m9336p3(true);
                }
                break;
            case 4:
                dialogInterface.dismiss();
                bh4[] bh4VarArr5 = ReaderFragment.f28218P0;
                ((ReaderFragment) abstractComponentCallbacksC0635c).m9290W0().m9338r3();
                break;
            default:
                HomeFragment homeFragment = (HomeFragment) abstractComponentCallbacksC0635c;
                SharedPreferences.Editor editorEdit = homeFragment.m9796i0().f58118b.edit();
                editorEdit.getClass();
                editorEdit.putBoolean("checked_for_dictionary_3", true);
                editorEdit.apply();
                homeFragment.f33892H0 = false;
                break;
        }
    }
}
