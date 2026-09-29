package p039c3;

import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.support.v4.media.session.C0166e;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* JADX INFO: renamed from: c3.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1673a extends BaseAdapter implements Filterable, C1674b.a {

    /* JADX INFO: renamed from: g */
    public C1674b f9386g;

    /* JADX INFO: renamed from: b */
    public boolean f9381b = true;

    /* JADX INFO: renamed from: c */
    public Cursor f9382c = null;

    /* JADX INFO: renamed from: a */
    public boolean f9380a = false;

    /* JADX INFO: renamed from: d */
    public int f9383d = -1;

    /* JADX INFO: renamed from: e */
    public a f9384e = new a();

    /* JADX INFO: renamed from: f */
    public b f9385f = new b();

    /* JADX INFO: renamed from: c3.a$a */
    public class a extends ContentObserver {
        public a() {
            super(new Handler());
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z10) {
            Cursor cursor;
            AbstractC1673a abstractC1673a = AbstractC1673a.this;
            if (!abstractC1673a.f9381b || (cursor = abstractC1673a.f9382c) == null || cursor.isClosed()) {
                return;
            }
            abstractC1673a.f9380a = abstractC1673a.f9382c.requery();
        }
    }

    /* JADX INFO: renamed from: c3.a$b */
    public class b extends DataSetObserver {
        public b() {
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            AbstractC1673a abstractC1673a = AbstractC1673a.this;
            abstractC1673a.f9380a = true;
            abstractC1673a.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            AbstractC1673a abstractC1673a = AbstractC1673a.this;
            abstractC1673a.f9380a = false;
            abstractC1673a.notifyDataSetInvalidated();
        }
    }

    public AbstractC1673a(Context context) {
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo1271b(View view, Cursor cursor);

    /* JADX INFO: renamed from: c */
    public void mo1272c(Cursor cursor) {
        Cursor cursor2 = this.f9382c;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.f9384e;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.f9385f;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.f9382c = cursor;
            if (cursor != null) {
                a aVar2 = this.f9384e;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.f9385f;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.f9383d = cursor.getColumnIndexOrThrow("_id");
                this.f9380a = true;
                notifyDataSetChanged();
            } else {
                this.f9383d = -1;
                this.f9380a = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    /* JADX INFO: renamed from: d */
    public abstract String mo1273d(Cursor cursor);

    /* JADX INFO: renamed from: e */
    public abstract View mo1274e(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.f9380a || (cursor = this.f9382c) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f9380a) {
            return null;
        }
        this.f9382c.moveToPosition(i10);
        if (view == null) {
            AbstractC1675c abstractC1675c = (AbstractC1675c) this;
            view = abstractC1675c.f9392j.inflate(abstractC1675c.f9391i, viewGroup, false);
        }
        mo1271b(view, this.f9382c);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.f9386g == null) {
            this.f9386g = new C1674b(this);
        }
        return this.f9386g;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i10) {
        Cursor cursor;
        if (!this.f9380a || (cursor = this.f9382c) == null) {
            return null;
        }
        cursor.moveToPosition(i10);
        return this.f9382c;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i10) {
        Cursor cursor;
        if (this.f9380a && (cursor = this.f9382c) != null && cursor.moveToPosition(i10)) {
            return this.f9382c.getLong(this.f9383d);
        }
        return 0L;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        if (!this.f9380a) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.f9382c.moveToPosition(i10)) {
            throw new IllegalStateException(C0166e.m761g("couldn't move cursor to position ", i10));
        }
        if (view == null) {
            view = mo1274e(viewGroup);
        }
        mo1271b(view, this.f9382c);
        return view;
    }
}
