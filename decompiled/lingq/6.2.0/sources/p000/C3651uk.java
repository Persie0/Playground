package p000;

import android.R;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.textclassifier.TextClassification;
import java.util.List;

/* JADX INFO: renamed from: uk */
/* JADX INFO: loaded from: classes.dex */
public final class C3651uk {

    /* JADX INFO: renamed from: a */
    public final C3688vk f63999a;

    /* JADX INFO: renamed from: b */
    public final C3463pk f64000b;

    /* JADX INFO: renamed from: c */
    public final C3463pk f64001c;

    /* JADX INFO: renamed from: d */
    public final View f64002d;

    public C3651uk(C3688vk c3688vk, C3463pk c3463pk, C3463pk c3463pk2, View view) {
        this.f63999a = c3688vk;
        this.f64000b = c3463pk;
        this.f64001c = c3463pk2;
        this.f64002d = view;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m22761a(Menu menu) {
        int i;
        int i2;
        ct9 ct9Var = (ct9) this.f64000b.mo0a();
        final int i3 = 0;
        if (fa4.m11650l(ct9Var, null)) {
            return false;
        }
        menu.clear();
        List list = ct9Var.f34529a;
        int size = list.size();
        final int i4 = 1;
        int i5 = 0;
        int i6 = 1;
        int i7 = 1;
        while (i5 < size) {
            bt9 bt9Var = (bt9) list.get(i5);
            if (bt9Var instanceof jt9) {
                i = i6 + 1;
                Object obj = bt9Var.f8993a;
                if (fa4.m11650l(obj, b34.f7849j)) {
                    i2 = R.id.cut;
                } else if (fa4.m11650l(obj, b34.f7850k)) {
                    i2 = R.id.copy;
                } else if (fa4.m11650l(obj, b34.f7851l)) {
                    i2 = R.id.paste;
                } else if (fa4.m11650l(obj, b34.f7852m)) {
                    i2 = R.id.selectAll;
                } else {
                    i2 = fa4.m11650l(obj, b34.f7853n) ? R.id.autofill : i6;
                }
                final jt9 jt9Var = (jt9) bt9Var;
                MenuItem menuItemAdd = menu.add(i7, i2, i6, jt9Var.f46133b);
                menuItemAdd.setShowAsAction(2);
                menuItemAdd.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: tk
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                        int i8 = i3;
                        Object obj2 = this;
                        Object obj3 = jt9Var;
                        switch (i8) {
                            case 0:
                                ((jt9) obj3).f46135d.invoke(((C3651uk) obj2).f63999a);
                                break;
                            default:
                                Context context = (Context) obj3;
                                TextClassification textClassification = (TextClassification) obj2;
                                String text = textClassification.getText();
                                pvc.m19497E(PendingIntent.getActivity(context, text != null ? text.hashCode() : 0, textClassification.getIntent(), 201326592));
                                break;
                        }
                        return true;
                    }
                });
            } else {
                if (bt9Var instanceof ot9) {
                    i = i6 + 1;
                    final Context context = this.f64002d.getContext();
                    ot9 ot9Var = (ot9) bt9Var;
                    final TextClassification textClassification = ot9Var.f54976b;
                    int i8 = ot9Var.f54977c;
                    Drawable drawable = ot9Var.f54978d;
                    if (i8 < 0) {
                        MenuItem menuItemAdd2 = menu.add(R.id.textAssist, R.id.textAssist, i6, textClassification.getLabel());
                        menuItemAdd2.setShowAsAction(2);
                        menuItemAdd2.setIcon(drawable);
                        menuItemAdd2.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: tk
                            @Override // android.view.MenuItem.OnMenuItemClickListener
                            public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                int i9 = i4;
                                Object obj2 = textClassification;
                                Object obj3 = context;
                                switch (i9) {
                                    case 0:
                                        ((jt9) obj3).f46135d.invoke(((C3651uk) obj2).f63999a);
                                        break;
                                    default:
                                        Context context2 = (Context) obj3;
                                        TextClassification textClassification2 = (TextClassification) obj2;
                                        String text = textClassification2.getText();
                                        pvc.m19497E(PendingIntent.getActivity(context2, text != null ? text.hashCode() : 0, textClassification2.getIntent(), 201326592));
                                        break;
                                }
                                return true;
                            }
                        });
                    } else {
                        int i9 = i8 == 0 ? 1 : i3;
                        final RemoteAction remoteAction = textClassification.getActions().get(i8);
                        MenuItem menuItemAdd3 = menu.add(R.id.textAssist, i9 != 0 ? 16908353 : i3, i6, remoteAction.getTitle());
                        menuItemAdd3.setShowAsAction(i9 == 0 ? 0 : 2);
                        if (drawable != null) {
                            menuItemAdd3.setIcon(drawable);
                        }
                        menuItemAdd3.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: yx9
                            @Override // android.view.MenuItem.OnMenuItemClickListener
                            public final boolean onMenuItemClick(MenuItem menuItem) throws PendingIntent.CanceledException {
                                pvc.m19497E(remoteAction.getActionIntent());
                                return true;
                            }
                        });
                    }
                } else if (bt9Var instanceof mt9) {
                    i7++;
                }
                i5++;
                i3 = 0;
            }
            i6 = i;
            i5++;
            i3 = 0;
        }
        return true;
    }
}
